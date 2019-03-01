/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudwatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.services.cloudwatch.model.Datapoint;
import com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest;
import com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest;
import com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest;
import com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult;
import com.amazonaws.services.cloudwatch.model.ListMetricsRequest;
import com.amazonaws.services.cloudwatch.model.ListMetricsResult;
import com.amazonaws.services.cloudwatch.model.Metric;
import com.amazonaws.services.cloudwatch.model.MetricAlarm;
import com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest;
import com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;


/**
 * Integration tests for the AWS CloudWatch service. NOTE: These tests require
 * data to be present in Amazon CloudWatch. Specifically, EC2 CPU utilization
 * data for m1.small instances currently. Once CloudWatch opens up a PUT API, we
 * can create the test data that we need, but until then, we have to rely on
 * pre-existing data.
 */
public class CloudWatchIntegrationTest extends CloudWatchIntegrationTestBase {

    private static final int ONE_DAY_IN_MILLISECONDS = 1000 * 60 * 60 * 24;

    /**
     * Tests that we can call the ListMetrics operation and correctly understand
     * the response.
     */
    @Test
    public void testListMetrics() throws Exception {
        ListMetricsResult result = cloudwatch.listMetrics();
        assertNotEmpty(result.getNextToken());

        boolean seenDimensions = false;
        assertTrue(result.getMetrics().size() > 0);
        for (Metric metric : result.getMetrics()) {
            assertNotEmpty(metric.getMetricName());
            assertNotEmpty(metric.getNamespace());

            for (Dimension dimension : metric.getDimensions()) {
                seenDimensions = true;
                assertNotEmpty(dimension.getName());
                assertNotEmpty(dimension.getValue());
            }
        }
        assertTrue(seenDimensions);

        result = cloudwatch.listMetrics(new ListMetricsRequest().withNextToken(result
                .getNextToken()));
        assertTrue(result.getMetrics().size() > 0);
    }

    /**
     * Tests that we can call the GetMetricStatistics operation and correctly
     * understand the response.
     */
    @Ignore
    public void testGetMetricStatistics() throws Exception {
        String measureName = "CPUUtilization";

        GetMetricStatisticsRequest request = new GetMetricStatisticsRequest()
                .withStartTime(new Date(new Date().getTime() - (7 * ONE_DAY_IN_MILLISECONDS)))
                .withNamespace("AWS/EC2")
                .withPeriod(60 * 60)
                .withMetricName(measureName)
                .withStatistics("Average", "Maximum", "Minimum", "Sum")
                .withEndTime(new Date(new Date().getTime() - (3 * ONE_DAY_IN_MILLISECONDS)));
        GetMetricStatisticsResult result = cloudwatch.getMetricStatistics(request);

        assertNotEmpty(result.getLabel());
        assertEquals(measureName, result.getLabel());

        assertTrue(result.getDatapoints().size() > 0);
        for (Datapoint datapoint : result.getDatapoints()) {
            assertNotNull(datapoint.getAverage());
            assertNotNull(datapoint.getMaximum());
            assertNotNull(datapoint.getMinimum());
            assertNotNull(datapoint.getSum());

            assertNotNull(datapoint.getTimestamp());
            assertNotEmpty(datapoint.getUnit());
        }
    }

    /**
     * Tests setting the state for an alarm and reading its history.
     */
    @Test
    public void testSetAlarmStateAndHistory() {
        String metricName = this.getClass().getName()
                + System.currentTimeMillis();

        PutMetricAlarmRequest[] rqs = createTwoNewAlarms(metricName);

        PutMetricAlarmRequest rq1 = rqs[0];
        PutMetricAlarmRequest rq2 = rqs[1];

        /*
         * Set the state
         */
        SetAlarmStateRequest setAlarmStateRequest = new SetAlarmStateRequest()
                .withAlarmName(rq1.getAlarmName()).withStateValue("ALARM")
                .withStateReason("manual");
        cloudwatch.setAlarmState(setAlarmStateRequest);
        setAlarmStateRequest = new SetAlarmStateRequest().withAlarmName(
                rq2.getAlarmName()).withStateValue("ALARM").withStateReason(
                "manual");
        cloudwatch.setAlarmState(setAlarmStateRequest);

        DescribeAlarmsForMetricResult describeResult = cloudwatch
                .describeAlarmsForMetric(new DescribeAlarmsForMetricRequest()
                        .withDimensions(rq1.getDimensions()).withMetricName(
                                metricName).withNamespace(rq1.getNamespace()));
        assertEquals(2, describeResult.getMetricAlarms().size());
        for (MetricAlarm alarm : describeResult.getMetricAlarms()) {
            assertTrue(rq1.getAlarmName().equals(alarm.getAlarmName())
                    || rq2.getAlarmName().equals(alarm.getAlarmName()));
            assertEquals(setAlarmStateRequest.getStateValue(), alarm
                    .getStateValue());
            assertEquals(setAlarmStateRequest.getStateReason(), alarm
                    .getStateReason());
        }

        /*
         * Get the history
         */
        DescribeAlarmHistoryRequest alarmHistoryRequest = new DescribeAlarmHistoryRequest()
                .withAlarmName(rq1.getAlarmName()).withHistoryItemType(
                        "StateUpdate");
        DescribeAlarmHistoryResult historyResult = cloudwatch
                .describeAlarmHistory(alarmHistoryRequest);
        assertEquals(1, historyResult.getAlarmHistoryItems().size());
    }

    /**
     * Tests disabling and enabling alarm actions
     */
    @Test
    public void testDisableEnableAlarmActions() {
        String metricName = this.getClass().getName()
                + System.currentTimeMillis();

        PutMetricAlarmRequest[] rqs = createTwoNewAlarms(metricName);

        PutMetricAlarmRequest rq1 = rqs[0];
        PutMetricAlarmRequest rq2 = rqs[1];

        /*
         * Disable
         */
        DisableAlarmActionsRequest disable = new DisableAlarmActionsRequest()
                .withAlarmNames(rq1.getAlarmName(), rq2.getAlarmName());
        cloudwatch.disableAlarmActions(disable);

        DescribeAlarmsForMetricResult describeResult = cloudwatch
                .describeAlarmsForMetric(new DescribeAlarmsForMetricRequest()
                        .withDimensions(rq1.getDimensions()).withMetricName(
                                metricName).withNamespace(rq1.getNamespace()));
        assertEquals(2, describeResult.getMetricAlarms().size());
        for (MetricAlarm alarm : describeResult.getMetricAlarms()) {
            assertTrue(rq1.getAlarmName().equals(alarm.getAlarmName())
                    || rq2.getAlarmName().equals(alarm.getAlarmName()));
            assertFalse(alarm.isActionsEnabled());
        }

        /*
         * Enable
         */
        EnableAlarmActionsRequest enable = new EnableAlarmActionsRequest()
                .withAlarmNames(rq1.getAlarmName(), rq2.getAlarmName());
        cloudwatch.enableAlarmActions(enable);

        describeResult = cloudwatch
                .describeAlarmsForMetric(new DescribeAlarmsForMetricRequest()
                        .withDimensions(rq1.getDimensions()).withMetricName(
                                metricName).withNamespace(rq1.getNamespace()));
        assertEquals(2, describeResult.getMetricAlarms().size());
        for (MetricAlarm alarm : describeResult.getMetricAlarms()) {
            assertTrue(rq1.getAlarmName().equals(alarm.getAlarmName())
                    || rq2.getAlarmName().equals(alarm.getAlarmName()));
            assertTrue(alarm.isActionsEnabled());
        }
    }

    /**
     * Tests creating alarms and describing them
     */
    @Test
    public void testDescribeAlarms() {
        String metricName = this.getClass().getName()
                + System.currentTimeMillis();

        PutMetricAlarmRequest[] rqs = createTwoNewAlarms(metricName);

        PutMetricAlarmRequest rq1 = rqs[0];
        PutMetricAlarmRequest rq2 = rqs[1];

        /*
         * Describe them
         */
        DescribeAlarmsForMetricResult describeResult = cloudwatch
                .describeAlarmsForMetric(new DescribeAlarmsForMetricRequest()
                        .withDimensions(rq1.getDimensions()).withMetricName(
                                metricName).withNamespace(rq1.getNamespace()));
        assertEquals(2, describeResult.getMetricAlarms().size());
        for (MetricAlarm alarm : describeResult.getMetricAlarms()) {
            assertTrue(rq1.getAlarmName().equals(alarm.getAlarmName())
                    || rq2.getAlarmName().equals(alarm.getAlarmName()));
            assertTrue(alarm.isActionsEnabled());
        }
    }

    /**
     * Cleans up any existing alarms before and after running the test suite
     */
    @BeforeClass
    @AfterClass
    public static void cleanupAlarms() {
        DescribeAlarmsResult describeResult = cloudwatch
                .describeAlarms(new DescribeAlarmsRequest());
        Collection<String> toDelete = new LinkedList<String>();
        for (MetricAlarm alarm : describeResult.getMetricAlarms()) {
            if (alarm.getMetricName().startsWith(CloudWatchIntegrationTest.class.getName())) {
                toDelete.add(alarm.getAlarmName());
            }
        }
        if (!toDelete.isEmpty()) {
            DeleteAlarmsRequest delete = new DeleteAlarmsRequest().withAlarmNames(toDelete);
            cloudwatch.deleteAlarms(delete);
        }
    }

    /**
     * Creates two alarms on the metric name given and returns the two requests
     * as an array.
     */
    private PutMetricAlarmRequest[] createTwoNewAlarms(String metricName) {
        PutMetricAlarmRequest[] rqs = new PutMetricAlarmRequest[2];

        /*
         * Put two metric alarms
         */
        rqs[0] = new PutMetricAlarmRequest().withActionsEnabled(true)
                .withAlarmDescription("Some alarm description").withAlarmName(
                        "An Alarm Name" + metricName).withComparisonOperator(
                        "GreaterThanThreshold").withDimensions(
                        new Dimension().withName("InstanceType").withValue(
                                "m1.small")).withEvaluationPeriods(1)
                .withMetricName(metricName).withNamespace("AWS/EC2")
                .withPeriod(60).withStatistic("Average").withThreshold(1.0)
                .withUnit("Count");

        cloudwatch.putMetricAlarm(rqs[0]);

        rqs[1] = new PutMetricAlarmRequest().withActionsEnabled(true)
                .withAlarmDescription("Some alarm description 2")
                .withAlarmName("An Alarm Name 2" + metricName)
                .withComparisonOperator("GreaterThanThreshold").withDimensions(
                        new Dimension().withName("InstanceType").withValue(
                                "m1.small")).withEvaluationPeriods(1)
                .withMetricName(metricName).withNamespace("AWS/EC2")
                .withPeriod(60).withStatistic("Average").withThreshold(2.0)
                .withUnit("Count");
        cloudwatch.putMetricAlarm(rqs[1]);
        return rqs;
    }

    /**
     * Tests that an error response from CloudWatch is correctly unmarshalled
     * into an AmazonServiceException object.
     */
    @Test
    public void testExceptionHandling() throws Exception {
        try {
            cloudwatch.getMetricStatistics(new GetMetricStatisticsRequest().withNamespace("foo"));
            fail("Expected an AmazonServiceException, but wasn't thrown");
        } catch (AmazonServiceException e) {
            assertNotEmpty(e.getErrorCode());
            assertEquals(ErrorType.Client, e.getErrorType());
            assertNotEmpty(e.getMessage());
            assertNotEmpty(e.getRequestId());
            assertNotEmpty(e.getServiceName());
            assertTrue(e.getStatusCode() >= 400);
            assertTrue(e.getStatusCode() < 500);
        }
    }

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkew() {
        SDKGlobalConfiguration.setGlobalTimeOffset(3600);
        cloudwatch.shutdown();
        cloudwatch = new AmazonCloudWatchClient(credentials);
        cloudwatch.listMetrics();
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() < 3600);
        // subsequent changes to the global time offset won't affect existing
        // client
        SDKGlobalConfiguration.setGlobalTimeOffset(3600);
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() == 3600);
    }
}
