package ai.yunxi.flyweight.sample;

import java.awt.*;

//具体享元角色：白子
public class WhitePieces implements ChessPieces {

    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
