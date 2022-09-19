package com.github.maleksandrowicz93.websiteresources.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    WEBSITE_ALREADY_EXISTS("WEBSITE_ALREADY_EXISTS", "Website already exists", HttpStatus.BAD_REQUEST),
    WEBSITE_NOT_FOUND("WEBSITE_NOT_FOUND", "Website not found", HttpStatus.NOT_FOUND),
    MALFORMED_URL("MALFORMED_URL", "Malformed url", HttpStatus.BAD_REQUEST),
    UNKNOWN_ERROR("UNKNOWN_ERROR", "Unknown error", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}