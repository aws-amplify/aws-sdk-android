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

package com.amazonaws.services.codedeploy.model.transform;

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
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateDeploymentRequest
 */
public class CreateDeploymentRequestMarshaller implements
        Marshaller<Request<CreateDeploymentRequest>, CreateDeploymentRequest> {

    public Request<CreateDeploymentRequest> marshall(CreateDeploymentRequest createDeploymentRequest) {
        if (createDeploymentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDeploymentRequest)");
        }

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(
                createDeploymentRequest, "AWSCodeDeploy");
        String target = "CodeDeploy_20141006.CreateDeployment";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createDeploymentRequest.getApplicationName() != null) {
                String applicationName = createDeploymentRequest.getApplicationName();
                jsonWriter.name("applicationName");
                jsonWriter.value(applicationName);
            }
            if (createDeploymentRequest.getDeploymentGroupName() != null) {
                String deploymentGroupName = createDeploymentRequest.getDeploymentGroupName();
                jsonWriter.name("deploymentGroupName");
                jsonWriter.value(deploymentGroupName);
            }
            if (createDeploymentRequest.getRevision() != null) {
                RevisionLocation revision = createDeploymentRequest.getRevision();
                jsonWriter.name("revision");
                RevisionLocationJsonMarshaller.getInstance().marshall(revision, jsonWriter);
            }
            if (createDeploymentRequest.getDeploymentConfigName() != null) {
                String deploymentConfigName = createDeploymentRequest.getDeploymentConfigName();
                jsonWriter.name("deploymentConfigName");
                jsonWriter.value(deploymentConfigName);
            }
            if (createDeploymentRequest.getDescription() != null) {
                String description = createDeploymentRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createDeploymentRequest.getIgnoreApplicationStopFailures() != null) {
                Boolean ignoreApplicationStopFailures = createDeploymentRequest
                        .getIgnoreApplicationStopFailures();
                jsonWriter.name("ignoreApplicationStopFailures");
                jsonWriter.value(ignoreApplicationStopFailures);
            }
            if (createDeploymentRequest.getTargetInstances() != null) {
                TargetInstances targetInstances = createDeploymentRequest.getTargetInstances();
                jsonWriter.name("targetInstances");
                TargetInstancesJsonMarshaller.getInstance().marshall(targetInstances, jsonWriter);
            }
            if (createDeploymentRequest.getAutoRollbackConfiguration() != null) {
                AutoRollbackConfiguration autoRollbackConfiguration = createDeploymentRequest
                        .getAutoRollbackConfiguration();
                jsonWriter.name("autoRollbackConfiguration");
                AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(
                        autoRollbackConfiguration, jsonWriter);
            }
            if (createDeploymentRequest.getUpdateOutdatedInstancesOnly() != null) {
                Boolean updateOutdatedInstancesOnly = createDeploymentRequest
                        .getUpdateOutdatedInstancesOnly();
                jsonWriter.name("updateOutdatedInstancesOnly");
                jsonWriter.value(updateOutdatedInstancesOnly);
            }
            if (createDeploymentRequest.getFileExistsBehavior() != null) {
                String fileExistsBehavior = createDeploymentRequest.getFileExistsBehavior();
                jsonWriter.name("fileExistsBehavior");
                jsonWriter.value(fileExistsBehavior);
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
