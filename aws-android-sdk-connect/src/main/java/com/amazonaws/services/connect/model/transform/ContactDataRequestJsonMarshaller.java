/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContactDataRequest
 */
class ContactDataRequestJsonMarshaller {

    public void marshall(ContactDataRequest contactDataRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (contactDataRequest.getSystemEndpoint() != null) {
            Endpoint systemEndpoint = contactDataRequest.getSystemEndpoint();
            jsonWriter.name("SystemEndpoint");
            EndpointJsonMarshaller.getInstance().marshall(systemEndpoint, jsonWriter);
        }
        if (contactDataRequest.getCustomerEndpoint() != null) {
            Endpoint customerEndpoint = contactDataRequest.getCustomerEndpoint();
            jsonWriter.name("CustomerEndpoint");
            EndpointJsonMarshaller.getInstance().marshall(customerEndpoint, jsonWriter);
        }
        if (contactDataRequest.getRequestIdentifier() != null) {
            String requestIdentifier = contactDataRequest.getRequestIdentifier();
            jsonWriter.name("RequestIdentifier");
            jsonWriter.value(requestIdentifier);
        }
        if (contactDataRequest.getQueueId() != null) {
            String queueId = contactDataRequest.getQueueId();
            jsonWriter.name("QueueId");
            jsonWriter.value(queueId);
        }
        if (contactDataRequest.getAttributes() != null) {
            java.util.Map<String, String> attributes = contactDataRequest.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (contactDataRequest.getCampaign() != null) {
            Campaign campaign = contactDataRequest.getCampaign();
            jsonWriter.name("Campaign");
            CampaignJsonMarshaller.getInstance().marshall(campaign, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContactDataRequestJsonMarshaller instance;

    public static ContactDataRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactDataRequestJsonMarshaller();
        return instance;
    }
}
