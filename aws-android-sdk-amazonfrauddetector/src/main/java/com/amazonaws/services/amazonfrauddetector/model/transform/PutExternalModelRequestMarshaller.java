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

package com.amazonaws.services.amazonfrauddetector.model.transform;

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
import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutExternalModelRequest
 */
public class PutExternalModelRequestMarshaller implements
        Marshaller<Request<PutExternalModelRequest>, PutExternalModelRequest> {

    public Request<PutExternalModelRequest> marshall(PutExternalModelRequest putExternalModelRequest) {
        if (putExternalModelRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutExternalModelRequest)");
        }

        Request<PutExternalModelRequest> request = new DefaultRequest<PutExternalModelRequest>(
                putExternalModelRequest, "AmazonFraudDetector");
        String target = "AWSHawksNestServiceFacade.PutExternalModel";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putExternalModelRequest.getModelEndpoint() != null) {
                String modelEndpoint = putExternalModelRequest.getModelEndpoint();
                jsonWriter.name("modelEndpoint");
                jsonWriter.value(modelEndpoint);
            }
            if (putExternalModelRequest.getModelSource() != null) {
                String modelSource = putExternalModelRequest.getModelSource();
                jsonWriter.name("modelSource");
                jsonWriter.value(modelSource);
            }
            if (putExternalModelRequest.getRole() != null) {
                Role role = putExternalModelRequest.getRole();
                jsonWriter.name("role");
                RoleJsonMarshaller.getInstance().marshall(role, jsonWriter);
            }
            if (putExternalModelRequest.getInputConfiguration() != null) {
                ModelInputConfiguration inputConfiguration = putExternalModelRequest
                        .getInputConfiguration();
                jsonWriter.name("inputConfiguration");
                ModelInputConfigurationJsonMarshaller.getInstance().marshall(inputConfiguration,
                        jsonWriter);
            }
            if (putExternalModelRequest.getOutputConfiguration() != null) {
                ModelOutputConfiguration outputConfiguration = putExternalModelRequest
                        .getOutputConfiguration();
                jsonWriter.name("outputConfiguration");
                ModelOutputConfigurationJsonMarshaller.getInstance().marshall(outputConfiguration,
                        jsonWriter);
            }
            if (putExternalModelRequest.getModelEndpointStatus() != null) {
                String modelEndpointStatus = putExternalModelRequest.getModelEndpointStatus();
                jsonWriter.name("modelEndpointStatus");
                jsonWriter.value(modelEndpointStatus);
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
