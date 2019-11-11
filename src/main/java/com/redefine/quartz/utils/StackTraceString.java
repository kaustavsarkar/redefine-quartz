package com.redefine.quartz.utils;

import java.util.Arrays;
/**
 * @author : Kaustav Sarkar
 * @since : 12/11/2019
 **/
public class StackTraceString {

    public static String getStackTraceString(Throwable throwable) {
        return getStackTraceString(throwable, throwable.getStackTrace().length);
    }

    public static String getStackTraceString(Throwable throwable, int traceArrayLength) {
        StackTraceElement[] stackTraces = throwable.getStackTrace();
        return Arrays.toString(Arrays.copyOfRange(stackTraces,0,traceArrayLength));
    }

    public static String getStackTraceStringLength(Throwable throwable, int stringLength) {
        StackTraceElement[] stackTraces = throwable.getStackTrace();
        String traces = Arrays.toString(stackTraces);
        return traces.substring(0, stringLength);
    }
}
