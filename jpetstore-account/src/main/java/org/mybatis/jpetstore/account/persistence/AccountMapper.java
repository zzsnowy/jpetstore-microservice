package org.mybatis.jpetstore.account.persistence;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.jpetstore.account.domain.Account;

@Mapper
public interface AccountMapper {

    // 通过用户名得到用户
    Account getAccountByUsername(String username);

    // 通过用户名和密码得到用户
    Account getAccountByUsernameAndPassword(Account account);

    // 插入新用户
    void insertAccount(Account account);

    // 插入新用户的部分信息
    void insertProfile(Account account);

    // 插入新用户的登录信息
    void insertSignon(Account account);

    // 更新用户
    void updateAccount(Account account);

    // 更新用户的部分信息
    void updateProfile(Account account);

    // 更新用户的登录信息
    void updateSignon(Account account);
}
