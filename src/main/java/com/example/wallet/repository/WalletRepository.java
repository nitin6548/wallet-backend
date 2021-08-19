package com.example.wallet.repository;

import com.example.wallet.dataModelObject.Money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Money, Integer> {


}
