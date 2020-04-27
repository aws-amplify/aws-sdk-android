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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

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
import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateNotebookInstanceRequest
 */
public class UpdateNotebookInstanceRequestMarshaller implements
        Marshaller<Request<UpdateNotebookInstanceRequest>, UpdateNotebookInstanceRequest> {

    public Request<UpdateNotebookInstanceRequest> marshall(
            UpdateNotebookInstanceRequest updateNotebookInstanceRequest) {
        if (updateNotebookInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateNotebookInstanceRequest)");
        }

        Request<UpdateNotebookInstanceRequest> request = new DefaultRequest<UpdateNotebookInstanceRequest>(
                updateNotebookInstanceRequest, "AmazonSageMakerService");
        String target = "SageMaker.UpdateNotebookInstance";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateNotebookInstanceRequest.getNotebookInstanceName() != null) {
                String notebookInstanceName = updateNotebookInstanceRequest
                        .getNotebookInstanceName();
                jsonWriter.name("NotebookInstanceName");
                jsonWriter.value(notebookInstanceName);
            }
            if (updateNotebookInstanceRequest.getInstanceType() != null) {
                String instanceType = updateNotebookInstanceRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (updateNotebookInstanceRequest.getRoleArn() != null) {
                String roleArn = updateNotebookInstanceRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (updateNotebookInstanceRequest.getLifecycleConfigName() != null) {
                String lifecycleConfigName = updateNotebookInstanceRequest.getLifecycleConfigName();
                jsonWriter.name("LifecycleConfigName");
                jsonWriter.value(lifecycleConfigName);
            }
            if (updateNotebookInstanceRequest.getDisassociateLifecycleConfig() != null) {
                Boolean disassociateLifecycleConfig = updateNotebookInstanceRequest
                        .getDisassociateLifecycleConfig();
                jsonWriter.name("DisassociateLifecycleConfig");
                jsonWriter.value(disassociateLifecycleConfig);
            }
            if (updateNotebookInstanceRequest.getVolumeSizeInGB() != null) {
                Integer volumeSizeInGB = updateNotebookInstanceRequest.getVolumeSizeInGB();
                jsonWriter.name("VolumeSizeInGB");
                jsonWriter.value(volumeSizeInGB);
            }
            if (updateNotebookInstanceRequest.getDefaultCodeRepository() != null) {
                String defaultCodeRepository = updateNotebookInstanceRequest
                        .getDefaultCodeRepository();
                jsonWriter.name("DefaultCodeRepository");
                jsonWriter.value(defaultCodeRepository);
            }
            if (updateNotebookInstanceRequest.getAdditionalCodeRepositories() != null) {
                java.util.List<String> additionalCodeRepositories = updateNotebookInstanceRequest
                        .getAdditionalCodeRepositories();
                jsonWriter.name("AdditionalCodeRepositories");
                jsonWriter.beginArray();
                for (String additionalCodeRepositoriesItem : additionalCodeRepositories) {
                    if (additionalCodeRepositoriesItem != null) {
                        jsonWriter.value(additionalCodeRepositoriesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateNotebookInstanceRequest.getAcceleratorTypes() != null) {
                java.util.List<String> acceleratorTypes = updateNotebookInstanceRequest
                        .getAcceleratorTypes();
                jsonWriter.name("AcceleratorTypes");
                jsonWriter.beginArray();
                for (String acceleratorTypesItem : acceleratorTypes) {
                    if (acceleratorTypesItem != null) {
                        jsonWriter.value(acceleratorTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateNotebookInstanceRequest.getDisassociateAcceleratorTypes() != null) {
                Boolean disassociateAcceleratorTypes = updateNotebookInstanceRequest
                        .getDisassociateAcceleratorTypes();
                jsonWriter.name("DisassociateAcceleratorTypes");
                jsonWriter.value(disassociateAcceleratorTypes);
            }
            if (updateNotebookInstanceRequest.getDisassociateDefaultCodeRepository() != null) {
                Boolean disassociateDefaultCodeRepository = updateNotebookInstanceRequest
                        .getDisassociateDefaultCodeRepository();
                jsonWriter.name("DisassociateDefaultCodeRepository");
                jsonWriter.value(disassociateDefaultCodeRepository);
            }
            if (updateNotebookInstanceRequest.getDisassociateAdditionalCodeRepositories() != null) {
                Boolean disassociateAdditionalCodeRepositories = updateNotebookInstanceRequest
                        .getDisassociateAdditionalCodeRepositories();
                jsonWriter.name("DisassociateAdditionalCodeRepositories");
                jsonWriter.value(disassociateAdditionalCodeRepositories);
            }
            if (updateNotebookInstanceRequest.getRootAccess() != null) {
                String rootAccess = updateNotebookInstanceRequest.getRootAccess();
                jsonWriter.name("RootAccess");
                jsonWriter.value(rootAccess);
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
