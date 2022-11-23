package test.takwaathimni.Services;

import test.takwaathimni.Entities.Clinique;
import test.takwaathimni.Entities.Medecin;
import test.takwaathimni.Repository.MedecinRepository;
import test.takwaathimni.Repository.RepositoryClinique;

import java.util.List;

public class ServiceMedecinImp implements IServiceMedecin{
    MedecinRepository medecinRepository;
    RepositoryClinique repositoryClinique;
    @Override
   public Medecin addMedecinAndAssignToClinique(Medecin medecin, long idClinique) {
       Clinique clinique=repositoryClinique.findById(idClinique).orElse(null);
        List<Clinique> cliniques=medecin.getCliniques();
        cliniques.add(clinique);
        medecin.setCliniques(cliniques);
           return   medecinRepository.save(medecin);

      
        }

    @Override
    public int getNbrRendezVous() {
        return medecinRepository.findById(idMedecin).orElse(null).getRendezVous().size();
    }

}


