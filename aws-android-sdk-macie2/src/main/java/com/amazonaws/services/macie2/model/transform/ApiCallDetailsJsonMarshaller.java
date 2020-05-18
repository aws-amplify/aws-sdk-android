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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApiCallDetails
 */
class ApiCallDetailsJsonMarshaller {

    public void marshall(ApiCallDetails apiCallDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (apiCallDetails.getApi() != null) {
            String api = apiCallDetails.getApi();
            jsonWriter.name("api");
            jsonWriter.value(api);
        }
        if (apiCallDetails.getApiServiceName() != null) {
            String apiServiceName = apiCallDetails.getApiServiceName();
            jsonWriter.name("apiServiceName");
            jsonWriter.value(apiServiceName);
        }
        if (apiCallDetails.getFirstSeen() != null) {
            java.util.Date firstSeen = apiCallDetails.getFirstSeen();
            jsonWriter.name("firstSeen");
            jsonWriter.value(firstSeen);
        }
        if (apiCallDetails.getLastSeen() != null) {
            java.util.Date lastSeen = apiCallDetails.getLastSeen();
            jsonWriter.name("lastSeen");
            jsonWriter.value(lastSeen);
        }
        jsonWriter.endObject();
    }

    private static ApiCallDetailsJsonMarshaller instance;

    public static ApiCallDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiCallDetailsJsonMarshaller();
        return instance;
    }
}
