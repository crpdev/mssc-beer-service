package in.crpdev.msscbeerservice.domain.repository;

import in.crpdev.msscbeerservice.domain.model.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 03/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.domain.repository
 **/
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
