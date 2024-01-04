package me.robin.fullstackbackend.mapper;

import me.robin.fullstackbackend.dto.EmployeeDto;
import me.robin.fullstackbackend.models.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getEmail(),
                employee.getFirstName(),
                employee.getLastName()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getEmail(),
                employeeDto.getFirstName(),
                employeeDto.getLastName()
        );
    }
}
