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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Snapshot StAX Unmarshaller
 */
public class SnapshotStaxUnmarshaller implements Unmarshaller<Snapshot, StaxUnmarshallerContext> {

    public Snapshot unmarshall(StaxUnmarshallerContext context) throws Exception {
        Snapshot snapshot = new Snapshot();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return snapshot;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("snapshotId", targetDepth)) {
                    snapshot.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("volumeId", targetDepth)) {
                    snapshot.setVolumeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("status", targetDepth)) {
                    snapshot.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    snapshot.setStateMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("startTime", targetDepth)) {
                    snapshot.setStartTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("progress", targetDepth)) {
                    snapshot.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ownerId", targetDepth)) {
                    snapshot.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("description", targetDepth)) {
                    snapshot.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("volumeSize", targetDepth)) {
                    snapshot.setVolumeSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ownerAlias", targetDepth)) {
                    snapshot.setOwnerAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("tagSet/item", targetDepth)) {
                    snapshot.getTags().add(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("encrypted", targetDepth)) {
                    snapshot.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    snapshot.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("dataEncryptionKeyId", targetDepth)) {
                    snapshot.setDataEncryptionKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshot;
                }
            }
        }
    }

    private static SnapshotStaxUnmarshaller instance;
    public static SnapshotStaxUnmarshaller getInstance() {
        if (instance == null) instance = new SnapshotStaxUnmarshaller();
        return instance;
    }
}
    