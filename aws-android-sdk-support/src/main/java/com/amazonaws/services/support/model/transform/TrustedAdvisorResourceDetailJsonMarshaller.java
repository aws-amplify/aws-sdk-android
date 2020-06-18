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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrustedAdvisorResourceDetail
 */
class TrustedAdvisorResourceDetailJsonMarshaller {

    public void marshall(TrustedAdvisorResourceDetail trustedAdvisorResourceDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorResourceDetail.getStatus() != null) {
            String status = trustedAdvisorResourceDetail.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (trustedAdvisorResourceDetail.getRegion() != null) {
            String region = trustedAdvisorResourceDetail.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (trustedAdvisorResourceDetail.getResourceId() != null) {
            String resourceId = trustedAdvisorResourceDetail.getResourceId();
            jsonWriter.name("resourceId");
            jsonWriter.value(resourceId);
        }
        if (trustedAdvisorResourceDetail.getIsSuppressed() != null) {
            Boolean isSuppressed = trustedAdvisorResourceDetail.getIsSuppressed();
            jsonWriter.name("isSuppressed");
            jsonWriter.value(isSuppressed);
        }
        if (trustedAdvisorResourceDetail.getMetadata() != null) {
            java.util.List<String> metadata = trustedAdvisorResourceDetail.getMetadata();
            jsonWriter.name("metadata");
            jsonWriter.beginArray();
            for (String metadataItem : metadata) {
                if (metadataItem != null) {
                    jsonWriter.value(metadataItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorResourceDetailJsonMarshaller instance;

    public static TrustedAdvisorResourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorResourceDetailJsonMarshaller();
        return instance;
    }
}
