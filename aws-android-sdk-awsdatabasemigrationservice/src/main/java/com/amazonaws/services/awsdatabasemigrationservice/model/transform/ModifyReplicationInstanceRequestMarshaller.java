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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

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
import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ModifyReplicationInstanceRequest
 */
public class ModifyReplicationInstanceRequestMarshaller implements
        Marshaller<Request<ModifyReplicationInstanceRequest>, ModifyReplicationInstanceRequest> {

    public Request<ModifyReplicationInstanceRequest> marshall(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest) {
        if (modifyReplicationInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyReplicationInstanceRequest)");
        }

        Request<ModifyReplicationInstanceRequest> request = new DefaultRequest<ModifyReplicationInstanceRequest>(
                modifyReplicationInstanceRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.ModifyReplicationInstance";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyReplicationInstanceRequest.getReplicationInstanceArn() != null) {
                String replicationInstanceArn = modifyReplicationInstanceRequest
                        .getReplicationInstanceArn();
                jsonWriter.name("ReplicationInstanceArn");
                jsonWriter.value(replicationInstanceArn);
            }
            if (modifyReplicationInstanceRequest.getAllocatedStorage() != null) {
                Integer allocatedStorage = modifyReplicationInstanceRequest.getAllocatedStorage();
                jsonWriter.name("AllocatedStorage");
                jsonWriter.value(allocatedStorage);
            }
            if (modifyReplicationInstanceRequest.getApplyImmediately() != null) {
                Boolean applyImmediately = modifyReplicationInstanceRequest.getApplyImmediately();
                jsonWriter.name("ApplyImmediately");
                jsonWriter.value(applyImmediately);
            }
            if (modifyReplicationInstanceRequest.getReplicationInstanceClass() != null) {
                String replicationInstanceClass = modifyReplicationInstanceRequest
                        .getReplicationInstanceClass();
                jsonWriter.name("ReplicationInstanceClass");
                jsonWriter.value(replicationInstanceClass);
            }
            if (modifyReplicationInstanceRequest.getVpcSecurityGroupIds() != null) {
                java.util.List<String> vpcSecurityGroupIds = modifyReplicationInstanceRequest
                        .getVpcSecurityGroupIds();
                jsonWriter.name("VpcSecurityGroupIds");
                jsonWriter.beginArray();
                for (String vpcSecurityGroupIdsItem : vpcSecurityGroupIds) {
                    if (vpcSecurityGroupIdsItem != null) {
                        jsonWriter.value(vpcSecurityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyReplicationInstanceRequest.getPreferredMaintenanceWindow() != null) {
                String preferredMaintenanceWindow = modifyReplicationInstanceRequest
                        .getPreferredMaintenanceWindow();
                jsonWriter.name("PreferredMaintenanceWindow");
                jsonWriter.value(preferredMaintenanceWindow);
            }
            if (modifyReplicationInstanceRequest.getMultiAZ() != null) {
                Boolean multiAZ = modifyReplicationInstanceRequest.getMultiAZ();
                jsonWriter.name("MultiAZ");
                jsonWriter.value(multiAZ);
            }
            if (modifyReplicationInstanceRequest.getEngineVersion() != null) {
                String engineVersion = modifyReplicationInstanceRequest.getEngineVersion();
                jsonWriter.name("EngineVersion");
                jsonWriter.value(engineVersion);
            }
            if (modifyReplicationInstanceRequest.getAllowMajorVersionUpgrade() != null) {
                Boolean allowMajorVersionUpgrade = modifyReplicationInstanceRequest
                        .getAllowMajorVersionUpgrade();
                jsonWriter.name("AllowMajorVersionUpgrade");
                jsonWriter.value(allowMajorVersionUpgrade);
            }
            if (modifyReplicationInstanceRequest.getAutoMinorVersionUpgrade() != null) {
                Boolean autoMinorVersionUpgrade = modifyReplicationInstanceRequest
                        .getAutoMinorVersionUpgrade();
                jsonWriter.name("AutoMinorVersionUpgrade");
                jsonWriter.value(autoMinorVersionUpgrade);
            }
            if (modifyReplicationInstanceRequest.getReplicationInstanceIdentifier() != null) {
                String replicationInstanceIdentifier = modifyReplicationInstanceRequest
                        .getReplicationInstanceIdentifier();
                jsonWriter.name("ReplicationInstanceIdentifier");
                jsonWriter.value(replicationInstanceIdentifier);
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
