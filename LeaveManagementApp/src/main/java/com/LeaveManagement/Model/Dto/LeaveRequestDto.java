/*package com.LeaveManagement.Model.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

import com.LeaveManagement.Model.Entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
public class LeaveRequestDto  extends BaseDto{
	
    private Long requestId;

   
    private Long employeeId;

   
    private String employeeName;

    
    private LocalDate startDate;

  
    private  LocalDate endDate;

   
    private int totalDays;

    private String reasonForLeave;

   
    private LocalDateTime requestDate;

  
    private String approvalStatus;  // Can be 'Pending', 'Approved', or 'Rejected'

    private String approvedBy;

    
    private LocalDateTime approvalDate;
    @JsonIgnoreProperties("LeaveRequests")
    private EmployeeDto Employee;


}
*/