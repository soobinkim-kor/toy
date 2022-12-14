package com.soobin.toy.member.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
@Entity
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long memberId;

    @Column(nullable = false, length=50, name = "EMAIL")
    private String email;

    @Column(nullable = false, length=50, name = "NICKNAME")
    private String nickname;

    @Column(nullable = false, length=555, name = "PASSWORD")
    private String password;

    @Column(name="PICTURE", nullable = false)
    private String picture;

    @Column(name="CREATED_AT")
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(name="MODIFIED_AT")
    @LastModifiedDate
    private LocalDateTime modifiedAt;


    @Enumerated(value = EnumType.STRING)
    @Column(length=20,nullable = false)
    private ROLE role = ROLE.ROLE_USER;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public enum ROLE implements GrantedAuthority {
        ROLE_ADMIN("ROLE_ADMIN"),
        ROLE_USER("ROLE_USER");

        @Getter
        private String role;

        @Override
        public String getAuthority() {
            return name();
        }
    }
}

