package com.isaguler.k8sdemoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("company")
public class Company {

    @Id
    private String id;

    private String name;

    private Point location;

    private Set<String> tags = new HashSet<>();

    private Integer yearFounded;

    private String url;
}
