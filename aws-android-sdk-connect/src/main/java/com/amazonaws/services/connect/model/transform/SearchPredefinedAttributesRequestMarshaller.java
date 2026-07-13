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
 * JSON request marshaller for SearchPredefinedAttributesRequest
 */
public class SearchPredefinedAttributesRequestMarshaller implements
        Marshaller<Request<SearchPredefinedAttributesRequest>, SearchPredefinedAttributesRequest> {

    public Request<SearchPredefinedAttributesRequest> marshall(
            SearchPredefinedAttributesRequest searchPredefinedAttributesRequest) {
        if (searchPredefinedAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchPredefinedAttributesRequest)");
        }

        Request<SearchPredefinedAttributesRequest> request = new DefaultRequest<SearchPredefinedAttributesRequest>(
                searchPredefinedAttributesRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/search-predefined-attributes";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchPredefinedAttributesRequest.getInstanceId() != null) {
                String instanceId = searchPredefinedAttributesRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (searchPredefinedAttributesRequest.getNextToken() != null) {
                String nextToken = searchPredefinedAttributesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (searchPredefinedAttributesRequest.getMaxResults() != null) {
                Integer maxResults = searchPredefinedAttributesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (searchPredefinedAttributesRequest.getSearchCriteria() != null) {
                PredefinedAttributeSearchCriteria searchCriteria = searchPredefinedAttributesRequest
                        .getSearchCriteria();
                jsonWriter.name("SearchCriteria");
                PredefinedAttributeSearchCriteriaJsonMarshaller.getInstance().marshall(
                        searchCriteria, jsonWriter);
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
