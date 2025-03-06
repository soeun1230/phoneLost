package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CustomerPhoneHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerPhone>> {

    @Override
    public EntityModel<CustomerPhone> process(
        EntityModel<CustomerPhone> model
    ) {
        return model;
    }
}
