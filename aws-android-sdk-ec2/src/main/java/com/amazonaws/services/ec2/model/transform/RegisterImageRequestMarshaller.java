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
 * JSON request marshaller for RegisterImageRequest
 */
public class RegisterImageRequestMarshaller implements
        Marshaller<Request<RegisterImageRequest>, RegisterImageRequest> {

    public Request<RegisterImageRequest> marshall(RegisterImageRequest registerImageRequest) {
        if (registerImageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterImageRequest)");
        }

        Request<RegisterImageRequest> request = new DefaultRequest<RegisterImageRequest>(
                registerImageRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (registerImageRequest.getImageLocation() != null) {
                String imageLocation = registerImageRequest.getImageLocation();
                jsonWriter.name("ImageLocation");
                jsonWriter.value(imageLocation);
            }
            if (registerImageRequest.getArchitecture() != null) {
                String architecture = registerImageRequest.getArchitecture();
                jsonWriter.name("Architecture");
                jsonWriter.value(architecture);
            }
            if (registerImageRequest.getBlockDeviceMappings() != null) {
                java.util.List<BlockDeviceMapping> blockDeviceMappings = registerImageRequest
                        .getBlockDeviceMappings();
                jsonWriter.name("BlockDeviceMappings");
                jsonWriter.beginArray();
                for (BlockDeviceMapping blockDeviceMappingsItem : blockDeviceMappings) {
                    if (blockDeviceMappingsItem != null) {
                        BlockDeviceMappingJsonMarshaller.getInstance().marshall(
                                blockDeviceMappingsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerImageRequest.getDescription() != null) {
                String description = registerImageRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (registerImageRequest.getDryRun() != null) {
                Boolean dryRun = registerImageRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (registerImageRequest.getEnaSupport() != null) {
                Boolean enaSupport = registerImageRequest.getEnaSupport();
                jsonWriter.name("EnaSupport");
                jsonWriter.value(enaSupport);
            }
            if (registerImageRequest.getKernelId() != null) {
                String kernelId = registerImageRequest.getKernelId();
                jsonWriter.name("KernelId");
                jsonWriter.value(kernelId);
            }
            if (registerImageRequest.getName() != null) {
                String name = registerImageRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (registerImageRequest.getBillingProducts() != null) {
                java.util.List<String> billingProducts = registerImageRequest.getBillingProducts();
                jsonWriter.name("BillingProducts");
                jsonWriter.beginArray();
                for (String billingProductsItem : billingProducts) {
                    if (billingProductsItem != null) {
                        jsonWriter.value(billingProductsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (registerImageRequest.getRamdiskId() != null) {
                String ramdiskId = registerImageRequest.getRamdiskId();
                jsonWriter.name("RamdiskId");
                jsonWriter.value(ramdiskId);
            }
            if (registerImageRequest.getRootDeviceName() != null) {
                String rootDeviceName = registerImageRequest.getRootDeviceName();
                jsonWriter.name("RootDeviceName");
                jsonWriter.value(rootDeviceName);
            }
            if (registerImageRequest.getSriovNetSupport() != null) {
                String sriovNetSupport = registerImageRequest.getSriovNetSupport();
                jsonWriter.name("SriovNetSupport");
                jsonWriter.value(sriovNetSupport);
            }
            if (registerImageRequest.getVirtualizationType() != null) {
                String virtualizationType = registerImageRequest.getVirtualizationType();
                jsonWriter.name("VirtualizationType");
                jsonWriter.value(virtualizationType);
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
