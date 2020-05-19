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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OrganizationEventDetailsErrorItem
 */
class OrganizationEventDetailsErrorItemJsonMarshaller {

    public void marshall(OrganizationEventDetailsErrorItem organizationEventDetailsErrorItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (organizationEventDetailsErrorItem.getAwsAccountId() != null) {
            String awsAccountId = organizationEventDetailsErrorItem.getAwsAccountId();
            jsonWriter.name("awsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (organizationEventDetailsErrorItem.getEventArn() != null) {
            String eventArn = organizationEventDetailsErrorItem.getEventArn();
            jsonWriter.name("eventArn");
            jsonWriter.value(eventArn);
        }
        if (organizationEventDetailsErrorItem.getErrorName() != null) {
            String errorName = organizationEventDetailsErrorItem.getErrorName();
            jsonWriter.name("errorName");
            jsonWriter.value(errorName);
        }
        if (organizationEventDetailsErrorItem.getErrorMessage() != null) {
            String errorMessage = organizationEventDetailsErrorItem.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static OrganizationEventDetailsErrorItemJsonMarshaller instance;

    public static OrganizationEventDetailsErrorItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventDetailsErrorItemJsonMarshaller();
        return instance;
    }
}
