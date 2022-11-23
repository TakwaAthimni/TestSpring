package test.takwaathimni.Services;

import test.takwaathimni.Entities.Medecin;

public interface IServiceMedecin {
public Medecin addMedecinAndAssignToClinique(Medecin medecin, long idClinique);
    public int getNbrRendezVous();
}
