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
 * StAX unmarshaller for model NodeGroupMemberUpdateStatus
 */
class NodeGroupMemberUpdateStatusStaxUnmarshaller implements
        Unmarshaller<NodeGroupMemberUpdateStatus, StaxUnmarshallerContext> {

    public NodeGroupMemberUpdateStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        NodeGroupMemberUpdateStatus nodeGroupMemberUpdateStatus = new NodeGroupMemberUpdateStatus();

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
                    nodeGroupMemberUpdateStatus.setCacheClusterId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheNodeId", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setCacheNodeId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateStatus", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeDeletionDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeDeletionDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateStartDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateStartDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateEndDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateEndDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateInitiatedBy", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateInitiatedBy(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateInitiatedDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus.setNodeUpdateInitiatedDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeUpdateStatusModifiedDate", targetDepth)) {
                    nodeGroupMemberUpdateStatus
                            .setNodeUpdateStatusModifiedDate(DateStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return nodeGroupMemberUpdateStatus;
    }

    private static NodeGroupMemberUpdateStatusStaxUnmarshaller instance;

    public static NodeGroupMemberUpdateStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupMemberUpdateStatusStaxUnmarshaller();
        return instance;
    }
}
