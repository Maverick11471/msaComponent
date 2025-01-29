package com.msacomponet.service;

public class CircularReference {
    private CircularService circularService;

    public CircularReference(CircularService circularService) {
        this.circularService = circularService;
    }
}