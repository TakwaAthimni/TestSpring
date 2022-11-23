package test.takwaathimni.Services;

import test.takwaathimni.Entities.RendezVous;
import test.takwaathimni.Entities.Specialite;

import java.util.List;

public interface IServiceRendezvous {
    public List<RendezVous> getRendezVousByCliniqueAndSpecialte(Long idClinique , Specialite specialite);

}
