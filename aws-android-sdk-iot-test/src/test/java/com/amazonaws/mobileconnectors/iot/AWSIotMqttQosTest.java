
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class AWSIotMqttQosTest {

    @Test
    public void testAsInt() throws Exception {
        AWSIotMqttQos zero = AWSIotMqttQos.QOS0;
        AWSIotMqttQos one = AWSIotMqttQos.QOS1;
        assertEquals(0, zero.asInt());
        assertEquals(1, one.asInt());
    }

    @Test
    public void testValues() throws Exception {
        AWSIotMqttQos[] values = new AWSIotMqttQos[] {
                AWSIotMqttQos.QOS0, AWSIotMqttQos.QOS1
        };
        Arrays.asList(AWSIotMqttQos.values()).containsAll(Arrays.asList(values));
    }

    @Test
    public void testValuesOf() throws Exception {
        assertEquals(AWSIotMqttQos.QOS0, AWSIotMqttQos.valueOf("QOS0"));
        assertEquals(AWSIotMqttQos.QOS1, AWSIotMqttQos.valueOf("QOS1"));
    }
}
