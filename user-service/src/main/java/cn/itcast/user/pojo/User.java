package cn.itcast.user.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "user")
public class User {

    @Id
    //@KeySql(useGeneratedKeys = true) 主键自增
    private String id;

    private String name;

    private String password;

    private String perms;

    @Transient //瞬时，不需要持久化到数据库
    private String other;
}
