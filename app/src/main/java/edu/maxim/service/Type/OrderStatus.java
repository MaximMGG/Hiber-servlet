package edu.maxim.service.Type;

import java.util.Arrays;
import java.util.Optional;

public enum OrderStatus {
    DELETE,
    UPDATE,
    INSERT;

    public static Optional<OrderStatus> find(String status) {
        return Arrays.stream(values())
                        .filter(it -> it.name().equals(status))
                        .findFirst();

    }
}
