package test.takwaathimni.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name ="Medecin")
public class Medecin  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMedecin")
    private long idMedecin;
    private String nomMedecin;
    @Enumerated (EnumType.STRING)
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;
    @ManyToMany
    private java.util.List<Clinique> cliniques;
    @OneToMany
    @JsonIgnore
    private List<RendezVous> rendezVousSet;
}
