package com.home.guiceexample.guicemodules;

import com.google.inject.AbstractModule;
import com.home.guiceexample.service.GuiceService;
import com.home.guiceexample.service.IService;
import com.home.guiceexample.serviceusers.GuiceServiceUser;
import com.home.guiceexample.serviceusers.IServiceUser;

/**
 * @author apodoprigora
 */
public class FakeGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IService.class).to(GuiceService.class);
        bind(IServiceUser.class).to(GuiceServiceUser.class);
    }
}
