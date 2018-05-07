package com.feng.ai.base.util;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ServiceResult <T>{

    private T data;
    private Integer count;
    private List<String> errorMessages;
    private boolean hasError;

    public ServiceResult(){
        errorMessages = new ArrayList<>();
    }

    public void addErrorMessage(String message) {
        errorMessages.add(message);
    }

    public void addErrorMessages(List<String> messages) {
        errorMessages.addAll(messages);
    }
}
