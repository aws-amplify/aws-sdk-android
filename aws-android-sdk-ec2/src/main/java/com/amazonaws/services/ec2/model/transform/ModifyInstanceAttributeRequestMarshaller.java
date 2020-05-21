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
 * JSON request marshaller for ModifyInstanceAttributeRequest
 */
public class ModifyInstanceAttributeRequestMarshaller implements
        Marshaller<Request<ModifyInstanceAttributeRequest>, ModifyInstanceAttributeRequest> {

    public Request<ModifyInstanceAttributeRequest> marshall(
            ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {
        if (modifyInstanceAttributeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyInstanceAttributeRequest)");
        }

        Request<ModifyInstanceAttributeRequest> request = new DefaultRequest<ModifyInstanceAttributeRequest>(
                modifyInstanceAttributeRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (modifyInstanceAttributeRequest.getSourceDestCheck() != null) {
                AttributeBooleanValue sourceDestCheck = modifyInstanceAttributeRequest
                        .getSourceDestCheck();
                jsonWriter.name("SourceDestCheck");
                AttributeBooleanValueJsonMarshaller.getInstance().marshall(sourceDestCheck,
                        jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getAttribute() != null) {
                String attribute = modifyInstanceAttributeRequest.getAttribute();
                jsonWriter.name("Attribute");
                jsonWriter.value(attribute);
            }
            if (modifyInstanceAttributeRequest.getBlockDeviceMappings() != null) {
                java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings = modifyInstanceAttributeRequest
                        .getBlockDeviceMappings();
                jsonWriter.name("BlockDeviceMappings");
                jsonWriter.beginArray();
                for (InstanceBlockDeviceMappingSpecification blockDeviceMappingsItem : blockDeviceMappings) {
                    if (blockDeviceMappingsItem != null) {
                        InstanceBlockDeviceMappingSpecificationJsonMarshaller.getInstance()
                                .marshall(blockDeviceMappingsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyInstanceAttributeRequest.getDisableApiTermination() != null) {
                AttributeBooleanValue disableApiTermination = modifyInstanceAttributeRequest
                        .getDisableApiTermination();
                jsonWriter.name("DisableApiTermination");
                AttributeBooleanValueJsonMarshaller.getInstance().marshall(disableApiTermination,
                        jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getDryRun() != null) {
                Boolean dryRun = modifyInstanceAttributeRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (modifyInstanceAttributeRequest.getEbsOptimized() != null) {
                AttributeBooleanValue ebsOptimized = modifyInstanceAttributeRequest
                        .getEbsOptimized();
                jsonWriter.name("EbsOptimized");
                AttributeBooleanValueJsonMarshaller.getInstance()
                        .marshall(ebsOptimized, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getEnaSupport() != null) {
                AttributeBooleanValue enaSupport = modifyInstanceAttributeRequest.getEnaSupport();
                jsonWriter.name("EnaSupport");
                AttributeBooleanValueJsonMarshaller.getInstance().marshall(enaSupport, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getGroups() != null) {
                java.util.List<String> groups = modifyInstanceAttributeRequest.getGroups();
                jsonWriter.name("Groups");
                jsonWriter.beginArray();
                for (String groupsItem : groups) {
                    if (groupsItem != null) {
                        jsonWriter.value(groupsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (modifyInstanceAttributeRequest.getInstanceId() != null) {
                String instanceId = modifyInstanceAttributeRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (modifyInstanceAttributeRequest.getInstanceInitiatedShutdownBehavior() != null) {
                AttributeValue instanceInitiatedShutdownBehavior = modifyInstanceAttributeRequest
                        .getInstanceInitiatedShutdownBehavior();
                jsonWriter.name("InstanceInitiatedShutdownBehavior");
                AttributeValueJsonMarshaller.getInstance().marshall(
                        instanceInitiatedShutdownBehavior, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getInstanceType() != null) {
                AttributeValue instanceType = modifyInstanceAttributeRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                AttributeValueJsonMarshaller.getInstance().marshall(instanceType, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getKernel() != null) {
                AttributeValue kernel = modifyInstanceAttributeRequest.getKernel();
                jsonWriter.name("Kernel");
                AttributeValueJsonMarshaller.getInstance().marshall(kernel, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getRamdisk() != null) {
                AttributeValue ramdisk = modifyInstanceAttributeRequest.getRamdisk();
                jsonWriter.name("Ramdisk");
                AttributeValueJsonMarshaller.getInstance().marshall(ramdisk, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getSriovNetSupport() != null) {
                AttributeValue sriovNetSupport = modifyInstanceAttributeRequest
                        .getSriovNetSupport();
                jsonWriter.name("SriovNetSupport");
                AttributeValueJsonMarshaller.getInstance().marshall(sriovNetSupport, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getUserData() != null) {
                BlobAttributeValue userData = modifyInstanceAttributeRequest.getUserData();
                jsonWriter.name("UserData");
                BlobAttributeValueJsonMarshaller.getInstance().marshall(userData, jsonWriter);
            }
            if (modifyInstanceAttributeRequest.getValue() != null) {
                String value = modifyInstanceAttributeRequest.getValue();
                jsonWriter.name("Value");
                jsonWriter.value(value);
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
