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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DBCluster
 */
class DBClusterStaxUnmarshaller implements Unmarshaller<DBCluster, StaxUnmarshallerContext> {

    public DBCluster unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBCluster dBCluster = new DBCluster();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBCluster.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    dBCluster.withAvailabilityZones(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    dBCluster.setBackupRetentionPeriod(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CharacterSetName", targetDepth)) {
                    dBCluster.setCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    dBCluster.setDatabaseName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBCluster.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBClusterParameterGroup", targetDepth)) {
                    dBCluster.setDBClusterParameterGroup(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroup", targetDepth)) {
                    dBCluster.setDBSubnetGroup(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBCluster.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    dBCluster.setPercentProgress(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EarliestRestorableTime", targetDepth)) {
                    dBCluster.setEarliestRestorableTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    dBCluster.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    dBCluster.setReaderEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("CustomEndpoints/member", targetDepth)) {
                    dBCluster.withCustomEndpoints(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    dBCluster.setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    dBCluster.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBCluster.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("LatestRestorableTime", targetDepth)) {
                    dBCluster.setLatestRestorableTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    dBCluster.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBCluster.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBClusterOptionGroupMemberships", targetDepth)) {
                    dBCluster
                            .withDBClusterOptionGroupMemberships(DBClusterOptionGroupStatusStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    dBCluster.setPreferredBackupWindow(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    dBCluster.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReplicationSourceIdentifier", targetDepth)) {
                    dBCluster.setReplicationSourceIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaIdentifiers", targetDepth)) {
                    dBCluster.withReadReplicaIdentifiers(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBClusterMembers", targetDepth)) {
                    dBCluster.withDBClusterMembers(DBClusterMemberStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    dBCluster.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZoneId", targetDepth)) {
                    dBCluster.setHostedZoneId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    dBCluster.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBCluster.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DbClusterResourceId", targetDepth)) {
                    dBCluster.setDbClusterResourceId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBClusterArn", targetDepth)) {
                    dBCluster.setDBClusterArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    dBCluster.withAssociatedRoles(DBClusterRoleStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBCluster.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CloneGroupId", targetDepth)) {
                    dBCluster.setCloneGroupId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    dBCluster.setClusterCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EarliestBacktrackTime", targetDepth)) {
                    dBCluster.setEarliestBacktrackTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("BacktrackWindow", targetDepth)) {
                    dBCluster.setBacktrackWindow(LongStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("BacktrackConsumedChangeRecords", targetDepth)) {
                    dBCluster.setBacktrackConsumedChangeRecords(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnabledCloudwatchLogsExports/member", targetDepth)) {
                    dBCluster.withEnabledCloudwatchLogsExports(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Capacity", targetDepth)) {
                    dBCluster
                            .setCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineMode", targetDepth)) {
                    dBCluster.setEngineMode(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ScalingConfigurationInfo", targetDepth)) {
                    dBCluster.setScalingConfigurationInfo(ScalingConfigurationInfoStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeletionProtection", targetDepth)) {
                    dBCluster.setDeletionProtection(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HttpEndpointEnabled", targetDepth)) {
                    dBCluster.setHttpEndpointEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActivityStreamMode", targetDepth)) {
                    dBCluster.setActivityStreamMode(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActivityStreamStatus", targetDepth)) {
                    dBCluster.setActivityStreamStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActivityStreamKmsKeyId", targetDepth)) {
                    dBCluster.setActivityStreamKmsKeyId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActivityStreamKinesisStreamName", targetDepth)) {
                    dBCluster.setActivityStreamKinesisStreamName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CopyTagsToSnapshot", targetDepth)) {
                    dBCluster.setCopyTagsToSnapshot(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CrossAccountClone", targetDepth)) {
                    dBCluster.setCrossAccountClone(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainMemberships", targetDepth)) {
                    dBCluster.withDomainMemberships(DomainMembershipStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBCluster;
    }

    private static DBClusterStaxUnmarshaller instance;

    public static DBClusterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterStaxUnmarshaller();
        return instance;
    }
}
