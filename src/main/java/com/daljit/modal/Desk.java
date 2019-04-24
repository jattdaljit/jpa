package com.daljit.modal;

import javax.persistence.*;

@Entity
@Table(name = "desk", catalog = "test")
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
