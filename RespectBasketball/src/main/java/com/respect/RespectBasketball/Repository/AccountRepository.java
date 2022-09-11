package com.respect.RespectBasketball.Repository;


import com.respect.RespectBasketball.Model.AccountListModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountListModel, String> {
}

