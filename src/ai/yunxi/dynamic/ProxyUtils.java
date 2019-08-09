package ai.yunxi.dynamic;

import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ProxyUtils {
	public static void getClassFile(String proxyName, Class clazz){
		//根据类的信息生成字节码
		byte[] proxyClassFile = ProxyGenerator.generateProxyClass(proxyName, new Class[]{clazz});
		
		String paths = clazz.getResource(".").getPath();
		System.out.println(paths);
		FileOutputStream out = null;

		try {
			// 保留到硬盘中
			out = new FileOutputStream(paths + proxyName + ".class");
			out.write(proxyClassFile);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
