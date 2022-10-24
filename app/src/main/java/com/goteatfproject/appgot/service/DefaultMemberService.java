package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.dao.MemberDao;
import com.goteatfproject.appgot.vo.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMemberService implements MemberService {

  @Autowired
  MemberDao memberDao;

  @Override
  public void add(User user) throws Exception {
    memberDao.insert(user);
  }

  public List<User> list() throws Exception {
    return memberDao.findAll();
  }
}
