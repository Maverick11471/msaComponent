package com.msacomponet.service;

import java.io.IOException;
import java.io.OutputStream;

public interface Printer<T> {

    void print(OutputStream os, T t) throws IOException;
}
