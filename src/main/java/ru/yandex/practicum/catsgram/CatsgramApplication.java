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

@SpringBootApplication
public class CatsgramApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatsgramApplication.class, args);
    }
}
