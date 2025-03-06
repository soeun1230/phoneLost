package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.CustomerApplication;

@Entity
@Table(name = "Customer_table")
@Data
//<<< DDD / Aggregate Root
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private Integer status;

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = CustomerApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }

    //<<< Clean Arch / Port Method
    public static void customerStatusChange(PhoneLost phoneLost) {
        //implement business logic here:

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        

        repository().findById(phoneLost.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void customerStatusChange(
        CanceledPhoneLost canceledPhoneLost
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        

        repository().findById(canceledPhoneLost.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void customerStatusChange(RentPhone rentPhone) {
        //implement business logic here:

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        

        repository().findById(rentPhone.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void rentFeePay(RentPhone rentPhone) {
        //implement business logic here:

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        

        repository().findById(rentPhone.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
