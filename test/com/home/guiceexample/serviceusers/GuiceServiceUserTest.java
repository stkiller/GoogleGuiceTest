package com.home.guiceexample.serviceusers;

import com.google.inject.Inject;
import com.home.guiceexample.testutilities.GuiceIntegration;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author apodoprigora
 */
@RunWith(GuiceIntegration.class)
public class GuiceServiceUserTest extends junit.framework.TestCase {

    private IServiceUser user;


    @Inject
    public GuiceServiceUserTest(IServiceUser aUser) {
        user = aUser;
    }


    @Test
    public void testUse() throws Exception {
        Assert.assertEquals(new Integer(50), user.use());
    }
}
