package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

	Optional<Address> findByCustomerNumber(String customerNumber);
}
