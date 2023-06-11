package son.springframework.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import son.springframework.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
