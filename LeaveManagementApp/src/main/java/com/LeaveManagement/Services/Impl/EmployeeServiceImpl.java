/*package com.LeaveManagement.Services.Impl;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.LeaveManagement.Services.EmployeeService;
import com.LeaveManagement.Model.Dto.EmployeeDto;
import com.LeaveManagement.Model.Dto.LeaveRequestDto;
import com.LeaveManagement.Model.Entity.Employee;
import com.LeaveManagement.Model.Entity.LeaveRequest;
import com.LeaveManagement.Repository.EmployeeRepository;
import com.LeaveManagement.Repository.LeaveRequestRepository;
import com.LeaveManagement.Model.Mappers.EmployeeMapper;
import com.LeaveManagement.Model.Mappers.LeaveRequestMapper;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	private final LeaveRequestRepository leaveRequestRepository;
	  public EmployeeServiceImpl (EmployeeRepository employeeRepository,LeaveRequestRepository leaveRequestRepository) {
	        this.employeeRepository = employeeRepository;
	        this.leaveRequestRepository =leaveRequestRepository;
	    }
   
    @Override
    public EmployeeDto addOne(EmployeeDto employeeDto) {
        // Conversion du DTO en entité et sauvegarde
        Employee employee = EmployeeMapper.convertToEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        // Retourne l'entité convertie en DTO
        return EmployeeMapper.convertToDTO(savedEmployee);
    }

    @Override
    public Page<EmployeeDto> getAll(Pageable pageable) {
        // Récupération de tous les employés avec pagination
        Page<Employee> employees = employeeRepository.findAll(pageable);
        // Conversion des entités en DTO
        return employees.map(EmployeeMapper::convertToDTO);
    }

    @Override
    public void deleteOne(long id) {
        // Suppression d'un employé par son ID
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto getOne(long id) {
        // Récupération d'un employé par son ID
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employé introuvable avec l'id " + id));
        return EmployeeMapper.convertToDTO(employee);
    }

    @Override
    public EmployeeDto assigLeaveRequestToUtilisateur(long idUser, LeaveRequestDto leaveRequestDto) {
        // Trouver l'employé
        Employee employee = employeeRepository.findById(idUser)
                .orElseThrow(() -> new EntityNotFoundException("Employé introuvable avec l'id " + idUser));
        // Convertir et assigner la demande de congé
        LeaveRequest leaveRequest = LeaveRequestMapper.convertToEntity(leaveRequestDto);
        employee.getLeaveRequests().add(leaveRequest);
        leaveRequestRepository.save(leaveRequest); // Sauvegarder la demande de congé
        Employee updatedEmployee = employeeRepository.save(employee); // Sauvegarder l'employé mis à jour
        return EmployeeMapper.convertToDTO(updatedEmployee);
    }
}
*/