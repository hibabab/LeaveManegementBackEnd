package com.LeaveManagement.Model.Entity;


import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@MappedSuperclass  // Indique que cette classe est une superclasse mappée. Ses champs seront hérités par d'autres entités, mais cette classe ne sera pas mappée directement à une table dans la base de données.
@Data  // Génère automatiquement les méthodes getters, setters, toString, equals, et hashCode grâce à Lombok, ce qui simplifie le code.

public abstract class BaseEntity {
    
    @Id  // Marque ce champ comme la clé primaire de l'entité.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Indique que l'ID sera généré automatiquement par la base de données (généralement auto-incrémenté).
    private long id;  // L'identifiant unique de l'entité.

    private LocalDateTime createdAt;  // Champ qui stocke la date et l'heure de création de l'entité.
    private LocalDateTime updatedAt;  // Champ qui stocke la date et l'heure de la dernière mise à jour de l'entité.

    @PrePersist  // Exécute la méthode avant que l'entité ne soit insérée dans la base de données. Utilisé pour initialiser les champs createdAt et updatedAt.
    public void init() {
        this.createdAt = this.updatedAt = LocalDateTime.now();  // Initialise les dates de création et de mise à jour à l'heure actuelle.
    }

    @PreUpdate  // Exécute la méthode avant que l'entité ne soit mise à jour dans la base de données. Utilisé pour mettre à jour le champ updatedAt.
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();  // Met à jour la date de modification à l'heure actuelle.
    }
}
