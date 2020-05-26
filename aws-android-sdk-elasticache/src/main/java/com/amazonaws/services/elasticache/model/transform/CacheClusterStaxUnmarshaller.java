/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model CacheCluster
 */
class CacheClusterStaxUnmarshaller implements Unmarshaller<CacheCluster, StaxUnmarshallerContext> {

    public CacheCluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheCluster cacheCluster = new CacheCluster();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("CacheClusterId", targetDepth)) {
                    cacheCluster.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ConfigurationEndpoint", targetDepth)) {
                    cacheCluster.setConfigurationEndpoint(EndpointStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClientDownloadLandingPage", targetDepth)) {
                    cacheCluster.setClientDownloadLandingPage(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodeType", targetDepth)) {
                    cacheCluster.setCacheNodeType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    cacheCluster
                            .setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    cacheCluster.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("CacheClusterStatus", targetDepth)) {
                    cacheCluster.setCacheClusterStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumCacheNodes", targetDepth)) {
                    cacheCluster.setNumCacheNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PreferredAvailabilityZone", targetDepth)) {
                    cacheCluster.setPreferredAvailabilityZone(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheClusterCreateTime", targetDepth)) {
                    cacheCluster.setCacheClusterCreateTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    cacheCluster.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    cacheCluster.setPendingModifiedValues(PendingModifiedValuesStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NotificationConfiguration", targetDepth)) {
                    cacheCluster
                            .setNotificationConfiguration(NotificationConfigurationStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheSecurityGroups", targetDepth)) {
                    cacheCluster
                            .withCacheSecurityGroups(CacheSecurityGroupMembershipStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheParameterGroup", targetDepth)) {
                    cacheCluster.setCacheParameterGroup(CacheParameterGroupStatusStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheSubnetGroupName", targetDepth)) {
                    cacheCluster.setCacheSubnetGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodes", targetDepth)) {
                    cacheCluster.withCacheNodes(CacheNodeStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    cacheCluster.setAutoMinorVersionUpgrade(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SecurityGroups/member", targetDepth)) {
                    cacheCluster.withSecurityGroups(SecurityGroupMembershipStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    cacheCluster.setReplicationGroupId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    cacheCluster.setSnapshotRetentionLimit(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    cacheCluster.setSnapshotWindow(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AuthTokenEnabled", targetDepth)) {
                    cacheCluster.setAuthTokenEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AuthTokenLastModifiedDate", targetDepth)) {
                    cacheCluster.setAuthTokenLastModifiedDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TransitEncryptionEnabled", targetDepth)) {
                    cacheCluster.setTransitEncryptionEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AtRestEncryptionEnabled", targetDepth)) {
                    cacheCluster.setAtRestEncryptionEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ARN", targetDepth)) {
                    cacheCluster.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return cacheCluster;
    }

    private static CacheClusterStaxUnmarshaller instance;

    public static CacheClusterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheClusterStaxUnmarshaller();
        return instance;
    }
}
