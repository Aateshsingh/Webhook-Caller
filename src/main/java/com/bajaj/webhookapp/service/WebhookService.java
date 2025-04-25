package com.bajaj.webhookapp.service;

import com.bajaj.webhookapp.model.RequestPayload;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebhookService {

    private final String GENERATE_WEBHOOK_URL = "https://bfhldevapigw.healthrx.co.in/hiring/generateWebhook";

    public void someMethod() {
        RequestPayload payload = new RequestPayload("John Doe", "REG12347", "john@example.com");


        String response = generateWebhook(payload);

        // Process the response as needed
        System.out.println("Response: " + response);
    }

    public String generateWebhook(RequestPayload payload) {
        RestTemplate restTemplate = new RestTemplate();


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);



        HttpEntity<RequestPayload> entity = new HttpEntity<>(payload, headers);


        ResponseEntity<String> responseEntity = restTemplate.exchange(
                GENERATE_WEBHOOK_URL,
                HttpMethod.POST,
                entity,
                String.class
        );


        if (responseEntity.getStatusCode() == HttpStatus.OK) {

            return responseEntity.getBody();
        } else {

            System.out.println("Failed to generate webhook");
            return null;
        }
    }

    public void callWebhookFlow(String webhookUrl, String accessToken) {

        String outcomePayload = "{\"outcome\": [[1, 2], [3, 4]]}";


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + accessToken);

        HttpEntity<String> entity = new HttpEntity<>(outcomePayload, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                webhookUrl,
                HttpMethod.POST,
                entity,
                String.class
        );

        if (responseEntity.getStatusCode() == HttpStatus.OK) {

            System.out.println("Webhook successfully triggered: " + responseEntity.getBody());
        } else {
            System.out.println("Failed to call webhook");
        }
    }
}
