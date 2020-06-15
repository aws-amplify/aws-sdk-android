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

package com.amazonaws.services.appconfig.model.transform;

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
import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListHostedConfigurationVersionsRequest
 */
public class ListHostedConfigurationVersionsRequestMarshaller
        implements
        Marshaller<Request<ListHostedConfigurationVersionsRequest>, ListHostedConfigurationVersionsRequest> {

    public Request<ListHostedConfigurationVersionsRequest> marshall(
            ListHostedConfigurationVersionsRequest listHostedConfigurationVersionsRequest) {
        if (listHostedConfigurationVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListHostedConfigurationVersionsRequest)");
        }

        Request<ListHostedConfigurationVersionsRequest> request = new DefaultRequest<ListHostedConfigurationVersionsRequest>(
                listHostedConfigurationVersionsRequest, "AmazonAppConfig");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/applications/{ApplicationId}/configurationprofiles/{ConfigurationProfileId}/hostedconfigurationversions";
        uriResourcePath = uriResourcePath.replace(
                "{ApplicationId}",
                (listHostedConfigurationVersionsRequest.getApplicationId() == null) ? ""
                        : StringUtils.fromString(listHostedConfigurationVersionsRequest
                                .getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{ConfigurationProfileId}",
                (listHostedConfigurationVersionsRequest.getConfigurationProfileId() == null) ? ""
                        : StringUtils.fromString(listHostedConfigurationVersionsRequest
                                .getConfigurationProfileId()));
        if (listHostedConfigurationVersionsRequest.getMaxResults() != null) {
            request.addParameter("max_results",
                    StringUtils.fromInteger(listHostedConfigurationVersionsRequest.getMaxResults()));
        }
        if (listHostedConfigurationVersionsRequest.getNextToken() != null) {
            request.addParameter("next_token",
                    StringUtils.fromString(listHostedConfigurationVersionsRequest.getNextToken()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
