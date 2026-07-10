package com.sbk.ems_fullstack.service.impl;

import com.sbk.ems_fullstack.dto.EmployeeDto;
import com.sbk.ems_fullstack.entity.Employee;
import com.sbk.ems_fullstack.mapper.EmployeeMapper;
import com.sbk.ems_fullstack.repository.EmployeeRepository;
import com.sbk.ems_fullstack.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);

    }
}
