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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetOpsSummaryRequest
 */
public class GetOpsSummaryRequestMarshaller implements
        Marshaller<Request<GetOpsSummaryRequest>, GetOpsSummaryRequest> {

    public Request<GetOpsSummaryRequest> marshall(GetOpsSummaryRequest getOpsSummaryRequest) {
        if (getOpsSummaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetOpsSummaryRequest)");
        }

        Request<GetOpsSummaryRequest> request = new DefaultRequest<GetOpsSummaryRequest>(
                getOpsSummaryRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.GetOpsSummary";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getOpsSummaryRequest.getSyncName() != null) {
                String syncName = getOpsSummaryRequest.getSyncName();
                jsonWriter.name("SyncName");
                jsonWriter.value(syncName);
            }
            if (getOpsSummaryRequest.getFilters() != null) {
                java.util.List<OpsFilter> filters = getOpsSummaryRequest.getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (OpsFilter filtersItem : filters) {
                    if (filtersItem != null) {
                        OpsFilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getOpsSummaryRequest.getAggregators() != null) {
                java.util.List<OpsAggregator> aggregators = getOpsSummaryRequest.getAggregators();
                jsonWriter.name("Aggregators");
                jsonWriter.beginArray();
                for (OpsAggregator aggregatorsItem : aggregators) {
                    if (aggregatorsItem != null) {
                        OpsAggregatorJsonMarshaller.getInstance().marshall(aggregatorsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getOpsSummaryRequest.getResultAttributes() != null) {
                java.util.List<OpsResultAttribute> resultAttributes = getOpsSummaryRequest
                        .getResultAttributes();
                jsonWriter.name("ResultAttributes");
                jsonWriter.beginArray();
                for (OpsResultAttribute resultAttributesItem : resultAttributes) {
                    if (resultAttributesItem != null) {
                        OpsResultAttributeJsonMarshaller.getInstance().marshall(
                                resultAttributesItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getOpsSummaryRequest.getNextToken() != null) {
                String nextToken = getOpsSummaryRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getOpsSummaryRequest.getMaxResults() != null) {
                Integer maxResults = getOpsSummaryRequest.getMaxResults();
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
