/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;

/**
 * Unmarshaller for JSON error responses from AWS services.
 */
public class JsonErrorUnmarshaller extends AbstractErrorUnmarshaller<JsonErrorResponse> {

    /** Constructor. */
    public JsonErrorUnmarshaller() {
    }

    protected JsonErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass) {
        super(exceptionClass);
    }

    /**
     * Subclass should override the match(String, JSONObject) method to indicate
     * whether it represents the given error type, and unmarshall(JSONObject)
     * should never return null.
     */
    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
        String message = error.getMessage();
        String errorCode = error.getErrorCode();

        if ((null == message || message.isEmpty()) && (null == errorCode || errorCode.isEmpty())) {
            /**
             * Trigger the catch block in AmazonHttpClient.handleErrorResponse
             * to handle 413 and 503 errors
             */
            throw new AmazonClientException(
                    "Neither error message nor error code is found in the error response payload.");
        } else {
            AmazonServiceException ase = newException(message);
            ase.setErrorCode(errorCode);
            return ase;
        }
    }

    /**
     * Any subclass that is specific to a error type should only return true
     * when the response matches, either by matching the error type parsed from
     * header or from the JSON content.
     *
     * @param error The JSON content of the response. Subclass should check for
     *            the error type information from this JSONObject if
     *            errorTypeFromHeader is null.
     * @return true.
     */
    public boolean match(JsonErrorResponse error) throws Exception {
        return true;
    }
}
