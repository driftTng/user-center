package com.personal.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.usercenter.model.domain.User;
import com.personal.usercenter.mapper.UserMapper;
import com.personal.usercenter.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    public static void main(String[] args) {
        String s = "{\"anchorCD\":\"14001\",\"anchorType\":\"MZFY_KSCY\",\"idMedpersList\":[\"62a7eb933c305611930b37de\"],\"cdPi\":\"6000425711\",\"idDepDisp\":\"61c2eab664de2a3c190498db\",\"windowNum\":\"03\",\"idPi\":\"61c1fb98076db10cf853fd1f\"}";
        String s2 = "{\"anchorCD\":\"14003\",\"anchorType\":\"MZFY_FYWC\",\"idMedpersList\":[\"62a7e8d73c305611930a5bd6\"],\"cdPi\":\"6000120718\",\"idPi\":\"61c1fbdc076db10cf856094f\"}";
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            //System.out.println("位置:"+i);
        }
        System.out.println(s.substring(98,108));
        System.out.println(s2.substring(98,108));
    }

}




