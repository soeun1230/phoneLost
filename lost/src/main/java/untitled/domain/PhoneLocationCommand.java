package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PhoneLocationCommand {

    private Long customerId;
    private Long customerPhoneId;
}
