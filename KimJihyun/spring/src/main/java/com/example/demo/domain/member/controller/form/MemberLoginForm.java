package com.example.demo.domain.member.controller.form;

//form이 request로 간다.
// form은 entity (=가장 핵심이 되는 규칙)을 만든다.
import com.example.demo.domain.member.service.request.MemberLoginRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberLoginForm {

    private String email;
    private String password;

    public MemberLoginRequest toMemberLoginRequest() {
        return new MemberLoginRequest(email, password);
    }
}