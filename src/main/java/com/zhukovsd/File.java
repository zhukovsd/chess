package com.zhukovsd;

public enum File {
    A, B, C, D, E, F, G, H;

    public static File fromChar(char c) {
        try {
            return File.valueOf(String.valueOf(c).toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
