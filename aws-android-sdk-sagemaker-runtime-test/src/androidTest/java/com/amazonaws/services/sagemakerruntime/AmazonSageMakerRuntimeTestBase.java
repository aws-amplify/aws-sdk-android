package com.amazonaws.services.sagemakerruntime;

import android.support.test.InstrumentationRegistry;

import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONObject;
import org.junit.Before;
import com.amazonaws.sagemakertest.R;

import java.io.IOException;

public abstract class AmazonSageMakerRuntimeTestBase extends AWSTestBase {

    /** The SageMaker Runtime client for all tests to use */
    protected static AmazonSageMakerRuntimeClient sageMakerRuntimeClient;

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
            getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    /**
     * Loads the AWS account info for the integration tests and creates a
     * SageMaker Runtime client for tests to use.
     */
    @Before
    public void setUp() throws IOException {
        setUpCredentials();
        sageMakerRuntimeClient = new AmazonSageMakerRuntimeClient(credentials);
    }
}
