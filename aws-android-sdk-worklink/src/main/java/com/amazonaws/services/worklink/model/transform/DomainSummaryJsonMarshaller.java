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

package com.amazonaws.services.worklink.model.transform;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainSummary
 */
class DomainSummaryJsonMarshaller {

    public void marshall(DomainSummary domainSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainSummary.getDomainName() != null) {
            String domainName = domainSummary.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainSummary.getDisplayName() != null) {
            String displayName = domainSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (domainSummary.getCreatedTime() != null) {
            java.util.Date createdTime = domainSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (domainSummary.getDomainStatus() != null) {
            String domainStatus = domainSummary.getDomainStatus();
            jsonWriter.name("DomainStatus");
            jsonWriter.value(domainStatus);
        }
        jsonWriter.endObject();
    }

    private static DomainSummaryJsonMarshaller instance;

    public static DomainSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainSummaryJsonMarshaller();
        return instance;
    }
}
