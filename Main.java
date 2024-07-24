import java.util.Arrays;

/**
 * Lớp chính để chạy Hệ Thống Quản Lý Robot.
 */
public class Main {
    /**
     * Phương thức chính để chạy Hệ Thống Quản Lý Robot.
     *
     * @param args các tham số dòng lệnh
     */
    public static void main(String[] args) {
        Robot treeRobot = new TreeCareRobot("TreeBot");
        Robot fishRobot = new FishCareRobot("FishBot");
        Robot doctorRobot = new DoctorRobot("DocBot");
        Robot nurseRobot = new NurseRobot("NurseBot");

        Team farmingTeam = new Team("Farming Team", Arrays.asList(treeRobot, fishRobot));
        Team medicalTeam = new Team("Medical Team", Arrays.asList(doctorRobot, nurseRobot));

        TeamManagement teamManagement = new TeamManagement();
        teamManagement.addTeam(farmingTeam);
        teamManagement.addTeam(medicalTeam);

        for (Team team : teamManagement.getTeams()) {
            WelcomeScreen.displayWelcome(team);
        }
    }
}