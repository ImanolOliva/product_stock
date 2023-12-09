package com.todocode.bazar.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;

    private String name;

    private String tradeMark;

    private Integer cost;

    private Integer quantityAvailable;

    private Boolean state;
}
