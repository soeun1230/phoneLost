package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class LostServiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostService>> {

    @Override
    public EntityModel<LostService> process(EntityModel<LostService> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/lost")
                .withRel("lost")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/cancel")
                .withRel("cancel")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/phonelocation")
                .withRel("phonelocation")
        );

        return model;
    }
}
