package com.example.demo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    protected User() {
    }
    public User(String email, String password, Collection< Role > roles) {

        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;



    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }


    @Column(name = "email")
    private String email;

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String username){
        this.email=username;
    }


    @Column(name = "password")
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "role_id"))

    private Collection <Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RegionInformation> regionInformations;

    public Set<RegionInformation> getRegionInformations() {
        return regionInformations;
    }

    public void setRegionInformations(Set<RegionInformation> regionInformations) {
        this.regionInformations = regionInformations;
    }

    public void setRoles(Collection<Role> roles){
        this.roles = roles;
    }
    public Collection<Role> getRoles(){
        return this.roles;
    }

    // other getters and setters are hidden for brevity
}