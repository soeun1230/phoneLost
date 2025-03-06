package untitled.domain;

import untitled.LostApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="LostService_table")
@Data

//<<< DDD / Aggregate Root
public class LostService  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long customerId;

    private Long customerPhoneId;

    private String customerName;

    private String phoneNumber;

    private Date lostDate;

    private Date foundDate;
    
    private Integer status;


    public static LostServiceRepository repository(){
        LostServiceRepository lostServiceRepository = LostApplication.applicationContext.getBean(LostServiceRepository.class);
        return lostServiceRepository;
    }

    public void lost(LostCommand lostCommand){
        
        PhoneLost phoneLost = new PhoneLost();
    
        // LostCommand의 데이터 매핑
        phoneLost.setCustomerId(lostCommand.getCustomerId());
        phoneLost.setCustomerPhoneId(lostCommand.getCustomerPhoneId());
        phoneLost.setCustomerName(lostCommand.getCustomerName());
        phoneLost.setPhoneNumber(lostCommand.getPhoneNumber());
        phoneLost.setLostDate(lostCommand.getLostDate());
        phoneLost.setStatus(1);
        
        // 필요한 추가 작업 후 메시지 발행
        phoneLost.publishAfterCommit();
        
        // // Customer customer = LostServiceApplication.applicationContext
        // //     .getBean(untitled.external.CustomerService.class);
        // //     //.customerInfo(get??);
    }


//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
//     public void cancel(CancelCommand cancelCommand){
        
//         //implement business logic here:
        

//         Customer customer = LostServiceApplication.applicationContext
//             .getBean(untitled.external.CustomerService.class)
//             .customerInfo(get??);

//         CanceledPhoneLost canceledPhoneLost = new CanceledPhoneLost(this);
//         canceledPhoneLost.publishAfterCommit();
//     }
// //>>> Clean Arch / Port Method
// //<<< Clean Arch / Port Method
//     public void phoneLocation(PhoneLocationCommand phoneLocationCommand){
        
//         //implement business logic here:
        

//         CustomerPhone customerPhone = LostServiceApplication.applicationContext
//             .getBean(untitled.external.CustomerPhoneService.class)
//             .phoneStatus(get??);

//         LocationProvided locationProvided = new LocationProvided(this);
//         locationProvided.publishAfterCommit();
//     }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
