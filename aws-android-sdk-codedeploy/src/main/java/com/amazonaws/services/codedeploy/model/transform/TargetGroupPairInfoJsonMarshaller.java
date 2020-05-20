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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetGroupPairInfo
 */
class TargetGroupPairInfoJsonMarshaller {

    public void marshall(TargetGroupPairInfo targetGroupPairInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetGroupPairInfo.getTargetGroups() != null) {
            java.util.List<TargetGroupInfo> targetGroups = targetGroupPairInfo.getTargetGroups();
            jsonWriter.name("targetGroups");
            jsonWriter.beginArray();
            for (TargetGroupInfo targetGroupsItem : targetGroups) {
                if (targetGroupsItem != null) {
                    TargetGroupInfoJsonMarshaller.getInstance().marshall(targetGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (targetGroupPairInfo.getProdTrafficRoute() != null) {
            TrafficRoute prodTrafficRoute = targetGroupPairInfo.getProdTrafficRoute();
            jsonWriter.name("prodTrafficRoute");
            TrafficRouteJsonMarshaller.getInstance().marshall(prodTrafficRoute, jsonWriter);
        }
        if (targetGroupPairInfo.getTestTrafficRoute() != null) {
            TrafficRoute testTrafficRoute = targetGroupPairInfo.getTestTrafficRoute();
            jsonWriter.name("testTrafficRoute");
            TrafficRouteJsonMarshaller.getInstance().marshall(testTrafficRoute, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TargetGroupPairInfoJsonMarshaller instance;

    public static TargetGroupPairInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetGroupPairInfoJsonMarshaller();
        return instance;
    }
}
