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
// @RequestMapping(value="/lostServices")
@Transactional
public class LostServiceController {

    @Autowired
    LostServiceRepository lostServiceRepository;

    @RequestMapping(
        value = "/lostServices/lost",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public LostService lost(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody LostCommand lostCommand
    ) throws Exception {
        System.out.println("##### /lostService/lost  called #####");
        LostService lostService = new LostService();
        lostService.lost(lostCommand);
        lostServiceRepository.save(lostService);
        return lostService;
    }

    // @RequestMapping(
    //     value = "/lostServices/{id}/cancel",
    //     method = RequestMethod.PUT,
    //     produces = "application/json;charset=UTF-8"
    // )
    // public LostService cancel(
    //     @PathVariable(value = "id") Long id,
    //     @RequestBody CancelCommand cancelCommand,
    //     HttpServletRequest request,
    //     HttpServletResponse response
    // ) throws Exception {
    //     System.out.println("##### /lostService/cancel  called #####");
    //     Optional<LostService> optionalLostService = lostServiceRepository.findById(
    //         id
    //     );

    //     optionalLostService.orElseThrow(() -> new Exception("No Entity Found"));
    //     LostService lostService = optionalLostService.get();
    //     lostService.cancel(cancelCommand);

    //     lostServiceRepository.save(lostService);
    //     return lostService;
    // }

    // @RequestMapping(
    //     value = "/lostServices/phonelocation",
    //     method = RequestMethod.POST,
    //     produces = "application/json;charset=UTF-8"
    // )
    // public LostService phoneLocation(
    //     HttpServletRequest request,
    //     HttpServletResponse response,
    //     @RequestBody PhoneLocationCommand phoneLocationCommand
    // ) throws Exception {
    //     System.out.println("##### /lostService/phoneLocation  called #####");
    //     LostService lostService = new LostService();
    //     lostService.phoneLocation(phoneLocationCommand);
    //     lostServiceRepository.save(lostService);
    //     return lostService;
    // }
}
//>>> Clean Arch / Inbound Adaptor
