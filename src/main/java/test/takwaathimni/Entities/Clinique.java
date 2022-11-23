package test.takwaathimni.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Clinique")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"attributeOfTypeList", "attributeOfTypeSet"})

public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClinique;
    private String nomClinique;
    private String adresse;
    private int telephone;
    @ManyToMany (mappedBy="cliniques", cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Medecin> medecins;

}