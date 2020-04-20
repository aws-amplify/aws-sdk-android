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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Cors
 */
class CorsJsonMarshaller {

    public void marshall(Cors cors, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cors.getAllowCredentials() != null) {
            Boolean allowCredentials = cors.getAllowCredentials();
            jsonWriter.name("AllowCredentials");
            jsonWriter.value(allowCredentials);
        }
        if (cors.getAllowHeaders() != null) {
            java.util.List<String> allowHeaders = cors.getAllowHeaders();
            jsonWriter.name("AllowHeaders");
            jsonWriter.beginArray();
            for (String allowHeadersItem : allowHeaders) {
                if (allowHeadersItem != null) {
                    jsonWriter.value(allowHeadersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (cors.getAllowMethods() != null) {
            java.util.List<String> allowMethods = cors.getAllowMethods();
            jsonWriter.name("AllowMethods");
            jsonWriter.beginArray();
            for (String allowMethodsItem : allowMethods) {
                if (allowMethodsItem != null) {
                    jsonWriter.value(allowMethodsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (cors.getAllowOrigins() != null) {
            java.util.List<String> allowOrigins = cors.getAllowOrigins();
            jsonWriter.name("AllowOrigins");
            jsonWriter.beginArray();
            for (String allowOriginsItem : allowOrigins) {
                if (allowOriginsItem != null) {
                    jsonWriter.value(allowOriginsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (cors.getExposeHeaders() != null) {
            java.util.List<String> exposeHeaders = cors.getExposeHeaders();
            jsonWriter.name("ExposeHeaders");
            jsonWriter.beginArray();
            for (String exposeHeadersItem : exposeHeaders) {
                if (exposeHeadersItem != null) {
                    jsonWriter.value(exposeHeadersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (cors.getMaxAge() != null) {
            Integer maxAge = cors.getMaxAge();
            jsonWriter.name("MaxAge");
            jsonWriter.value(maxAge);
        }
        jsonWriter.endObject();
    }

    private static CorsJsonMarshaller instance;

    public static CorsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CorsJsonMarshaller();
        return instance;
    }
}
