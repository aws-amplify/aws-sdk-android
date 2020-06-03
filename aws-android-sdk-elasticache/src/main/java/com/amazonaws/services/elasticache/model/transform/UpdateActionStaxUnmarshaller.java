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
 * StAX unmarshaller for model UpdateAction
 */
class UpdateActionStaxUnmarshaller implements Unmarshaller<UpdateAction, StaxUnmarshallerContext> {

    public UpdateAction unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpdateAction updateAction = new UpdateAction();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("ReplicationGroupId", targetDepth)) {
                    updateAction.setReplicationGroupId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheClusterId", targetDepth)) {
                    updateAction.setCacheClusterId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateName", targetDepth)) {
                    updateAction.setServiceUpdateName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateReleaseDate", targetDepth)) {
                    updateAction.setServiceUpdateReleaseDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateSeverity", targetDepth)) {
                    updateAction.setServiceUpdateSeverity(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateStatus", targetDepth)) {
                    updateAction.setServiceUpdateStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateRecommendedApplyByDate", targetDepth)) {
                    updateAction.setServiceUpdateRecommendedApplyByDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServiceUpdateType", targetDepth)) {
                    updateAction.setServiceUpdateType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdateActionAvailableDate", targetDepth)) {
                    updateAction.setUpdateActionAvailableDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdateActionStatus", targetDepth)) {
                    updateAction.setUpdateActionStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodesUpdated", targetDepth)) {
                    updateAction.setNodesUpdated(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("UpdateActionStatusModifiedDate", targetDepth)) {
                    updateAction.setUpdateActionStatusModifiedDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SlaMet", targetDepth)) {
                    updateAction
                            .setSlaMet(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeGroupUpdateStatus", targetDepth)) {
                    updateAction.withNodeGroupUpdateStatus(NodeGroupUpdateStatusStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodeUpdateStatus", targetDepth)) {
                    updateAction.withCacheNodeUpdateStatus(CacheNodeUpdateStatusStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EstimatedUpdateTime", targetDepth)) {
                    updateAction.setEstimatedUpdateTime(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    updateAction
                            .setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return updateAction;
    }

    private static UpdateActionStaxUnmarshaller instance;

    public static UpdateActionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateActionStaxUnmarshaller();
        return instance;
    }
}
