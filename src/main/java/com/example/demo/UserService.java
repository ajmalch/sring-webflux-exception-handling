package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    public Mono<ServerResponse> getUser(ServerRequest serverRequest) {
        throw new ResourceNotFoundException("User not Found");
    }
}
