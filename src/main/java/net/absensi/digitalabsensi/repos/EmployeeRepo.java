package net.absensi.digitalabsensi.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.absensi.digitalabsensi.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(long id);

    Optional<Employee> findEmployeeById(Long id);   
}
