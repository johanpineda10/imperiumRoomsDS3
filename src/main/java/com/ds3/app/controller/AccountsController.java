package com.ds3.app.controller;

import com.ds3.app.model.Accounts;
import com.ds3.app.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public List<Accounts> getAll(){
        return accountsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Accounts getById(@PathVariable Long id){
        return accountsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Accounts create(@RequestBody Accounts accounts){
        return accountsRepository.save(accounts);
    }

    @PutMapping("/{id}")
    public Accounts update(@PathVariable Long id,@RequestBody Accounts accounts){
        accounts.setId(id);
        return accountsRepository.save(accounts);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        accountsRepository.deleteById(id);
    }
}
