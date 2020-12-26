package com.sang.util;

import java.sql.SQLIntegrityConstraintViolationException;

public class MySQLException extends SQLIntegrityConstraintViolationException{

    public MySQLException() {
    }

    public MySQLException(String reason) {
        super(reason);
    }

}
