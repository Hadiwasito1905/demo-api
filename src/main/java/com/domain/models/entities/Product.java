package com.domain.models.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_product")
@NoArgsConstructor
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = 4191527379433298354L;
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Nama tidak boleh kosong")
    @Column (name="product_name", length=100)
    private String name;

    @NotEmpty(message = "Deskripsi tidak boleh kosong")
    @Column(name = "product_description", length = 1000) 
    private String description;

    private double price;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(name = "tbl_product_supplier",
               joinColumns = @JoinColumn(name = "product_id"),
               inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private Set<Supplier> suppliers;



}
