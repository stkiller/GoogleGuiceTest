package com.home.guiceexample.testutilities;

import com.home.guiceexample.guicemodules.FakeGuiceModule;
import org.junit.runners.model.InitializationError;

/**
 * @author apodoprigora
 */
public class GuiceIntegration extends GuiceTestRunner
{
    /**
     * Creates a new GuiceIntegration.
     *
     * @param classToRun the test class to run
     * @throws InitializationError if the test class is malformed
     */
    public GuiceIntegration(Class classToRun) throws InitializationError
    {
        super(classToRun, new FakeGuiceModule());
    }
}
