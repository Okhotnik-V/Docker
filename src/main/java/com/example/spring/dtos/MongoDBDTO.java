package com.example.spring.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class MongoDBDTO {

    @Id
    public String id;
    public String textMongoDB;

    public MongoDBDTO(String textMongoDB) {
        this.textMongoDB = textMongoDB;
    }

    @Override
    public String toString() {
        return String.format("MongoDBDTO[id=%s, textMongoDB='%s']", id, textMongoDB);
    }
}