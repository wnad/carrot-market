package com.carrotmarket.dto.location;

import com.carrotmarket.domain.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class LocationDto {

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private String doo;

        private String si;

        private String gu;

        private String dong;
    }


    @Data
    @Builder
    @AllArgsConstructor
    public static class Create {

        private String doo;

        private String si;

        private String gu;

        private String dong;

        public Location toEntity() {
            return Location.builder()
                    .doo(this.doo)
                    .si(this.si)
                    .gu(this.gu)
                    .dong(this.dong)
                    .build();
        }

    }

}
