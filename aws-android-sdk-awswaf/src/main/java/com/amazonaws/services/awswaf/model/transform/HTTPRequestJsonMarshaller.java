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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HTTPRequest
 */
class HTTPRequestJsonMarshaller {

    public void marshall(HTTPRequest hTTPRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hTTPRequest.getClientIP() != null) {
            String clientIP = hTTPRequest.getClientIP();
            jsonWriter.name("ClientIP");
            jsonWriter.value(clientIP);
        }
        if (hTTPRequest.getCountry() != null) {
            String country = hTTPRequest.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        if (hTTPRequest.getURI() != null) {
            String uRI = hTTPRequest.getURI();
            jsonWriter.name("URI");
            jsonWriter.value(uRI);
        }
        if (hTTPRequest.getMethod() != null) {
            String method = hTTPRequest.getMethod();
            jsonWriter.name("Method");
            jsonWriter.value(method);
        }
        if (hTTPRequest.getHTTPVersion() != null) {
            String hTTPVersion = hTTPRequest.getHTTPVersion();
            jsonWriter.name("HTTPVersion");
            jsonWriter.value(hTTPVersion);
        }
        if (hTTPRequest.getHeaders() != null) {
            java.util.List<HTTPHeader> headers = hTTPRequest.getHeaders();
            jsonWriter.name("Headers");
            jsonWriter.beginArray();
            for (HTTPHeader headersItem : headers) {
                if (headersItem != null) {
                    HTTPHeaderJsonMarshaller.getInstance().marshall(headersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HTTPRequestJsonMarshaller instance;

    public static HTTPRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HTTPRequestJsonMarshaller();
        return instance;
    }
}
