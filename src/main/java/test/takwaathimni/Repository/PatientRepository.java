package test.takwaathimni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.takwaathimni.Entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
