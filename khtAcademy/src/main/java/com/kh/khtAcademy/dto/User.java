package com.kh.khtAcademy.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor // 필수 생성자
@NoArgsConstructor // 기본 생성자
@Setter // setter
@Getter // getter
@ToString // toString
public class User {
    @Id // primary key 표기로 id는 맨 위에 작성
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 숫자가 자동증가임을 설정
    private int userId;
    private String username;
    private String email;
    private String profileImagePath;
    /*
private String birthdate;
birthdate SQL 에서는 DATE 타입
         JAVA 에서는 String 타입
         만약 SQL에서 DATE 타입인 자료형을 JAVA에서 String 타입으로 사용하려면
         mybatis-config.xml 에서
         SQL DATE 타입을 String으로 받아서 가져오겠다 는 형식 변환 표기
private Date birthdate;
    birthdate SQL 에서는 DATE 타입
             JAVA 에서는 DATE 타입을 사용한다면
             import java.util.Date를 가져와서 사용할 것!
 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    private String accountBalance;
    private String gender;
    private String hobbies;

//
//    public User() {}
//
//    public User(int userId, String username, String email, String birthday, String account_balance, String gender, String hobbies) {
//        this.userId = userId;
//        this.username = username;
//        this.email = email;
//        this.birthday = birthday;
//        this.account_balance = account_balance;
//        this.gender = gender;
//        this.hobbies = hobbies;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//    public String getBirthday() {
//        return birthday;
//    }
//    public String getAccount_balance() {
//        return account_balance;
//    }
//    public String getGender() {
//        return gender;
//    }
//    public String getHobbies() {
//        return hobbies;
//    }
//
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//    public void setAccount_balance(String account_balance) {
//        this.account_balance = account_balance;
//    }
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//    public void setHobbies(String hobbies) {
//        this.hobbies = hobbies;
//    }
//
//
//    @Override
//    public String toString() {
//        return userId + username + email + birthday + account_balance + gender + hobbies;
//    }
//
}
