# 谷粒学苑

### 学习视频
https://www.bilibili.com/video/BV1dQ4y1A75e/?spm_id_from=333.337.search-card.all.click&vd_source=58ac2e30439fc1319ead7b18b72b863b


### 文件结构
```
common_utils/src/            工具类模块
├── main/  
│   ├── java/  
│   │   com/  
│   │   grain/  
│   │   commonutils/  
│   │   ├── R.java           统一返回类
│   │   └── ResultCode.java  
│   └── resources/  
└── test/  
    java/  

service_base/src/
├── main/  
│   ├── java/  
│   │   com/  
│   │   grain/  
│   │   ├── SwaggerConfig.java  
│   │   ├── exceptionhandler/       异常处理
│   │   │   └── GlobalExceptionHandler.java  
│   │   └── handler/  
│   │       └── MyMetaObjectHandler.java     
│   └── resources/  
└── test/  
    java/


service_edu/src/
├── main/
│   ├── java/
│   │   com/
│   │   grain/
│   │   ├── EduApplication.java
│   │   └── eduservice/
│   │       ├── config/              配置文件
│   │       │   └── EduConfig.java
│   │       ├── controller/          控制器类
│   │       │   ├── EduLoginController.java
│   │       │   └── EduTeacherController.java
│   │       ├── entity/              实体类
│   │       │   ├── EduTeacher.java
│   │       │   └── vo/
│   │       │       └── TeacherQuery.java
│   │       ├── mapper/              用于数据库数据操作
│   │       │   ├── EduTeacherMapper.java
│   │       │   └── xml/
│   │       │       └── EduTeacherMapper.xml
│   │       └── service/             服务层
│   │           ├── EduTeacherService.java
│   │           └── impl/
│   │               └── EduTeacherServiceImpl.java
│   └── resources/
│       └── application.properties
└── test/
    java/
    com/  
    grain/
    demo/
    └── CodeGenerator.java           代码生成器

```