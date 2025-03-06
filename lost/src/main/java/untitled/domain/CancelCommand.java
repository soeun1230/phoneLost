package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CancelCommand {

    private Long customerId;
    private Long customerPhoneId;
    private Long id;
    private Date foundDate;
}
