package com.ankur.prodcat.model;

public class PingResponse {
    private String status;

    public PingResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
