package io.sakila.actor.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.UUID;
@Entity
@Table(name = "actor", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActorModel {
    @Id
    @Column(name = "actor_id", nullable = false)
    UUID actorId;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "email")
    String email;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "dob")
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate dob;
    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    LocalDateTime lastUpdate;
}