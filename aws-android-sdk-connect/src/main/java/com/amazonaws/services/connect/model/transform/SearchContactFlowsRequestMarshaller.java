/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SearchContactFlowsRequest
 */
public class SearchContactFlowsRequestMarshaller implements
        Marshaller<Request<SearchContactFlowsRequest>, SearchContactFlowsRequest> {

    public Request<SearchContactFlowsRequest> marshall(
            SearchContactFlowsRequest searchContactFlowsRequest) {
        if (searchContactFlowsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchContactFlowsRequest)");
        }

        Request<SearchContactFlowsRequest> request = new DefaultRequest<SearchContactFlowsRequest>(
                searchContactFlowsRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/search-contact-flows";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchContactFlowsRequest.getInstanceId() != null) {
                String instanceId = searchContactFlowsRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (searchContactFlowsRequest.getNextToken() != null) {
                String nextToken = searchContactFlowsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (searchContactFlowsRequest.getMaxResults() != null) {
                Integer maxResults = searchContactFlowsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (searchContactFlowsRequest.getSearchFilter() != null) {
                ContactFlowSearchFilter searchFilter = searchContactFlowsRequest.getSearchFilter();
                jsonWriter.name("SearchFilter");
                ContactFlowSearchFilterJsonMarshaller.getInstance().marshall(searchFilter,
                        jsonWriter);
            }
            if (searchContactFlowsRequest.getSearchCriteria() != null) {
                ContactFlowSearchCriteria searchCriteria = searchContactFlowsRequest
                        .getSearchCriteria();
                jsonWriter.name("SearchCriteria");
                ContactFlowSearchCriteriaJsonMarshaller.getInstance().marshall(searchCriteria,
                        jsonWriter);
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
