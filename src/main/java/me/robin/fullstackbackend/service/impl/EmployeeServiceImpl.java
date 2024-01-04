package me.robin.fullstackbackend.service.impl;

import lombok.AllArgsConstructor;
import me.robin.fullstackbackend.dto.EmployeeDto;
import me.robin.fullstackbackend.exception.ResourceNotFoundException;
import me.robin.fullstackbackend.mapper.EmployeeMapper;
import me.robin.fullstackbackend.models.Employee;
import me.robin.fullstackbackend.repository.EmployeeRepository;
import me.robin.fullstackbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee with the given id: " + employeeId + " does not exist."));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
