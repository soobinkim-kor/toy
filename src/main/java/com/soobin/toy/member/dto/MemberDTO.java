package com.soobin.toy.member.dto;

import com.soobin.toy.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MemberDTO {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JwtResponse{
        private long id;
        private String email;
        private String nickname;
        private String picture;
        private Member.ROLE role;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Post{
        private String email;
        private String password;
        private String nickname;
        //private Member.ROLE role;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response{
        private long id;
        private String email;
        private String nickname;
        private String picture;
        private Member.ROLE role;
        private LocalDateTime createdDate;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Patch {
        private String email;
        private String password;
        private String nickname;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Login {
        private String email;
        private String password;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostResponse{   // 게시글 목록 조회 응답용 DTO
        private long memberId;
        private String nickname;
        private String picture;

        private String email;
        public PostResponse(Member member) {
            this.memberId = member.getMemberId();
            this.nickname = member.getNickname();
            this.picture = member.getPicture();
            this.email = member.getEmail();
        }
    }
}

