package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "rentServices",
    path = "rentServices"
)
public interface RentServiceRepository
    extends PagingAndSortingRepository<RentService, Long> {}
