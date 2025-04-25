package com.bajaj.webhookapp.model;

import java.util.List;

public class WebhookRequest {
    private String regNo;
    private List<List<Integer>> outcome;

    public String getRegNo() { return regNo; }
    public List<List<Integer>> getOutcome() { return outcome; }

    public void setRegNo(String regNo) { this.regNo = regNo; }
    public void setOutcome(List<List<Integer>> outcome) { this.outcome = outcome; }
}
