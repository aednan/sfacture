package com.facture.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.facture.bean.Employe;

public interface EmployeRepository extends JpaRepository<Employe, String>{

}
