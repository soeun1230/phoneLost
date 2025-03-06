package untitled.domain;

import untitled.RentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


@Entity
@Table(name="RentService_table")
@Data

//<<< DDD / Aggregate Root
public class RentService  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long customerId;
    
    
    
    
    private Long rentPhoneId;
    
    
    
    
    private String customerName;
    
    
    
    
    private Integer fee;
    
    
    
    
    private Integer rentDays;
    
    
    
    
    private Date rentDate;
    
    
    
    
    private Date returnDate;


    public static RentServiceRepository repository(){
        RentServiceRepository rentServiceRepository = RentApplication.applicationContext.getBean(RentServiceRepository.class);
        return rentServiceRepository;
    }



//<<< Clean Arch / Port Method
    public void rent(RentCommand rentCommand){
        
        //implement business logic here:
        

        Customer customer = RentServiceApplication.applicationContext
            .getBean(untitled.external.CustomerService.class)
            .customerInfo(get??);

        RentPhone rentPhone = new RentPhone(this);
        rentPhone.publishAfterCommit();
    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
