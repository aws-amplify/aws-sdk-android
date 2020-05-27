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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Resource
 */
class ResourceJsonMarshaller {

    public void marshall(Resource resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resource.getAccessKeyDetails() != null) {
            AccessKeyDetails accessKeyDetails = resource.getAccessKeyDetails();
            jsonWriter.name("AccessKeyDetails");
            AccessKeyDetailsJsonMarshaller.getInstance().marshall(accessKeyDetails, jsonWriter);
        }
        if (resource.getInstanceDetails() != null) {
            InstanceDetails instanceDetails = resource.getInstanceDetails();
            jsonWriter.name("InstanceDetails");
            InstanceDetailsJsonMarshaller.getInstance().marshall(instanceDetails, jsonWriter);
        }
        if (resource.getResourceType() != null) {
            String resourceType = resource.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }
}
