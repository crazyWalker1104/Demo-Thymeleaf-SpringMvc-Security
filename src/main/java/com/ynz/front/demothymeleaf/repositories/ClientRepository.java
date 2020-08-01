package com.ynz.front.demothymeleaf.repositories;

import com.ynz.front.demothymeleaf.Entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
