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
 * JSON request marshaller for UpdateNotebookInstanceLifecycleConfigRequest
 */
public class UpdateNotebookInstanceLifecycleConfigRequestMarshaller
        implements
        Marshaller<Request<UpdateNotebookInstanceLifecycleConfigRequest>, UpdateNotebookInstanceLifecycleConfigRequest> {

    public Request<UpdateNotebookInstanceLifecycleConfigRequest> marshall(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest) {
        if (updateNotebookInstanceLifecycleConfigRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateNotebookInstanceLifecycleConfigRequest)");
        }

        Request<UpdateNotebookInstanceLifecycleConfigRequest> request = new DefaultRequest<UpdateNotebookInstanceLifecycleConfigRequest>(
                updateNotebookInstanceLifecycleConfigRequest, "AmazonSageMakerService");
        String target = "SageMaker.UpdateNotebookInstanceLifecycleConfig";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateNotebookInstanceLifecycleConfigRequest
                    .getNotebookInstanceLifecycleConfigName() != null) {
                String notebookInstanceLifecycleConfigName = updateNotebookInstanceLifecycleConfigRequest
                        .getNotebookInstanceLifecycleConfigName();
                jsonWriter.name("NotebookInstanceLifecycleConfigName");
                jsonWriter.value(notebookInstanceLifecycleConfigName);
            }
            if (updateNotebookInstanceLifecycleConfigRequest.getOnCreate() != null) {
                java.util.List<NotebookInstanceLifecycleHook> onCreate = updateNotebookInstanceLifecycleConfigRequest
                        .getOnCreate();
                jsonWriter.name("OnCreate");
                jsonWriter.beginArray();
                for (NotebookInstanceLifecycleHook onCreateItem : onCreate) {
                    if (onCreateItem != null) {
                        NotebookInstanceLifecycleHookJsonMarshaller.getInstance().marshall(
                                onCreateItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateNotebookInstanceLifecycleConfigRequest.getOnStart() != null) {
                java.util.List<NotebookInstanceLifecycleHook> onStart = updateNotebookInstanceLifecycleConfigRequest
                        .getOnStart();
                jsonWriter.name("OnStart");
                jsonWriter.beginArray();
                for (NotebookInstanceLifecycleHook onStartItem : onStart) {
                    if (onStartItem != null) {
                        NotebookInstanceLifecycleHookJsonMarshaller.getInstance().marshall(
                                onStartItem, jsonWriter);
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
