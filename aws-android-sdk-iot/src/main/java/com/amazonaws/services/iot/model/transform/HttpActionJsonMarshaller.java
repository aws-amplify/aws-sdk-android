/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HttpAction
 */
class HttpActionJsonMarshaller {

    public void marshall(HttpAction httpAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (httpAction.getUrl() != null) {
            String url = httpAction.getUrl();
            jsonWriter.name("url");
            jsonWriter.value(url);
        }
        if (httpAction.getConfirmationUrl() != null) {
            String confirmationUrl = httpAction.getConfirmationUrl();
            jsonWriter.name("confirmationUrl");
            jsonWriter.value(confirmationUrl);
        }
        if (httpAction.getHeaders() != null) {
            java.util.List<HttpActionHeader> headers = httpAction.getHeaders();
            jsonWriter.name("headers");
            jsonWriter.beginArray();
            for (HttpActionHeader headersItem : headers) {
                if (headersItem != null) {
                    HttpActionHeaderJsonMarshaller.getInstance().marshall(headersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (httpAction.getAuth() != null) {
            HttpAuthorization auth = httpAction.getAuth();
            jsonWriter.name("auth");
            HttpAuthorizationJsonMarshaller.getInstance().marshall(auth, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HttpActionJsonMarshaller instance;

    public static HttpActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpActionJsonMarshaller();
        return instance;
    }
}
