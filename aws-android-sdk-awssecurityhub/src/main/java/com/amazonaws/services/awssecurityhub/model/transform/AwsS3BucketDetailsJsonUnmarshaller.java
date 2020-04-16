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
 * JSON unmarshaller for POJO AwsS3BucketDetails
 */
class AwsS3BucketDetailsJsonUnmarshaller implements
        Unmarshaller<AwsS3BucketDetails, JsonUnmarshallerContext> {

    public AwsS3BucketDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsS3BucketDetails awsS3BucketDetails = new AwsS3BucketDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                awsS3BucketDetails.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerName")) {
                awsS3BucketDetails.setOwnerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                awsS3BucketDetails.setCreatedAt(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerSideEncryptionConfiguration")) {
                awsS3BucketDetails
                        .setServerSideEncryptionConfiguration(AwsS3BucketServerSideEncryptionConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsS3BucketDetails;
    }

    private static AwsS3BucketDetailsJsonUnmarshaller instance;

    public static AwsS3BucketDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsS3BucketDetailsJsonUnmarshaller();
        return instance;
    }
}
