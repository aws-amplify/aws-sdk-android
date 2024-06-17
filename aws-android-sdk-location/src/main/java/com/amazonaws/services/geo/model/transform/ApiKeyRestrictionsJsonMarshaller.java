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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApiKeyRestrictions
 */
class ApiKeyRestrictionsJsonMarshaller {

    public void marshall(ApiKeyRestrictions apiKeyRestrictions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (apiKeyRestrictions.getAllowActions() != null) {
            java.util.List<String> allowActions = apiKeyRestrictions.getAllowActions();
            jsonWriter.name("AllowActions");
            jsonWriter.beginArray();
            for (String allowActionsItem : allowActions) {
                if (allowActionsItem != null) {
                    jsonWriter.value(allowActionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (apiKeyRestrictions.getAllowResources() != null) {
            java.util.List<String> allowResources = apiKeyRestrictions.getAllowResources();
            jsonWriter.name("AllowResources");
            jsonWriter.beginArray();
            for (String allowResourcesItem : allowResources) {
                if (allowResourcesItem != null) {
                    jsonWriter.value(allowResourcesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (apiKeyRestrictions.getAllowReferers() != null) {
            java.util.List<String> allowReferers = apiKeyRestrictions.getAllowReferers();
            jsonWriter.name("AllowReferers");
            jsonWriter.beginArray();
            for (String allowReferersItem : allowReferers) {
                if (allowReferersItem != null) {
                    jsonWriter.value(allowReferersItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ApiKeyRestrictionsJsonMarshaller instance;

    public static ApiKeyRestrictionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiKeyRestrictionsJsonMarshaller();
        return instance;
    }
}
