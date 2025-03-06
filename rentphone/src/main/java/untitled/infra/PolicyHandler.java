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
    RentPhoneRepository rentPhoneRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RentPhone'"
    )
    public void wheneverRentPhone_RentPhoneStatusChange(
        @Payload RentPhone rentPhone
    ) {
        RentPhone event = rentPhone;
        System.out.println(
            "\n\n##### listener RentPhoneStatusChange : " + rentPhone + "\n\n"
        );

        // Sample Logic //
        RentPhone.rentPhoneStatusChange(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
