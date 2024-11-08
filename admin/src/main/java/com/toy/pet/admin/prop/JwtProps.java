package com.toy.pet.admin.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("com.aloha.jwt")
public class JwtProps {

    // com.aloha.jwt.secretKey로 지정된 프로퍼티 값을 주입받는 필드
    // ✅ com.aloha.jwt.secret-key ➡ secretKey : {인코딩된 시크릿 키}
    private String secretKey;
}
