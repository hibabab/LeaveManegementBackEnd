package com.LeaveManagement.Model.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	
	@Entity
	
	@Builder
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
	
	public class LeaveRequest extends  BaseEntity  {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long requestId;

	    @Column(nullable = false)
	    private Long employeeId;

	    @Column(nullable = false)
	    private String employeeName;

	    @Column(nullable = false)
	    private LocalDate startDate;

	    @Column(nullable = false)
	    private LocalDate endDate;

	    @Column(nullable = false)
	    private int totalDays;

	    private String reasonForLeave;

	    @Column(nullable = false)
	    private LocalDateTime requestDate;

	    @Column(nullable = false)
	    private String approvalStatus;  // Can be 'Pending', 'Approved', or 'Rejected'

	    private String approvedBy;

	    private LocalDateTime approvalDate;
	    @ManyToOne(optional = false,cascade = CascadeType.ALL)
	    @JoinColumn(name = "employee_id") //  pour spécifier la colonne de la clé étrangère
	    private Employee Employee;

	  	}

