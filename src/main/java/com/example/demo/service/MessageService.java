package com.example.demo.service;

import com.example.demo.entity.Message;

import java.util.List;



public interface MessageService {

    public void insert(Message message);

    public void delete(int id);

    public void update(Message message);

    public Message select(int id);

    public List<Message> selectAll();
}
