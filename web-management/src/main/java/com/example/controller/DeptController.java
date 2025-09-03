package com.example.controller;
import com.example.pojo.Dept;
import com.example.pojo.Result;
import com.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 部门管理控制器
 */
@RestController
@RequestMapping("/depts") //所有URL都是以/depts开头
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门列表
     */
    @GetMapping
    public Result list(){
        try {
            List<Dept>  depList = deptService.findAll();
            System.out.println("查询到的部门列表: " + depList);
            return Result.success(depList);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("查询失败: " + e.getMessage());
        }
    }

    /**
     * 根据id删除部门 - delete http://localhost:8080/depts?id=1
     */
    @DeleteMapping
    public Result delete(Integer id){
        System.out.println("根据id删除部门"+id);
        deptService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增部门 - POST http://localhost:8080/depts   请求参数：{"name":"研发部"}
     */
    @PostMapping
    public Result save(@RequestBody Dept dept){
        System.out.println("写入部门："+dept);
        deptService.save(dept);
        return Result.success();
    }

    /**
     * 根据ID查询 - GET http://localhost:8080/depts/1
     * 可用于修改数据时的页面回显
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        System.out.println("根据Id查询，id="+id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门 - PUT http://localhost:8080/depts  请求参数：{"id":1,"name":"研发部"}
     */
    @PutMapping
    public Result update(@RequestBody Dept dept){
        System.out.println("修改部门，dept="+dept);
        deptService.update(dept);
        return Result.success();
    }


}