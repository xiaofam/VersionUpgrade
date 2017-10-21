package com.Fan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fan on 17/10/21.
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return  demoMapper.likeName(name);
    }
}
