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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Webhook
 */
class WebhookJsonMarshaller {

    public void marshall(Webhook webhook, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (webhook.getWebhookArn() != null) {
            String webhookArn = webhook.getWebhookArn();
            jsonWriter.name("webhookArn");
            jsonWriter.value(webhookArn);
        }
        if (webhook.getWebhookId() != null) {
            String webhookId = webhook.getWebhookId();
            jsonWriter.name("webhookId");
            jsonWriter.value(webhookId);
        }
        if (webhook.getWebhookUrl() != null) {
            String webhookUrl = webhook.getWebhookUrl();
            jsonWriter.name("webhookUrl");
            jsonWriter.value(webhookUrl);
        }
        if (webhook.getBranchName() != null) {
            String branchName = webhook.getBranchName();
            jsonWriter.name("branchName");
            jsonWriter.value(branchName);
        }
        if (webhook.getDescription() != null) {
            String description = webhook.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (webhook.getCreateTime() != null) {
            java.util.Date createTime = webhook.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (webhook.getUpdateTime() != null) {
            java.util.Date updateTime = webhook.getUpdateTime();
            jsonWriter.name("updateTime");
            jsonWriter.value(updateTime);
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
