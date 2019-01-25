/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CancelJobRequest
 */
public class CancelJobRequestMarshaller implements
        Marshaller<Request<CancelJobRequest>, CancelJobRequest> {

    public Request<CancelJobRequest> marshall(CancelJobRequest cancelJobRequest) {
        if (cancelJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CancelJobRequest)");
        }

        Request<CancelJobRequest> request = new DefaultRequest<CancelJobRequest>(cancelJobRequest,
                "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/jobs/{jobId}/cancel";
        uriResourcePath = uriResourcePath.replace(
                "{jobId}",
                (cancelJobRequest.getJobId() == null) ? "" : StringUtils
                        .fromString(cancelJobRequest.getJobId()));
        if (cancelJobRequest.getForce() != null) {
            request.addParameter("force", StringUtils.fromBoolean(cancelJobRequest.getForce()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (cancelJobRequest.getReasonCode() != null) {
                String reasonCode = cancelJobRequest.getReasonCode();
                jsonWriter.name("reasonCode");
                jsonWriter.value(reasonCode);
            }
            if (cancelJobRequest.getComment() != null) {
                String comment = cancelJobRequest.getComment();
                jsonWriter.name("comment");
                jsonWriter.value(comment);
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
