package com.zemoso.FundRaiser.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Integer role_id;

    @Column(name = "role_name")
    private String role_name;

//    @ManyToMany(mappedBy = "roles")
    @OneToMany(targetEntity = User.class)
    private Collection<User> users;

    public Role(){

    }

    public Role(Integer role_id, String role_name, Collection<User> users) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.users = users;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Collection<User> getUsers() {
        return users;
    }


    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                ", users=" + users +
                '}';
    }
}
