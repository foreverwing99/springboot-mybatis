package com.xina.demo1008.service.impl;

import com.google.gson.JsonObject;
import com.xina.demo1008.entity.TMsg;
import com.xina.demo1008.mapper.TMsgMapper;
import com.xina.demo1008.service.TMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TMsgServiceImpl implements TMsgService {

    @Autowired
    private TMsgMapper tMsgMapper;

    @Override
    public TMsg findById(Integer id) {
        System.out.println(null==tMsgMapper);
        return tMsgMapper.findById(id);
    }

    @Override // 获取Message
    public TMsg findByMessage(String Message) {

        return tMsgMapper.findByMessage(Message);
    }

    @Override // 获取所有
    public List findTMsgAll() {

        return tMsgMapper.findTMsgAll();
    }
}