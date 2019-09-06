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

package com.amazonaws.services.elasticloadbalancing;

import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.elbtest.R;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.Placement;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;
import com.amazonaws.services.elasticloadbalancing.model.ConfigureHealthCheckRequest;
import com.amazonaws.services.elasticloadbalancing.model.ConnectionDraining;
import com.amazonaws.services.elasticloadbalancing.model.CreateLBCookieStickinessPolicyRequest;
import com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerListenersRequest;
import com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerPolicyRequest;
import com.amazonaws.services.elasticloadbalancing.model.CreateLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.CrossZoneLoadBalancing;
import com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerListenersRequest;
import com.amazonaws.services.elasticloadbalancing.model.DeleteLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.DeregisterInstancesFromLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.DescribeInstanceHealthRequest;
import com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesRequest;
import com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerAttributesResult;
import com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancerPoliciesRequest;
import com.amazonaws.services.elasticloadbalancing.model.DescribeLoadBalancersRequest;
import com.amazonaws.services.elasticloadbalancing.model.DisableAvailabilityZonesForLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.EnableAvailabilityZonesForLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.HealthCheck;
import com.amazonaws.services.elasticloadbalancing.model.Instance;
import com.amazonaws.services.elasticloadbalancing.model.InstanceState;
import com.amazonaws.services.elasticloadbalancing.model.Listener;
import com.amazonaws.services.elasticloadbalancing.model.ListenerDescription;
import com.amazonaws.services.elasticloadbalancing.model.LoadBalancerAttributes;
import com.amazonaws.services.elasticloadbalancing.model.LoadBalancerDescription;
import com.amazonaws.services.elasticloadbalancing.model.ModifyLoadBalancerAttributesRequest;
import com.amazonaws.services.elasticloadbalancing.model.PolicyDescription;
import com.amazonaws.services.elasticloadbalancing.model.PolicyTypeDescription;
import com.amazonaws.services.elasticloadbalancing.model.RegisterInstancesWithLoadBalancerRequest;
import com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerListenerSSLCertificateRequest;
import com.amazonaws.services.elasticloadbalancing.model.SetLoadBalancerPoliciesOfListenerRequest;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Integration tests for the Elastic Load Balancing client.
 *
 */
public class ElbIntegrationTest extends AWSTestBase {

    /** AMI used for tests that require an EC2 instance */
    private static final String AMI_ID = "ami-e965ba80";

    /** Protocol value used in LB requests */
    private static final String PROTOCOL = "HTTP";

    /** AZs used for LB requests */
    private static final String AVAILABILITY_ZONE_1 = "us-east-1c";
    private static final String AVAILABILITY_ZONE_2 = "us-east-1b";

    /** Existing SSL certificate ARN in IAM */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
            getResources().getString(R.string.package_name);

    /** The ELB client used in these tests */
    private static AmazonElasticLoadBalancing elb;

    /** The EC2 client used to start an instance for the tests requiring one */
    private static AmazonEC2 ec2;

    /** The name of a load balancer created and tested by these tests */
    private String loadBalancerName;

    /** The ID of an EC2 instance created and used by these tests */
    private String instanceId;

    /**
     * Loads the AWS account info for the integration tests and creates an EC2
     * client for tests to use.
     */
    @BeforeClass
    public static void setUp() throws FileNotFoundException, IOException {
        setUpCredentials();
        elb = new AmazonElasticLoadBalancingClient(credentials);
        ec2 = new AmazonEC2Client(credentials);
    }

    /** Release any resources created by this test */
    @After
    public void tearDown() throws Exception {
        if (loadBalancerName != null) {
            try {
                elb.deleteLoadBalancer(new DeleteLoadBalancerRequest()
                        .withLoadBalancerName(loadBalancerName));
            } catch (Exception e) {
            }
        }
        if (instanceId != null) {
            try {
                ec2.terminateInstances(new TerminateInstancesRequest()
                        .withInstanceIds(instanceId));
            } catch (Exception e) {
            }
        }
    }

    /*
     * Tests
     */

    /**
     * Tests the ELB operations that require a real EC2 instance.
     */
    @Test
    public void testLoadBalancerInstanceOperations() throws Exception {
        loadBalancerName = "integ-test-lb-" + new Date().getTime();
        Listener expectedListener = new Listener().withInstancePort(8080)
                .withLoadBalancerPort(80).withProtocol(PROTOCOL);

        // Start up an EC2 instance to register with our LB
        RunInstancesRequest runInstancesRequest = new RunInstancesRequest()
                .withPlacement(
                        new Placement()
                                .withAvailabilityZone(AVAILABILITY_ZONE_1))
                .withImageId(AMI_ID).withMinCount(1).withMaxCount(1);
        instanceId = ec2.runInstances(runInstancesRequest).getReservation()
                .getInstances().get(0).getInstanceId();

        // Create a load balancer
        elb.createLoadBalancer(
                new CreateLoadBalancerRequest()
                        .withLoadBalancerName(loadBalancerName)
                        .withAvailabilityZones(AVAILABILITY_ZONE_1)
                        .withListeners(expectedListener)).getDNSName();

        // Register it with our load balancer
        List<Instance> instances = elb.registerInstancesWithLoadBalancer(
                new RegisterInstancesWithLoadBalancerRequest().withInstances(
                        new Instance().withInstanceId(instanceId))
                        .withLoadBalancerName(loadBalancerName)).getInstances();
        assertEquals(1, instances.size());
        assertEquals(instanceId, instances.get(0).getInstanceId());

        // Describe it's health
        List<InstanceState> instanceStates = elb.describeInstanceHealth(
                new DescribeInstanceHealthRequest().withInstances(
                        new Instance().withInstanceId(instanceId))
                        .withLoadBalancerName(loadBalancerName))
                .getInstanceStates();
        assertEquals(1, instanceStates.size());
        assertNotEmpty(instanceStates.get(0).getDescription());
        assertEquals(instanceId, instanceStates.get(0).getInstanceId());
        assertNotEmpty(instanceStates.get(0).getReasonCode());
        assertNotEmpty(instanceStates.get(0).getState());

        // Deregister it
        instances = elb.deregisterInstancesFromLoadBalancer(
                new DeregisterInstancesFromLoadBalancerRequest().withInstances(
                        new Instance().withInstanceId(instanceId))
                        .withLoadBalancerName(loadBalancerName)).getInstances();
        assertEquals(0, instances.size());
    }


    /**
     * Tests that the ELB client can call the basic load balancer operations (no
     * operations requiring a real EC2 instance).
     */
    @Test
    public void testLoadBalancerOperations() throws Exception {
        loadBalancerName = "integ-test-lb-" + System.currentTimeMillis();
        Listener expectedListener = new Listener().withInstancePort(8080)
                .withLoadBalancerPort(80).withProtocol(PROTOCOL);

        // Create a load balancer
        String dnsName = elb.createLoadBalancer(
                new CreateLoadBalancerRequest()
                        .withLoadBalancerName(loadBalancerName)
                        .withAvailabilityZones(AVAILABILITY_ZONE_1)
                        .withListeners(expectedListener)).getDNSName();
        assertNotEmpty(dnsName);

        // Configure health checks
        HealthCheck expectedHealthCheck = new HealthCheck().withInterval(120)
                .withTarget("HTTP:80/ping").withTimeout(60)
                .withUnhealthyThreshold(9).withHealthyThreshold(10);
        HealthCheck createdHealthCheck = elb.configureHealthCheck(
                new ConfigureHealthCheckRequest().withLoadBalancerName(
                        loadBalancerName).withHealthCheck(expectedHealthCheck))
                .getHealthCheck();
        assertEquals(expectedHealthCheck.getHealthyThreshold(),
                createdHealthCheck.getHealthyThreshold());
        assertEquals(expectedHealthCheck.getInterval(),
                createdHealthCheck.getInterval());
        assertEquals(expectedHealthCheck.getTarget(),
                createdHealthCheck.getTarget());
        assertEquals(expectedHealthCheck.getTimeout(),
                createdHealthCheck.getTimeout());
        assertEquals(expectedHealthCheck.getUnhealthyThreshold(),
                createdHealthCheck.getUnhealthyThreshold());

        // Describe
        List<LoadBalancerDescription> loadBalancerDescriptions = elb
                .describeLoadBalancers(
                        new DescribeLoadBalancersRequest()
                                .withLoadBalancerNames(loadBalancerName))
                .getLoadBalancerDescriptions();
        assertEquals(1, loadBalancerDescriptions.size());
        LoadBalancerDescription loadBalancer = loadBalancerDescriptions.get(0);
        assertEquals(loadBalancerName, loadBalancer.getLoadBalancerName());
        assertEquals(1, loadBalancer.getAvailabilityZones().size());
        assertTrue(loadBalancer.getAvailabilityZones().contains(
                AVAILABILITY_ZONE_1));
        assertNotNull(loadBalancer.getCreatedTime());
        assertEquals(dnsName, loadBalancer.getDNSName());
        assertEquals(expectedHealthCheck.getTarget(), loadBalancer
                .getHealthCheck().getTarget());
        assertTrue(loadBalancer.getInstances().isEmpty());
        assertEquals(1, loadBalancer.getListenerDescriptions().size());
        assertEquals(8080, loadBalancer.getListenerDescriptions().get(0)
                .getListener().getInstancePort(), 0.0);
        assertEquals(80, loadBalancer.getListenerDescriptions().get(0)
                .getListener().getLoadBalancerPort(), 0.0);
        assertEquals(PROTOCOL, loadBalancer.getListenerDescriptions().get(0)
                .getListener().getProtocol());
        assertEquals(loadBalancerName, loadBalancer.getLoadBalancerName());
        assertNotNull(loadBalancer.getSourceSecurityGroup());
        assertNotNull(loadBalancer.getSourceSecurityGroup().getGroupName());
        assertNotNull(loadBalancer.getSourceSecurityGroup().getOwnerAlias());

        // Enabled AZs
        List<String> availabilityZones = elb
                .enableAvailabilityZonesForLoadBalancer(
                        new EnableAvailabilityZonesForLoadBalancerRequest()
                                .withLoadBalancerName(loadBalancerName)
                                .withAvailabilityZones(AVAILABILITY_ZONE_2))
                .getAvailabilityZones();
        assertEquals(2, availabilityZones.size());
        assertTrue(availabilityZones.contains(AVAILABILITY_ZONE_1));
        assertTrue(availabilityZones.contains(AVAILABILITY_ZONE_2));

        /*
         * Enabling and disabling AZs is a relatively expensive operation that
         * kicks of longer running workflow processes, so we don't want to
         * enable and disable AZs back to back. This small sleep ensures that
         * these tests aren't antagonistic for the ELB service and don't cause
         * problems for that team.
         */
        Thread.sleep(1000 * 10);

        // Disable AZs
        availabilityZones = elb.disableAvailabilityZonesForLoadBalancer(
                new DisableAvailabilityZonesForLoadBalancerRequest()
                        .withLoadBalancerName(loadBalancerName)
                        .withAvailabilityZones(AVAILABILITY_ZONE_2))
                .getAvailabilityZones();
        assertEquals(1, availabilityZones.size());
        assertTrue(availabilityZones.contains(AVAILABILITY_ZONE_1));
        assertFalse(availabilityZones.contains(AVAILABILITY_ZONE_2));

        // Create a new SSL listener
        elb.createLoadBalancerListeners(new CreateLoadBalancerListenersRequest()
                .withLoadBalancerName(loadBalancerName).withListeners(
                        new Listener().withInstancePort(8181)
                                .withLoadBalancerPort(443).withProtocol("SSL")
                                .withSSLCertificateId(getPackageConfigure(PACKAGE_NAME).getString("certificate_arn"))));

        Thread.sleep(1000 * 5);
        List<ListenerDescription> listenerDescriptions = elb
                .describeLoadBalancers(
                        new DescribeLoadBalancersRequest()
                                .withLoadBalancerNames(loadBalancerName))
                .getLoadBalancerDescriptions().get(0).getListenerDescriptions();
        assertEquals(2, listenerDescriptions.size());
        ListenerDescription sslListener = null;
        for (ListenerDescription listener : listenerDescriptions) {
            if (listener.getListener().getLoadBalancerPort() == 443)
                sslListener = listener;
        }
        assertEquals(getPackageConfigure(PACKAGE_NAME).getString("certificate_arn"), sslListener.getListener()
                .getSSLCertificateId());

        // Describe LB Policy Types
        List<PolicyTypeDescription> policyTypeDescriptions = elb
                .describeLoadBalancerPolicyTypes().getPolicyTypeDescriptions();
        assertTrue(policyTypeDescriptions.size() > 0);
        assertNotNull(policyTypeDescriptions.get(0).getPolicyTypeName());
        assertTrue(policyTypeDescriptions.get(0)
                .getPolicyAttributeTypeDescriptions().size() > 0);
        assertNotNull(policyTypeDescriptions.get(0)
                .getPolicyAttributeTypeDescriptions().get(0).getAttributeName());
        assertNotNull(policyTypeDescriptions.get(0)
                .getPolicyAttributeTypeDescriptions().get(0).getAttributeType());
        assertNotNull(policyTypeDescriptions.get(0)
                .getPolicyAttributeTypeDescriptions().get(0).getCardinality());

        // Create LB Policy
        elb.createLoadBalancerPolicy(new CreateLoadBalancerPolicyRequest()
                .withLoadBalancerName(loadBalancerName)
                .withPolicyName("java-sdk-policy")
                .withPolicyTypeName("SSLNegotiationPolicyType"));

        // Create LB stickiness policy
        String policyName = "java-sdk-policy-" + System.currentTimeMillis();
        elb.createLBCookieStickinessPolicy(new CreateLBCookieStickinessPolicyRequest(
                loadBalancerName, policyName));

        // Attach the policy to a listener
        elb.setLoadBalancerPoliciesOfListener(new SetLoadBalancerPoliciesOfListenerRequest(
                loadBalancerName, 80, null).withPolicyNames(policyName));
        assertTrue(doesLoadBalancerHaveListenerWithPolicy(loadBalancerName,
                policyName));

        // Describe LB Policies
        List<PolicyDescription> policyDescriptions = elb
                .describeLoadBalancerPolicies(
                        new DescribeLoadBalancerPoliciesRequest()
                                .withLoadBalancerName(loadBalancerName))
                .getPolicyDescriptions();
        assertTrue(policyDescriptions.size() > 0);
        assertTrue(policyDescriptions.get(0).getPolicyAttributeDescriptions()
                .size() > 0);
        assertNotNull(policyDescriptions.get(0).getPolicyName());
        assertNotNull(policyDescriptions.get(0).getPolicyTypeName());

        // Modify LB Attributes
        elb.modifyLoadBalancerAttributes(new ModifyLoadBalancerAttributesRequest()
                .withLoadBalancerName(loadBalancerName)
                .withLoadBalancerAttributes(
                        new LoadBalancerAttributes()
                                .withCrossZoneLoadBalancing(new CrossZoneLoadBalancing()
                                        .withEnabled(true))));

        // Describe LB Attributes
        DescribeLoadBalancerAttributesResult describeLoadBalancerAttributesResult = elb
                .describeLoadBalancerAttributes(new DescribeLoadBalancerAttributesRequest()
                        .withLoadBalancerName(loadBalancerName));
        CrossZoneLoadBalancing returnedCrossZoneLoadBalancing = describeLoadBalancerAttributesResult
                .getLoadBalancerAttributes().getCrossZoneLoadBalancing();
        assertTrue(returnedCrossZoneLoadBalancing.getEnabled());

        // Set the SSL certificate for an existing listener
        elb.setLoadBalancerListenerSSLCertificate(new SetLoadBalancerListenerSSLCertificateRequest()
                .withLoadBalancerName(loadBalancerName)
                .withLoadBalancerPort(443)
                .withSSLCertificateId(getPackageConfigure(PACKAGE_NAME).getString("certificate_arn")));

        // Delete the SSL listener
        Thread.sleep(1000 * 5);
        elb.deleteLoadBalancerListeners(new DeleteLoadBalancerListenersRequest()
                .withLoadBalancerName(loadBalancerName).withLoadBalancerPorts(
                        443));

        // Delete the test load balancer
        elb.deleteLoadBalancer(new DeleteLoadBalancerRequest()
                .withLoadBalancerName(loadBalancerName));
    }

    /*
     * Private Test Helpers
     */

    /**
     * Tests if a specified load balancer contains a listener using the
     * specified policy.
     *
     * @param loadBalancerName The name of the load balancer to test.
     * @param policyName The name of the policy to look for.
     * @return True if the specified load balancer contains a listener using the
     *         specified policy.
     */
    private boolean doesLoadBalancerHaveListenerWithPolicy(
            String loadBalancerName, String policyName) {
        List<LoadBalancerDescription> loadBalancers = elb
                .describeLoadBalancers(
                        new DescribeLoadBalancersRequest()
                                .withLoadBalancerNames(loadBalancerName))
                .getLoadBalancerDescriptions();
        if (loadBalancers.isEmpty())
            fail("Unknown load balancer: " + loadBalancerName);

        List<ListenerDescription> listeners = loadBalancers.get(0)
                .getListenerDescriptions();
        for (ListenerDescription listener : listeners) {
            if (listener.getPolicyNames().contains(policyName))
                return true;
        }

        return false;
    }

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkew() {
        SDKGlobalConfiguration.setGlobalTimeOffset(3600);
        elb.describeLoadBalancerPolicies();
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() < 60);
    }

    /**
     * Tests the new connection draining parameter. Initially when the load
     * balancer is created, the connection draining must be FALSE. Then the
     * <code>ModifyLoadBalancerAttributes</code> API is used to enable the
     * connection draining attribute. Asserts that the connection draining
     * attribute is set to TRUE by retrieving the value from the load balancer
     * through the describe load balancer attribute API.
     */
    @Test
    public void testConnectionDraining() {
        int timeout = 20;
        loadBalancerName = "integ-test-lb-" + System.currentTimeMillis();
        Listener expectedListener = new Listener().withInstancePort(8080)
                .withLoadBalancerPort(80).withProtocol(PROTOCOL);

        // Create a load balancer
        String dnsName = elb.createLoadBalancer(
                new CreateLoadBalancerRequest()
                        .withLoadBalancerName(loadBalancerName)
                        .withAvailabilityZones(AVAILABILITY_ZONE_1)
                        .withListeners(expectedListener)).getDNSName();
        assertNotEmpty(dnsName);

        // Retrieves the load balancer attributes.
        DescribeLoadBalancerAttributesRequest describeLoadBalancerRequest = new DescribeLoadBalancerAttributesRequest()
                .withLoadBalancerName(loadBalancerName);

        DescribeLoadBalancerAttributesResult result = elb
                .describeLoadBalancerAttributes(describeLoadBalancerRequest);

        // Connection draining must be FALSE by default.
        assertFalse(result.getLoadBalancerAttributes().getConnectionDraining()
                .getEnabled());

        // Enable the connection draining attribute
        LoadBalancerAttributes loadBalancerAttributes = new LoadBalancerAttributes()
                .withConnectionDraining(new ConnectionDraining().withEnabled(
                        Boolean.TRUE).withTimeout(timeout));
        elb.modifyLoadBalancerAttributes(new ModifyLoadBalancerAttributesRequest()
                .withLoadBalancerName(loadBalancerName)
                .withLoadBalancerAttributes(loadBalancerAttributes));

        result = elb
                .describeLoadBalancerAttributes(new DescribeLoadBalancerAttributesRequest()
                        .withLoadBalancerName(loadBalancerName));

        // Connection draining must be TRUE now.
        assertTrue(result.getLoadBalancerAttributes().getConnectionDraining()
                .getEnabled());
    }
}
