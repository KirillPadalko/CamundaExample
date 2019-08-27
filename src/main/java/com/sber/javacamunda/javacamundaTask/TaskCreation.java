package com.sber.javacamunda.javacamundaTask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TaskCreation implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String search = (String) execution.getVariable("search");
        HttpURLConnectionExample httpUrlConnection = new HttpURLConnectionExample();
        httpUrlConnection.sendGet(search);
    }
}

