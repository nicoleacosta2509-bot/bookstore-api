package com.taller.bookstoreapi.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class CategoryRequest {

    @NotBlank
    private String name;
}