/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ContactFlowSummary
 */
class ContactFlowSummaryJsonMarshaller {

    public void marshall(ContactFlowSummary contactFlowSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (contactFlowSummary.getId() != null) {
            String id = contactFlowSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contactFlowSummary.getArn() != null) {
            String arn = contactFlowSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contactFlowSummary.getName() != null) {
            String name = contactFlowSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (contactFlowSummary.getContactFlowType() != null) {
            String contactFlowType = contactFlowSummary.getContactFlowType();
            jsonWriter.name("ContactFlowType");
            jsonWriter.value(contactFlowType);
        }
        if (contactFlowSummary.getContactFlowState() != null) {
            String contactFlowState = contactFlowSummary.getContactFlowState();
            jsonWriter.name("ContactFlowState");
            jsonWriter.value(contactFlowState);
        }
        jsonWriter.endObject();
    }

    private static ContactFlowSummaryJsonMarshaller instance;

    public static ContactFlowSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactFlowSummaryJsonMarshaller();
        return instance;
    }
}
