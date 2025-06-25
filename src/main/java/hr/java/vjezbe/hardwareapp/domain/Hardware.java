package hr.java.vjezbe.hardwareapp.domain;

import hr.java.vjezbe.hardwareapp.dto.HardwareDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "hardware")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hardware {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
    private String code;
    private long stock;
    private BigDecimal price;

//    public Hardware(String name, Type type, String code, long stock, BigDecimal price) {
//        this.name = name;
//        this.type = type;
//        this.code = code;
//        this.stock = stock;
//        this.price = price;
//    }

//    public Hardware(HardwareDTO hardwareDTO) {
//        this.name = hardwareDTO.getName();
//        this.type = hardwareDTO.getType();
//        this.code = hardwareDTO.getCode();
//        this.stock = hardwareDTO.getStock();
//        this.price = hardwareDTO.getPrice();
//    }

//    public String getName() {
//        return name;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public long getStock() {
//        return stock;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hardware hardware = (Hardware) o;
        return stock == hardware.stock && Objects.equals(name, hardware.name) && type == hardware.type && Objects.equals(code, hardware.code) && Objects.equals(price, hardware.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, code, stock, price);
    }
}
