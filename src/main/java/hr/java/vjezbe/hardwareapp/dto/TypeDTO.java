package hr.java.vjezbe.hardwareapp.dto;

import hr.java.vjezbe.hardwareapp.domain.Type;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TypeDTO {
    private long id;
    private String name;

    public TypeDTO(Type type) {
        this.id = type.getId();
        this.name = type.getName();
    }
}
