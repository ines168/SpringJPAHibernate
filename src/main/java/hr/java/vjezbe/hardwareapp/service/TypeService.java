package hr.java.vjezbe.hardwareapp.service;

import hr.java.vjezbe.hardwareapp.dto.TypeDTO;

import java.util.List;

public interface TypeService {
    List<TypeDTO> findAll();

    List<TypeDTO> findById(int id);
}
