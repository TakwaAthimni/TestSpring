package test.takwaathimni.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.takwaathimni.Entities.Patient;
import test.takwaathimni.Services.IServicePatient;

@RestController
public class PatientController {
    IServicePatient iServicePatient;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return iServicePatient.addPatient(patient);
    }
}
