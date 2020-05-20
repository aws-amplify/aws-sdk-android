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
 * JSON unmarshaller for POJO LoadBalancerInfo
 */
class LoadBalancerInfoJsonUnmarshaller implements
        Unmarshaller<LoadBalancerInfo, JsonUnmarshallerContext> {

    public LoadBalancerInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LoadBalancerInfo loadBalancerInfo = new LoadBalancerInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("elbInfoList")) {
                loadBalancerInfo.setElbInfoList(new ListUnmarshaller<ELBInfo>(
                        ELBInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("targetGroupInfoList")) {
                loadBalancerInfo.setTargetGroupInfoList(new ListUnmarshaller<TargetGroupInfo>(
                        TargetGroupInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("targetGroupPairInfoList")) {
                loadBalancerInfo
                        .setTargetGroupPairInfoList(new ListUnmarshaller<TargetGroupPairInfo>(
                                TargetGroupPairInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return loadBalancerInfo;
    }

    private static LoadBalancerInfoJsonUnmarshaller instance;

    public static LoadBalancerInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerInfoJsonUnmarshaller();
        return instance;
    }
}
