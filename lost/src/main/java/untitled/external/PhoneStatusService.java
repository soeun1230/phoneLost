// package untitled.external;

// import java.util.Date;
// import java.util.List;
// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// @FeignClient(name = "customerphone", url = "${api.url.customerphone}")
// public interface PhoneStatusService {
//     @GetMapping(path = "/phoneStatuses")
//     public List<PhoneStatus> getPhoneStatus();

//     @GetMapping(path = "/phoneStatuses/{id}")
//     public PhoneStatus getPhoneStatus(@PathVariable("id") Long id);
// }
