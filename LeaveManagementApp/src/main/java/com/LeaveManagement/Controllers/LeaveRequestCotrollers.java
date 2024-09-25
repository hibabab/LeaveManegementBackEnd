/*package com.LeaveManagement.Controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LeaveManagement.Model.Dto.LeaveRequestDto;
import com.LeaveManagement.Services.EmployeeService;
import com.LeaveManagement.Services.LeaveRequesttService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/LeaveRequest")
@RequiredArgsConstructor
public class LeaveRequestCotrollers {

	 private final LeaveRequesttService service;

	    // Injection de dépendances via le constructeur
	    public LeaveRequestCotrollers(LeaveRequesttService service) {
	        this.service = service;
	    }



    @PostMapping("/")
    public ResponseEntity<LeaveRequestDto> save(@RequestBody LeaveRequestDto leaveRequestDto) {
        return ResponseEntity.ok(service.addOne(leaveRequestDto));
    }

    @GetMapping("/")
    public ResponseEntity<Page<LeaveRequestDto>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{LeaveRequest-id}")
    public ResponseEntity<LeaveRequestDto> findById(@PathVariable("LeaveRequest-id") Integer leaveRequestId) {
        return ResponseEntity.ok(service.getOne(leaveRequestId));
    }

    @DeleteMapping("/{LeaveRequest-id}")
    public ResponseEntity<Void> delete(@PathVariable("LeaveRequest-id") Integer leaveRequestId) {
        service.deleteOne(leaveRequestId);
        return ResponseEntity.noContent().build();
    }
}
*/