
package com.amazonaws.services.sqs;

import com.amazonaws.services.sqs.model.MessageAttributeValue;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.support.test.runner.AndroidJUnit4;
import android.util.Base64;
import android.util.Log;

import com.amazonaws.util.StringUtils;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;


import org.junit.BeforeClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;   
import java.util.UUID;
import com.amazonaws.testutils.AWSTestBase;

/**
 * Base class for SQS integration tests. Provides convenience methods for
 * creating test data, and automatically loads AWS credentials from a properties
 * file on disk and instantiates clients for the individual tests to use.
 *
 */

@RunWith(AndroidJUnit4.class)
abstract public class IntegrationTestBase extends AWSTestBase{

    public static final String PACKAGE_NAME = "sqs";

    public static final String TAG = IntegrationTestBase.class.getSimpleName();
    /** The SQS client for all tests to use */
    protected static AmazonSQSAsyncClient sqs;

    /** Random number used for naming message attributes. */
    private static final Random random = new Random(System.currentTimeMillis());

    /**
     * Loads the AWS account info for the integration tests and creates an SQS
     * client for tests to use.
     */
    @BeforeClass
    public static void setUp() throws FileNotFoundException, IOException {
        Log.e(TAG, "setUp before");
        setUpCredentials();
        sqs = createSQS();
    }

    public static JSONObject getPackageConfigure()  {
        return getPackageConfigure(PACKAGE_NAME);
    }

    /**
     * create an implementation for testing. subclasses can override this to
     * test different implementations of the SQS client
     */
    public static AmazonSQSAsyncClient createSQS() {
        Log.e(TAG, "createSQS before");
        return new AmazonSQSAsyncClient(credentials);
    }

    protected static MessageAttributeValue createRandomStringAttributeValue() {
        return new MessageAttributeValue().withDataType("String")
                .withStringValue(UUID.randomUUID().toString());
    }

    protected static MessageAttributeValue createRandomNumberAttributeValue() {
        return new MessageAttributeValue().withDataType("Number")
                .withStringValue(Integer.toString(random.nextInt()));
    }

    protected static MessageAttributeValue createRandomBinaryAttributeValue() {
        byte[] randomBytes = new byte[10];
        random.nextBytes(randomBytes);
        return new MessageAttributeValue().withDataType("Binary")
                .withBinaryValue(ByteBuffer.wrap(randomBytes));
    }

    protected static Map<String, MessageAttributeValue> createRandomAttributeValues(int attrNumber) {
        Map<String, MessageAttributeValue> attrs = new HashMap<String, MessageAttributeValue>();
        for (int i = 0; i < attrNumber; i++) {
            int randomeAttributeType = random.nextInt(3);
            MessageAttributeValue randomAttrValue = null;
            switch (randomeAttributeType) {
                case 0:
                    randomAttrValue = createRandomStringAttributeValue();
                    break;
                case 1:
                    randomAttrValue = createRandomNumberAttributeValue();
                    break;
                case 2:
                    randomAttrValue = createRandomBinaryAttributeValue();
                    break;
                default:
                    break;
            }
            attrs.put("attribute-" + UUID.randomUUID(), randomAttrValue);
        }
        return Collections.unmodifiableMap(attrs);
    }

}
