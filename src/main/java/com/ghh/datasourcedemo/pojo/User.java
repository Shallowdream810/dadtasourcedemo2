package com.ghh.datasourcedemo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private Integer uid;
    private  String uname;
    private String pwd;
}
