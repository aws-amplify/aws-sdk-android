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

package com.amazonaws.services.amazonredshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model TableRestoreStatus
 */
class TableRestoreStatusStaxUnmarshaller implements
        Unmarshaller<TableRestoreStatus, StaxUnmarshallerContext> {

    public TableRestoreStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        TableRestoreStatus tableRestoreStatus = new TableRestoreStatus();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("TableRestoreRequestId", targetDepth)) {
                    tableRestoreStatus.setTableRestoreRequestId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    tableRestoreStatus.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Message", targetDepth)) {
                    tableRestoreStatus.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("RequestTime", targetDepth)) {
                    tableRestoreStatus.setRequestTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProgressInMegaBytes", targetDepth)) {
                    tableRestoreStatus.setProgressInMegaBytes(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TotalDataInMegaBytes", targetDepth)) {
                    tableRestoreStatus.setTotalDataInMegaBytes(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    tableRestoreStatus.setClusterIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotIdentifier", targetDepth)) {
                    tableRestoreStatus.setSnapshotIdentifier(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceDatabaseName", targetDepth)) {
                    tableRestoreStatus.setSourceDatabaseName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceSchemaName", targetDepth)) {
                    tableRestoreStatus.setSourceSchemaName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceTableName", targetDepth)) {
                    tableRestoreStatus.setSourceTableName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetDatabaseName", targetDepth)) {
                    tableRestoreStatus.setTargetDatabaseName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetSchemaName", targetDepth)) {
                    tableRestoreStatus.setTargetSchemaName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NewTableName", targetDepth)) {
                    tableRestoreStatus.setNewTableName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return tableRestoreStatus;
    }

    private static TableRestoreStatusStaxUnmarshaller instance;

    public static TableRestoreStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableRestoreStatusStaxUnmarshaller();
        return instance;
    }
}
