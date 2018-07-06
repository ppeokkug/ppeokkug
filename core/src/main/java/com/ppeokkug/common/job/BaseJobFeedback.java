package com.ppeokkug.common.job;

public class BaseJobFeedback implements JobFeedback {
    boolean runResult;
    long executionTime;
    Throwable errorMessage;
}
