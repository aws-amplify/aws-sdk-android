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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceAssociationOutputLocation
 */
class InstanceAssociationOutputLocationJsonMarshaller {

    public void marshall(InstanceAssociationOutputLocation instanceAssociationOutputLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceAssociationOutputLocation.getS3Location() != null) {
            S3OutputLocation s3Location = instanceAssociationOutputLocation.getS3Location();
            jsonWriter.name("S3Location");
            S3OutputLocationJsonMarshaller.getInstance().marshall(s3Location, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceAssociationOutputLocationJsonMarshaller instance;
    public static InstanceAssociationOutputLocationJsonMarshaller getInstance() {
        if (instance == null) instance = new InstanceAssociationOutputLocationJsonMarshaller();
        return instance;
    }
}
