package hr.java.vjezbe.hardwareapp.service;

import hr.java.vjezbe.hardwareapp.dto.HardwareDTO;
import hr.java.vjezbe.hardwareapp.dto.TypeDTO;
import hr.java.vjezbe.hardwareapp.repository.SpringDataHardwareRepository;
import hr.java.vjezbe.hardwareapp.repository.SpringDataTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeServiceImp implements TypeService{

    private final SpringDataHardwareRepository hardwareRepository;
    private final SpringDataTypeRepository typeRepository;

    public TypeServiceImp(SpringDataHardwareRepository hardwareRepository, SpringDataTypeRepository typeRepository) {
        this.hardwareRepository = hardwareRepository;
        this.typeRepository = typeRepository;
    }

    @Override
    public List<TypeDTO> findAll() {
        return typeRepository.findAll().stream().map(TypeDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<TypeDTO> findById(int id) {
        return typeRepository.findById(id).stream().map(TypeDTO::new).toList();
    }
}
