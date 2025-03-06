package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class RentPhoneHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RentPhone>> {

    @Override
    public EntityModel<RentPhone> process(EntityModel<RentPhone> model) {
        return model;
    }
}
