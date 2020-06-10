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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResourcesAffected
 */
class ResourcesAffectedJsonUnmarshaller implements
        Unmarshaller<ResourcesAffected, JsonUnmarshallerContext> {

    public ResourcesAffected unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourcesAffected resourcesAffected = new ResourcesAffected();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("s3Bucket")) {
                resourcesAffected.setS3Bucket(S3BucketJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3Object")) {
                resourcesAffected.setS3Object(S3ObjectJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourcesAffected;
    }

    private static ResourcesAffectedJsonUnmarshaller instance;

    public static ResourcesAffectedJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourcesAffectedJsonUnmarshaller();
        return instance;
    }
}
