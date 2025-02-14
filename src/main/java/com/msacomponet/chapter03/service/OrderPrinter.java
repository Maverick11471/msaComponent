package com.msacomponet.service;

import com.msacomponet.domain.ProductOrder;
import com.msacomponet.domain.format.Formatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.util.StringJoiner;

@Slf4j
@Service
public class OrderPrinter implements Printer<ProductOrder> {

    private Formatter formatter;

    @Autowired
    public OrderPrinter(@Qualifier("localDateTimeFormatter") Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void print(OutputStream os, ProductOrder productOrder) throws IOException {
        StringJoiner joiner = new StringJoiner("\r\n");
        joiner.add(productOrder.getBuyerName());
        joiner.add(productOrder.getOrderAmount().toPlainString());
        joiner.add(formatter.of(productOrder.getOrderAt()));

        os.write(joiner.toString().getBytes());
    }


}