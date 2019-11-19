package ai.yunxi.flyweight.sample;

import java.awt.*;

//抽象享元角色：棋子
public interface ChessPieces {

    void DownPieces(Graphics g, Point pt);//下子
}
