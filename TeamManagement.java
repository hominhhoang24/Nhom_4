import java.util.ArrayList;
import java.util.List;

/**
 * Quản lý nhiều Đội.
 */
public class TeamManagement {
    private List<Team> teams;

    /**
     * Khởi tạo một TeamManagement rỗng.
     */
    public TeamManagement() {
        this.teams = new ArrayList<>();
    }

    /**
     * Thêm một Đội vào hệ thống quản lý.
     *
     * @param team Đội cần thêm
     */
    public void addTeam(Team team) {
        teams.add(team);
    }

    /**
     * Trả về danh sách các Đội.
     *
     * @return danh sách các Đội
     */
    public List<Team> getTeams() {
        return teams;
    }
}