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

package com.amazonaws.services.kendra.model.transform;

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
import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for QueryRequest
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
        if (queryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(QueryRequest)");
        }

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest,
                "AWSKendraFrontendService");
        String target = "AWSKendraFrontendService.Query";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (queryRequest.getIndexId() != null) {
                String indexId = queryRequest.getIndexId();
                jsonWriter.name("IndexId");
                jsonWriter.value(indexId);
            }
            if (queryRequest.getQueryText() != null) {
                String queryText = queryRequest.getQueryText();
                jsonWriter.name("QueryText");
                jsonWriter.value(queryText);
            }
            if (queryRequest.getAttributeFilter() != null) {
                AttributeFilter attributeFilter = queryRequest.getAttributeFilter();
                jsonWriter.name("AttributeFilter");
                AttributeFilterJsonMarshaller.getInstance().marshall(attributeFilter, jsonWriter);
            }
            if (queryRequest.getFacets() != null) {
                java.util.List<Facet> facets = queryRequest.getFacets();
                jsonWriter.name("Facets");
                jsonWriter.beginArray();
                for (Facet facetsItem : facets) {
                    if (facetsItem != null) {
                        FacetJsonMarshaller.getInstance().marshall(facetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getRequestedDocumentAttributes() != null) {
                java.util.List<String> requestedDocumentAttributes = queryRequest
                        .getRequestedDocumentAttributes();
                jsonWriter.name("RequestedDocumentAttributes");
                jsonWriter.beginArray();
                for (String requestedDocumentAttributesItem : requestedDocumentAttributes) {
                    if (requestedDocumentAttributesItem != null) {
                        jsonWriter.value(requestedDocumentAttributesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getQueryResultTypeFilter() != null) {
                String queryResultTypeFilter = queryRequest.getQueryResultTypeFilter();
                jsonWriter.name("QueryResultTypeFilter");
                jsonWriter.value(queryResultTypeFilter);
            }
            if (queryRequest.getPageNumber() != null) {
                Integer pageNumber = queryRequest.getPageNumber();
                jsonWriter.name("PageNumber");
                jsonWriter.value(pageNumber);
            }
            if (queryRequest.getPageSize() != null) {
                Integer pageSize = queryRequest.getPageSize();
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
