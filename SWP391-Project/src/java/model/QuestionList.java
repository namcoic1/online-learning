/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class QuestionList {
    
    int queid, que_result, qid, sid, ques_status;
    String que_content, que_note, cid, cname, sname, qname;
//    boolean que_status;

    public QuestionList() {
    }

    public QuestionList(int queid, int que_result, int qid, int sid, int ques_status, String que_content, String que_note, String cid, String cname, String sname, String qname) {
        this.queid = queid;
        this.que_result = que_result;
        this.qid = qid;
        this.sid = sid;
        this.ques_status = ques_status;
        this.que_content = que_content;
        this.que_note = que_note;
        this.cid = cid;
        this.cname = cname;
        this.sname = sname;
        this.qname = qname;
    }

    public int getQueid() {
        return queid;
    }

    public void setQueid(int queid) {
        this.queid = queid;
    }

    public int getQue_result() {
        return que_result;
    }

    public void setQue_result(int que_result) {
        this.que_result = que_result;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getQues_status() {
        return ques_status;
    }

    public void setQues_status(int ques_status) {
        this.ques_status = ques_status;
    }

    public String getQue_content() {
        return que_content;
    }

    public void setQue_content(String que_content) {
        this.que_content = que_content;
    }

    public String getQue_note() {
        return que_note;
    }

    public void setQue_note(String que_note) {
        this.que_note = que_note;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }
    
}
