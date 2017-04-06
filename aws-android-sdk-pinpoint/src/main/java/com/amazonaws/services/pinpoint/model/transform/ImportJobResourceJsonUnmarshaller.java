/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImportJobResource
 */
class ImportJobResourceJsonUnmarshaller implements
        Unmarshaller<ImportJobResource, JsonUnmarshallerContext> {

    public ImportJobResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImportJobResource importJobResource = new ImportJobResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DefineSegment")) {
                importJobResource.setDefineSegment(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExternalId")) {
                importJobResource.setExternalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Format")) {
                importJobResource.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RegisterEndpoints")) {
                importJobResource.setRegisterEndpoints(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                importJobResource.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3Url")) {
                importJobResource.setS3Url(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentId")) {
                importJobResource.setSegmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentName")) {
                importJobResource.setSegmentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return importJobResource;
    }

    private static ImportJobResourceJsonUnmarshaller instance;

    public static ImportJobResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResourceJsonUnmarshaller();
        return instance;
    }
}
