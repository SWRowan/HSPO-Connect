package com.rowan.HSPOConnect.Models.Person;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Offender extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long OffenderID;


}
