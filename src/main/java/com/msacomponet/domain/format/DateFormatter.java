package com.msacomponet.domain.format;

import io.micrometer.common.util.StringUtils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter implements Formatter<Date> {

    private SimpleDateFormat sdf;

    public DateFormatter(String pattern) {
        if (StringUtils.isEmpty(pattern))
            throw new IllegalArgumentException("Pattern is empty");

        this.sdf = new SimpleDateFormat(pattern);
    }

    @Override
    public String of(Date target) {
        return sdf.format(target);
    }

    public Date parse(String dateString) throws ParseException {
        return sdf.parse(dateString);
    }
}