package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// annotation shows spring boot that it's the main config of the app
// REST - architecture of API.
// 1) client-server architecture, server's point is to give information
// 2) Stateless - server doesn't contain info about client's state
// 3) Request interface looks the same without changing from client to client
// 4) Multi layered architectures where one server serves one purpose
// 5) Caching - cache data on a client and when asked for it again give it from client's cache
// 6) Code on demand - client's functionality can be extended by server's code response

// Resource in REST - data in all shapes and data types
// to name them mostly nouns are used e.g. /posts, /api/starships
// /posts/{post-id}/author and etc
// slash is used like a hierarchy of the resource
// slash in the end is used if the resource has child URLS, if not - better to not use
// use "-" instead of "_" and do not put words together
// do not specify HTTP method in the resource name, API will know it auto
// HTTP has variuos methods e.g. PUT - changes existind data or writes new, PATCH - small changes in existing
// PUT, PATCH, DELETE AND POST are not safe methods cuz they can change the resource
// idempotent methods are the ones that don't change anything if called many times

// apps code should be divided into 3 pieces: logic(business logic), data storage and API handlintg
@SpringBootApplication
public class CatsgramApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatsgramApplication.class, args);
    }
}
