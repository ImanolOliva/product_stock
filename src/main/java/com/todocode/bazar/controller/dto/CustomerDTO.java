package com.todocode.bazar.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    private Long id;

    private String name;

    private String lastName;

    private Integer dni;

}
