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

package com.amazonaws.services.awscostexplorerservice.model.transform;

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
import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetSavingsPlansUtilizationRequest
 */
public class GetSavingsPlansUtilizationRequestMarshaller implements
        Marshaller<Request<GetSavingsPlansUtilizationRequest>, GetSavingsPlansUtilizationRequest> {

    public Request<GetSavingsPlansUtilizationRequest> marshall(
            GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest) {
        if (getSavingsPlansUtilizationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetSavingsPlansUtilizationRequest)");
        }

        Request<GetSavingsPlansUtilizationRequest> request = new DefaultRequest<GetSavingsPlansUtilizationRequest>(
                getSavingsPlansUtilizationRequest, "AWSCostExplorerService");
        String target = "AWSInsightsIndexService.GetSavingsPlansUtilization";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getSavingsPlansUtilizationRequest.getTimePeriod() != null) {
                DateInterval timePeriod = getSavingsPlansUtilizationRequest.getTimePeriod();
                jsonWriter.name("TimePeriod");
                DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
            }
            if (getSavingsPlansUtilizationRequest.getGranularity() != null) {
                String granularity = getSavingsPlansUtilizationRequest.getGranularity();
                jsonWriter.name("Granularity");
                jsonWriter.value(granularity);
            }
            if (getSavingsPlansUtilizationRequest.getFilter() != null) {
                Expression filter = getSavingsPlansUtilizationRequest.getFilter();
                jsonWriter.name("Filter");
                ExpressionJsonMarshaller.getInstance().marshall(filter, jsonWriter);
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
