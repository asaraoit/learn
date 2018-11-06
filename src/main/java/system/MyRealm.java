package system;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.User;
import pojo.UserExample;
import service.UserService;

public class MyRealm extends AuthorizingRealm {


    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


        System.out.println("---------认证-----------");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 查询用户
        UserExample example = new UserExample();
        //封装查询条件
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(token.getUsername());
        User user = userService.getAll(example).get(0);
        if (null != user) {
            return new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), this.getClass().getSimpleName());
        }

        return null;
    }
}
