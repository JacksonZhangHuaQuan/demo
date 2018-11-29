package com.example.demo.service.impl;

import com.example.demo.dao.MessageMapper;
import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public void insert(Message message) {
        messageMapper.insert(message);
    }

    @Override
    public void delete(int id) {
        messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Message message) {
        messageMapper.updateByPrimaryKey(message);
    }

    @Override
    public Message select(int id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Message> selectAll() {
        return messageMapper.selectAll();
    }
}
