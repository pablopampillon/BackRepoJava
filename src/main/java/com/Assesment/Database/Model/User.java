package com.Assesment.Database.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PabloPampillonParra")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "firstName", length = 25)
    private String firstName;

    @Column(name = "LastName", length = 25)
    private String lastName;

    @Column(name = "phoneNumber", length = 20)
    private String phoneNumber;

    @Column(name="email", length = 25)
    private String email;
}
