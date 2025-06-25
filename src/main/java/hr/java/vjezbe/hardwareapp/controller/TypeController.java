package hr.java.vjezbe.hardwareapp.controller;

import hr.java.vjezbe.hardwareapp.dto.TypeDTO;
import hr.java.vjezbe.hardwareapp.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type")
@AllArgsConstructor
public class TypeController {
    private final TypeService typeService;

    @GetMapping
    public ResponseEntity<List<TypeDTO>> getAll() {
        return ResponseEntity.ok(typeService.findAll().stream().toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<List<TypeDTO>> getById(@PathVariable int id) {
        return ResponseEntity.ok(typeService.findById(id).stream().toList());
    }
}
