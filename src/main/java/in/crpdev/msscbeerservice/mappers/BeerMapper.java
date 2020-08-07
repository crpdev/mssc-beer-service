package in.crpdev.msscbeerservice.mappers;

import in.crpdev.msscbeerservice.domain.model.Beer;
import in.crpdev.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by rajapandian
 * Date: 07/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.mappers
 **/
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer beerDtoToBeer(final BeerDto beerDto);

    BeerDto beerToBeerDto(final Beer beer);
}
