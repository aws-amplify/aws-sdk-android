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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContextDataType
 */
class ContextDataTypeJsonUnmarshaller implements
        Unmarshaller<ContextDataType, JsonUnmarshallerContext> {

    public ContextDataType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContextDataType contextDataType = new ContextDataType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IpAddress")) {
                contextDataType.setIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerName")) {
                contextDataType.setServerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServerPath")) {
                contextDataType.setServerPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HttpHeaders")) {
                contextDataType.setHttpHeaders(new ListUnmarshaller<HttpHeader>(
                        HttpHeaderJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EncodedData")) {
                contextDataType.setEncodedData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return contextDataType;
    }

    private static ContextDataTypeJsonUnmarshaller instance;

    public static ContextDataTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContextDataTypeJsonUnmarshaller();
        return instance;
    }
}
