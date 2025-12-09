package com.ds3.app.repository;

import com.ds3.app.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Long> {

}
