package com.bajaj.webhookapp.model;

public class RequestPayload {
    private String regNo;
    private String param1;
    private String param2;
    private String param3;

    // Default constructor
    public RequestPayload() {
        // Default values or nothing
    }

    // Constructor with arguments
    public RequestPayload(String regNo, String param1, String param2, String param3) {
        this.regNo = regNo;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    // Getter and Setter for regNo
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    // Getters and setters for other parameters
    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }
}
