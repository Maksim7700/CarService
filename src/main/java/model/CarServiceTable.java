package model;

import enumeration.CarBrand;
import enumeration.TypeEngine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarServiceTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "brand")
    private CarBrand brand;
    @Column(name = "model")
    private String model;
    @Column(name = "graduation_year")
    private Integer graduation_year;
    @Column(name = "price")
    private Integer price;
    @Column(name = "color")
    private String color;
    @Column(name = "type_engine")
    private TypeEngine type_engine;
    @Column(name = "VIN_code")
    private String VIN_code;


}
