package com.domain.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_catgories")
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = -3619983811486303843L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Column(name = "product_name",length = 100, nullable = false, unique = true)
    private String name;


}
