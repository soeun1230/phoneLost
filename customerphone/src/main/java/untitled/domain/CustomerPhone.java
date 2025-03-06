package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.CustomerphoneApplication;

@Entity
@Table(name = "CustomerPhone_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    private Long customerId;

    private Integer status;

    private String phoneKind;

    public static CustomerPhoneRepository repository() {
        CustomerPhoneRepository customerPhoneRepository = CustomerphoneApplication.applicationContext.getBean(
            CustomerPhoneRepository.class
        );
        return customerPhoneRepository;
    }

    //<<< Clean Arch / Port Method
    public static void customerPhoneStatusChange(PhoneLost phoneLost) {
        //implement business logic here:

        /** Example 1:  new item 
        CustomerPhone customerPhone = new CustomerPhone();
        repository().save(customerPhone);

        */

        /** Example 2:  finding and process
        

        repository().findById(phoneLost.get???()).ifPresent(customerPhone->{
            
            customerPhone // do something
            repository().save(customerPhone);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void customerPhoneStatusChange(
        CanceledPhoneLost canceledPhoneLost
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        CustomerPhone customerPhone = new CustomerPhone();
        repository().save(customerPhone);

        */

        /** Example 2:  finding and process
        

        repository().findById(canceledPhoneLost.get???()).ifPresent(customerPhone->{
            
            customerPhone // do something
            repository().save(customerPhone);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
