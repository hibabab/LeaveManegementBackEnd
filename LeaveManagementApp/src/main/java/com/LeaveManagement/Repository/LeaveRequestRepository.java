/*package com.LeaveManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LeaveManagement.Model.Entity.LeaveRequest;
@Repository

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    // Vous pouvez ajouter des méthodes personnalisées, par exemple pour rechercher des demandes de congés par statut ou employé
    List<LeaveRequest> findByEmployeeId(Long employeeId);
    List<LeaveRequest> findByApprovalStatus(String approvalStatus);
}
*/