package test.takwaathimni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.takwaathimni.Entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
