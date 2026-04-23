package com.taller.bookstoreapi.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class AuthorRequest {

    @NotBlank
    private String name;

    private String biography;
}
