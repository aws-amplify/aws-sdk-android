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

package com.amazonaws.services.tagging.model.transform;

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
import com.amazonaws.services.tagging.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetResourcesRequest
 */
public class GetResourcesRequestMarshaller implements
        Marshaller<Request<GetResourcesRequest>, GetResourcesRequest> {

    public Request<GetResourcesRequest> marshall(GetResourcesRequest getResourcesRequest) {
        if (getResourcesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetResourcesRequest)");
        }

        Request<GetResourcesRequest> request = new DefaultRequest<GetResourcesRequest>(
                getResourcesRequest, "AWSResourceGroupsTaggingAPI");
        String target = "ResourceGroupsTaggingAPI_20170126.GetResources";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getResourcesRequest.getPaginationToken() != null) {
                String paginationToken = getResourcesRequest.getPaginationToken();
                jsonWriter.name("PaginationToken");
                jsonWriter.value(paginationToken);
            }
            if (getResourcesRequest.getTagFilters() != null) {
                java.util.List<TagFilter> tagFilters = getResourcesRequest.getTagFilters();
                jsonWriter.name("TagFilters");
                jsonWriter.beginArray();
                for (TagFilter tagFiltersItem : tagFilters) {
                    if (tagFiltersItem != null) {
                        TagFilterJsonMarshaller.getInstance().marshall(tagFiltersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getResourcesRequest.getResourcesPerPage() != null) {
                Integer resourcesPerPage = getResourcesRequest.getResourcesPerPage();
                jsonWriter.name("ResourcesPerPage");
                jsonWriter.value(resourcesPerPage);
            }
            if (getResourcesRequest.getTagsPerPage() != null) {
                Integer tagsPerPage = getResourcesRequest.getTagsPerPage();
                jsonWriter.name("TagsPerPage");
                jsonWriter.value(tagsPerPage);
            }
            if (getResourcesRequest.getResourceTypeFilters() != null) {
                java.util.List<String> resourceTypeFilters = getResourcesRequest
                        .getResourceTypeFilters();
                jsonWriter.name("ResourceTypeFilters");
                jsonWriter.beginArray();
                for (String resourceTypeFiltersItem : resourceTypeFilters) {
                    if (resourceTypeFiltersItem != null) {
                        jsonWriter.value(resourceTypeFiltersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getResourcesRequest.getIncludeComplianceDetails() != null) {
                Boolean includeComplianceDetails = getResourcesRequest
                        .getIncludeComplianceDetails();
                jsonWriter.name("IncludeComplianceDetails");
                jsonWriter.value(includeComplianceDetails);
            }
            if (getResourcesRequest.getExcludeCompliantResources() != null) {
                Boolean excludeCompliantResources = getResourcesRequest
                        .getExcludeCompliantResources();
                jsonWriter.name("ExcludeCompliantResources");
                jsonWriter.value(excludeCompliantResources);
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
