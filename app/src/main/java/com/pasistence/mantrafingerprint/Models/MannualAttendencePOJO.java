package com.pasistence.mantrafingerprint.Models;

import java.io.Serializable;

public class MannualAttendencePOJO implements Serializable {
    public String id, worker_id, worker_assignment_id,
            project_id, check_in_date, check_in_time, overtime, fulltime, halfday,
            check_out_time, wages, created_at, updated_at, checktype, approval, name, number;

    public MannualAttendencePOJO(String id, String worker_id, String worker_assignment_id, String project_id, String check_in_date, String check_in_time, String overtime, String fulltime, String halfday, String check_out_time, String wages, String created_at, String updated_at, String checktype, String approval, String name, String number) {
        this.id = id;
        this.worker_id = worker_id;
        this.worker_assignment_id = worker_assignment_id;
        this.project_id = project_id;
        this.check_in_date = check_in_date;
        this.check_in_time = check_in_time;
        this.overtime = overtime;
        this.fulltime = fulltime;
        this.halfday = halfday;
        this.check_out_time = check_out_time;
        this.wages = wages;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.checktype = checktype;
        this.approval = approval;
        this.name = name;
        this.number = number;
    }

    public MannualAttendencePOJO() {
    }

    @Override
    public String toString() {
        return "MannualAttendencePOJO{" +
                "id='" + id + '\'' +
                ", worker_id='" + worker_id + '\'' +
                ", worker_assignment_id='" + worker_assignment_id + '\'' +
                ", project_id='" + project_id + '\'' +
                ", check_in_date='" + check_in_date + '\'' +
                ", check_in_time='" + check_in_time + '\'' +
                ", overtime='" + overtime + '\'' +
                ", fulltime='" + fulltime + '\'' +
                ", halfday='" + halfday + '\'' +
                ", check_out_time='" + check_out_time + '\'' +
                ", wages='" + wages + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", checktype='" + checktype + '\'' +
                ", approval='" + approval + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public String getWorker_assignment_id() {
        return worker_assignment_id;
    }

    public void setWorker_assignment_id(String worker_assignment_id) {
        this.worker_assignment_id = worker_assignment_id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_in_time() {
        return check_in_time;
    }

    public void setCheck_in_time(String check_in_time) {
        this.check_in_time = check_in_time;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }

    public String getFulltime() {
        return fulltime;
    }

    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    public String getHalfday() {
        return halfday;
    }

    public void setHalfday(String halfday) {
        this.halfday = halfday;
    }

    public String getCheck_out_time() {
        return check_out_time;
    }

    public void setCheck_out_time(String check_out_time) {
        this.check_out_time = check_out_time;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}