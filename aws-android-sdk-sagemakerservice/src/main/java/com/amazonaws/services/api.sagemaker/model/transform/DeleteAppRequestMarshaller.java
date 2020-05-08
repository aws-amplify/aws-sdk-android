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

package com.amazonaws.services.api.sagemaker.model.transform;

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
import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DeleteAppRequest
 */
public class DeleteAppRequestMarshaller implements
        Marshaller<Request<DeleteAppRequest>, DeleteAppRequest> {

    public Request<DeleteAppRequest> marshall(DeleteAppRequest deleteAppRequest) {
        if (deleteAppRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DeleteAppRequest)");
        }

        Request<DeleteAppRequest> request = new DefaultRequest<DeleteAppRequest>(deleteAppRequest,
                "AmazonSageMakerService");
        String target = "SageMaker.DeleteApp";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (deleteAppRequest.getDomainId() != null) {
                String domainId = deleteAppRequest.getDomainId();
                jsonWriter.name("DomainId");
                jsonWriter.value(domainId);
            }
            if (deleteAppRequest.getUserProfileName() != null) {
                String userProfileName = deleteAppRequest.getUserProfileName();
                jsonWriter.name("UserProfileName");
                jsonWriter.value(userProfileName);
            }
            if (deleteAppRequest.getAppType() != null) {
                String appType = deleteAppRequest.getAppType();
                jsonWriter.name("AppType");
                jsonWriter.value(appType);
            }
            if (deleteAppRequest.getAppName() != null) {
                String appName = deleteAppRequest.getAppName();
                jsonWriter.name("AppName");
                jsonWriter.value(appName);
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
