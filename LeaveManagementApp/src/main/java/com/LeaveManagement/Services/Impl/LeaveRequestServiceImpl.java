/*package com.LeaveManagement.Services.Impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.LeaveManagement.Services.LeaveRequesttService;
import com.LeaveManagement.Model.Dto.LeaveRequestDto;
import com.LeaveManagement.Model.Entity.LeaveRequest;
import com.LeaveManagement.Repository.EmployeeRepository;
import com.LeaveManagement.Repository.LeaveRequestRepository;
import com.LeaveManagement.Model.Mappers.LeaveRequestMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaveRequestServiceImpl implements LeaveRequesttService {

    private final LeaveRequestRepository leaveRequestRepository;
    public LeaveRequestServiceImpl(LeaveRequestRepository leaveRequestRepository) {
     
        this.leaveRequestRepository =leaveRequestRepository;
    }

    @Override
    public LeaveRequestDto addOne(LeaveRequestDto leaveRequestDto) {
        // Convertir le DTO en entité et sauvegarder
        LeaveRequest leaveRequest = LeaveRequestMapper.convertToEntity(leaveRequestDto);
        LeaveRequest savedLeaveRequest = leaveRequestRepository.save(leaveRequest);
        // Retourner l'entité convertie en DTO
        return LeaveRequestMapper.convertToDTO(savedLeaveRequest);
    }

    @Override
    public Page<LeaveRequestDto> getAll(Pageable pageable) {
        // Récupérer toutes les demandes de congé avec pagination
        Page<LeaveRequest> leaveRequests = leaveRequestRepository.findAll(pageable);
        // Convertir les entités en DTO
        return leaveRequests.map(LeaveRequestMapper::convertToDTO);
    }

    @Override
    public void deleteOne(long id) {
        // Supprimer une demande de congé par son ID
        leaveRequestRepository.deleteById(id);
    }

    @Override
    public LeaveRequestDto getOne(long id) {
        // Récupérer une demande de congé par son ID
        LeaveRequest leaveRequest = leaveRequestRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Demande de congé introuvable avec l'id " + id));
        return LeaveRequestMapper.convertToDTO(leaveRequest);
    }

    // Ajoutez d'autres méthodes si nécessaire
}
*/