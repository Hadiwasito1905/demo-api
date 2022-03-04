package com.domain.dto;

import lombok.Data;


import javax.validation.constraints.NotEmpty;

@Data
public class CategoryData {

    @NotEmpty(message = "Nama tidak boleh kosong")
    private String name;


}
