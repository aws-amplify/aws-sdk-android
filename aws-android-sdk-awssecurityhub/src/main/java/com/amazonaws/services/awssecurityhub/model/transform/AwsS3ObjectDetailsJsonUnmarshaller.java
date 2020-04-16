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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsS3ObjectDetails
 */
class AwsS3ObjectDetailsJsonUnmarshaller implements
        Unmarshaller<AwsS3ObjectDetails, JsonUnmarshallerContext> {

    public AwsS3ObjectDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsS3ObjectDetails awsS3ObjectDetails = new AwsS3ObjectDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LastModified")) {
                awsS3ObjectDetails.setLastModified(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ETag")) {
                awsS3ObjectDetails.setETag(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionId")) {
                awsS3ObjectDetails.setVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentType")) {
                awsS3ObjectDetails.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerSideEncryption")) {
                awsS3ObjectDetails.setServerSideEncryption(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SSEKMSKeyId")) {
                awsS3ObjectDetails.setSSEKMSKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsS3ObjectDetails;
    }

    private static AwsS3ObjectDetailsJsonUnmarshaller instance;

    public static AwsS3ObjectDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3ObjectDetailsJsonUnmarshaller();
        return instance;
    }
}
