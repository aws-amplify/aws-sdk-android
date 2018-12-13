
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AWSIotMqttTopicTest {

    AWSIotMqttTopic topicModel;
    AWSIotMqttNewMessageCallback callback1;
    AWSIotMqttNewMessageCallback callback2;

    @Before
    public void setUp() throws Exception {
        topicModel = new AWSIotMqttTopic("test-topic", AWSIotMqttQos.QOS0, callback1);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetTopic() throws Exception {
        assertEquals("test-topic", topicModel.getTopic());
    }

    @Test
    public void testSetTopic() throws Exception {
        topicModel.setTopic("not-test-topic");
        assertEquals("not-test-topic", topicModel.getTopic());
        topicModel.setTopic("test-topic");
    }

    @Test
    public void testGetQos() throws Exception {
        assertEquals(AWSIotMqttQos.QOS0, topicModel.getQos());
    }

    @Test
    public void testSetQos() throws Exception {
        topicModel.setQos(AWSIotMqttQos.QOS1);
        assertEquals(AWSIotMqttQos.QOS1, topicModel.getQos());
        topicModel.setQos(AWSIotMqttQos.QOS0);
    }

    @Test
    public void testGetCallback() throws Exception {
        assertEquals(callback1, topicModel.getCallback());
    }

    @Test
    public void testSetCallback() throws Exception {
        topicModel.setCallback(callback2);
        assertEquals(callback2, topicModel.getCallback());
        topicModel.setCallback(callback1);
    }
}
