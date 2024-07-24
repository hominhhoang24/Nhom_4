import java.util.List;

/**
 * Đại diện cho một Đội với tên và danh sách các Robot.
 */
public class Team {
    private String teamName;
    private List<Robot> robots;

    /**
     * Khởi tạo một Đội với tên và danh sách các Robot được chỉ định.
     *
     * @param teamName tên của Đội
     * @param robots danh sách các Robot trong Đội
     */
    public Team(String teamName, List<Robot> robots) {
        this.teamName = teamName;
        this.robots = robots;
    }

    /**
     * Trả về tên của Đội.
     *
     * @return tên của Đội
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Trả về danh sách các Robot trong Đội.
     *
     * @return danh sách các Robot trong Đội
     */
    public List<Robot> getRobots() {
        return robots;
    }
}