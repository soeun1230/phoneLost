package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RentCommand {

    private Long customerId;
    private Long rentPhoneId;
}
