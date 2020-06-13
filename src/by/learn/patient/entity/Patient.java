package by.learn.patient.entity;

/**
 * The class provides informational object Patient
 * @author Kirill Don-Shinaiko
 * @version 0.1
 */
public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private int medicalRecord;
    private String diagnosis;

    public Patient() {
    }

    public Patient(int id,
                   String lastName,
                   String firstName,
                   String patronymic,
                   String address,
                   String phoneNumber,
                   int medicalRecord,
                   String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalRecord = medicalRecord;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalRecord() {
        return medicalRecord;
    }
    public void setMedicalRecord(int medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient: ");
        sb.append(id).append("\n");
        sb.append("lastName: ").append(lastName).append("\n");
        sb.append("firstName: ").append(firstName).append("\n");
        sb.append("patronymic: ").append(patronymic).append("\n");
        sb.append("address: ").append(address).append("\n");
        sb.append("phoneNumber: ").append(phoneNumber).append("\n");
        sb.append("medicalRecord: ").append(medicalRecord).append("\n");
        sb.append("diagnosis: ").append(diagnosis);
        sb.append("\n");
        return sb.toString();
    }
}
