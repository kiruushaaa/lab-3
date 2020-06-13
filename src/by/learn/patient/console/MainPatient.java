package by.learn.patient.console;

import by.learn.patient.actions.Reader;
import by.learn.patient.entity.Patient;
import by.learn.patient.entity.PatientList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPatient {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Patient object1 = new Patient(1,"Staselko","Pavel","Vladimirovich","Minsk","102",1,"nCoV-2019");
        Patient object2 = new Patient(2,"John","John","John","London","103",2,"stye");
        PatientList patients = new PatientList();
        patients.addPatients(object1);
        patients.addPatients(object2);
        patients.inputPatient();
        System.out.print("Enter a diagnosis you are looking for: ");
        patients.patientsWithDiagnosis(Reader.fromConsole());
        System.out.print("Enter bounds of medical records of patients you are looking for: ");
        patients.patientsWithMedicalRecordBetweenBounds(Reader.fromConsole());
    }
}
