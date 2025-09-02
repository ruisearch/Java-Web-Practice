package com.example.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String name;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

//    public Dept(){};
//
//    public Dept(Integer id, String name, LocalDateTime createTime, LocalDateTime updateTime){
//        this.id = id;
//        this.name = name;
//        this.createTime = createTime;
//        this.updateTime = updateTime;
//    }
}