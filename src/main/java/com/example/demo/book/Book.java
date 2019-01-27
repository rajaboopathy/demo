package com.example.demo.book;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"auth","nm","version","identifier"})
public class Book {
    @JsonProperty("identifier")
    private Long id;
    private String version;
    @JsonProperty("nm")
    private String name;
    @JsonProperty("auth")
    private String author;
}
