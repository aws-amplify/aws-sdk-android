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

package com.amazonaws.services.catalog.marketplace.model.transform;

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
import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListChangeSetsRequest
 */
public class ListChangeSetsRequestMarshaller implements
        Marshaller<Request<ListChangeSetsRequest>, ListChangeSetsRequest> {

    public Request<ListChangeSetsRequest> marshall(ListChangeSetsRequest listChangeSetsRequest) {
        if (listChangeSetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListChangeSetsRequest)");
        }

        Request<ListChangeSetsRequest> request = new DefaultRequest<ListChangeSetsRequest>(
                listChangeSetsRequest, "AWSMarketplaceCatalogService");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/ListChangeSets";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listChangeSetsRequest.getCatalog() != null) {
                String catalog = listChangeSetsRequest.getCatalog();
                jsonWriter.name("Catalog");
                jsonWriter.value(catalog);
            }
            if (listChangeSetsRequest.getFilterList() != null) {
                java.util.List<Filter> filterList = listChangeSetsRequest.getFilterList();
                jsonWriter.name("FilterList");
                jsonWriter.beginArray();
                for (Filter filterListItem : filterList) {
                    if (filterListItem != null) {
                        FilterJsonMarshaller.getInstance().marshall(filterListItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (listChangeSetsRequest.getSort() != null) {
                Sort sort = listChangeSetsRequest.getSort();
                jsonWriter.name("Sort");
                SortJsonMarshaller.getInstance().marshall(sort, jsonWriter);
            }
            if (listChangeSetsRequest.getMaxResults() != null) {
                Integer maxResults = listChangeSetsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listChangeSetsRequest.getNextToken() != null) {
                String nextToken = listChangeSetsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
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
