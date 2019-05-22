package cn.itcast.consumer.pojo;

import lombok.Data;

@Data
public class User {

    private String id;

    private String name;

    private String password;

    private String perms;

    private String other;
}