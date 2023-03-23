/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExpirationSettings
 */
class ExpirationSettingsJsonMarshaller {

    public void marshall(ExpirationSettings expirationSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expirationSettings.getExpirationDays() != null) {
            Integer expirationDays = expirationSettings.getExpirationDays();
            jsonWriter.name("ExpirationDays");
            jsonWriter.value(expirationDays);
        }
        if (expirationSettings.getExpirationCriterion() != null) {
            String expirationCriterion = expirationSettings.getExpirationCriterion();
            jsonWriter.name("ExpirationCriterion");
            jsonWriter.value(expirationCriterion);
        }
        jsonWriter.endObject();
    }

    private static ExpirationSettingsJsonMarshaller instance;

    public static ExpirationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpirationSettingsJsonMarshaller();
        return instance;
    }
}
