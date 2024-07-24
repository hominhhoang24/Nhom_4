/**
 * Đại diện cho một Robot Chăm Sóc Cá có thể thu hoạch và chế biến sản phẩm từ cá.
 */
public class FishCareRobot extends Robot implements FarmingRobot {
    /**
     * Khởi tạo một FishCareRobot với tên được chỉ định.
     *
     * @param name tên của FishCareRobot
     */
    public FishCareRobot(String name) {
        super(name);
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " đang thu hoạch cá.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " đang chế biến sản phẩm từ cá.");
    }
}
