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
 * JSON request marshaller for SearchProductsAsAdminRequest
 */
public class SearchProductsAsAdminRequestMarshaller implements
        Marshaller<Request<SearchProductsAsAdminRequest>, SearchProductsAsAdminRequest> {

    public Request<SearchProductsAsAdminRequest> marshall(
            SearchProductsAsAdminRequest searchProductsAsAdminRequest) {
        if (searchProductsAsAdminRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchProductsAsAdminRequest)");
        }

        Request<SearchProductsAsAdminRequest> request = new DefaultRequest<SearchProductsAsAdminRequest>(
                searchProductsAsAdminRequest, "AWSServiceCatalog");
        String target = "AWS242ServiceCatalogService.SearchProductsAsAdmin";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchProductsAsAdminRequest.getAcceptLanguage() != null) {
                String acceptLanguage = searchProductsAsAdminRequest.getAcceptLanguage();
                jsonWriter.name("AcceptLanguage");
                jsonWriter.value(acceptLanguage);
            }
            if (searchProductsAsAdminRequest.getPortfolioId() != null) {
                String portfolioId = searchProductsAsAdminRequest.getPortfolioId();
                jsonWriter.name("PortfolioId");
                jsonWriter.value(portfolioId);
            }
            if (searchProductsAsAdminRequest.getFilters() != null) {
                java.util.Map<String, java.util.List<String>> filters = searchProductsAsAdminRequest
                        .getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> filtersEntry : filters
                        .entrySet()) {
                    java.util.List<String> filtersValue = filtersEntry.getValue();
                    if (filtersValue != null) {
                        jsonWriter.name(filtersEntry.getKey());
                        jsonWriter.beginArray();
                        for (String filtersValueItem : filtersValue) {
                            if (filtersValueItem != null) {
                                jsonWriter.value(filtersValueItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (searchProductsAsAdminRequest.getSortBy() != null) {
                String sortBy = searchProductsAsAdminRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (searchProductsAsAdminRequest.getSortOrder() != null) {
                String sortOrder = searchProductsAsAdminRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (searchProductsAsAdminRequest.getPageToken() != null) {
                String pageToken = searchProductsAsAdminRequest.getPageToken();
                jsonWriter.name("PageToken");
                jsonWriter.value(pageToken);
            }
            if (searchProductsAsAdminRequest.getPageSize() != null) {
                Integer pageSize = searchProductsAsAdminRequest.getPageSize();
                jsonWriter.name("PageSize");
                jsonWriter.value(pageSize);
            }
            if (searchProductsAsAdminRequest.getProductSource() != null) {
                String productSource = searchProductsAsAdminRequest.getProductSource();
                jsonWriter.name("ProductSource");
                jsonWriter.value(productSource);
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
