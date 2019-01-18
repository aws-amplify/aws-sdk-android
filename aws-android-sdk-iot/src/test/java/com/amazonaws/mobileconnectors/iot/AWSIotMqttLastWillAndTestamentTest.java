package com.amazonaws.mobileconnectors.iot;

import org.junit.Test;

import static org.junit.Assert.*;

public class AWSIotMqttLastWillAndTestamentTest {

    @Test
    public void testTopic() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye", AWSIotMqttQos.QOS0);
        assertEquals("test/lwt", lwt.getTopic());
    }

    @Test
    public void testMessage() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye", AWSIotMqttQos.QOS0);
        assertEquals("bye", lwt.getMessage());
    }

    @Test
    public void testQos() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye", AWSIotMqttQos.QOS0);
        assertEquals(AWSIotMqttQos.QOS0, lwt.getQos());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCreateLwtWithNullTopic() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament(null, "bye", AWSIotMqttQos.QOS0);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testCreateLwtWithEmptyTopic() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("", "bye", AWSIotMqttQos.QOS0);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testCreateLwtWithNullMessage() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", null, AWSIotMqttQos.QOS0);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testCreateLwtWithNullQos() throws Exception {
        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye", null);
    }
}
