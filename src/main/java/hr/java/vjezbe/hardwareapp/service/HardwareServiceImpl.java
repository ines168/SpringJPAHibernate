package hr.java.vjezbe.hardwareapp.service;

import hr.java.vjezbe.hardwareapp.domain.Hardware;
import hr.java.vjezbe.hardwareapp.dto.HardwareDTO;
import hr.java.vjezbe.hardwareapp.repository.SpringDataHardwareRepository;
import hr.java.vjezbe.hardwareapp.repository.SpringDataTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HardwareServiceImpl implements HardwareService{

    private final SpringDataHardwareRepository hardwareRepository;
    private final SpringDataTypeRepository typeRepository;

    public HardwareServiceImpl(SpringDataHardwareRepository hardwareRepository, SpringDataTypeRepository typeRepository) {
        this.hardwareRepository = hardwareRepository;
        this.typeRepository = typeRepository;
    }

    @Override
    public List<HardwareDTO> findAll() {
        return hardwareRepository.findAll().stream().map(HardwareDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<HardwareDTO> findByCode(String code) {
        return hardwareRepository.findByCode(code).stream().map(HardwareDTO::new).toList();
    }

    @Override
    public HardwareDTO save(HardwareDTO hardwareDTO) {
        return mapToDTO(hardwareRepository.save(mapToEntity(hardwareDTO)));
    }

    @Override
    public void deleteById(int id) {
        hardwareRepository.deleteById(id);
    }

    private HardwareDTO mapToDTO(Hardware hardware){
        HardwareDTO hardwareDTO = new HardwareDTO();

        hardwareDTO.setName(hardware.getName());
        hardwareDTO.setCode(hardware.getCode());
        hardwareDTO.setStock(hardware.getStock());
        hardwareDTO.setPrice(hardware.getPrice());
        hardwareDTO.setType(hardware.getType().getName());

        return  hardwareDTO;
    }

    private Hardware mapToEntity(HardwareDTO hardwareDTO){
        Hardware hardware = new Hardware();
        hardware.setName(hardwareDTO.getName());
        hardware.setCode(hardwareDTO.getCode());
        hardware.setStock(hardwareDTO.getStock());
        hardware.setPrice(hardwareDTO.getPrice());
        hardware.setType(typeRepository.findByName(hardwareDTO.getType()));

        return  hardware;
    }

}
