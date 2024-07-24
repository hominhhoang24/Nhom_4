/**
 * Hiển thị màn hình chào mừng cho các Đội.
 */
public class WelcomeScreen {
    /**
     * Hiển thị thông điệp chào mừng cho Đội được chỉ định.
     *
     * @param team Đội cần hiển thị thông điệp chào mừng
     */
    public static void displayWelcome(Team team) {
        System.out.println("**************WELCOME TO**************");
        System.out.println("***************" + team.getTeamName() + "****************");
    }
}
