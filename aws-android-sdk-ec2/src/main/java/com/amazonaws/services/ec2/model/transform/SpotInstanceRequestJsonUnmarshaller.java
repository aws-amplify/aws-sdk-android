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
 * JSON unmarshaller for POJO SpotInstanceRequest
 */
class SpotInstanceRequestJsonUnmarshaller implements
        Unmarshaller<SpotInstanceRequest, JsonUnmarshallerContext> {

    public SpotInstanceRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SpotInstanceRequest spotInstanceRequest = new SpotInstanceRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActualBlockHourlyPrice")) {
                spotInstanceRequest.setActualBlockHourlyPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZoneGroup")) {
                spotInstanceRequest.setAvailabilityZoneGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDurationMinutes")) {
                spotInstanceRequest.setBlockDurationMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                spotInstanceRequest.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Fault")) {
                spotInstanceRequest.setFault(SpotInstanceStateFaultJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                spotInstanceRequest.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchGroup")) {
                spotInstanceRequest.setLaunchGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchSpecification")) {
                spotInstanceRequest.setLaunchSpecification(LaunchSpecificationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LaunchedAvailabilityZone")) {
                spotInstanceRequest.setLaunchedAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductDescription")) {
                spotInstanceRequest.setProductDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotInstanceRequestId")) {
                spotInstanceRequest.setSpotInstanceRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpotPrice")) {
                spotInstanceRequest.setSpotPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                spotInstanceRequest.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                spotInstanceRequest.setStatus(SpotInstanceStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                spotInstanceRequest.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                spotInstanceRequest.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidFrom")) {
                spotInstanceRequest.setValidFrom(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidUntil")) {
                spotInstanceRequest.setValidUntil(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceInterruptionBehavior")) {
                spotInstanceRequest.setInstanceInterruptionBehavior(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return spotInstanceRequest;
    }

    private static SpotInstanceRequestJsonUnmarshaller instance;

    public static SpotInstanceRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotInstanceRequestJsonUnmarshaller();
        return instance;
    }
}
