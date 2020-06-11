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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CapacityProvider
 */
class CapacityProviderJsonUnmarshaller implements
        Unmarshaller<CapacityProvider, JsonUnmarshallerContext> {

    public CapacityProvider unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CapacityProvider capacityProvider = new CapacityProvider();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("capacityProviderArn")) {
                capacityProvider.setCapacityProviderArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                capacityProvider.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                capacityProvider.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoScalingGroupProvider")) {
                capacityProvider
                        .setAutoScalingGroupProvider(AutoScalingGroupProviderJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("updateStatus")) {
                capacityProvider.setUpdateStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updateStatusReason")) {
                capacityProvider.setUpdateStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                capacityProvider.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return capacityProvider;
    }

    private static CapacityProviderJsonUnmarshaller instance;

    public static CapacityProviderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CapacityProviderJsonUnmarshaller();
        return instance;
    }
}
