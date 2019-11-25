package ai.principle.OCP;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

//实现书店类
public class BookStore {

    private final static List<IBook> sBookList = new ArrayList<>();

    static {
        sBookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        sBookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
        sBookList.add(new NovelBook("悲催世界", 3500, "雨果"));
        sBookList.add(new NovelBook("金瓶梅", 4300, "兰陵笑笑生"));
        sBookList.add(new ComputerBook("Think in Java", 5800, "Bruce Eckel", "编程语言"));
    }

    public static void main(String[] args) throws IOException {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("----书店卖出去的书籍记录如下---");
        for (IBook book : sBookList) {
            System.out.println("书籍名称:" + book.getName()
                    + "\t书籍作者:" + book.getAuthor()
                    + "\t书籍价格:" + format.format(book.getPrice() / 100.00) + "元");
        }
    }
}
