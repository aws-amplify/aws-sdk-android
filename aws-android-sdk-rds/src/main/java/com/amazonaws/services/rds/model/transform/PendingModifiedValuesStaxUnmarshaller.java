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
 * StAX unmarshaller for model PendingModifiedValues
 */
class PendingModifiedValuesStaxUnmarshaller implements
        Unmarshaller<PendingModifiedValues, StaxUnmarshallerContext> {

    public PendingModifiedValues unmarshall(StaxUnmarshallerContext context) throws Exception {
        PendingModifiedValues pendingModifiedValues = new PendingModifiedValues();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("DBInstanceClass", targetDepth)) {
                    pendingModifiedValues.setDBInstanceClass(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    pendingModifiedValues.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUserPassword", targetDepth)) {
                    pendingModifiedValues.setMasterUserPassword(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    pendingModifiedValues.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    pendingModifiedValues.setBackupRetentionPeriod(IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    pendingModifiedValues.setMultiAZ(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    pendingModifiedValues.setEngineVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    pendingModifiedValues.setLicenseModel(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Iops", targetDepth)) {
                    pendingModifiedValues.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    pendingModifiedValues.setDBInstanceIdentifier(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    pendingModifiedValues.setStorageType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CACertificateIdentifier", targetDepth)) {
                    pendingModifiedValues.setCACertificateIdentifier(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBSubnetGroupName", targetDepth)) {
                    pendingModifiedValues.setDBSubnetGroupName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("PendingCloudwatchLogsExports", targetDepth)) {
                    pendingModifiedValues
                            .setPendingCloudwatchLogsExports(PendingCloudwatchLogsExportsStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    pendingModifiedValues.withProcessorFeatures(ProcessorFeatureStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return pendingModifiedValues;
    }

    private static PendingModifiedValuesStaxUnmarshaller instance;

    public static PendingModifiedValuesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedValuesStaxUnmarshaller();
        return instance;
    }
}
