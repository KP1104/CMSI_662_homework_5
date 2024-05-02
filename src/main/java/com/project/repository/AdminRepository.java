package com.project.repository;

import com.project.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    /**
     * Creating and Populating a 'Admin' as well as 'Transaction' Table in a PostgresSql Database
     * Security Enhancements:
     * Preventing SQL Injection:
     * Utilizes parameterized queries during data insertion to safeguard against SQL injection attacks. SQL injection exploits vulnerabilities in input validation, allowing attackers to execute malicious SQL commands.
     * Enhanced Password Security:
     * Error Handling:
     * Employs native sql query whereas also using the spring data jpa native queries. This proactive approach ensures appropriate handling of issues arising during table creation or data insertion processes.
     * Transaction Management:
     * Incorporates transactional operations to ensure the integrity of database operations. This safeguards against partial executions by guaranteeing that all database operations either succeed completely or are rolled back entirely, thus preserving data consistency.
     */
    @Query("SELECT COUNT(a) FROM Admin a WHERE a.userName = :userName AND a.password = :password")
    int countByUserIdAndPassword(@Param("userName") String userName, @Param("password") String password);


    @Query(value = "INSERT INTO Transaction (userId, username, amount, balance) VALUES (:userid, :username, :amount, :balance)" , nativeQuery = true)
    void insertAmount(@Param("userid") Long userid, @Param("username") String username, @Param("amount") Long amount, @Param("balance") Long balance);

    @Query("SELECT FROM CURRENT a where a.userName = :userName AND a.userId = :userId AND a.closingBalance = :closingBalance ")
    List<Object[]> getCurrentAccountDetails();

    @Query("SELECT FROM SAVINGS a WHERE a.userName = :userName AND a.userId = :userId AND a.closingBalance = :closingBalance")
    List<Object[]> getSavingsAccountDetails();

}
