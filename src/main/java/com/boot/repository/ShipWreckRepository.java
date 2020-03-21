package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.boot.model.Shipwreck;

@Repository
public interface ShipWreckRepository extends JpaRepository<Shipwreck ,Long>{

}