package com.myz.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @description: todo
 * @author: myz
 * @createtime: 2019/2/26$ 13:45$
 */
@Entity
@Table(name = "sys_user")
public class User {

    public User(){}

    @Id
    private String id;
    private String name;
    private Integer age;
    private String address;
    private String email;
    @Column(name = "wechat_number")
    private String wechatNumber;
    @Column(name = "qq_number")
    private String qqNumber;
    @Column(name = "head_image_url")
    private String headImageUrl;
    @Column(name = "login_account")
    private String loginAccount;
    @Column(name = "login_password")
    private String loginPassword;
    @Column(name = "id_card_number")
    private String idCardNumber;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "update_by")
    private String updateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                name.equals(user.name) &&
                age.equals(user.age) &&
                address.equals(user.address) &&
                email.equals(user.email) &&
                wechatNumber.equals(user.wechatNumber) &&
                qqNumber.equals(user.qqNumber) &&
                headImageUrl.equals(user.headImageUrl) &&
                loginAccount.equals(user.loginAccount) &&
                loginPassword.equals(user.loginPassword) &&
                idCardNumber.equals(user.idCardNumber) &&
                createBy.equals(user.createBy) &&
                updateBy.equals(user.updateBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, address, email, wechatNumber, qqNumber, headImageUrl, loginAccount, loginPassword, idCardNumber, createBy, updateBy);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", wechatNumber='" + wechatNumber + '\'' +
                ", qqNumber='" + qqNumber + '\'' +
                ", headImageUrl='" + headImageUrl + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
