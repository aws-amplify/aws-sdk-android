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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AnalyzedResourceSummary
 */
class AnalyzedResourceSummaryJsonMarshaller {

    public void marshall(AnalyzedResourceSummary analyzedResourceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (analyzedResourceSummary.getResourceArn() != null) {
            String resourceArn = analyzedResourceSummary.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        if (analyzedResourceSummary.getResourceOwnerAccount() != null) {
            String resourceOwnerAccount = analyzedResourceSummary.getResourceOwnerAccount();
            jsonWriter.name("resourceOwnerAccount");
            jsonWriter.value(resourceOwnerAccount);
        }
        if (analyzedResourceSummary.getResourceType() != null) {
            String resourceType = analyzedResourceSummary.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static AnalyzedResourceSummaryJsonMarshaller instance;

    public static AnalyzedResourceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzedResourceSummaryJsonMarshaller();
        return instance;
    }
}
