package com.example.commonlib.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiErrorResponse {

    private int value;

    private HttpStatus.Series series;

    private String reasonPhrase;

    private String message;

    private List<Field> fields;

    public ApiErrorResponse(HttpStatus httpStatus, String message) {
        this.value = httpStatus.value();
        this.series = httpStatus.series();
        this.reasonPhrase = httpStatus.getReasonPhrase();
        this.message = message;
    }

    @Data
    @AllArgsConstructor
    public static class Field {

        private String name;

        private String message;
    }

    public void addField(String name, String message) {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        fields.add(new Field(name, message));
    }
}
