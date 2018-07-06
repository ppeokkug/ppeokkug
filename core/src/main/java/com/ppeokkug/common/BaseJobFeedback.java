package com.ppeokkug.common;

public class BaseJobFeedback implements JobFeedback {
    boolean runResult;
    long executionTime;
    Throwable errorMessage;
}
