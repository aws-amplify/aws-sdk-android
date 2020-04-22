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
 * StAX unmarshaller for model RestoreStatus
 */
class RestoreStatusStaxUnmarshaller implements Unmarshaller<RestoreStatus, StaxUnmarshallerContext> {

    public RestoreStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        RestoreStatus restoreStatus = new RestoreStatus();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Status", targetDepth)) {
                    restoreStatus.setStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CurrentRestoreRateInMegaBytesPerSecond", targetDepth)) {
                    restoreStatus.setCurrentRestoreRateInMegaBytesPerSecond(DoubleStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotSizeInMegaBytes", targetDepth)) {
                    restoreStatus.setSnapshotSizeInMegaBytes(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProgressInMegaBytes", targetDepth)) {
                    restoreStatus.setProgressInMegaBytes(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ElapsedTimeInSeconds", targetDepth)) {
                    restoreStatus.setElapsedTimeInSeconds(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EstimatedTimeToCompletionInSeconds", targetDepth)) {
                    restoreStatus.setEstimatedTimeToCompletionInSeconds(LongStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return restoreStatus;
    }

    private static RestoreStatusStaxUnmarshaller instance;

    public static RestoreStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreStatusStaxUnmarshaller();
        return instance;
    }
}
