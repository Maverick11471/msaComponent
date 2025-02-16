package com.msacomponet.domain.format;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Component
public class LocalDateTimeFormatter implements
    com.msacomponet.domain.format.Formatter<LocalDateTime> {

    private final DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public String of(LocalDateTime target) {
        return Optional.ofNullable(target)
            .map(formatter::format)
            .orElse(null);
    }
}
