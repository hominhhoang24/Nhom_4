/**
 * Đại diện cho một Robot Chăm Sóc Cây có thể thu hoạch và chế biến sản phẩm từ cây.
 */
public class TreeCareRobot extends Robot implements FarmingRobot {
    /**
     * Khởi tạo một TreeCareRobot với tên được chỉ định.
     *
     * @param name tên của TreeCareRobot
     */
    public TreeCareRobot(String name) {
        super(name);
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " đang thu hoạch cây.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " đang chế biến sản phẩm từ cây.");
    }
}
