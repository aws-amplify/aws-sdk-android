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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CloudFormationStackRecord
 */
class CloudFormationStackRecordJsonUnmarshaller implements
        Unmarshaller<CloudFormationStackRecord, JsonUnmarshallerContext> {

    public CloudFormationStackRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CloudFormationStackRecord cloudFormationStackRecord = new CloudFormationStackRecord();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                cloudFormationStackRecord.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                cloudFormationStackRecord.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                cloudFormationStackRecord.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                cloudFormationStackRecord.setLocation(ResourceLocationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                cloudFormationStackRecord.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                cloudFormationStackRecord.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceInfo")) {
                cloudFormationStackRecord
                        .setSourceInfo(new ListUnmarshaller<CloudFormationStackRecordSourceInfo>(
                                CloudFormationStackRecordSourceInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("destinationInfo")) {
                cloudFormationStackRecord.setDestinationInfo(DestinationInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cloudFormationStackRecord;
    }

    private static CloudFormationStackRecordJsonUnmarshaller instance;

    public static CloudFormationStackRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudFormationStackRecordJsonUnmarshaller();
        return instance;
    }
}
