package com.xina.demo1008.mapper;

import com.xina.demo1008.entity.TMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface TMsgMapper {
    public TMsg findById(Integer id); // id字段
    public TMsg findByMessage(String Message);//Message字段
    public List findTMsgAll();
}