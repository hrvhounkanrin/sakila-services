package io.sakila.actor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.*;

@Data
public class ActorDto {
    @JsonProperty("actorId")
    UUID actorId;
    @JsonProperty("firstName")
    @NotNull
    String firstName;
    @JsonProperty("lastName")
    @NotNull
    String lastName;
    @JsonProperty("email")
    @Email(regexp = ".+[@].+[\\.].+")
    String email;
    @JsonProperty("phoneNumber")
    @Pattern(regexp = "/^(\\+33 |0)[1-9]( \\d\\d){4}$/")
    String phoneNumber;
    @JsonProperty("dob")
    LocalDate dob;
}
