package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "rentphone", url = "${api.url.rentphone}")
public interface PossibleRentPhoneService {
    @GetMapping(path = "/possibleRentPhones")
    public List<PossibleRentPhone> getPossibleRentPhone();

    @GetMapping(path = "/possibleRentPhones/{id}")
    public PossibleRentPhone getPossibleRentPhone(@PathVariable("id") Long id);
}
