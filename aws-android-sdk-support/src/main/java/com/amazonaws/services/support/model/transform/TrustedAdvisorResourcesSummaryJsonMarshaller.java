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
 * JSON marshaller for POJO TrustedAdvisorResourcesSummary
 */
class TrustedAdvisorResourcesSummaryJsonMarshaller {

    public void marshall(TrustedAdvisorResourcesSummary trustedAdvisorResourcesSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorResourcesSummary.getResourcesProcessed() != null) {
            Long resourcesProcessed = trustedAdvisorResourcesSummary.getResourcesProcessed();
            jsonWriter.name("resourcesProcessed");
            jsonWriter.value(resourcesProcessed);
        }
        if (trustedAdvisorResourcesSummary.getResourcesFlagged() != null) {
            Long resourcesFlagged = trustedAdvisorResourcesSummary.getResourcesFlagged();
            jsonWriter.name("resourcesFlagged");
            jsonWriter.value(resourcesFlagged);
        }
        if (trustedAdvisorResourcesSummary.getResourcesIgnored() != null) {
            Long resourcesIgnored = trustedAdvisorResourcesSummary.getResourcesIgnored();
            jsonWriter.name("resourcesIgnored");
            jsonWriter.value(resourcesIgnored);
        }
        if (trustedAdvisorResourcesSummary.getResourcesSuppressed() != null) {
            Long resourcesSuppressed = trustedAdvisorResourcesSummary.getResourcesSuppressed();
            jsonWriter.name("resourcesSuppressed");
            jsonWriter.value(resourcesSuppressed);
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorResourcesSummaryJsonMarshaller instance;

    public static TrustedAdvisorResourcesSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorResourcesSummaryJsonMarshaller();
        return instance;
    }
}
