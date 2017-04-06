/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model AutoScalingGroup
 */
class AutoScalingGroupStaxUnmarshaller implements
        Unmarshaller<AutoScalingGroup, StaxUnmarshallerContext> {

    public AutoScalingGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        AutoScalingGroup autoScalingGroup = new AutoScalingGroup();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("AutoScalingGroupName", targetDepth)) {
                    autoScalingGroup.setAutoScalingGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AutoScalingGroupARN", targetDepth)) {
                    autoScalingGroup.setAutoScalingGroupARN(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LaunchConfigurationName", targetDepth)) {
                    autoScalingGroup.setLaunchConfigurationName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MinSize", targetDepth)) {
                    autoScalingGroup.setMinSize(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("MaxSize", targetDepth)) {
                    autoScalingGroup.setMaxSize(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DesiredCapacity", targetDepth)) {
                    autoScalingGroup.setDesiredCapacity(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultCooldown", targetDepth)) {
                    autoScalingGroup.setDefaultCooldown(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZones/member", targetDepth)) {
                    autoScalingGroup.withAvailabilityZones(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerNames/member", targetDepth)) {
                    autoScalingGroup.withLoadBalancerNames(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheckType", targetDepth)) {
                    autoScalingGroup.setHealthCheckType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheckGracePeriod", targetDepth)) {
                    autoScalingGroup.setHealthCheckGracePeriod(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Instances/member", targetDepth)) {
                    autoScalingGroup.withInstances(InstanceStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    autoScalingGroup.setCreatedTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SuspendedProcesses/member", targetDepth)) {
                    autoScalingGroup.withSuspendedProcesses(SuspendedProcessStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlacementGroup", targetDepth)) {
                    autoScalingGroup.setPlacementGroup(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VPCZoneIdentifier", targetDepth)) {
                    autoScalingGroup.setVPCZoneIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnabledMetrics/member", targetDepth)) {
                    autoScalingGroup.withEnabledMetrics(EnabledMetricStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    autoScalingGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Tags/member", targetDepth)) {
                    autoScalingGroup.withTags(TagDescriptionStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TerminationPolicies/member", targetDepth)) {
                    autoScalingGroup.withTerminationPolicies(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NewInstancesProtectedFromScaleIn", targetDepth)) {
                    autoScalingGroup.setNewInstancesProtectedFromScaleIn(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return autoScalingGroup;
    }

    private static AutoScalingGroupStaxUnmarshaller instance;

    public static AutoScalingGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingGroupStaxUnmarshaller();
        return instance;
    }
}
