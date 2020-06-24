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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.services.fsx.model.ResourceDoesNotSupportTaggingException;

public class ResourceDoesNotSupportTaggingExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public ResourceDoesNotSupportTaggingExceptionUnmarshaller() {
        super(ResourceDoesNotSupportTaggingException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("ResourceDoesNotSupportTagging");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        ResourceDoesNotSupportTaggingException e = (ResourceDoesNotSupportTaggingException) super
                .unmarshall(error);
        e.setErrorCode("ResourceDoesNotSupportTagging");
        e.setResourceARN(String.valueOf(error.get("ResourceARN")));

        return e;
    }
}
