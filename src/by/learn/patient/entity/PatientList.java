package by.learn.patient.entity;

import by.learn.patient.actions.Reader;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The class provides array of objects Patients
 * @version 0.1
 */
public class PatientList {
    private ArrayList<Patient> patients;

    public PatientList() { patients = new ArrayList<>(); }

    public ArrayList<Patient> getPatients() { return patients; }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void addPatients(Patient patient) {
        this.patients.add(patient);
    }

    /**
     * The method provides initialing object Patient from Console
     */
    public void inputPatient() {
        Patient patient = new Patient();
        patient.setId(patients.size() + 1);
        System.out.print("Enter a last name: ");
        patient.setLastName(Reader.fromConsole());
        System.out.print("Enter a first name: ");
        patient.setFirstName(Reader.fromConsole());
        System.out.print("Enter a patronymic: ");
        patient.setPatronymic(Reader.fromConsole());
        System.out.print("Enter an address: ");
        patient.setAddress(Reader.fromConsole());
        System.out.print("Enter a phone number: ");
        patient.setPhoneNumber(Reader.fromConsole());
        patient.setMedicalRecord(patients.size() + 1);
        System.out.print("Enter a diagnosis: ");
        patient.setDiagnosis(Reader.fromConsole());
        patients.add(patient);
    }

    public void patientsWithDiagnosis(String diagnosis) {
        for (Patient i: patients) {
            if(i.getDiagnosis().equals(diagnosis)) {
                System.out.println(i.toString());
            }
        }
    }

    public void patientsWithMedicalRecordBetweenBounds(String stringBounds) {
        int [] bounds = Arrays.stream(stringBounds.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (Patient i: patients) {
            if(i.getMedicalRecord() >= bounds[0] && i.getMedicalRecord() <= bounds[1]) {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public String toString() {
        return patients.toString();
    }
}
