package com.example.demo.domain.member.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.security.SecureRandom;

// 정보를 꺼내 보는 용도이므로 굳이 entity를 만들  필요가 없음
@Getter
@ToString
@RequiredArgsConstructor
public class MemberLoginRequest {

    private  final String email;
    private  final String password;
}
