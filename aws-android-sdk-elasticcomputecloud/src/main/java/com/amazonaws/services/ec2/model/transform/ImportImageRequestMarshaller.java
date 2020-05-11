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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ImportImageRequest
 */
public class ImportImageRequestMarshaller implements
        Marshaller<Request<ImportImageRequest>, ImportImageRequest> {

    public Request<ImportImageRequest> marshall(ImportImageRequest importImageRequest) {
        if (importImageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ImportImageRequest)");
        }

        Request<ImportImageRequest> request = new DefaultRequest<ImportImageRequest>(
                importImageRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (importImageRequest.getArchitecture() != null) {
                String architecture = importImageRequest.getArchitecture();
                jsonWriter.name("Architecture");
                jsonWriter.value(architecture);
            }
            if (importImageRequest.getClientData() != null) {
                ClientData clientData = importImageRequest.getClientData();
                jsonWriter.name("ClientData");
                ClientDataJsonMarshaller.getInstance().marshall(clientData, jsonWriter);
            }
            if (importImageRequest.getClientToken() != null) {
                String clientToken = importImageRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (importImageRequest.getDescription() != null) {
                String description = importImageRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (importImageRequest.getDiskContainers() != null) {
                java.util.List<ImageDiskContainer> diskContainers = importImageRequest
                        .getDiskContainers();
                jsonWriter.name("DiskContainers");
                jsonWriter.beginArray();
                for (ImageDiskContainer diskContainersItem : diskContainers) {
                    if (diskContainersItem != null) {
                        ImageDiskContainerJsonMarshaller.getInstance().marshall(diskContainersItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (importImageRequest.getDryRun() != null) {
                Boolean dryRun = importImageRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (importImageRequest.getEncrypted() != null) {
                Boolean encrypted = importImageRequest.getEncrypted();
                jsonWriter.name("Encrypted");
                jsonWriter.value(encrypted);
            }
            if (importImageRequest.getHypervisor() != null) {
                String hypervisor = importImageRequest.getHypervisor();
                jsonWriter.name("Hypervisor");
                jsonWriter.value(hypervisor);
            }
            if (importImageRequest.getKmsKeyId() != null) {
                String kmsKeyId = importImageRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (importImageRequest.getLicenseType() != null) {
                String licenseType = importImageRequest.getLicenseType();
                jsonWriter.name("LicenseType");
                jsonWriter.value(licenseType);
            }
            if (importImageRequest.getPlatform() != null) {
                String platform = importImageRequest.getPlatform();
                jsonWriter.name("Platform");
                jsonWriter.value(platform);
            }
            if (importImageRequest.getRoleName() != null) {
                String roleName = importImageRequest.getRoleName();
                jsonWriter.name("RoleName");
                jsonWriter.value(roleName);
            }
            if (importImageRequest.getLicenseSpecifications() != null) {
                java.util.List<ImportImageLicenseConfigurationRequest> licenseSpecifications = importImageRequest
                        .getLicenseSpecifications();
                jsonWriter.name("LicenseSpecifications");
                jsonWriter.beginArray();
                for (ImportImageLicenseConfigurationRequest licenseSpecificationsItem : licenseSpecifications) {
                    if (licenseSpecificationsItem != null) {
                        ImportImageLicenseConfigurationRequestJsonMarshaller.getInstance()
                                .marshall(licenseSpecificationsItem, jsonWriter);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
