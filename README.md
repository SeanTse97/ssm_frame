# 快速使用SSM后端框架

### 一、编写背景：

​       由于写基于SSM的JAVAWEB项目，每次都要重新搭建SSM的后端框架，所以自己把平时经常用到的框架内容整理起来，用于快速的完成项目的编写。

###  二、使用方法：

1. 直接克隆到本地 
2. 使用IDEA打开，并配置Tomcat环境
3. 运行案例：

- 将src/resources 下的jdbc.properties文件中的数据库用户名和密码修改成自己的，mysql8.0以下的驱动也需要修改

- 在 mysql 中新建mybatistest数据库，执行一下SQL脚本：

  ```sql
  SET NAMES utf8mb4;
  SET FOREIGN_KEY_CHECKS = 0;
  
  -- ----------------------------
  -- Table structure for account
  -- ----------------------------
  DROP TABLE IF EXISTS `account`;
  CREATE TABLE `account`  (
    `aid` int(11) NOT NULL,
    `aname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `balance` float(255, 0) NULL DEFAULT NULL,
    PRIMARY KEY (`aid`) USING BTREE
  ) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
  
  -- ----------------------------
  -- Records of account
  -- ----------------------------
  INSERT INTO `account` VALUES (1001, 'lucy', 2400);
  INSERT INTO `account` VALUES (1002, 'kaili', 7000);
  
  SET FOREIGN_KEY_CHECKS = 1;
  ```

- 运行tomcat，在地址栏输入http://localhost:8080/account/list就可以获取数据库对应的表信息



------









