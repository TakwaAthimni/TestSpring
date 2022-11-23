package test.takwaathimni.Controller;

import org.springframework.web.bind.annotation.*;
import test.takwaathimni.Entities.Medecin;
import test.takwaathimni.Services.IServiceMedecin;
@RestController
public class MedecinController {
    IServiceMedecin iServiceMedecin;
    @PostMapping("/addMedecinAndAssignToClinique")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin,@PathVariable("idClinique") long idClinique){
return iServiceMedecin.addMedecinAndAssignToClinique(medecin,idClinique);
    }
    @GetMapping("getNbrRendezvousmedecin/{IdMeecin}")
    public int getNbrRendezvousmedecin(@PathVariable Long IdMeecin) {
        return  iServiceMedecin.getNbrRendezvousmedecin(IdMeecin);
    }
}
