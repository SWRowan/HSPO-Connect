package com.rowan.HSPOConnect.Models;

import com.rowan.HSPOConnect.Models.Person.Offender;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class Calls {

    private long id;
    private Date date;
    private Offender offender;
    private Complainant complainant;


}
