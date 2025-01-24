package com.msacomponet.domain.format;

public interface Formatter<T> {
    String of(T target);
}
