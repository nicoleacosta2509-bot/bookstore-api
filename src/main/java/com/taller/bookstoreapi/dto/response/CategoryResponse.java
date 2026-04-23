package com.taller.bookstoreapi.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
public class CategoryResponse {

    private Long id;
    private String name;
}
