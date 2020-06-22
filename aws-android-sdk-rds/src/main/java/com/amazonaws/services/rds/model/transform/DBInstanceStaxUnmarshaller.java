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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DBInstance
 */
class DBInstanceStaxUnmarshaller implements Unmarshaller<DBInstance, StaxUnmarshallerContext> {

    public DBInstance unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBInstance dBInstance = new DBInstance();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    dBInstance.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    dBInstance.setDBInstanceClass(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    dBInstance.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBInstanceStatus", targetDepth)) {
                    dBInstance.setDBInstanceStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBInstance.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBName", targetDepth)) {
                    dBInstance.setDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    dBInstance.setEndpoint(EndpointStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBInstance.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    dBInstance.setInstanceCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    dBInstance.setPreferredBackupWindow(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    dBInstance.setBackupRetentionPeriod(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSecurityGroups", targetDepth)) {
                    dBInstance.withDBSecurityGroups(DBSecurityGroupMembershipStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    dBInstance.withVpcSecurityGroups(VpcSecurityGroupMembershipStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBParameterGroups", targetDepth)) {
                    dBInstance.withDBParameterGroups(DBParameterGroupStatusStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    dBInstance.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroup", targetDepth)) {
                    dBInstance.setDBSubnetGroup(DBSubnetGroupStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    dBInstance.setPreferredMaintenanceWindow(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    dBInstance.setPendingModifiedValues(PendingModifiedValuesStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LatestRestorableTime", targetDepth)) {
                    dBInstance.setLatestRestorableTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    dBInstance
                            .setMultiAZ(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBInstance.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    dBInstance.setAutoMinorVersionUpgrade(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaSourceDBInstanceIdentifier", targetDepth)) {
                    dBInstance.setReadReplicaSourceDBInstanceIdentifier(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaDBInstanceIdentifiers", targetDepth)) {
                    dBInstance.withReadReplicaDBInstanceIdentifiers(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadReplicaDBClusterIdentifiers", targetDepth)) {
                    dBInstance.withReadReplicaDBClusterIdentifiers(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBInstance.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Iops", targetDepth)) {
                    dBInstance.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OptionGroupMemberships", targetDepth)) {
                    dBInstance.withOptionGroupMemberships(OptionGroupMembershipStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CharacterSetName", targetDepth)) {
                    dBInstance.setCharacterSetName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SecondaryAvailabilityZone", targetDepth)) {
                    dBInstance.setSecondaryAvailabilityZone(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    dBInstance.setPubliclyAccessible(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StatusInfos", targetDepth)) {
                    dBInstance.withStatusInfos(DBInstanceStatusInfoStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    dBInstance.setStorageType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    dBInstance.setTdeCredentialArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DbInstancePort", targetDepth)) {
                    dBInstance.setDbInstancePort(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBInstance.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    dBInstance.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBInstance
                            .setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DbiResourceId", targetDepth)) {
                    dBInstance.setDbiResourceId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("CACertificateIdentifier", targetDepth)) {
                    dBInstance.setCACertificateIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainMemberships", targetDepth)) {
                    dBInstance.withDomainMemberships(DomainMembershipStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CopyTagsToSnapshot", targetDepth)) {
                    dBInstance.setCopyTagsToSnapshot(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MonitoringInterval", targetDepth)) {
                    dBInstance.setMonitoringInterval(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnhancedMonitoringResourceArn", targetDepth)) {
                    dBInstance.setEnhancedMonitoringResourceArn(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MonitoringRoleArn", targetDepth)) {
                    dBInstance.setMonitoringRoleArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PromotionTier", targetDepth)) {
                    dBInstance.setPromotionTier(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBInstanceArn", targetDepth)) {
                    dBInstance.setDBInstanceArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    dBInstance
                            .setTimezone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBInstance.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PerformanceInsightsEnabled", targetDepth)) {
                    dBInstance.setPerformanceInsightsEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PerformanceInsightsKMSKeyId", targetDepth)) {
                    dBInstance.setPerformanceInsightsKMSKeyId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PerformanceInsightsRetentionPeriod", targetDepth)) {
                    dBInstance.setPerformanceInsightsRetentionPeriod(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnabledCloudwatchLogsExports/member", targetDepth)) {
                    dBInstance.withEnabledCloudwatchLogsExports(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    dBInstance.withProcessorFeatures(ProcessorFeatureStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeletionProtection", targetDepth)) {
                    dBInstance.setDeletionProtection(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    dBInstance.withAssociatedRoles(DBInstanceRoleStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ListenerEndpoint", targetDepth)) {
                    dBInstance.setListenerEndpoint(EndpointStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MaxAllocatedStorage", targetDepth)) {
                    dBInstance.setMaxAllocatedStorage(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBInstance;
    }

    private static DBInstanceStaxUnmarshaller instance;

    public static DBInstanceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceStaxUnmarshaller();
        return instance;
    }
}
