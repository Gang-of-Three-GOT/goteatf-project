package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.dao.NoticeDao;
import com.goteatfproject.appgot.dao.PartyDao;
import com.goteatfproject.appgot.vo.Notice;
import com.goteatfproject.appgot.vo.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPartyService implements PartyService {

  @Autowired
  PartyDao partyDao;

  @Override
  public List<Party> list() throws Exception {
    return partyDao.findAll();
  }

  @Override
  public Party get(int no) throws Exception {
    return partyDao.findByNo(no);
  }


}