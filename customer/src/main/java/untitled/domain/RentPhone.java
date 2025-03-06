package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class RentPhone extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long rentPhoneId;
    private String customerName;
    private Integer fee;
    private Integer rentDays;
    private Date rentDate;
    private Date returnDate;
}
