package com.github.dsciencebk.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.github.dsciencebk.entity.Parking;
import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import javax.ws.rs.core.MediaType;


public class ParkingWSClient {

    public static final String BASE_URL = "http://localhost:8080/parkingTracker-1/rest/parkings/";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        try {
//            ClientRequest request = new ClientRequest(BASE_URL);
//            request.accept("application/json");
//            ClientResponse<String> response = request.get(String.class);
//            ClientResponse<String> response1 = request.post(new Parking.class)
//            if (response.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//            }
//            System.out.println("Ответ сервера .... \n");
//            System.out.println(new Gson().toJson(response.getEntity()));
//
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
        try {
        System.out.println("Do you want in parking? (y/n)");
        if(scanner.nextLine().equals("y")){
            ClientRequest request = new ClientRequest(BASE_URL+"/countFreePlaces");
            ClientResponse response = request.get(String.class);
                        if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
//            проверить кол-во свободных мест на парковке
        }else if(scanner.nextLine().equals("n")){

        }else {
            System.out.println("You give incorrect answer");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}