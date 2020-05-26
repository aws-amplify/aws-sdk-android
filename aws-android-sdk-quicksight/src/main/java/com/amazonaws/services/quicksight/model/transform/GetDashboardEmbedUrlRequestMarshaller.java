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
 * JSON request marshaller for GetDashboardEmbedUrlRequest
 */
public class GetDashboardEmbedUrlRequestMarshaller implements
        Marshaller<Request<GetDashboardEmbedUrlRequest>, GetDashboardEmbedUrlRequest> {

    public Request<GetDashboardEmbedUrlRequest> marshall(
            GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest) {
        if (getDashboardEmbedUrlRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetDashboardEmbedUrlRequest)");
        }

        Request<GetDashboardEmbedUrlRequest> request = new DefaultRequest<GetDashboardEmbedUrlRequest>(
                getDashboardEmbedUrlRequest, "AmazonQuickSight");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/accounts/{AwsAccountId}/dashboards/{DashboardId}/embed-url";
        uriResourcePath = uriResourcePath.replace(
                "{AwsAccountId}",
                (getDashboardEmbedUrlRequest.getAwsAccountId() == null) ? "" : StringUtils
                        .fromString(getDashboardEmbedUrlRequest.getAwsAccountId()));
        uriResourcePath = uriResourcePath.replace(
                "{DashboardId}",
                (getDashboardEmbedUrlRequest.getDashboardId() == null) ? "" : StringUtils
                        .fromString(getDashboardEmbedUrlRequest.getDashboardId()));
        if (getDashboardEmbedUrlRequest.getIdentityType() != null) {
            request.addParameter("creds-type",
                    StringUtils.fromString(getDashboardEmbedUrlRequest.getIdentityType()));
        }
        if (getDashboardEmbedUrlRequest.getSessionLifetimeInMinutes() != null) {
            request.addParameter("session-lifetime",
                    StringUtils.fromLong(getDashboardEmbedUrlRequest.getSessionLifetimeInMinutes()));
        }
        if (getDashboardEmbedUrlRequest.getUndoRedoDisabled() != null) {
            request.addParameter("undo-redo-disabled",
                    StringUtils.fromBoolean(getDashboardEmbedUrlRequest.getUndoRedoDisabled()));
        }
        if (getDashboardEmbedUrlRequest.getResetDisabled() != null) {
            request.addParameter("reset-disabled",
                    StringUtils.fromBoolean(getDashboardEmbedUrlRequest.getResetDisabled()));
        }
        if (getDashboardEmbedUrlRequest.getUserArn() != null) {
            request.addParameter("user-arn",
                    StringUtils.fromString(getDashboardEmbedUrlRequest.getUserArn()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
