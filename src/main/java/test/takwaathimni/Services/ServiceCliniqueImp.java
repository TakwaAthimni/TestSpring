package test.takwaathimni.Services;

import test.takwaathimni.Entities.Clinique;
import test.takwaathimni.Repository.RepositoryClinique;

public class ServiceCliniqueImp implements IServiceClinique{
    RepositoryClinique repositoryClinique;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return repositoryClinique.save(clinique);
    }
}
