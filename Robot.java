/**
 * Đại diện cho một Robot cơ bản với tên.
 */
public class Robot {
    private String name;

    /**
     * Khởi tạo một Robot với tên được chỉ định.
     *
     * @param name tên của Robot
     */
    public Robot(String name) {
        this.name = name;
    }

    /**
     * Trả về tên của Robot.
     *
     * @return tên của Robot
     */
    public String getName() {
        return name;
    }
}
