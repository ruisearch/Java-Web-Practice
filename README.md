学习Java Web技术的练手项目

## 功能
一个Web后端，可以接受前端的请求，与MySql数据库交互，实现数据的增删改查

## 使用
1. 创建名为`javaweb`的Mysql数据库，在该数据库下创建dept表，该表显示一个学校的部门信息，有id（主键）,name（部门名）,create_time（部门创建时间）,update_time（部门信息更新时间）这几个字段；
2. 运行`WebManagementApplication`，启动Web后端，创建一个Tomcat服务器；
3. 利用postman模拟前端的请求。目前支持以下四类请求：
 * 查询所有部门信息。URL为`http://localhost8080:/depts`，方式为GET
 * 删除部门。URL为`http://localhost8080:/depts?id=<id值>`，方式为DELETE，在数据库删除删除id值对应的部门信息
 * 新增部门。URL为`http://localhost8080:/depts`，方式为POST,请求体设置为`{"name":<新增部门名>}`，在数据库增加一个部门
 * 修改部门信息。URL为`http://localhost8080:/depts`，方式为PUT，请求体为`{"id":<要修改的部门id值>,"name":<要修改的部门名>}`

## 涉及框架
* Spring Boot框架
* MyBatics框架

## 开发环境
IDEA 2023