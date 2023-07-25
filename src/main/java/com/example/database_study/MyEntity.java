package com.example.database_study;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
// 테이블 이름 변경하고 싶은 경우 @Table 어노테이션 사용 가능
// @Table(name="hello_entity")
public class MyEntity {
    enum MyEnum { HELLO, WORLD }
    enum MyAnotherEnum { VALUE1, VALUE2 }
    // 엔티티 클래스에는 해당 엔티티를 유일하게 식별하는 주 키(Primary Key)와 관련된 필드가 반드시 필요함 (없으면 No identifier specified for entity 에러 발생)
    @Id
    // @GeneratedValue 어노테이션은 필드값(주로 Primary Key)을 자동으로 생성하는 방식을설정하기 위해서 사용함
    // (데이터베이스 프로그램마다 키를 자동 생성하는 방식(auto increment)이 지원되지 않거나 혹은 다른 방식으로 키 생성(ex: 오라클의 경우 시퀀스 객체를 사용)을 하므로 키 자동 생성방식을 직접 정의하기 위해서 사용)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    // unique, not null 제약 조건을 걸기 위해서 @Column 어노테이션 사용 (그러나 해당 어노테이션이 없더라도 필드와 관련된 칼럼 정보가 생성됨)
    @Column(unique=true, nullable=false)
    @NotNull
    private String uniqueStringColumn;
    // name에 전달하는 값으로 직접 칼럼 이름 지정 가능
    @Column(name="my_int_column")
    private Integer intColumn;
    // 자바의 타입을 쓰면 적절한 대응되는 데이터베이스의 타입으로 칼럼 생성
    @Column
    private Double doubleColumn;
    // Temporal 어노테이션 사용하여 타임존이 포함된 시간을 입력 가능
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateColumn;
    // Enumerated 어노테이션으로 enum 타입값 지정 가능 (단, MySQL에서 지원하는 enum 타입으로 만들지는 않음)
    // @Column(columnDefinition="ENUM('HELLO', 'WORLD')")
    @Column @Enumerated(EnumType.STRING)
    private MyEnum enum1;
    // ORDINAL이 기본값이지만 사용이 권장되지 않음 (열거형 클래스 내부의 상수 순서가 변경될 경우 문제가 발생할 수 있음)
    @Column @Enumerated(EnumType.ORDINAL)
    private MyAnotherEnum enum2;
    // longtext (CLOB)
    @Lob
    private String lobString;
    // longblob (BLOB)
    @Lob
    private byte[] lobBytes;
    // 테이블 칼럼 생성에서 제외할 멤버 필드는 @Transient 어노테이션 붙이기
    @Transient
    private String transientValue;
}
