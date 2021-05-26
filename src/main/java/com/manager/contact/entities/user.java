package com.manager.contact.entities;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String imgURL;
    private String about;
    private boolean enabled;
}
