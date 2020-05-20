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

package com.amazonaws.services.chime.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SearchAvailablePhoneNumbersRequest
 */
public class SearchAvailablePhoneNumbersRequestMarshaller implements
        Marshaller<Request<SearchAvailablePhoneNumbersRequest>, SearchAvailablePhoneNumbersRequest> {

    public Request<SearchAvailablePhoneNumbersRequest> marshall(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest) {
        if (searchAvailablePhoneNumbersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchAvailablePhoneNumbersRequest)");
        }

        Request<SearchAvailablePhoneNumbersRequest> request = new DefaultRequest<SearchAvailablePhoneNumbersRequest>(
                searchAvailablePhoneNumbersRequest, "AmazonChime");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/search?type&#x3D;phone-numbers";
        if (searchAvailablePhoneNumbersRequest.getAreaCode() != null) {
            request.addParameter("area-code",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getAreaCode()));
        }
        if (searchAvailablePhoneNumbersRequest.getCity() != null) {
            request.addParameter("city",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getCity()));
        }
        if (searchAvailablePhoneNumbersRequest.getCountry() != null) {
            request.addParameter("country",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getCountry()));
        }
        if (searchAvailablePhoneNumbersRequest.getState() != null) {
            request.addParameter("state",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getState()));
        }
        if (searchAvailablePhoneNumbersRequest.getTollFreePrefix() != null) {
            request.addParameter("toll-free-prefix",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getTollFreePrefix()));
        }
        if (searchAvailablePhoneNumbersRequest.getMaxResults() != null) {
            request.addParameter("max-results",
                    StringUtils.fromInteger(searchAvailablePhoneNumbersRequest.getMaxResults()));
        }
        if (searchAvailablePhoneNumbersRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(searchAvailablePhoneNumbersRequest.getNextToken()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
