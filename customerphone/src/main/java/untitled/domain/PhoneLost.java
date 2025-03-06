package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class PhoneLost extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long customerPhoneId;
    private String customerName;
    private String phoneNumber;
    private Date lostDate;
    private Date foundDate;
    private Integer status;
}
