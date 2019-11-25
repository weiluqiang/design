package ai.principle.ISP;

public class ISPTest {

    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        count.countAverage();
        print.queryStuInfo();
        print.printStuInfo();
        input.modify();
        input.delete();
    }
}
