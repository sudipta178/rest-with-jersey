package com.sudipta.rest.service;

public interface IGenerateUUID {

    void createPool(int initialSize);

    String getUUID();

}
