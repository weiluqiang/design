package ai.yunxi.visitor.apply;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MaterialWin extends JFrame implements ItemListener {

    private static final long serialVersionUID = 1L;
    private JPanel centerPanel;
    private SetMaterial os;    //材料集对象
    private Company visitor1, visitor2;    //访问者对象
    private String[] select;

    MaterialWin() {
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton Art;
        JRadioButton mint;
        os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());
        visitor1 = new ArtCompany();//艺术公司
        visitor2 = new Mint(); //造币公司
        this.setBounds(20, 20, 450, 200);
        this.setResizable(false);
        centerPanel = new JPanel();
        this.add("Center", centerPanel);
        JPanel SouthJP = new JPanel();
        JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
        Art = new JRadioButton("艺术公司", true);
        mint = new JRadioButton("造币公司");
        Art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(Art);
        group.add(mint);
        SouthJP.add(yl);
        SouthJP.add(Art);
        SouthJP.add(mint);
        this.add("South", SouthJP);
        select = (os.accept(visitor1)).split(" ");    //获取产品名
        try {
            showPicture(select[0], select[1]);    //显示产品
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //显示图片
    private void showPicture(String cuprum, String paper) {
        centerPanel.removeAll();    //清除面板内容
        centerPanel.repaint();    //刷新屏幕
        JLabel lb = new JLabel(cuprum);
        JLabel rb = new JLabel(paper);
        centerPanel.add(lb);
        centerPanel.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent arg0) {
        JRadioButton jc = (JRadioButton) arg0.getSource();
        if (jc.isSelected()) {
            if (jc.getText().equals("造币公司")) {
                select = (os.accept(visitor2)).split(" ");
            } else {
                select = (os.accept(visitor1)).split(" ");
            }
            try {
                showPicture(select[0], select[1]);    //显示选择的产品
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
