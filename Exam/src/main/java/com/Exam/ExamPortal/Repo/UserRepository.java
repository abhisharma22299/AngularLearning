package com.Exam.ExamPortal.Repo;

import com.Exam.ExamPortal.Modelss.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUserName(String userName);
}
