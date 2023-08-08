package com.sakshath.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakshath.core.entities.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {
	
	Optional<Asset> findByLoanAccountNumber(String loanAccountNumber);
	
	Optional<Asset> findByAssetSerialNo(String assetSerialNumber);
}
