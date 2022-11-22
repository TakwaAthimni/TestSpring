package test.takwaathimni.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table  (name ="Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant;
    private String prenomE;
    private String nomE;
}
