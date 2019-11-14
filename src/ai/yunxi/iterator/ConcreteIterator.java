package ai.yunxi.iterator;

import java.util.List;

//具体迭代器
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }

    public Object first() {
        index = 0;
        return list.get(index);
    }

    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
