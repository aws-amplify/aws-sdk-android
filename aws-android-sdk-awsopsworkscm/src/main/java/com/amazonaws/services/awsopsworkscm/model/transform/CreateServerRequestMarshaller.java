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

package com.amazonaws.services.awsopsworkscm.model.transform;

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
import com.amazonaws.services.awsopsworkscm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateServerRequest
 */
public class CreateServerRequestMarshaller implements
        Marshaller<Request<CreateServerRequest>, CreateServerRequest> {

    public Request<CreateServerRequest> marshall(CreateServerRequest createServerRequest) {
        if (createServerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateServerRequest)");
        }

        Request<CreateServerRequest> request = new DefaultRequest<CreateServerRequest>(
                createServerRequest, "AWSOpsWorksCM");
        String target = "OpsWorksCM_V2016_11_01.CreateServer";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createServerRequest.getAssociatePublicIpAddress() != null) {
                Boolean associatePublicIpAddress = createServerRequest
                        .getAssociatePublicIpAddress();
                jsonWriter.name("AssociatePublicIpAddress");
                jsonWriter.value(associatePublicIpAddress);
            }
            if (createServerRequest.getCustomDomain() != null) {
                String customDomain = createServerRequest.getCustomDomain();
                jsonWriter.name("CustomDomain");
                jsonWriter.value(customDomain);
            }
            if (createServerRequest.getCustomCertificate() != null) {
                String customCertificate = createServerRequest.getCustomCertificate();
                jsonWriter.name("CustomCertificate");
                jsonWriter.value(customCertificate);
            }
            if (createServerRequest.getCustomPrivateKey() != null) {
                String customPrivateKey = createServerRequest.getCustomPrivateKey();
                jsonWriter.name("CustomPrivateKey");
                jsonWriter.value(customPrivateKey);
            }
            if (createServerRequest.getDisableAutomatedBackup() != null) {
                Boolean disableAutomatedBackup = createServerRequest.getDisableAutomatedBackup();
                jsonWriter.name("DisableAutomatedBackup");
                jsonWriter.value(disableAutomatedBackup);
            }
            if (createServerRequest.getEngine() != null) {
                String engine = createServerRequest.getEngine();
                jsonWriter.name("Engine");
                jsonWriter.value(engine);
            }
            if (createServerRequest.getEngineModel() != null) {
                String engineModel = createServerRequest.getEngineModel();
                jsonWriter.name("EngineModel");
                jsonWriter.value(engineModel);
            }
            if (createServerRequest.getEngineVersion() != null) {
                String engineVersion = createServerRequest.getEngineVersion();
                jsonWriter.name("EngineVersion");
                jsonWriter.value(engineVersion);
            }
            if (createServerRequest.getEngineAttributes() != null) {
                java.util.List<EngineAttribute> engineAttributes = createServerRequest
                        .getEngineAttributes();
                jsonWriter.name("EngineAttributes");
                jsonWriter.beginArray();
                for (EngineAttribute engineAttributesItem : engineAttributes) {
                    if (engineAttributesItem != null) {
                        EngineAttributeJsonMarshaller.getInstance().marshall(engineAttributesItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServerRequest.getBackupRetentionCount() != null) {
                Integer backupRetentionCount = createServerRequest.getBackupRetentionCount();
                jsonWriter.name("BackupRetentionCount");
                jsonWriter.value(backupRetentionCount);
            }
            if (createServerRequest.getServerName() != null) {
                String serverName = createServerRequest.getServerName();
                jsonWriter.name("ServerName");
                jsonWriter.value(serverName);
            }
            if (createServerRequest.getInstanceProfileArn() != null) {
                String instanceProfileArn = createServerRequest.getInstanceProfileArn();
                jsonWriter.name("InstanceProfileArn");
                jsonWriter.value(instanceProfileArn);
            }
            if (createServerRequest.getInstanceType() != null) {
                String instanceType = createServerRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (createServerRequest.getKeyPair() != null) {
                String keyPair = createServerRequest.getKeyPair();
                jsonWriter.name("KeyPair");
                jsonWriter.value(keyPair);
            }
            if (createServerRequest.getPreferredMaintenanceWindow() != null) {
                String preferredMaintenanceWindow = createServerRequest
                        .getPreferredMaintenanceWindow();
                jsonWriter.name("PreferredMaintenanceWindow");
                jsonWriter.value(preferredMaintenanceWindow);
            }
            if (createServerRequest.getPreferredBackupWindow() != null) {
                String preferredBackupWindow = createServerRequest.getPreferredBackupWindow();
                jsonWriter.name("PreferredBackupWindow");
                jsonWriter.value(preferredBackupWindow);
            }
            if (createServerRequest.getSecurityGroupIds() != null) {
                java.util.List<String> securityGroupIds = createServerRequest.getSecurityGroupIds();
                jsonWriter.name("SecurityGroupIds");
                jsonWriter.beginArray();
                for (String securityGroupIdsItem : securityGroupIds) {
                    if (securityGroupIdsItem != null) {
                        jsonWriter.value(securityGroupIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServerRequest.getServiceRoleArn() != null) {
                String serviceRoleArn = createServerRequest.getServiceRoleArn();
                jsonWriter.name("ServiceRoleArn");
                jsonWriter.value(serviceRoleArn);
            }
            if (createServerRequest.getSubnetIds() != null) {
                java.util.List<String> subnetIds = createServerRequest.getSubnetIds();
                jsonWriter.name("SubnetIds");
                jsonWriter.beginArray();
                for (String subnetIdsItem : subnetIds) {
                    if (subnetIdsItem != null) {
                        jsonWriter.value(subnetIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServerRequest.getTags() != null) {
                java.util.List<Tag> tags = createServerRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createServerRequest.getBackupId() != null) {
                String backupId = createServerRequest.getBackupId();
                jsonWriter.name("BackupId");
                jsonWriter.value(backupId);
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
