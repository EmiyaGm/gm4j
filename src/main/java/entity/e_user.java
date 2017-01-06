package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gm on 17/1/6.
 */
@Entity
@Table(name = "user")
public class e_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String username;
    private String password;
    private String state;
    private Date createTime;

    public e_user(String username,String password){
        this.username = username;
        this.password = password;
    }

    public e_user(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
