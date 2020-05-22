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

package com.amazonaws.services.iotsitewise.model.transform;

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
import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetAssetPropertyAggregatesRequest
 */
public class GetAssetPropertyAggregatesRequestMarshaller implements
        Marshaller<Request<GetAssetPropertyAggregatesRequest>, GetAssetPropertyAggregatesRequest> {

    public Request<GetAssetPropertyAggregatesRequest> marshall(
            GetAssetPropertyAggregatesRequest getAssetPropertyAggregatesRequest) {
        if (getAssetPropertyAggregatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetAssetPropertyAggregatesRequest)");
        }

        Request<GetAssetPropertyAggregatesRequest> request = new DefaultRequest<GetAssetPropertyAggregatesRequest>(
                getAssetPropertyAggregatesRequest, "AWSIoTSiteWise");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/properties/aggregates";
        if (getAssetPropertyAggregatesRequest.getAssetId() != null) {
            request.addParameter("assetId",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getAssetId()));
        }
        if (getAssetPropertyAggregatesRequest.getPropertyId() != null) {
            request.addParameter("propertyId",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getPropertyId()));
        }
        if (getAssetPropertyAggregatesRequest.getPropertyAlias() != null) {
            request.addParameter("propertyAlias",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getPropertyAlias()));
        }
        if (getAssetPropertyAggregatesRequest.getAggregateTypes() != null) {
            request.addParameter("aggregateTypes", StringUtils.join(",",
                    getAssetPropertyAggregatesRequest.getAggregateTypes().toArray(new String[0])));
        }
        if (getAssetPropertyAggregatesRequest.getResolution() != null) {
            request.addParameter("resolution",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getResolution()));
        }
        if (getAssetPropertyAggregatesRequest.getQualities() != null) {
            request.addParameter("qualities", StringUtils.join(",",
                    getAssetPropertyAggregatesRequest.getQualities().toArray(new String[0])));
        }
        if (getAssetPropertyAggregatesRequest.getStartDate() != null) {
            request.addParameter("startDate",
                    StringUtils.fromDate(getAssetPropertyAggregatesRequest.getStartDate()));
        }
        if (getAssetPropertyAggregatesRequest.getEndDate() != null) {
            request.addParameter("endDate",
                    StringUtils.fromDate(getAssetPropertyAggregatesRequest.getEndDate()));
        }
        if (getAssetPropertyAggregatesRequest.getTimeOrdering() != null) {
            request.addParameter("timeOrdering",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getTimeOrdering()));
        }
        if (getAssetPropertyAggregatesRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(getAssetPropertyAggregatesRequest.getNextToken()));
        }
        if (getAssetPropertyAggregatesRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(getAssetPropertyAggregatesRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
