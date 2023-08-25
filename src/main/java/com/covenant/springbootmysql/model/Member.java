package com.covenant.springbootmysql.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @JsonBackReference
    @OneToMany(mappedBy = "member",
                fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Lend> lends;


}
