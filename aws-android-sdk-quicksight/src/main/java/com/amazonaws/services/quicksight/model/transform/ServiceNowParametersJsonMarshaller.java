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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceNowParameters
 */
class ServiceNowParametersJsonMarshaller {

    public void marshall(ServiceNowParameters serviceNowParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceNowParameters.getSiteBaseUrl() != null) {
            String siteBaseUrl = serviceNowParameters.getSiteBaseUrl();
            jsonWriter.name("SiteBaseUrl");
            jsonWriter.value(siteBaseUrl);
        }
        jsonWriter.endObject();
    }

    private static ServiceNowParametersJsonMarshaller instance;

    public static ServiceNowParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowParametersJsonMarshaller();
        return instance;
    }
}
