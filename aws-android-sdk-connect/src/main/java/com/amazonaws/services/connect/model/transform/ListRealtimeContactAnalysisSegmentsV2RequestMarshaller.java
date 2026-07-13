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
 * JSON request marshaller for ListRealtimeContactAnalysisSegmentsV2Request
 */
public class ListRealtimeContactAnalysisSegmentsV2RequestMarshaller
        implements
        Marshaller<Request<ListRealtimeContactAnalysisSegmentsV2Request>, ListRealtimeContactAnalysisSegmentsV2Request> {

    public Request<ListRealtimeContactAnalysisSegmentsV2Request> marshall(
            ListRealtimeContactAnalysisSegmentsV2Request listRealtimeContactAnalysisSegmentsV2Request) {
        if (listRealtimeContactAnalysisSegmentsV2Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListRealtimeContactAnalysisSegmentsV2Request)");
        }

        Request<ListRealtimeContactAnalysisSegmentsV2Request> request = new DefaultRequest<ListRealtimeContactAnalysisSegmentsV2Request>(
                listRealtimeContactAnalysisSegmentsV2Request, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/contact/list-real-time-analysis-segments-v2/{InstanceId}/{ContactId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (listRealtimeContactAnalysisSegmentsV2Request.getInstanceId() == null) ? ""
                        : StringUtils.fromString(listRealtimeContactAnalysisSegmentsV2Request
                                .getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{ContactId}",
                (listRealtimeContactAnalysisSegmentsV2Request.getContactId() == null) ? ""
                        : StringUtils.fromString(listRealtimeContactAnalysisSegmentsV2Request
                                .getContactId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listRealtimeContactAnalysisSegmentsV2Request.getMaxResults() != null) {
                Integer maxResults = listRealtimeContactAnalysisSegmentsV2Request.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listRealtimeContactAnalysisSegmentsV2Request.getNextToken() != null) {
                String nextToken = listRealtimeContactAnalysisSegmentsV2Request.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listRealtimeContactAnalysisSegmentsV2Request.getOutputType() != null) {
                String outputType = listRealtimeContactAnalysisSegmentsV2Request.getOutputType();
                jsonWriter.name("OutputType");
                jsonWriter.value(outputType);
            }
            if (listRealtimeContactAnalysisSegmentsV2Request.getSegmentTypes() != null) {
                java.util.List<String> segmentTypes = listRealtimeContactAnalysisSegmentsV2Request
                        .getSegmentTypes();
                jsonWriter.name("SegmentTypes");
                jsonWriter.beginArray();
                for (String segmentTypesItem : segmentTypes) {
                    if (segmentTypesItem != null) {
                        jsonWriter.value(segmentTypesItem);
                    }
                }
                jsonWriter.endArray();
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
