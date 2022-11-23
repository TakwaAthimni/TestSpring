package test.takwaathimni.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.takwaathimni.Entities.Clinique;
import test.takwaathimni.Services.IServiceClinique;
@RestController
public class CliniqueController {
IServiceClinique iServiceClinique;
@PostMapping("/addClinique")
    public Clinique addClinique( @RequestBody Clinique clinique){
    return iServiceClinique.addClinique(clinique);
}
}
