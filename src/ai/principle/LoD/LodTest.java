package ai.principle.LoD;

public class LodTest {

    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("某明星"));
        agent.setFans(new Fans("某粉丝"));
        agent.setCompany(new Company("某传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
