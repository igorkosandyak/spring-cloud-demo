package com.services;

import com.entities.Department;
import com.repos.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    private final DepartmentRepository repository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department save(Department department) {
        return this.repository.save(department);
    }

    public Department getById(long id) {
        return this.repository.findById(id)
                .orElse(null);
    }
}
