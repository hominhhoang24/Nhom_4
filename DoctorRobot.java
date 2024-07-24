/**
 * Đại diện cho một Robot Bác Sĩ có thể chăm sóc bệnh nhân.
 */
public class DoctorRobot extends Robot implements MedicalRobot {
    /**
     * Khởi tạo một DoctorRobot với tên được chỉ định.
     *
     * @param name tên của DoctorRobot
     */
    public DoctorRobot(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " đang chăm sóc bệnh nhân.");
    }
}
