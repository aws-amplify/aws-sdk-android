
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TopicMatchTest {

    ArrayList<TopicMatchTestCase> testCases;
    AWSIotMqttManager client;

    @Before
    public void setUp() throws Exception {
        client = new AWSIotMqttManager("test-client-id", Region.getRegion(Regions.US_EAST_1),
                "test-prefix");

        testCases = new ArrayList<TopicMatchTestCase>();
        testCases.add(new TopicMatchTestCase("test", "test", true));
        testCases.add(new TopicMatchTestCase("test/1", "test/1", true));
        testCases.add(new TopicMatchTestCase("test/1", "test/1/2", false));
        testCases.add(new TopicMatchTestCase("test/1/2", "test/1/2/3", false));
        testCases.add(new TopicMatchTestCase("#", "test", true));
        testCases.add(new TopicMatchTestCase("#", "test/1", true));
        testCases.add(new TopicMatchTestCase("#", "test/1/2", true));
        testCases.add(new TopicMatchTestCase("test/+", "test/1", true));
        testCases.add(new TopicMatchTestCase("test/+/1", "test/1/1", true));
        testCases.add(new TopicMatchTestCase("test/+/1", "test/1/2", false));
        testCases.add(new TopicMatchTestCase("test/+/+/+/+", "test/1", false));
        testCases.add(new TopicMatchTestCase("test/+/+/+/+", "test/1/2", false));
        testCases.add(new TopicMatchTestCase("test/+/+/+/+", "test/1/2/3", false));
        testCases.add(new TopicMatchTestCase("test/+/+/+/+", "test/1/2/3/4", true));
        testCases.add(new TopicMatchTestCase("test/+/+/+/+", "test/1/2/3/4/5", false));
        testCases.add(new TopicMatchTestCase("+", "test", true));
        testCases.add(new TopicMatchTestCase("+", "test/1", false));
        testCases.add(new TopicMatchTestCase("+/1", "test/1", true));
        testCases.add(new TopicMatchTestCase("+/1", "nottest/1", true));
        testCases.add(new TopicMatchTestCase("+/1", "test/12", false));
        testCases.add(new TopicMatchTestCase("+/1", "test/1/2", false));
        testCases.add(new TopicMatchTestCase("+/1/+", "test/1/test", true));
        testCases.add(new TopicMatchTestCase("+/1/+", "A/1/B", true));
        testCases.add(new TopicMatchTestCase("+/1/+", "test/test/test", false));
        testCases.add(new TopicMatchTestCase("test/#", "test/1", true));
        testCases.add(new TopicMatchTestCase("test/#", "test/1/2", true));
        testCases.add(new TopicMatchTestCase("test/#", "test/1/2/3", true));
        testCases.add(new TopicMatchTestCase("test/#", "test/1/2/3/4", true));
        testCases.add(new TopicMatchTestCase("test/#", "test/1/2/3/4/5", true));
        testCases.add(new TopicMatchTestCase("test/#", "not/1", false));
    }

    @Test
    public void topicMatchingTest() throws Exception {
        for (TopicMatchTestCase tc : testCases) {
            assertEquals(tc.matches, client.isTopicMatch(tc.topicFilter, tc.topic));
        }
    }

    public class TopicMatchTestCase {
        String topic;
        String topicFilter;
        boolean matches;

        TopicMatchTestCase(String tf, String t, boolean m) {
            topicFilter = tf;
            topic = t;
            matches = m;
        }
    }
}
