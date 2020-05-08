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
 * JSON request marshaller for GetComplianceSummaryRequest
 */
public class GetComplianceSummaryRequestMarshaller implements
        Marshaller<Request<GetComplianceSummaryRequest>, GetComplianceSummaryRequest> {

    public Request<GetComplianceSummaryRequest> marshall(
            GetComplianceSummaryRequest getComplianceSummaryRequest) {
        if (getComplianceSummaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetComplianceSummaryRequest)");
        }

        Request<GetComplianceSummaryRequest> request = new DefaultRequest<GetComplianceSummaryRequest>(
                getComplianceSummaryRequest, "AWSResourceGroupsTaggingAPI");
        String target = "ResourceGroupsTaggingAPI_20170126.GetComplianceSummary";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getComplianceSummaryRequest.getTargetIdFilters() != null) {
                java.util.List<String> targetIdFilters = getComplianceSummaryRequest
                        .getTargetIdFilters();
                jsonWriter.name("TargetIdFilters");
                jsonWriter.beginArray();
                for (String targetIdFiltersItem : targetIdFilters) {
                    if (targetIdFiltersItem != null) {
                        jsonWriter.value(targetIdFiltersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getComplianceSummaryRequest.getRegionFilters() != null) {
                java.util.List<String> regionFilters = getComplianceSummaryRequest
                        .getRegionFilters();
                jsonWriter.name("RegionFilters");
                jsonWriter.beginArray();
                for (String regionFiltersItem : regionFilters) {
                    if (regionFiltersItem != null) {
                        jsonWriter.value(regionFiltersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getComplianceSummaryRequest.getResourceTypeFilters() != null) {
                java.util.List<String> resourceTypeFilters = getComplianceSummaryRequest
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
            if (getComplianceSummaryRequest.getTagKeyFilters() != null) {
                java.util.List<String> tagKeyFilters = getComplianceSummaryRequest
                        .getTagKeyFilters();
                jsonWriter.name("TagKeyFilters");
                jsonWriter.beginArray();
                for (String tagKeyFiltersItem : tagKeyFilters) {
                    if (tagKeyFiltersItem != null) {
                        jsonWriter.value(tagKeyFiltersItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getComplianceSummaryRequest.getGroupBy() != null) {
                java.util.List<String> groupBy = getComplianceSummaryRequest.getGroupBy();
                jsonWriter.name("GroupBy");
                jsonWriter.beginArray();
                for (String groupByItem : groupBy) {
                    if (groupByItem != null) {
                        jsonWriter.value(groupByItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getComplianceSummaryRequest.getMaxResults() != null) {
                Integer maxResults = getComplianceSummaryRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getComplianceSummaryRequest.getPaginationToken() != null) {
                String paginationToken = getComplianceSummaryRequest.getPaginationToken();
                jsonWriter.name("PaginationToken");
                jsonWriter.value(paginationToken);
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
