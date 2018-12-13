
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;

import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AWSIotMqttQueueMessageTest {

    AWSIotMqttQueueMessage qMessage;
    MyTestObject testObject;
    AWSIotMqttMessageDeliveryCallback mdcb = new AWSIotMqttMessageDeliveryCallback() {
        @Override
        public void statusChanged(MessageDeliveryStatus status, Object userData) {

        }
    };

    @Before
    public void setUp() {
        testObject = new MyTestObject(1, "test", 2.0);
        qMessage = new AWSIotMqttQueueMessage("test-topic",
                "test-message".getBytes(StringUtils.UTF8),
                AWSIotMqttQos.QOS0,
                new PublishMessageUserData(mdcb, testObject));
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testGetTopic() throws Exception {
        assertEquals("test-topic", qMessage.getTopic());
    }

    @Test
    public void testGetMessage() throws Exception {
        assertEquals("test-message", new String(qMessage.getMessage(), StringUtils.UTF8));
    }

    @Test
    public void testGetQos() throws Exception {
        assertEquals(AWSIotMqttQos.QOS0, qMessage.getQos());
    }

    @Test
    public void testGetMessageUserData() throws Exception {
        assertEquals(mdcb, qMessage.getUserData().getUserCallback());
        assertEquals(testObject, qMessage.getUserData().getUserData());
    }

    private class MyTestObject {
        int i;
        String s;
        Double d;

        MyTestObject(int i, String s, Double d) {
            this.i = i;
            this.s = s;
            this.d = d;
        }
    }

}
