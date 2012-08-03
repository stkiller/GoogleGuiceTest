package com.home.guiceexample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.home.guiceexample.guicemodules.ServiceModule;
import com.home.guiceexample.serviceusers.IServiceUser;

/**
 * @author apodoprigora
 */
public class Main {

    public static void main(final String[] args) {
        final Injector injector = Guice.createInjector(Stage.DEVELOPMENT, new ServiceModule());
        final IServiceUser serviceUser = injector.getInstance(IServiceUser.class);
        System.out.println(serviceUser.use());
    }

}
