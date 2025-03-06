package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "PossibleRentPhone_table")
@Data
public class PossibleRentPhone {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String phoneNumber;
    private String phoneKind;
    private Integer status;
}
