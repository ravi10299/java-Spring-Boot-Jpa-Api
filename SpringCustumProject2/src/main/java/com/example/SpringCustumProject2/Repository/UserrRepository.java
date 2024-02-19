package com.example.SpringCustumProject2.Repository;

import com.example.SpringCustumProject2.Entity.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserrRepository extends JpaRepository<Userr,Integer> {

}
