package ai.yunxi.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理者
public class Dynamic<T> implements InvocationHandler {

    //被代理对象
    private T proxyObject;

    public Dynamic(T proxyObject) {
        this.proxyObject = proxyObject;
    }

    public void before() {
        System.out.println("上课前发放资料");
    }

    public void after() {
        System.out.println("上课后发送视频、笔记、代码...");
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //具体的业务调用 执行
        this.before();
        Object result = method.invoke(proxyObject, args);
        this.after();
        return result;
    }

    public T getProxyInstance() {
        return (T) Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), proxyObject.getClass().getInterfaces(), this);
    }
}
