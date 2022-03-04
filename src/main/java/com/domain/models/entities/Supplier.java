package com.domain.models.entities;

import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tbl_suppliers")
@Setter
@Getter
public class Supplier implements Serializable {


    private static final long serialVersionUID = 4885562230127870790L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String address;

    @Column(length = 100, nullable = false, unique = true )
    private String email;

    @ManyToMany(mappedBy = "suppliers")
    private Set<Product> products;

}
