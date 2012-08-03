package com.home.guiceexample.service;

/**
 * @author apodoprigora
 */
public class FakeGuiceService implements IService{

    @Override
    public Integer serve() {
        return 5;
    }
}
