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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainName
 */
class DomainNameJsonMarshaller {

    public void marshall(DomainName domainName, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainName.getApiMappingSelectionExpression() != null) {
            String apiMappingSelectionExpression = domainName.getApiMappingSelectionExpression();
            jsonWriter.name("ApiMappingSelectionExpression");
            jsonWriter.value(apiMappingSelectionExpression);
        }
        if (domainName.getDomainName() != null) {
            String domainName = domainName.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainName.getDomainNameConfigurations() != null) {
            java.util.List<DomainNameConfiguration> domainNameConfigurations = domainName
                    .getDomainNameConfigurations();
            jsonWriter.name("DomainNameConfigurations");
            jsonWriter.beginArray();
            for (DomainNameConfiguration domainNameConfigurationsItem : domainNameConfigurations) {
                if (domainNameConfigurationsItem != null) {
                    DomainNameConfigurationJsonMarshaller.getInstance().marshall(
                            domainNameConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (domainName.getTags() != null) {
            java.util.Map<String, String> tags = domainName.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DomainNameJsonMarshaller instance;

    public static DomainNameJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameJsonMarshaller();
        return instance;
    }
}
