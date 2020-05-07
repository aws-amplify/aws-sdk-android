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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudFormationStackRecordSourceInfo
 */
class CloudFormationStackRecordSourceInfoJsonMarshaller {

    public void marshall(CloudFormationStackRecordSourceInfo cloudFormationStackRecordSourceInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cloudFormationStackRecordSourceInfo.getResourceType() != null) {
            String resourceType = cloudFormationStackRecordSourceInfo.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (cloudFormationStackRecordSourceInfo.getName() != null) {
            String name = cloudFormationStackRecordSourceInfo.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (cloudFormationStackRecordSourceInfo.getArn() != null) {
            String arn = cloudFormationStackRecordSourceInfo.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        jsonWriter.endObject();
    }

    private static CloudFormationStackRecordSourceInfoJsonMarshaller instance;

    public static CloudFormationStackRecordSourceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFormationStackRecordSourceInfoJsonMarshaller();
        return instance;
    }
}
