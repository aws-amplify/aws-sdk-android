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
 * StAX unmarshaller for model DBSnapshot
 */
class DBSnapshotStaxUnmarshaller implements Unmarshaller<DBSnapshot, StaxUnmarshallerContext> {

    public DBSnapshot unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBSnapshot dBSnapshot = new DBSnapshot();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("DBSnapshotIdentifier", targetDepth)) {
                    dBSnapshot.setDBSnapshotIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    dBSnapshot.setDBInstanceIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    dBSnapshot.setSnapshotCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    dBSnapshot.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBSnapshot.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBSnapshot.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    dBSnapshot.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    dBSnapshot.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    dBSnapshot.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    dBSnapshot.setInstanceCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBSnapshot.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBSnapshot.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBSnapshot.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    dBSnapshot.setSnapshotType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Iops", targetDepth)) {
                    dBSnapshot.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OptionGroupName", targetDepth)) {
                    dBSnapshot.setOptionGroupName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    dBSnapshot.setPercentProgress(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SourceRegion", targetDepth)) {
                    dBSnapshot.setSourceRegion(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("SourceDBSnapshotIdentifier", targetDepth)) {
                    dBSnapshot.setSourceDBSnapshotIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    dBSnapshot.setStorageType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    dBSnapshot.setTdeCredentialArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    dBSnapshot.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBSnapshot
                            .setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSnapshotArn", targetDepth)) {
                    dBSnapshot.setDBSnapshotArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    dBSnapshot
                            .setTimezone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IAMDatabaseAuthenticationEnabled", targetDepth)) {
                    dBSnapshot.setIAMDatabaseAuthenticationEnabled(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    dBSnapshot.withProcessorFeatures(ProcessorFeatureStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DbiResourceId", targetDepth)) {
                    dBSnapshot.setDbiResourceId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBSnapshot;
    }

    private static DBSnapshotStaxUnmarshaller instance;

    public static DBSnapshotStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBSnapshotStaxUnmarshaller();
        return instance;
    }
}
