package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer", url = "${api.url.customer}")
public interface CustomerInfoService {
    @GetMapping(path = "/customerInfos")
    public List<CustomerInfo> getCustomerInfo();

    @GetMapping(path = "/customerInfos/{id}")
    public CustomerInfo getCustomerInfo(@PathVariable("id") Long id);

    @GetMapping(path = "/customerInfos")
    public List<CustomerInfo> getCustomerInfo();

    @GetMapping(path = "/customerInfos/{id}")
    public CustomerInfo getCustomerInfo(@PathVariable("id") Long id);
}
