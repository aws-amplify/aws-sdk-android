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
package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.services.ssm.model.OpsItemInvalidParameterException;

import com.amazonaws.services.ssm.model.java.util.List&lt;String&gt;;


public class OpsItemInvalidParameterExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public OpsItemInvalidParameterExceptionUnmarshaller() {
        super(OpsItemInvalidParameterException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("OpsItemInvalidParameterException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
   		
        OpsItemInvalidParameterException e = (OpsItemInvalidParameterException)super.unmarshall(error);
        e.setErrorCode("OpsItemInvalidParameterException");
        
        e.setParameterNames(gson.fromJson(error.get("ParameterNames"),java.util.List&lt;String&gt;.class));

        return e;
    }
}
