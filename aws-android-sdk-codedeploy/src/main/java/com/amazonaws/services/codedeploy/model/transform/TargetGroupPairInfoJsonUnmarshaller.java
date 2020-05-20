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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TargetGroupPairInfo
 */
class TargetGroupPairInfoJsonUnmarshaller implements
        Unmarshaller<TargetGroupPairInfo, JsonUnmarshallerContext> {

    public TargetGroupPairInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TargetGroupPairInfo targetGroupPairInfo = new TargetGroupPairInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("targetGroups")) {
                targetGroupPairInfo.setTargetGroups(new ListUnmarshaller<TargetGroupInfo>(
                        TargetGroupInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("prodTrafficRoute")) {
                targetGroupPairInfo.setProdTrafficRoute(TrafficRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("testTrafficRoute")) {
                targetGroupPairInfo.setTestTrafficRoute(TrafficRouteJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return targetGroupPairInfo;
    }

    private static TargetGroupPairInfoJsonUnmarshaller instance;

    public static TargetGroupPairInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetGroupPairInfoJsonUnmarshaller();
        return instance;
    }
}
