package test.takwaathimni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.takwaathimni.Entities.Clinique;

public interface RepositoryClinique extends JpaRepository<Clinique,Long> {
}
