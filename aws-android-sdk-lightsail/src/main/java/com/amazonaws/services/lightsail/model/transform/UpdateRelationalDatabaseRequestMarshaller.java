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
 * JSON request marshaller for UpdateRelationalDatabaseRequest
 */
public class UpdateRelationalDatabaseRequestMarshaller implements
        Marshaller<Request<UpdateRelationalDatabaseRequest>, UpdateRelationalDatabaseRequest> {

    public Request<UpdateRelationalDatabaseRequest> marshall(
            UpdateRelationalDatabaseRequest updateRelationalDatabaseRequest) {
        if (updateRelationalDatabaseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateRelationalDatabaseRequest)");
        }

        Request<UpdateRelationalDatabaseRequest> request = new DefaultRequest<UpdateRelationalDatabaseRequest>(
                updateRelationalDatabaseRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.UpdateRelationalDatabase";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateRelationalDatabaseRequest.getRelationalDatabaseName() != null) {
                String relationalDatabaseName = updateRelationalDatabaseRequest
                        .getRelationalDatabaseName();
                jsonWriter.name("relationalDatabaseName");
                jsonWriter.value(relationalDatabaseName);
            }
            if (updateRelationalDatabaseRequest.getMasterUserPassword() != null) {
                String masterUserPassword = updateRelationalDatabaseRequest.getMasterUserPassword();
                jsonWriter.name("masterUserPassword");
                jsonWriter.value(masterUserPassword);
            }
            if (updateRelationalDatabaseRequest.getRotateMasterUserPassword() != null) {
                Boolean rotateMasterUserPassword = updateRelationalDatabaseRequest
                        .getRotateMasterUserPassword();
                jsonWriter.name("rotateMasterUserPassword");
                jsonWriter.value(rotateMasterUserPassword);
            }
            if (updateRelationalDatabaseRequest.getPreferredBackupWindow() != null) {
                String preferredBackupWindow = updateRelationalDatabaseRequest
                        .getPreferredBackupWindow();
                jsonWriter.name("preferredBackupWindow");
                jsonWriter.value(preferredBackupWindow);
            }
            if (updateRelationalDatabaseRequest.getPreferredMaintenanceWindow() != null) {
                String preferredMaintenanceWindow = updateRelationalDatabaseRequest
                        .getPreferredMaintenanceWindow();
                jsonWriter.name("preferredMaintenanceWindow");
                jsonWriter.value(preferredMaintenanceWindow);
            }
            if (updateRelationalDatabaseRequest.getEnableBackupRetention() != null) {
                Boolean enableBackupRetention = updateRelationalDatabaseRequest
                        .getEnableBackupRetention();
                jsonWriter.name("enableBackupRetention");
                jsonWriter.value(enableBackupRetention);
            }
            if (updateRelationalDatabaseRequest.getDisableBackupRetention() != null) {
                Boolean disableBackupRetention = updateRelationalDatabaseRequest
                        .getDisableBackupRetention();
                jsonWriter.name("disableBackupRetention");
                jsonWriter.value(disableBackupRetention);
            }
            if (updateRelationalDatabaseRequest.getPubliclyAccessible() != null) {
                Boolean publiclyAccessible = updateRelationalDatabaseRequest
                        .getPubliclyAccessible();
                jsonWriter.name("publiclyAccessible");
                jsonWriter.value(publiclyAccessible);
            }
            if (updateRelationalDatabaseRequest.getApplyImmediately() != null) {
                Boolean applyImmediately = updateRelationalDatabaseRequest.getApplyImmediately();
                jsonWriter.name("applyImmediately");
                jsonWriter.value(applyImmediately);
            }
            if (updateRelationalDatabaseRequest.getCaCertificateIdentifier() != null) {
                String caCertificateIdentifier = updateRelationalDatabaseRequest
                        .getCaCertificateIdentifier();
                jsonWriter.name("caCertificateIdentifier");
                jsonWriter.value(caCertificateIdentifier);
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
