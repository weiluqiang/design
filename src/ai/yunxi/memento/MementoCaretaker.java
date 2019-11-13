package ai.yunxi.memento;

import java.util.ArrayList;

public class MementoCaretaker {

    //定义一个集合来存储备忘录
    private ArrayList mementoList = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementoList.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
