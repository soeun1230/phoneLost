package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
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

    public RentPhone(RentService aggregate) {
        super(aggregate);
    }

    public RentPhone() {
        super();
    }
}
//>>> DDD / Domain Event
