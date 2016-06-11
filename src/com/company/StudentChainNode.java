package com.company;

/**
 *  结点实体，封装了Student这个对象和下一个实体的引用
 * Created by Dudaizhong on 2016/4/18.
 */
public class StudentChainNode {

    Student student;     //学生
    StudentChainNode nextNode;        //该对象保存的下一个对象的引用

//    获取当前实体对象
    public Student getStudent(){
        return this.student;
    }

//    获取下一个实体
    public StudentChainNode getNextNode(){
        return this.nextNode;
    }

    public StudentChainNode() {
    }

    //    构造方法
    public StudentChainNode(Student student,StudentChainNode nextNode){
        this.student = student;
        this.nextNode = nextNode;
    }

    public StudentChainNode(Student student) {
        this.student = student;
    }
}
