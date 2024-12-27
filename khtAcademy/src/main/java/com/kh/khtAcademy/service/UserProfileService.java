package com.kh.khtAcademy.service;

import com.kh.khtAcademy.dto.User;

import java.util.List;
import java.util.Map;

public interface UserProfileService {
    // service로 사용할 기능 설정

    // html로 서비스 기능을 통해 나타난 결과를 보여줄 기능들 작성

    // 모든 유저 보기 기능

    List<Map<String, Object>> getAllUsers();

    // 유저 저장하기 기능
    void insertUser(User user);

    String findByUsername(String email);

    // 유저이름, 성별로 이메일  찾기 기능
    String findByEmail(String username, String gender);
    // 유저 상세보기
    User getUser(int userId);


}
