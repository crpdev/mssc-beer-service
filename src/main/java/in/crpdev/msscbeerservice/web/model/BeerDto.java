package in.crpdev.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 01/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.web.model
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;
    private BeerStyle beerStyle;
    private Integer upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
