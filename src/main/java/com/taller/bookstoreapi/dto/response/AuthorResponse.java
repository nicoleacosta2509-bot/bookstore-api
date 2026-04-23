package com.taller.bookstoreapi.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
public class AuthorResponse {

    private Long id;
    private String name;
    private String biography;
}
