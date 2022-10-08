package com.xina.demo1008.controller;

import com.xina.demo1008.entity.TMsg;
import com.xina.demo1008.service.TMsgService;
import com.google.gson.Gson;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class TMsgController {

    @Autowired
    private TMsgService tMsgService;

    @GetMapping("/getMsg")
    public String getMsg(@Param("id") Integer id){
        TMsg tMsg = tMsgService.findById(id);
        return tMsg.getMessage();
    }

    @GetMapping("/getId") // 通过Message获取id
    public Integer getId(@Param("Message") String Message){
        TMsg tMsg = tMsgService.findByMessage(Message);
        return tMsg.getId();
    }


    @GetMapping("/getOne") // 通过Message获取id
    public TMsg getAll(@Param("id") Integer id){
        TMsg tMsg = tMsgService.findById(id);
        return tMsg;
    }

    @GetMapping("/getJson") // 通过Message获取id
    public String getJson(@Param("id") Integer id){
        TMsg tMsg = tMsgService.findById(id);
        Gson gson = new Gson();
        return gson.toJson(tMsg);
    }

    @GetMapping("/getAll") // 通过Message获取id
    public List getAll(){
        List<TMsg> list = tMsgService.findTMsgAll();
        return list;
    }

    @GetMapping("/getAllJson") // 通过Message获取id
    public String getAllJson(){
        List<TMsg> list = tMsgService.findTMsgAll();
        Gson gson = new Gson();
        return gson.toJson(list);
    }
}