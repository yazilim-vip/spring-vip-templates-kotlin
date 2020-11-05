package vip.yazilim.libs.springvip.template.example;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "person")
@Data // just for lombok. Not required!!
public class Person {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String career;
}