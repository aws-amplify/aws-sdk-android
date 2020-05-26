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

package com.amazonaws.services.quicksight.model.transform;

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
import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListDataSourcesRequest
 */
public class ListDataSourcesRequestMarshaller implements
        Marshaller<Request<ListDataSourcesRequest>, ListDataSourcesRequest> {

    public Request<ListDataSourcesRequest> marshall(ListDataSourcesRequest listDataSourcesRequest) {
        if (listDataSourcesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListDataSourcesRequest)");
        }

        Request<ListDataSourcesRequest> request = new DefaultRequest<ListDataSourcesRequest>(
                listDataSourcesRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/accounts/{AwsAccountId}/data-sources";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (listDataSourcesRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(listDataSourcesRequest.getAwsAccountId()));
        if (listDataSourcesRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(listDataSourcesRequest.getNextToken()));
        }
        if (listDataSourcesRequest.getMaxResults() != null) {
            request.addParameter("max-results",
                    StringUtils.fromInteger(listDataSourcesRequest.getMaxResults()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
