/**
 * Đại diện cho một Robot Y Tá hỗ trợ chăm sóc bệnh nhân.
 */
public class NurseRobot extends Robot implements MedicalRobot {
    /**
     * Khởi tạo một NurseRobot với tên được chỉ định.
     *
     * @param name tên của NurseRobot
     */
    public NurseRobot(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " đang hỗ trợ chăm sóc bệnh nhân.");
    }
}
