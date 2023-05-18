package com.it.exception;

import com.it.dto.MessageInfo;

import lombok.Data;

@Data
public class DataNotFoundException extends RuntimeException {
    private MessageInfo messageInfo;

    public DataNotFoundException(MessageInfo messageInfo) {
        this.messageInfo = messageInfo;
    }

}
