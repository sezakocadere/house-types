package entity;

import enums.HouseType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class House {
    private HouseType type;
    private BigDecimal price;
    private int area;
    private int numberOfRoom;
    private int numberOfLivingRoom;
}