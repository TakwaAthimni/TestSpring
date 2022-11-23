package test.takwaathimni.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.takwaathimni.Entities.RendezVous;

public interface RendezvousRepository extends JpaRepository<RendezVous,Long> {

}
