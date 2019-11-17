package com.example.learningapplication.bean;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description: crop bean 实体类，对应数据源
 * todo 1.1 创建json 对应的bean类，注意跟json数据一一对应
 **/
public class CropRecord {
    String createTime;
    String cropName;
    String inputRecord;
    String location;
    String operation;

    @Override
    public String toString() {
        return "CropRecord{" +
                "createTime='" + createTime + '\'' +
                ", cropName='" + cropName + '\'' +
                ", inputRecord='" + inputRecord + '\'' +
                ", location='" + location + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getCropName() {
        return "农作物名：" + cropName;
    }

    public String getInputRecord() {
        return "投入品：" + inputRecord;
    }

    public String getLocation() {
        return "位置："  + location;
    }

    public String getOperation() {
        return "操作：" + operation;
    }
}
