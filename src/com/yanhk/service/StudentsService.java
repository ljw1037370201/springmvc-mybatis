package com.yanhk.service;

import com.yanhk.pojo.Students;

public interface StudentsService {
    void insertStu(Students students);
    void deleteStu(int id);
    void updateStu(int id,String name,String sex,int age);
    Students selectStu(int id);
}
