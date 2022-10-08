package com.xina.demo1008.service;
import com.xina.demo1008.entity.TMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TMsgService {
    public TMsg findById(Integer id);

    public TMsg findByMessage(String Message); // 获取Message

    public List<TMsg> findTMsgAll();
}