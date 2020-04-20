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

package com.amazonaws.services.awsglue.model.transform;

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
import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SearchTablesRequest
 */
public class SearchTablesRequestMarshaller implements
        Marshaller<Request<SearchTablesRequest>, SearchTablesRequest> {

    public Request<SearchTablesRequest> marshall(SearchTablesRequest searchTablesRequest) {
        if (searchTablesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchTablesRequest)");
        }

        Request<SearchTablesRequest> request = new DefaultRequest<SearchTablesRequest>(
                searchTablesRequest, "AWSGlue");
        String target = "AWSGlue.SearchTables";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchTablesRequest.getCatalogId() != null) {
                String catalogId = searchTablesRequest.getCatalogId();
                jsonWriter.name("CatalogId");
                jsonWriter.value(catalogId);
            }
            if (searchTablesRequest.getNextToken() != null) {
                String nextToken = searchTablesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (searchTablesRequest.getFilters() != null) {
                java.util.List<PropertyPredicate> filters = searchTablesRequest.getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (PropertyPredicate filtersItem : filters) {
                    if (filtersItem != null) {
                        PropertyPredicateJsonMarshaller.getInstance().marshall(filtersItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchTablesRequest.getSearchText() != null) {
                String searchText = searchTablesRequest.getSearchText();
                jsonWriter.name("SearchText");
                jsonWriter.value(searchText);
            }
            if (searchTablesRequest.getSortCriteria() != null) {
                java.util.List<SortCriterion> sortCriteria = searchTablesRequest.getSortCriteria();
                jsonWriter.name("SortCriteria");
                jsonWriter.beginArray();
                for (SortCriterion sortCriteriaItem : sortCriteria) {
                    if (sortCriteriaItem != null) {
                        SortCriterionJsonMarshaller.getInstance().marshall(sortCriteriaItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchTablesRequest.getMaxResults() != null) {
                Integer maxResults = searchTablesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
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
