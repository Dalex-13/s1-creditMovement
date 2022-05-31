package com.nttdata.entitys;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "CreditMovement")
public class CreditMovement {

    @Id
    private String id;
    private String amount;
    private String startDate;
    private String payday;
    private String comision;
    private String description;
    private String idCredit;
}
