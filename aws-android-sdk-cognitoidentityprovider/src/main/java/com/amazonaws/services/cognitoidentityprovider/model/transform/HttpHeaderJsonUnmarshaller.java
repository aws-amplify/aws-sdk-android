/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HttpHeader
 */
class HttpHeaderJsonUnmarshaller implements Unmarshaller<HttpHeader, JsonUnmarshallerContext> {

    public HttpHeader unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HttpHeader httpHeader = new HttpHeader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("headerName")) {
                httpHeader.setHeaderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("headerValue")) {
                httpHeader.setHeaderValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return httpHeader;
    }

    private static HttpHeaderJsonUnmarshaller instance;

    public static HttpHeaderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HttpHeaderJsonUnmarshaller();
        return instance;
    }
}
