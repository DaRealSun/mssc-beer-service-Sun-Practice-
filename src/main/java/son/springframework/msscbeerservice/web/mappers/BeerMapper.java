package son.springframework.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import son.springframework.msscbeerservice.domain.Beer;
import son.springframework.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}