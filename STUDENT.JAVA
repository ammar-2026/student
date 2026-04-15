public class   STUDENT {
    private int id;
    private String name;
    private String major;

    // ده الـ Constructor اللي بنستخدمه عشان ننشئ طالب جديد
    public Project(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }
// مثال لمعادلة حقيقية: حساب المعدل بناءً على مجموع الدرجات وعدد المواد
public double calculateGPA(double totalGrades, int numberOfSubjects) {
    if (numberOfSubjects == 0) return 0.0;
    return totalGrades / numberOfSubjects;
}

    // Getters عشان نقدر نقرأ البيانات في الملف التاني
    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
}