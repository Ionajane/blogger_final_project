package com.example.GossipGirl.models;
import javax.persistence.*;


@Entity
@Table(name= "journalists")

public class Journalist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "first_name")
    private String fName;

    @Column(name= "last_name")
    private String lName;

    @Column(name= "field")
    private String field;


    //constructor
    public Journalist(String fName, String lName, String field) {
        this.fName = fName;
        this.lName = lName;
        this.field = field;
    }

    //empty constructor
    public Journalist() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
