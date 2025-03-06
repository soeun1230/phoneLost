package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CanceledPhoneLost extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long customerPhoneId;
    private String customerName;
    private String phoneNumber;
    private Date lostDate;
    private Date foundDate;
    private Integer status;

    public CanceledPhoneLost(LostService aggregate) {
        super(aggregate);
    }

    public CanceledPhoneLost() {
        super();
    }
}
//>>> DDD / Domain Event
