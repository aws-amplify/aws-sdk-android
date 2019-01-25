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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpHeader
 */
class HttpHeaderJsonMarshaller {

    public void marshall(HttpHeader httpHeader, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (httpHeader.getHeaderName() != null) {
            String headerName = httpHeader.getHeaderName();
            jsonWriter.name("headerName");
            jsonWriter.value(headerName);
        }
        if (httpHeader.getHeaderValue() != null) {
            String headerValue = httpHeader.getHeaderValue();
            jsonWriter.name("headerValue");
            jsonWriter.value(headerValue);
        }
        jsonWriter.endObject();
    }

    private static HttpHeaderJsonMarshaller instance;

    public static HttpHeaderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpHeaderJsonMarshaller();
        return instance;
    }
}
