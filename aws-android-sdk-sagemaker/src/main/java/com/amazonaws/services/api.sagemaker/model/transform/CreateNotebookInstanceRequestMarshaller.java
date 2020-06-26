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
 * JSON request marshaller for CreateNotebookInstanceRequest
 */
public class CreateNotebookInstanceRequestMarshaller implements
        Marshaller<Request<CreateNotebookInstanceRequest>, CreateNotebookInstanceRequest> {

    public Request<CreateNotebookInstanceRequest> marshall(
            CreateNotebookInstanceRequest createNotebookInstanceRequest) {
        if (createNotebookInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateNotebookInstanceRequest)");
        }

        Request<CreateNotebookInstanceRequest> request = new DefaultRequest<CreateNotebookInstanceRequest>(
                createNotebookInstanceRequest, "AmazonSageMakerService");
        String target = "SageMaker.CreateNotebookInstance";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createNotebookInstanceRequest.getNotebookInstanceName() != null) {
                String notebookInstanceName = createNotebookInstanceRequest
                        .getNotebookInstanceName();
                jsonWriter.name("NotebookInstanceName");
                jsonWriter.value(notebookInstanceName);
            }
            if (createNotebookInstanceRequest.getInstanceType() != null) {
                String instanceType = createNotebookInstanceRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (createNotebookInstanceRequest.getSubnetId() != null) {
                String subnetId = createNotebookInstanceRequest.getSubnetId();
                jsonWriter.name("SubnetId");
                jsonWriter.value(subnetId);
            }
            if (createNotebookInstanceRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createNotebookInstanceRequest
                        .getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNotebookInstanceRequest.getRoleArn() != null) {
                String roleArn = createNotebookInstanceRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createNotebookInstanceRequest.getKmsKeyId() != null) {
                String kmsKeyId = createNotebookInstanceRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createNotebookInstanceRequest.getTags() != null) {
                java.util.List<Tag> tags = createNotebookInstanceRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createNotebookInstanceRequest.getLifecycleConfigName() != null) {
                String lifecycleConfigName = createNotebookInstanceRequest.getLifecycleConfigName();
                jsonWriter.name("LifecycleConfigName");
                jsonWriter.value(lifecycleConfigName);
            }
            if (createNotebookInstanceRequest.getDirectInternetAccess() != null) {
                String directInternetAccess = createNotebookInstanceRequest
                        .getDirectInternetAccess();
                jsonWriter.name("DirectInternetAccess");
                jsonWriter.value(directInternetAccess);
            }
            if (createNotebookInstanceRequest.getVolumeSizeInGB() != null) {
                Integer volumeSizeInGB = createNotebookInstanceRequest.getVolumeSizeInGB();
                jsonWriter.name("VolumeSizeInGB");
                jsonWriter.value(volumeSizeInGB);
            }
            if (createNotebookInstanceRequest.getAcceleratorTypes() != null) {
                java.util.List<String> acceleratorTypes = createNotebookInstanceRequest
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
            if (createNotebookInstanceRequest.getDefaultCodeRepository() != null) {
                String defaultCodeRepository = createNotebookInstanceRequest
                        .getDefaultCodeRepository();
                jsonWriter.name("DefaultCodeRepository");
                jsonWriter.value(defaultCodeRepository);
            }
            if (createNotebookInstanceRequest.getAdditionalCodeRepositories() != null) {
                java.util.List<String> additionalCodeRepositories = createNotebookInstanceRequest
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
            if (createNotebookInstanceRequest.getRootAccess() != null) {
                String rootAccess = createNotebookInstanceRequest.getRootAccess();
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
