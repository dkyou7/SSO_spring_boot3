package com.ktnet.Auth_server.info;

import com.ktnet.Auth_server.account.Account;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class Info {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Account manager;
}
