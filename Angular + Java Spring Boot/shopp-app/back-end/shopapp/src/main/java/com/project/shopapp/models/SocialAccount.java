package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "social_account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SocialAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tự động tăng lên 1
    private Long id;

    @Column(name = "provider", nullable = false, length = 20)
    private String provider;

    @Column(name = "provider_id", length = 50)
    private String providerId;

    @Column(name = "name", length = 150)
    private String name;

    @Column(name = "email", length = 150)
    private String email;
}
