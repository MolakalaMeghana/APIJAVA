package com.example.demo2.dao;
import com.example.demo2.model.person;
import java.util.*;
public interface persondao {
    int insertPerson(person person);
    List<person> selectAllPerson();
}

