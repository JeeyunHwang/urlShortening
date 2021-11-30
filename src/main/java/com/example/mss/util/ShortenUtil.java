package com.example.mss.util;

import com.example.mss.exception.UrlShorteningException;

public class ShortenUtil {
    static final int MAX_LENGTH = 8;
    static final String BASE62 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static final int RADIX = 62;

    public static String encoding(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("The num value must be greater than or equal to 0");
        }

        final StringBuilder sb = new StringBuilder();
        do {
            int i = value % 62;
            sb.append(BASE62.charAt(i));
            value /= 62;
        } while (value > 0);

        if(sb.length() > MAX_LENGTH){
            throw new UrlShorteningException("Encode result out of range");
        }
        return sb.toString();
    }

    public long decoding(String param) {
        long sum = 0;
        long power = 1;
        for (int i = 0; i < param.length(); i++) {
            sum += BASE62.indexOf(param.charAt(i)) * power;
            power *= RADIX;
        }
        return sum;
    }
}
