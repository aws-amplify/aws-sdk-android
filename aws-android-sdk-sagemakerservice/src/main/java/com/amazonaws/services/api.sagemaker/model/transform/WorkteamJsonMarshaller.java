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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Workteam
 */
class WorkteamJsonMarshaller {

    public void marshall(Workteam workteam, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workteam.getWorkteamName() != null) {
            String workteamName = workteam.getWorkteamName();
            jsonWriter.name("WorkteamName");
            jsonWriter.value(workteamName);
        }
        if (workteam.getMemberDefinitions() != null) {
            java.util.List<MemberDefinition> memberDefinitions = workteam.getMemberDefinitions();
            jsonWriter.name("MemberDefinitions");
            jsonWriter.beginArray();
            for (MemberDefinition memberDefinitionsItem : memberDefinitions) {
                if (memberDefinitionsItem != null) {
                    MemberDefinitionJsonMarshaller.getInstance().marshall(memberDefinitionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (workteam.getWorkteamArn() != null) {
            String workteamArn = workteam.getWorkteamArn();
            jsonWriter.name("WorkteamArn");
            jsonWriter.value(workteamArn);
        }
        if (workteam.getProductListingIds() != null) {
            java.util.List<String> productListingIds = workteam.getProductListingIds();
            jsonWriter.name("ProductListingIds");
            jsonWriter.beginArray();
            for (String productListingIdsItem : productListingIds) {
                if (productListingIdsItem != null) {
                    jsonWriter.value(productListingIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (workteam.getDescription() != null) {
            String description = workteam.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (workteam.getSubDomain() != null) {
            String subDomain = workteam.getSubDomain();
            jsonWriter.name("SubDomain");
            jsonWriter.value(subDomain);
        }
        if (workteam.getCreateDate() != null) {
            java.util.Date createDate = workteam.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (workteam.getLastUpdatedDate() != null) {
            java.util.Date lastUpdatedDate = workteam.getLastUpdatedDate();
            jsonWriter.name("LastUpdatedDate");
            jsonWriter.value(lastUpdatedDate);
        }
        if (workteam.getNotificationConfiguration() != null) {
            NotificationConfiguration notificationConfiguration = workteam
                    .getNotificationConfiguration();
            jsonWriter.name("NotificationConfiguration");
            NotificationConfigurationJsonMarshaller.getInstance().marshall(
                    notificationConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WorkteamJsonMarshaller instance;

    public static WorkteamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkteamJsonMarshaller();
        return instance;
    }
}
