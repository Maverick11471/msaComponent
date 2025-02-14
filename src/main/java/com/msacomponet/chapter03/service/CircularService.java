package com.msacomponet.service;

public class CircularService {

    private CircularReference circularReference;

    public CircularService(CircularReference circularReference) {
        this.circularReference = circularReference;
    }
}