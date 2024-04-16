package app.nosybe.avis.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String statut;

    @Column(name = "uti_nom", nullable = true)
    private String nom;

    @Column(name = "uti_prenom", nullable = true)
    private String prenom;

    @Column(name = "uti_mot_de_passe", nullable = false)
    private String motDePasse;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "avis_id")
    private Avis avis;

}
