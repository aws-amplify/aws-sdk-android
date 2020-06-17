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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LaunchTemplatePlacementRequest
 */
class LaunchTemplatePlacementRequestJsonUnmarshaller implements
        Unmarshaller<LaunchTemplatePlacementRequest, JsonUnmarshallerContext> {

    public LaunchTemplatePlacementRequest unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LaunchTemplatePlacementRequest launchTemplatePlacementRequest = new LaunchTemplatePlacementRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                launchTemplatePlacementRequest.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Affinity")) {
                launchTemplatePlacementRequest.setAffinity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupName")) {
                launchTemplatePlacementRequest.setGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostId")) {
                launchTemplatePlacementRequest.setHostId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tenancy")) {
                launchTemplatePlacementRequest.setTenancy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpreadDomain")) {
                launchTemplatePlacementRequest.setSpreadDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HostResourceGroupArn")) {
                launchTemplatePlacementRequest.setHostResourceGroupArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartitionNumber")) {
                launchTemplatePlacementRequest.setPartitionNumber(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return launchTemplatePlacementRequest;
    }

    private static LaunchTemplatePlacementRequestJsonUnmarshaller instance;

    public static LaunchTemplatePlacementRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplatePlacementRequestJsonUnmarshaller();
        return instance;
    }
}
