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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.services.geo.model.ValidationException;
import com.amazonaws.services.geo.model.ValidationExceptionField;

import java.io.StringReader;

public class ValidationExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public ValidationExceptionUnmarshaller() {
        super(ValidationException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("ValidationException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        ValidationException e = (ValidationException) super.unmarshall(error);
        e.setErrorCode("ValidationException");

        final AwsJsonReader jsonReader = JsonUtils.getJsonReader(new StringReader(error
                .get("FieldList")));
        e.setFieldList(new ListUnmarshaller<ValidationExceptionField>(
                ValidationExceptionFieldJsonUnmarshaller.getInstance())
                .unmarshall(new JsonUnmarshallerContext(jsonReader)));

        e.setReason(String.valueOf(error.get("Reason")));

        return e;
    }
}
