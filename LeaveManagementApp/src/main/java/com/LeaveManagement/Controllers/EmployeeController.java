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

import com.LeaveManagement.Model.Dto.EmployeeDto;
import com.LeaveManagement.Services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController//permet de convertir reponse a format json ou xml
@RequestMapping("/Employee")
@RequiredArgsConstructor
public class EmployeeController {

	 private final EmployeeService service;

	  
	    public EmployeeController(EmployeeService service) {
	        this.service = service;
	    }


    // Add a new employee
    @PostMapping("/")
    public String  save(@RequestBody EmployeeDto employeeDto) {
        return "hello";
    }

    // Retrieve all employees with pagination
    @GetMapping("/")
    public ResponseEntity<Page<EmployeeDto>> findAll(Pageable pageable) {
        Page<EmployeeDto> employees = service.getAll(pageable);
        return ResponseEntity.ok(employees);
    }

    // Retrieve an employee by their ID
    @GetMapping("/{employee-id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable("employee-id") Integer employeeId) {
        return ResponseEntity.ok(service.getOne(employeeId));
    }

    // Delete an employee by their ID
    @DeleteMapping("/{employee-id}")
    public ResponseEntity<Void> delete(@PathVariable("employee-id") Integer employeeId) {
        service.deleteOne(employeeId);
        return ResponseEntity.noContent().build(); // Using noContent for deletion response
    }
}
*/