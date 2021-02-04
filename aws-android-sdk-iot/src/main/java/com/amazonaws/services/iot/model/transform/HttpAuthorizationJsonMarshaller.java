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
 * JSON marshaller for POJO HttpAuthorization
 */
class HttpAuthorizationJsonMarshaller {

    public void marshall(HttpAuthorization httpAuthorization, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (httpAuthorization.getSigv4() != null) {
            SigV4Authorization sigv4 = httpAuthorization.getSigv4();
            jsonWriter.name("sigv4");
            SigV4AuthorizationJsonMarshaller.getInstance().marshall(sigv4, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HttpAuthorizationJsonMarshaller instance;

    public static HttpAuthorizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HttpAuthorizationJsonMarshaller();
        return instance;
    }
}
