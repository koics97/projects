package com.example.gokart.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "applied_riders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppliedRider {

    @Id
    @Column
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "postal_code")
    private int postalCode;
    private String city;
    private String address;
    private String email;
}
