package com.carrotmarket.dto.user;

import com.carrotmarket.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class UserDto {

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private String profileImg;

        private String profileNickname;

        private Double mannerTemperature;

        private String loginId;

        private String loginPwd;

        private Long neighbor1;

        private Long neighbor2;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class Create {

        private String profileImg;

        private String profileNickname;

        private Double mannerTemperature;

        private String loginId;

        private String loginPwd;

        private Long neighbor1;

        private Long neighbor2;

        public User toEntity() {
            return User.builder()
                    .profileImg(this.profileImg)
                    .profileNickname(this.profileNickname)
                    .mannerTemperature(this.mannerTemperature)
                    .loginId(this.loginId)
                    .loginPwd(this.loginPwd)
                    .build();
        }

    }

}
