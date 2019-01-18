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

package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The JSON error response handler class.
 */
public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /**
     * Services using AWS JSON 1.1 protocol with HTTP binding send the error
     * type information in the response headers, instead of the content.
     */
    private static final String X_AMZN_ERROR_TYPE = "x-amzn-ErrorType";
    private static final int HTTP_STATUS_INTERNAL_SERVER_ERROR = 500;

    /**
     * The list of error response unmarshallers to try to apply to error
     * responses.
     */
    private final List<? extends JsonErrorUnmarshaller> unmarshallerList;

    /**
     * Constructor.
     * @param exceptionUnmarshallers the list of exception unmarshallers.
     */
    public JsonErrorResponseHandler(List<? extends JsonErrorUnmarshaller> exceptionUnmarshallers) {
        this.unmarshallerList = exceptionUnmarshallers;
    }

    @Override
    public AmazonServiceException handle(HttpResponse response) throws Exception {
        JsonErrorResponse error;
        try {
            error = JsonErrorResponse.fromResponse(response);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse error response", e);
        }

        AmazonServiceException ase = runErrorUnmarshallers(error);
        if (ase == null)
            return null;

        ase.setStatusCode(response.getStatusCode());
        if (response.getStatusCode() < HTTP_STATUS_INTERNAL_SERVER_ERROR) {
            ase.setErrorType(ErrorType.Client);
        } else {
            ase.setErrorType(ErrorType.Service);
        }
        ase.setErrorCode(error.getErrorCode());

        for (Entry<String, String> headerEntry : response.getHeaders().entrySet()) {
            if ("X-Amzn-RequestId".equalsIgnoreCase(headerEntry.getKey())) {
                ase.setRequestId(headerEntry.getValue());
            }
        }

        return ase;
    }

    private AmazonServiceException runErrorUnmarshallers(JsonErrorResponse error) throws Exception {
        /*
         * We need to select which exception unmarshaller is the correct one to
         * use from all the possible exceptions this operation can throw.
         * Currently we rely on JsonErrorUnmarshaller.match(...) method which
         * checks for the error type parsed either from response headers or the
         * content.
         */
        for (JsonErrorUnmarshaller unmarshaller : unmarshallerList) {
            if (unmarshaller.match(error)) {
                return unmarshaller.unmarshall(error);
            }
        }

        return null;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }

    /**
     * A class that represents the error object returned from JSON service.
     */
    public static final class JsonErrorResponse {

        private final int statusCode;
        private final String message;
        private final String errorCode;
        private final Map<String, String> map;

        private JsonErrorResponse(int statusCode, String errorCode, Map<String, String> map) {
            this.statusCode = statusCode;
            this.errorCode = errorCode;
            this.map = map;
            this.message = get("message");
        }

        /**
         * Gets the status code of the response header
         *
         * @return status code
         */
        public int getStatusCode() {
            return statusCode;
        }

        /**
         * Gets the error code
         *
         * @return error code
         */
        public String getErrorCode() {
            return errorCode;
        }

        /**
         * Gets the error message
         *
         * @return error message
         */
        public String getMessage() {
            return message;
        }

        /**
         * Gets value from the error body map.
         *
         * @param key key of map
         * @return null if key is null; "" if not exists
         */
        public String get(String key) {
            if (key == null || key.length() == 0) {
                return null;
            }

            String firstLetterUppercaseKey;
            String firstLetterLowercaseKey;

            firstLetterLowercaseKey = StringUtils.lowerCase(key.substring(0, 1))
                    + key.substring(1);

            firstLetterUppercaseKey = StringUtils.upperCase(key.substring(0, 1))
                    + key.substring(1);

            String value = "";
            if (map.containsKey(firstLetterUppercaseKey)) {
                value = map.get(firstLetterUppercaseKey);
            } else if (map.containsKey(firstLetterLowercaseKey)) {
                value = map.get(firstLetterLowercaseKey);
            }

            return value;
        }

        /**
         * @param response The HTTP response.
         * @return the JSONErrorResponse object.
         * @throws IOException
         */
        public static JsonErrorResponse fromResponse(HttpResponse response) throws IOException {
            int statusCode = response.getStatusCode();

            // parse error body
            Map<String, String> map = JsonUtils.jsonToMap(new BufferedReader(new InputStreamReader(
                    response.getContent(), StringUtils.UTF8)));

            /*
             * Services using AWS JSON 1.1 protocol with HTTP binding send the
             * error type information in the response headers, instead of the
             * content.
             */
            String errorCode = response.getHeaders().get(X_AMZN_ERROR_TYPE);
            if (errorCode != null) {
                int separator = errorCode.indexOf(':');
                if (separator != -1) {
                    errorCode = errorCode.substring(0, separator);
                }
            } else if (map.containsKey("__type")) {
                // check body otherwise
                String type = map.get("__type");
                int separator = type.lastIndexOf("#");
                errorCode = type.substring(separator + 1);
            }

            return new JsonErrorResponse(statusCode, errorCode, map);
        }
    }
}
