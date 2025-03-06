package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class RentServiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RentService>> {

    @Override
    public EntityModel<RentService> process(EntityModel<RentService> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/rent")
                .withRel("rent")
        );

        return model;
    }
}
