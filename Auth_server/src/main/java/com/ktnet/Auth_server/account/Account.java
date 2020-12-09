package com.ktnet.Auth_server.account;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Account {

    @Id @GeneratedValue
    private Integer id;
    private String email;
    private String password;

    // NOTE : 여러개의 ENUM 을 가지므로 ElementCollection을 이용한다.
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<AccountRole> roles;
}
