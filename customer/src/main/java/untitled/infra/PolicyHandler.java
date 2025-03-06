package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CustomerRepository customerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PhoneLost'"
    )
    public void wheneverPhoneLost_CustomerStatusChange(
        @Payload PhoneLost phoneLost
    ) {
        PhoneLost event = phoneLost;
        System.out.println(
            "\n\n##### listener CustomerStatusChange : " + phoneLost + "\n\n"
        );

        // Sample Logic //
        Customer.customerStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CanceledPhoneLost'"
    )
    public void wheneverCanceledPhoneLost_CustomerStatusChange(
        @Payload CanceledPhoneLost canceledPhoneLost
    ) {
        CanceledPhoneLost event = canceledPhoneLost;
        System.out.println(
            "\n\n##### listener CustomerStatusChange : " +
            canceledPhoneLost +
            "\n\n"
        );

        // Sample Logic //
        Customer.customerStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RentPhone'"
    )
    public void wheneverRentPhone_CustomerStatusChange(
        @Payload RentPhone rentPhone
    ) {
        RentPhone event = rentPhone;
        System.out.println(
            "\n\n##### listener CustomerStatusChange : " + rentPhone + "\n\n"
        );

        // Sample Logic //
        Customer.customerStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RentPhone'"
    )
    public void wheneverRentPhone_RentFeePay(@Payload RentPhone rentPhone) {
        RentPhone event = rentPhone;
        System.out.println(
            "\n\n##### listener RentFeePay : " + rentPhone + "\n\n"
        );

        // Sample Logic //
        Customer.rentFeePay(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
