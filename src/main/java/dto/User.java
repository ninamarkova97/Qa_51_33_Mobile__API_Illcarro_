package dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
//    username*ﾠstring
//    password*ﾠstring
//    firstName*ﾠstring
//    lastName*ﾠstring
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
