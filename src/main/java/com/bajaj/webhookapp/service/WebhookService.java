package com.bajaj.webhookapp.service;

import com.bajaj.webhookapp.model.RequestPayload;

public class WebhookService {

    public void someMethod() {
        // Create a RequestPayload object with the required arguments
        RequestPayload payload = new RequestPayload("regNo_value", "param1_value", "param2_value", "param3_value");

        // Access the regNo using the getRegNo() method
        String regNo = payload.getRegNo();

        // Do something with the payload and regNo
        System.out.println("RegNo: " + regNo);
    }

    public void callWebhookFlow() {
    }
}
