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

package com.amazonaws.services.awsdataexchange.model.transform;

import com.amazonaws.services.awsdataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobError
 */
class JobErrorJsonMarshaller {

    public void marshall(JobError jobError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobError.getCode() != null) {
            String code = jobError.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (jobError.getDetails() != null) {
            Details details = jobError.getDetails();
            jsonWriter.name("Details");
            DetailsJsonMarshaller.getInstance().marshall(details, jsonWriter);
        }
        if (jobError.getLimitName() != null) {
            String limitName = jobError.getLimitName();
            jsonWriter.name("LimitName");
            jsonWriter.value(limitName);
        }
        if (jobError.getLimitValue() != null) {
            Double limitValue = jobError.getLimitValue();
            jsonWriter.name("LimitValue");
            jsonWriter.value(limitValue);
        }
        if (jobError.getMessage() != null) {
            String message = jobError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (jobError.getResourceId() != null) {
            String resourceId = jobError.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (jobError.getResourceType() != null) {
            String resourceType = jobError.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static JobErrorJsonMarshaller instance;

    public static JobErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobErrorJsonMarshaller();
        return instance;
    }
}
