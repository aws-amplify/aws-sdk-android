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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RequestValidator
 */
class RequestValidatorJsonUnmarshaller implements
        Unmarshaller<RequestValidator, JsonUnmarshallerContext> {

    public RequestValidator unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RequestValidator requestValidator = new RequestValidator();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                requestValidator.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                requestValidator.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("validateRequestBody")) {
                requestValidator.setValidateRequestBody(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("validateRequestParameters")) {
                requestValidator.setValidateRequestParameters(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return requestValidator;
    }

    private static RequestValidatorJsonUnmarshaller instance;

    public static RequestValidatorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestValidatorJsonUnmarshaller();
        return instance;
    }
}
