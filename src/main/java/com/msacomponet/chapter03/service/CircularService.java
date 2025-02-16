package com.msacomponet.service;

public class CircularService {

    private com.msacomponet.service.CircularReference circularReference;

    public CircularService(com.msacomponet.service.CircularReference circularReference) {
        this.circularReference = circularReference;
    }
}