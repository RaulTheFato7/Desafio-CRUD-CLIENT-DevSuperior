package com.devsuperio.desafioTres.service.exceptionals;

public class DataBaseException extends  RuntimeException{

    public DataBaseException(String msg) {
        super(msg);
    }
}
