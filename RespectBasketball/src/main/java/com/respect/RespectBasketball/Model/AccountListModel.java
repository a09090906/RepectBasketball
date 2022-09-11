package com.respect.RespectBasketball.Model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "AccountList")
public class AccountListModel {
    public String _id;
    public String Account;
    public String Password;
    public String Name;
    public String Email;
}
