package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Post {
    @NonNull
    private final String author;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;
}
