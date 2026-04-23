package com.taller.bookstoreapi.config;

import com.taller.bookstoreapi.entity.*;
import com.taller.bookstoreapi.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) {

        User admin = User.builder()
                .name("Admin")
                .email("admin@test.com")
                .password("1234")
                .role(Role.ROLE_ADMIN)
                .build();

        userRepository.save(admin);

        // ✍️ Autor
        Author author = Author.builder()
                .name("Gabriel Garcia Marquez")
                .biography("Autor colombiano")
                .build();

        authorRepository.save(author);

        // 📚 Categoría
        Category category = Category.builder()
                .name("Novela")
                .build();

        categoryRepository.save(category);

        // 📖 Libro
        Book book = Book.builder()
                .title("Cien Años de Soledad")
                .isbn("123456")
                .price(new BigDecimal("50000"))
                .stock(10)
                .author(author)
                .categories(List.of(category))
                .build();

        bookRepository.save(book);
    }
}
