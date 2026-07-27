public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String disease;

    public Patient(int patientId, String patientName, int age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
                ", Name: " + patientName +
                ", Age: " + age +
                ", Disease: " + disease;
    }
}
