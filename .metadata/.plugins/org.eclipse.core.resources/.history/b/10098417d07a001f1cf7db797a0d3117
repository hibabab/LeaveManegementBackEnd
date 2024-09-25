package com.LeaveManagement.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
// Interface générique pour la gestion des services
public interface AbstractService<T> {

    /**
     * Ajoute une nouvelle entité ou met à jour une entité existante.
     *
     * @param dto l'objet de transfert de données (Data Transfer Object) représentant l'entité.
     * @return l'entité ajoutée ou mise à jour.
     */
    T addOne(T dto);

    /**
     * Récupère toutes les entités sous forme paginée.
     *
     * @param pageable l'objet de pagination qui contient les informations sur la taille de la page et le numéro.
     * @return une page contenant une liste d'entités.
     */
    Page<T> getAll(Pageable pageable);

    /**
     * Supprime une entité par son identifiant unique.
     *
     * @param id l'identifiant unique de l'entité à supprimer.
     */
    void deleteOne(long id);

    /**
     * Récupère une entité spécifique par son identifiant.
     *
     * @param id l'identifiant unique de l'entité à récupérer.
     * @return l'entité trouvée correspondant à l'ID fourni, ou null si elle n'existe pas.
     */
    T getOne(long id);
}
