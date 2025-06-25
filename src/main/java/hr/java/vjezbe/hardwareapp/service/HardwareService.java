package hr.java.vjezbe.hardwareapp.service;

import hr.java.vjezbe.hardwareapp.dto.HardwareDTO;
import hr.java.vjezbe.hardwareapp.dto.TypeDTO;

import java.util.List;
import java.util.Optional;

public interface HardwareService {

    List<HardwareDTO> findAll();

    List<HardwareDTO> findByCode(String code);

}
