package test.takwaathimni.Services;

import test.takwaathimni.Entities.Patient;
import test.takwaathimni.Repository.PatientRepository;

public class ServicePatient implements IServicePatient{
     PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
