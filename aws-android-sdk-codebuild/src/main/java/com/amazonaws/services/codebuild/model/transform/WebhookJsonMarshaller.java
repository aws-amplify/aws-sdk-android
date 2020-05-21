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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Webhook
 */
class WebhookJsonMarshaller {

    public void marshall(Webhook webhook, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (webhook.getUrl() != null) {
            String url = webhook.getUrl();
            jsonWriter.name("url");
            jsonWriter.value(url);
        }
        if (webhook.getPayloadUrl() != null) {
            String payloadUrl = webhook.getPayloadUrl();
            jsonWriter.name("payloadUrl");
            jsonWriter.value(payloadUrl);
        }
        if (webhook.getSecret() != null) {
            String secret = webhook.getSecret();
            jsonWriter.name("secret");
            jsonWriter.value(secret);
        }
        if (webhook.getBranchFilter() != null) {
            String branchFilter = webhook.getBranchFilter();
            jsonWriter.name("branchFilter");
            jsonWriter.value(branchFilter);
        }
        if (webhook.getFilterGroups() != null) {
            java.util.List<java.util.List<WebhookFilter>> filterGroups = webhook.getFilterGroups();
            jsonWriter.name("filterGroups");
            jsonWriter.beginArray();
            for (java.util.List<WebhookFilter> filterGroupsItem : filterGroups) {
                if (filterGroupsItem != null) {
                    jsonWriter.beginArray();
                    for (WebhookFilter filterGroupsItemItem : filterGroupsItem) {
                        if (filterGroupsItemItem != null) {
                            WebhookFilterJsonMarshaller.getInstance().marshall(
                                    filterGroupsItemItem, jsonWriter);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endArray();
        }
        if (webhook.getLastModifiedSecret() != null) {
            java.util.Date lastModifiedSecret = webhook.getLastModifiedSecret();
            jsonWriter.name("lastModifiedSecret");
            jsonWriter.value(lastModifiedSecret);
        }
        jsonWriter.endObject();
    }

    private static WebhookJsonMarshaller instance;

    public static WebhookJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WebhookJsonMarshaller();
        return instance;
    }
}
