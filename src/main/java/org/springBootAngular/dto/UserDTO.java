package org.springBootAngular.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springBootAngular.enums.UserRole;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;

    private String username;

    //bcs we dont want to dislplay user password when we are showing ser information
    @JsonIgnore
    private String password;


    private String email;

    private String phoneNumber;


    private UserRole role;

    private final LocalDateTime createAt = LocalDateTime.now();


    private List<TransactionDTO> transactions;

}
