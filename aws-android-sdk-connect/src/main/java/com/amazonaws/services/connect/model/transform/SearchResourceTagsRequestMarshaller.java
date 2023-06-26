/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for SearchResourceTagsRequest
 */
public class SearchResourceTagsRequestMarshaller implements
        Marshaller<Request<SearchResourceTagsRequest>, SearchResourceTagsRequest> {

    public Request<SearchResourceTagsRequest> marshall(
            SearchResourceTagsRequest searchResourceTagsRequest) {
        if (searchResourceTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SearchResourceTagsRequest)");
        }

        Request<SearchResourceTagsRequest> request = new DefaultRequest<SearchResourceTagsRequest>(
                searchResourceTagsRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/search-resource-tags";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (searchResourceTagsRequest.getInstanceId() != null) {
                String instanceId = searchResourceTagsRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (searchResourceTagsRequest.getResourceTypes() != null) {
                java.util.List<String> resourceTypes = searchResourceTagsRequest.getResourceTypes();
                jsonWriter.name("ResourceTypes");
                jsonWriter.beginArray();
                for (String resourceTypesItem : resourceTypes) {
                    if (resourceTypesItem != null) {
                        jsonWriter.value(resourceTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (searchResourceTagsRequest.getNextToken() != null) {
                String nextToken = searchResourceTagsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (searchResourceTagsRequest.getMaxResults() != null) {
                Integer maxResults = searchResourceTagsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (searchResourceTagsRequest.getSearchCriteria() != null) {
                ResourceTagsSearchCriteria searchCriteria = searchResourceTagsRequest
                        .getSearchCriteria();
                jsonWriter.name("SearchCriteria");
                ResourceTagsSearchCriteriaJsonMarshaller.getInstance().marshall(searchCriteria,
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
