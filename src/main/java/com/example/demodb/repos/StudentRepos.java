package com.example.demodb.repos;

import com.example.demodb.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepos extends JpaRepository <Student, Integer> {

}
