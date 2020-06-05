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

package com.amazonaws.services.servicecatalog.model.transform;

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
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListOrganizationPortfolioAccessRequest
 */
public class ListOrganizationPortfolioAccessRequestMarshaller
        implements
        Marshaller<Request<ListOrganizationPortfolioAccessRequest>, ListOrganizationPortfolioAccessRequest> {

    public Request<ListOrganizationPortfolioAccessRequest> marshall(
            ListOrganizationPortfolioAccessRequest listOrganizationPortfolioAccessRequest) {
        if (listOrganizationPortfolioAccessRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListOrganizationPortfolioAccessRequest)");
        }

        Request<ListOrganizationPortfolioAccessRequest> request = new DefaultRequest<ListOrganizationPortfolioAccessRequest>(
                listOrganizationPortfolioAccessRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.ListOrganizationPortfolioAccess";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listOrganizationPortfolioAccessRequest.getAcceptLanguage() != null) {
                String acceptLanguage = listOrganizationPortfolioAccessRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (listOrganizationPortfolioAccessRequest.getPortfolioId() != null) {
                String portfolioId = listOrganizationPortfolioAccessRequest.getPortfolioId();
                jsonWriter.name("PortfolioId");
                jsonWriter.value(portfolioId);
            }
            if (listOrganizationPortfolioAccessRequest.getOrganizationNodeType() != null) {
                String organizationNodeType = listOrganizationPortfolioAccessRequest
                        .getOrganizationNodeType();
                jsonWriter.name("OrganizationNodeType");
                jsonWriter.value(organizationNodeType);
            }
            if (listOrganizationPortfolioAccessRequest.getPageToken() != null) {
                String pageToken = listOrganizationPortfolioAccessRequest.getPageToken();
                jsonWriter.name("PageToken");
                jsonWriter.value(pageToken);
            }
            if (listOrganizationPortfolioAccessRequest.getPageSize() != null) {
                Integer pageSize = listOrganizationPortfolioAccessRequest.getPageSize();
                jsonWriter.name("PageSize");
                jsonWriter.value(pageSize);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
