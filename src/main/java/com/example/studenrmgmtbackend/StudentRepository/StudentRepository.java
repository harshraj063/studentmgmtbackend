package com.example.studenrmgmtbackend.StudentRepository;
import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
