package com.nemanja.user.service;

import com.nemanja.user.VO.Department;
import com.nemanja.user.VO.ResponseTemplateVO;
import com.nemanja.user.entity.UserS;
import com.nemanja.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private UserRepository repository;
    private RestTemplate restTemplate;
    public UserS saveUser(UserS userS) {
        log.info("inside saveUser method of UserService");
        return repository.save(userS);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("inside saveUser method of UserService");
        ResponseTemplateVO vo=new ResponseTemplateVO();
        UserS userS = repository.findByUserId(userId);
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ userS.getDepartmentId(), Department.class);
        vo.setUserS(userS);
        vo.setDepartment(department);
        return vo;
    }
}
