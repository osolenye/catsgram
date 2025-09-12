package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Post {
    private Integer id; // to get a specific post by id
    @NonNull
    private final String author;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;
}
