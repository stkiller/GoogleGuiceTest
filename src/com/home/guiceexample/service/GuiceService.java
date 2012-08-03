package com.home.guiceexample.service;

/**
 * @author apodoprigora
 */
public class GuiceService implements IService {


    @Override
    public Integer serve() {
        return 10;
    }
}
