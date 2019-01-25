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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CampaignEmailMessage
 */
class CampaignEmailMessageJsonMarshaller {

    public void marshall(CampaignEmailMessage campaignEmailMessage, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (campaignEmailMessage.getBody() != null) {
            String body = campaignEmailMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (campaignEmailMessage.getFromAddress() != null) {
            String fromAddress = campaignEmailMessage.getFromAddress();
            jsonWriter.name("FromAddress");
            jsonWriter.value(fromAddress);
        }
        if (campaignEmailMessage.getHtmlBody() != null) {
            String htmlBody = campaignEmailMessage.getHtmlBody();
            jsonWriter.name("HtmlBody");
            jsonWriter.value(htmlBody);
        }
        if (campaignEmailMessage.getTitle() != null) {
            String title = campaignEmailMessage.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        jsonWriter.endObject();
    }

    private static CampaignEmailMessageJsonMarshaller instance;

    public static CampaignEmailMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignEmailMessageJsonMarshaller();
        return instance;
    }
}
