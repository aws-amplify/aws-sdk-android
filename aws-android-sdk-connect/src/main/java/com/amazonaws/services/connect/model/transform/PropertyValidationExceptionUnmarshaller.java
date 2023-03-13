/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.services.connect.model.PropertyValidationException;
import com.amazonaws.services.connect.model.PropertyValidationExceptionProperty;

import java.io.StringReader;

public class PropertyValidationExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public PropertyValidationExceptionUnmarshaller() {
        super(PropertyValidationException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("PropertyValidationException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        PropertyValidationException e = (PropertyValidationException) super.unmarshall(error);
        e.setErrorCode("PropertyValidationException");

        final AwsJsonReader jsonReader = JsonUtils.getJsonReader(new StringReader(error
                .get("PropertyList")));
        e.setPropertyList(new ListUnmarshaller<PropertyValidationExceptionProperty>(
                PropertyValidationExceptionPropertyJsonUnmarshaller.getInstance())
                .unmarshall(new JsonUnmarshallerContext(jsonReader)));

        return e;
    }
}
