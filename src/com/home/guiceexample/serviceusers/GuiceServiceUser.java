package com.home.guiceexample.serviceusers;

import com.google.inject.Inject;
import com.home.guiceexample.service.IService;

/**
 * @author apodoprigora
 */
public class GuiceServiceUser implements IServiceUser {

    private final IService service;


    @Inject
    public GuiceServiceUser(final IService aService) {
        this.service = aService;
    }

    @Override
    public Integer use() {
        return this.service.serve()*5;
    }
}
