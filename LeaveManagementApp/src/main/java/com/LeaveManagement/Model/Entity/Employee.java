package com.LeaveManagement.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String position;
    private String department;
    private LocalDate hireDate;
    private double salary;
    private double leaveBalance;

    // Corrected OneToMany mapping with LeaveRequest
    @OneToMany(mappedBy = "employee")
    private Set<LeaveRequest> leaveRequests;

    public Set<LeaveRequest> getLeaveRequests() {
        return leaveRequests;
    }
}
