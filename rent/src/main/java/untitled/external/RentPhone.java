package untitled.external;

import java.util.Date;
import lombok.Data;

@Data
public class RentPhone {

    private Long id;
    private String phoneNumber;
    private Integer status;
    private String phoneKind;
}
