package com.petClinic.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


}
