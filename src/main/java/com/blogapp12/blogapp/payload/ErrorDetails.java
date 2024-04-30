package com.blogapp12.blogapp.payload;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.message.Message;

import java.util.Date;
@AllArgsConstructor
public class ErrorDetails {

    private Date date;
    private String message;
    private String details;


    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
