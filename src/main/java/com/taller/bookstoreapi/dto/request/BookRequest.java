package com.taller.bookstoreapi.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Integer stock;

    @NotNull
    private Long authorId;

    private List<Long> categoryIds;
}
