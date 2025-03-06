package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.RentphoneApplication;

@Entity
@Table(name = "RentPhone_table")
@Data
//<<< DDD / Aggregate Root
public class RentPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    private Integer status;

    private String phoneKind;

    public static RentPhoneRepository repository() {
        RentPhoneRepository rentPhoneRepository = RentphoneApplication.applicationContext.getBean(
            RentPhoneRepository.class
        );
        return rentPhoneRepository;
    }

    //<<< Clean Arch / Port Method
    public static void rentPhoneStatusChange(RentPhone rentPhone) {
        //implement business logic here:

        /** Example 1:  new item 
        RentPhone rentPhone = new RentPhone();
        repository().save(rentPhone);

        */

        /** Example 2:  finding and process
        

        repository().findById(rentPhone.get???()).ifPresent(rentPhone->{
            
            rentPhone // do something
            repository().save(rentPhone);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
