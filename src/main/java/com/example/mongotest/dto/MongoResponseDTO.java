package com.example.mongotest.dto;

import com.example.mongotest.entity.Jamsil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class MongoResponseDTO {

    @Getter
    @Setter
    public static class JamsilDTO {
        private List<Jamsil> jamsilList;
        public JamsilDTO(List<Jamsil> list) {
            this.jamsilList = list;
        }
    }
}
