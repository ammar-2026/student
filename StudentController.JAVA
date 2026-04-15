
public class StudentController {
 @FXML
    private Student student; 
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtOutput;
    @FXML
    private TextField txtMajor;
 @FXML
    private void addstudent() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String name = txtName.getText();
            String major = txtMajor.getText();

            student = new Student(id, name, major);
            txtOutput.setText("✅ تم إضافة الطالب: " + name);
        } catch (Exception e) {
            txtOutput.setText("❌ خطأ في البيانات!");
        }
    }

    @FXML
    private void showStudentInfo() {
        if (student != null) {
            txtOutput.setText("اسم الطالب: " + student.getName() + "\nتخصص: " + student.getMajor());
        } else {
            txtOutput.setText("لا يوجد طالب مضاف.");
        }
    }
}