package com.example.service;

import com.example.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     */
    public List<Dept> findAll();

    /**
     * 根据id删除部门
     */
    public void deleteById(Integer id);

    /**
     * 新增部门
     */
    public void save(Dept dept);

    /**
     * 根据Id查询部门
     */
    public Dept getById(Integer id);

    /**
     * 修改部门
     */
    void update(Dept dept);
}
