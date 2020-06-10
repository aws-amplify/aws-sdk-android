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

package com.amazonaws.services.lightsail.model.transform;

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
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateRelationalDatabaseRequest
 */
public class CreateRelationalDatabaseRequestMarshaller implements
        Marshaller<Request<CreateRelationalDatabaseRequest>, CreateRelationalDatabaseRequest> {

    public Request<CreateRelationalDatabaseRequest> marshall(
            CreateRelationalDatabaseRequest createRelationalDatabaseRequest) {
        if (createRelationalDatabaseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateRelationalDatabaseRequest)");
        }

        Request<CreateRelationalDatabaseRequest> request = new DefaultRequest<CreateRelationalDatabaseRequest>(
                createRelationalDatabaseRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.CreateRelationalDatabase";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createRelationalDatabaseRequest.getRelationalDatabaseName() != null) {
                String relationalDatabaseName = createRelationalDatabaseRequest
                        .getRelationalDatabaseName();
                jsonWriter.name("relationalDatabaseName");
                jsonWriter.value(relationalDatabaseName);
            }
            if (createRelationalDatabaseRequest.getAvailabilityZone() != null) {
                String availabilityZone = createRelationalDatabaseRequest.getAvailabilityZone();
                jsonWriter.name("availabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createRelationalDatabaseRequest.getRelationalDatabaseBlueprintId() != null) {
                String relationalDatabaseBlueprintId = createRelationalDatabaseRequest
                        .getRelationalDatabaseBlueprintId();
                jsonWriter.name("relationalDatabaseBlueprintId");
                jsonWriter.value(relationalDatabaseBlueprintId);
            }
            if (createRelationalDatabaseRequest.getRelationalDatabaseBundleId() != null) {
                String relationalDatabaseBundleId = createRelationalDatabaseRequest
                        .getRelationalDatabaseBundleId();
                jsonWriter.name("relationalDatabaseBundleId");
                jsonWriter.value(relationalDatabaseBundleId);
            }
            if (createRelationalDatabaseRequest.getMasterDatabaseName() != null) {
                String masterDatabaseName = createRelationalDatabaseRequest.getMasterDatabaseName();
                jsonWriter.name("masterDatabaseName");
                jsonWriter.value(masterDatabaseName);
            }
            if (createRelationalDatabaseRequest.getMasterUsername() != null) {
                String masterUsername = createRelationalDatabaseRequest.getMasterUsername();
                jsonWriter.name("masterUsername");
                jsonWriter.value(masterUsername);
            }
            if (createRelationalDatabaseRequest.getMasterUserPassword() != null) {
                String masterUserPassword = createRelationalDatabaseRequest.getMasterUserPassword();
                jsonWriter.name("masterUserPassword");
                jsonWriter.value(masterUserPassword);
            }
            if (createRelationalDatabaseRequest.getPreferredBackupWindow() != null) {
                String preferredBackupWindow = createRelationalDatabaseRequest
                        .getPreferredBackupWindow();
                jsonWriter.name("preferredBackupWindow");
                jsonWriter.value(preferredBackupWindow);
            }
            if (createRelationalDatabaseRequest.getPreferredMaintenanceWindow() != null) {
                String preferredMaintenanceWindow = createRelationalDatabaseRequest
                        .getPreferredMaintenanceWindow();
                jsonWriter.name("preferredMaintenanceWindow");
                jsonWriter.value(preferredMaintenanceWindow);
            }
            if (createRelationalDatabaseRequest.getPubliclyAccessible() != null) {
                Boolean publiclyAccessible = createRelationalDatabaseRequest
                        .getPubliclyAccessible();
                jsonWriter.name("publiclyAccessible");
                jsonWriter.value(publiclyAccessible);
            }
            if (createRelationalDatabaseRequest.getTags() != null) {
                java.util.List<Tag> tags = createRelationalDatabaseRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
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
