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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import com.amazonaws.services.connect.model.InvalidContactFlowException;
import com.amazonaws.services.connect.model.ProblemDetail;

import java.io.StringReader;

public class InvalidContactFlowExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public InvalidContactFlowExceptionUnmarshaller() {
        super(InvalidContactFlowException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("InvalidContactFlowException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        InvalidContactFlowException e = (InvalidContactFlowException) super.unmarshall(error);
        e.setErrorCode("InvalidContactFlowException");

        final AwsJsonReader jsonReader = JsonUtils.getJsonReader(new StringReader(error
                .get("problems")));
        e.setProblems(new ListUnmarshaller<ProblemDetail>(ProblemDetailJsonUnmarshaller
                .getInstance()).unmarshall(new JsonUnmarshallerContext(jsonReader)));

        return e;
    }
}
