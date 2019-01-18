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
 * StAX unmarshaller for model Ebs
 */
class EbsStaxUnmarshaller implements Unmarshaller<Ebs, StaxUnmarshallerContext> {

    public Ebs unmarshall(StaxUnmarshallerContext context) throws Exception {
        Ebs ebs = new Ebs();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("SnapshotId", targetDepth)) {
                    ebs.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VolumeSize", targetDepth)) {
                    ebs.setVolumeSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    ebs.setVolumeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeleteOnTermination", targetDepth)) {
                    ebs.setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Iops", targetDepth)) {
                    ebs.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    ebs.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return ebs;
    }

    private static EbsStaxUnmarshaller instance;

    public static EbsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsStaxUnmarshaller();
        return instance;
    }
}
