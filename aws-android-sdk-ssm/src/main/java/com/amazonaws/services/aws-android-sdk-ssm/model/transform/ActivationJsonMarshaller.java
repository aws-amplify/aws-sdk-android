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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Activation
 */
class ActivationJsonMarshaller {

    public void marshall(Activation activation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activation.getActivationId() != null) {
            String activationId = activation.getActivationId();
            jsonWriter.name("ActivationId");
            jsonWriter.value(activationId);
        }
        if (activation.getDescription() != null) {
            String description = activation.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (activation.getDefaultInstanceName() != null) {
            String defaultInstanceName = activation.getDefaultInstanceName();
            jsonWriter.name("DefaultInstanceName");
            jsonWriter.value(defaultInstanceName);
        }
        if (activation.getIamRole() != null) {
            String iamRole = activation.getIamRole();
            jsonWriter.name("IamRole");
            jsonWriter.value(iamRole);
        }
        if (activation.getRegistrationLimit() != null) {
            Integer registrationLimit = activation.getRegistrationLimit();
            jsonWriter.name("RegistrationLimit");
            jsonWriter.value(registrationLimit);
        }
        if (activation.getRegistrationsCount() != null) {
            Integer registrationsCount = activation.getRegistrationsCount();
            jsonWriter.name("RegistrationsCount");
            jsonWriter.value(registrationsCount);
        }
        if (activation.getExpirationDate() != null) {
            java.util.Date expirationDate = activation.getExpirationDate();
            jsonWriter.name("ExpirationDate");
            jsonWriter.value(expirationDate);
        }
        if (activation.getExpired() != null) {
            Boolean expired = activation.getExpired();
            jsonWriter.name("Expired");
            jsonWriter.value(expired);
        }
        if (activation.getCreatedDate() != null) {
            java.util.Date createdDate = activation.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (activation.getTags() != null) {
            java.util.List<Tag> tags = activation.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
            TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ActivationJsonMarshaller instance;
    public static ActivationJsonMarshaller getInstance() {
        if (instance == null) instance = new ActivationJsonMarshaller();
        return instance;
    }
}
