package com.tugalsan.api.executable.client;

public class TGS_ExecutableUtils {

    public static TGS_ExecutableType1 doNothing1() {
        TGS_ExecutableType1 NOOP = w1 -> {
        };
        return NOOP;
    }

    public static TGS_ExecutableType2 doNothing2() {
        TGS_ExecutableType2 NOOP = (w1, w2) -> {
        };
        return NOOP;
    }

    public static TGS_ExecutableType3 doNothing3() {
        TGS_ExecutableType3 NOOP = (w1, w2, w3) -> {
        };
        return NOOP;
    }

    public static TGS_ExecutableType4 doNothing4() {
        TGS_ExecutableType4 NOOP = (w1, w2, w3, w4) -> {
        };
        return NOOP;
    }

}
