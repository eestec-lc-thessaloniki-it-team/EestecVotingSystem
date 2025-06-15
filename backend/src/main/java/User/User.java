package User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity  // This is for SpringBoot to see each object as a row in the DB
@Getter // Setter and Getter BoilerPlate are handled by Lombok and the
@Setter
@NoArgsConstructor // That's why we don't have a constructor
@AllArgsConstructor // --//--
@Builder // This makes the instantiation more readable
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String Name;
    @NotBlank(message = "Surname is required")
    private String Surname;
    @NotBlank(message = "Email is required")
    private String Email;


//    @Enumerated(EnumType.STRING)
//    private UserRole role;
}
