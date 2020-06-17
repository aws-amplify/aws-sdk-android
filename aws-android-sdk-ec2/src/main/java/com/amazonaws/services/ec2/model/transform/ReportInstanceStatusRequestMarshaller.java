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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ReportInstanceStatusRequest
 */
public class ReportInstanceStatusRequestMarshaller implements
        Marshaller<Request<ReportInstanceStatusRequest>, ReportInstanceStatusRequest> {

    public Request<ReportInstanceStatusRequest> marshall(
            ReportInstanceStatusRequest reportInstanceStatusRequest) {
        if (reportInstanceStatusRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ReportInstanceStatusRequest)");
        }

        Request<ReportInstanceStatusRequest> request = new DefaultRequest<ReportInstanceStatusRequest>(
                reportInstanceStatusRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (reportInstanceStatusRequest.getDescription() != null) {
                String description = reportInstanceStatusRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (reportInstanceStatusRequest.getDryRun() != null) {
                Boolean dryRun = reportInstanceStatusRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (reportInstanceStatusRequest.getEndTime() != null) {
                java.util.Date endTime = reportInstanceStatusRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (reportInstanceStatusRequest.getInstances() != null) {
                java.util.List<String> instances = reportInstanceStatusRequest.getInstances();
                jsonWriter.name("Instances");
                jsonWriter.beginArray();
                for (String instancesItem : instances) {
                    if (instancesItem != null) {
                        jsonWriter.value(instancesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (reportInstanceStatusRequest.getReasonCodes() != null) {
                java.util.List<String> reasonCodes = reportInstanceStatusRequest.getReasonCodes();
                jsonWriter.name("ReasonCodes");
                jsonWriter.beginArray();
                for (String reasonCodesItem : reasonCodes) {
                    if (reasonCodesItem != null) {
                        jsonWriter.value(reasonCodesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (reportInstanceStatusRequest.getStartTime() != null) {
                java.util.Date startTime = reportInstanceStatusRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (reportInstanceStatusRequest.getStatus() != null) {
                String status = reportInstanceStatusRequest.getStatus();
                jsonWriter.name("Status");
                jsonWriter.value(status);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
