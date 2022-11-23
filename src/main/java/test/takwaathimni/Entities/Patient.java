package test.takwaathimni.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name ="Patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMedecin")
    private long idPatient;
    private String nomPatient;
    private int telephone;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany
    @JsonIgnore
    private List<RendezVous> rendezVousSet;
}
