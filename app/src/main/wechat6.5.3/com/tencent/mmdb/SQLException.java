package com.tencent.mmdb;

public class SQLException extends RuntimeException {
    public SQLException(String str) {
        super(str);
    }

    public SQLException(String str, Throwable th) {
        super(str, th);
    }
}
