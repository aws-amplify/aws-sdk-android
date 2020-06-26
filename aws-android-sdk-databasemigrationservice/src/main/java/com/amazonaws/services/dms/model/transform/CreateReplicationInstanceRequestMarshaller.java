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

package com.amazonaws.services.dms.model.transform;

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
import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateReplicationInstanceRequest
 */
public class CreateReplicationInstanceRequestMarshaller implements
        Marshaller<Request<CreateReplicationInstanceRequest>, CreateReplicationInstanceRequest> {

    public Request<CreateReplicationInstanceRequest> marshall(
            CreateReplicationInstanceRequest createReplicationInstanceRequest) {
        if (createReplicationInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateReplicationInstanceRequest)");
        }

        Request<CreateReplicationInstanceRequest> request = new DefaultRequest<CreateReplicationInstanceRequest>(
                createReplicationInstanceRequest, "AWSDatabaseMigrationService");
        String target = "AmazonDMSv20160101.CreateReplicationInstance";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createReplicationInstanceRequest.getReplicationInstanceIdentifier() != null) {
                String replicationInstanceIdentifier = createReplicationInstanceRequest
                        .getReplicationInstanceIdentifier();
                jsonWriter.name("ReplicationInstanceIdentifier");
                jsonWriter.value(replicationInstanceIdentifier);
            }
            if (createReplicationInstanceRequest.getAllocatedStorage() != null) {
                Integer allocatedStorage = createReplicationInstanceRequest.getAllocatedStorage();
                jsonWriter.name("AllocatedStorage");
                jsonWriter.value(allocatedStorage);
            }
            if (createReplicationInstanceRequest.getReplicationInstanceClass() != null) {
                String replicationInstanceClass = createReplicationInstanceRequest
                        .getReplicationInstanceClass();
                jsonWriter.name("ReplicationInstanceClass");
                jsonWriter.value(replicationInstanceClass);
            }
            if (createReplicationInstanceRequest.getVpcSecurityGroupIds() != null) {
                java.util.List<String> vpcSecurityGroupIds = createReplicationInstanceRequest
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
            if (createReplicationInstanceRequest.getAvailabilityZone() != null) {
                String availabilityZone = createReplicationInstanceRequest.getAvailabilityZone();
                jsonWriter.name("AvailabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (createReplicationInstanceRequest.getReplicationSubnetGroupIdentifier() != null) {
                String replicationSubnetGroupIdentifier = createReplicationInstanceRequest
                        .getReplicationSubnetGroupIdentifier();
                jsonWriter.name("ReplicationSubnetGroupIdentifier");
                jsonWriter.value(replicationSubnetGroupIdentifier);
            }
            if (createReplicationInstanceRequest.getPreferredMaintenanceWindow() != null) {
                String preferredMaintenanceWindow = createReplicationInstanceRequest
                        .getPreferredMaintenanceWindow();
                jsonWriter.name("PreferredMaintenanceWindow");
                jsonWriter.value(preferredMaintenanceWindow);
            }
            if (createReplicationInstanceRequest.getMultiAZ() != null) {
                Boolean multiAZ = createReplicationInstanceRequest.getMultiAZ();
                jsonWriter.name("MultiAZ");
                jsonWriter.value(multiAZ);
            }
            if (createReplicationInstanceRequest.getEngineVersion() != null) {
                String engineVersion = createReplicationInstanceRequest.getEngineVersion();
                jsonWriter.name("EngineVersion");
                jsonWriter.value(engineVersion);
            }
            if (createReplicationInstanceRequest.getAutoMinorVersionUpgrade() != null) {
                Boolean autoMinorVersionUpgrade = createReplicationInstanceRequest
                        .getAutoMinorVersionUpgrade();
                jsonWriter.name("AutoMinorVersionUpgrade");
                jsonWriter.value(autoMinorVersionUpgrade);
            }
            if (createReplicationInstanceRequest.getTags() != null) {
                java.util.List<Tag> tags = createReplicationInstanceRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createReplicationInstanceRequest.getKmsKeyId() != null) {
                String kmsKeyId = createReplicationInstanceRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createReplicationInstanceRequest.getPubliclyAccessible() != null) {
                Boolean publiclyAccessible = createReplicationInstanceRequest
                        .getPubliclyAccessible();
                jsonWriter.name("PubliclyAccessible");
                jsonWriter.value(publiclyAccessible);
            }
            if (createReplicationInstanceRequest.getDnsNameServers() != null) {
                String dnsNameServers = createReplicationInstanceRequest.getDnsNameServers();
                jsonWriter.name("DnsNameServers");
                jsonWriter.value(dnsNameServers);
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
