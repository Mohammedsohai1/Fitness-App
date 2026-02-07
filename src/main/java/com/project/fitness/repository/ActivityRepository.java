package com.project.fitness.repository;

import com.project.fitness.model.Activity;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity,String> {
    List<Activity> findByUserId(String userId);
}
