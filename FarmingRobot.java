/**
 * Đại diện cho một Robot Nông Nghiệp với khả năng thu hoạch và chế biến.
 */
public interface FarmingRobot {
    /**
     * Thu hoạch tài nguyên.
     */
    void harvest();

    /**
     * Chế biến tài nguyên đã thu hoạch.
     */
    void process();
}