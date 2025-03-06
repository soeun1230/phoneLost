package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class LostCommand {

    private Long customerId;
    private Long customerPhoneId;
    private String customerName;
    private String phoneNumber;
    private Date lostDate;
}
