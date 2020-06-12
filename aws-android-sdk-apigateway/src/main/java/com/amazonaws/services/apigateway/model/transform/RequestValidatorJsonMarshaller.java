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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RequestValidator
 */
class RequestValidatorJsonMarshaller {

    public void marshall(RequestValidator requestValidator, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (requestValidator.getId() != null) {
            String id = requestValidator.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (requestValidator.getName() != null) {
            String name = requestValidator.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (requestValidator.getValidateRequestBody() != null) {
            Boolean validateRequestBody = requestValidator.getValidateRequestBody();
            jsonWriter.name("validateRequestBody");
            jsonWriter.value(validateRequestBody);
        }
        if (requestValidator.getValidateRequestParameters() != null) {
            Boolean validateRequestParameters = requestValidator.getValidateRequestParameters();
            jsonWriter.name("validateRequestParameters");
            jsonWriter.value(validateRequestParameters);
        }
        jsonWriter.endObject();
    }

    private static RequestValidatorJsonMarshaller instance;

    public static RequestValidatorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RequestValidatorJsonMarshaller();
        return instance;
    }
}
