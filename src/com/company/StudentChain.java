package com.company;

/**
 * 单向链表
 * Created by Dudaizhong on 2016/4/18.
 */
public class StudentChain {

    private StudentChainNode head;//头结点
    private int size;//链表的实体(即结点的个数)

    //    获取链表中节点数量
    public int getSize() {
        return this.size;
    }

    //    添加节点
    public void addNode(Student student) {

        if(head == null){
            head = new StudentChainNode();
            head.student = null;
            head.nextNode = null;
        }
        StudentChainNode studentChainNode = new StudentChainNode();
        studentChainNode.student = student;
        studentChainNode.nextNode = head.nextNode;
        head.nextNode = studentChainNode;
        size++;
    }

    //    遍历结点
    public void searchNode(StudentChain studentChain) {

        StudentChainNode temp = null;
        for(temp = studentChain.head;temp !=null;temp=temp.nextNode){
            System.out.println(temp.getStudent().toString());
        }
    }

//    销毁链表
    public void delete(StudentChainNode studentChainNode,StudentChain studentChain){
        if(studentChain == null){
            return;
        }
        StudentChainNode temp = null;
        for(temp = studentChain.head;temp !=null;temp=temp.nextNode){
            if(temp.nextNode != null && studentChainNode.getStudent().equals(temp.nextNode.getStudent())){
                if(temp.nextNode.nextNode != null){
                    temp.nextNode = temp.nextNode.nextNode;
                }else {
                    temp.nextNode = null;
                }
            }
        }
    }
}
