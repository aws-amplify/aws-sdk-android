/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelatedResource
 */
class RelatedResourceJsonMarshaller {

    public void marshall(RelatedResource relatedResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (relatedResource.getResourceType() != null) {
            String resourceType = relatedResource.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (relatedResource.getResourceIdentifier() != null) {
            ResourceIdentifier resourceIdentifier = relatedResource.getResourceIdentifier();
            jsonWriter.name("resourceIdentifier");
            ResourceIdentifierJsonMarshaller.getInstance().marshall(resourceIdentifier, jsonWriter);
        }
        if (relatedResource.getAdditionalInfo() != null) {
            java.util.Map<String, String> additionalInfo = relatedResource.getAdditionalInfo();
            jsonWriter.name("additionalInfo");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> additionalInfoEntry : additionalInfo
                    .entrySet()) {
                String additionalInfoValue = additionalInfoEntry.getValue();
                if (additionalInfoValue != null) {
                    jsonWriter.name(additionalInfoEntry.getKey());
                    jsonWriter.value(additionalInfoValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static RelatedResourceJsonMarshaller instance;

    public static RelatedResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelatedResourceJsonMarshaller();
        return instance;
    }
}
