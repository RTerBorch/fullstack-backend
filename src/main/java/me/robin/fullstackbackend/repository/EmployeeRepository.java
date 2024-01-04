package me.robin.fullstackbackend.repository;

import me.robin.fullstackbackend.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {


}
