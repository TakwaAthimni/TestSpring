package test.takwaathimni.Services;

import test.takwaathimni.Entities.RendezVous;
import test.takwaathimni.Entities.Specialite;
import test.takwaathimni.Repository.RendezvousRepository;

import java.util.List;

public class ServiceRendezvous implements IServiceRendezvous{
    RendezvousRepository rendezvousRepository;
    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialte(Long idClinique, Specialite specialite) {
        return null;
    }



}
