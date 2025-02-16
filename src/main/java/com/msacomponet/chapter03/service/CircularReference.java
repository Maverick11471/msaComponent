package com.msacomponet.service;

public class CircularReference {

    private com.msacomponet.service.CircularService circularService;

    public CircularReference(com.msacomponet.service.CircularService circularService) {
        this.circularService = circularService;
    }
}