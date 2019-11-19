package ai.yunxi.flyweight.sample;

import java.awt.*;

//具体享元角色：黑子
public class BlackPieces implements ChessPieces {

    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
