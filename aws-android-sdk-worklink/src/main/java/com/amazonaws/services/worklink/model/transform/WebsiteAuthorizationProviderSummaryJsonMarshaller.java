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
 * JSON marshaller for POJO WebsiteAuthorizationProviderSummary
 */
class WebsiteAuthorizationProviderSummaryJsonMarshaller {

    public void marshall(WebsiteAuthorizationProviderSummary websiteAuthorizationProviderSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (websiteAuthorizationProviderSummary.getAuthorizationProviderId() != null) {
            String authorizationProviderId = websiteAuthorizationProviderSummary
                    .getAuthorizationProviderId();
            jsonWriter.name("AuthorizationProviderId");
            jsonWriter.value(authorizationProviderId);
        }
        if (websiteAuthorizationProviderSummary.getAuthorizationProviderType() != null) {
            String authorizationProviderType = websiteAuthorizationProviderSummary
                    .getAuthorizationProviderType();
            jsonWriter.name("AuthorizationProviderType");
            jsonWriter.value(authorizationProviderType);
        }
        if (websiteAuthorizationProviderSummary.getDomainName() != null) {
            String domainName = websiteAuthorizationProviderSummary.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (websiteAuthorizationProviderSummary.getCreatedTime() != null) {
            java.util.Date createdTime = websiteAuthorizationProviderSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static WebsiteAuthorizationProviderSummaryJsonMarshaller instance;

    public static WebsiteAuthorizationProviderSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebsiteAuthorizationProviderSummaryJsonMarshaller();
        return instance;
    }
}
