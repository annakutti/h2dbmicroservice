/**
 * 
 */
package com.sanya.boot.h2dbmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanya.boot.h2dbmicroservice.entity.Employee;

/**
 * @author Sanya_s
 *
 */
@Repository
public interface H2DBRepository extends JpaRepository<Employee, Integer>{

}
