package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/rentServices")
@Transactional
public class RentServiceController {

    @Autowired
    RentServiceRepository rentServiceRepository;

    @RequestMapping(
        value = "/rentServices/rent",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public RentService rent(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody RentCommand rentCommand
    ) throws Exception {
        System.out.println("##### /rentService/rent  called #####");
        RentService rentService = new RentService();
        rentService.rent(rentCommand);
        rentServiceRepository.save(rentService);
        return rentService;
    }
}
//>>> Clean Arch / Inbound Adaptor
