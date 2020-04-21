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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceDetails
 */
class InstanceDetailsJsonMarshaller {

    public void marshall(InstanceDetails instanceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceDetails.getAvailabilityZone() != null) {
            String availabilityZone = instanceDetails.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (instanceDetails.getIamInstanceProfile() != null) {
            IamInstanceProfile iamInstanceProfile = instanceDetails.getIamInstanceProfile();
            jsonWriter.name("IamInstanceProfile");
            IamInstanceProfileJsonMarshaller.getInstance().marshall(iamInstanceProfile, jsonWriter);
        }
        if (instanceDetails.getImageDescription() != null) {
            String imageDescription = instanceDetails.getImageDescription();
            jsonWriter.name("ImageDescription");
            jsonWriter.value(imageDescription);
        }
        if (instanceDetails.getImageId() != null) {
            String imageId = instanceDetails.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (instanceDetails.getInstanceId() != null) {
            String instanceId = instanceDetails.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceDetails.getInstanceState() != null) {
            String instanceState = instanceDetails.getInstanceState();
            jsonWriter.name("InstanceState");
            jsonWriter.value(instanceState);
        }
        if (instanceDetails.getInstanceType() != null) {
            String instanceType = instanceDetails.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceDetails.getOutpostArn() != null) {
            String outpostArn = instanceDetails.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (instanceDetails.getLaunchTime() != null) {
            String launchTime = instanceDetails.getLaunchTime();
            jsonWriter.name("LaunchTime");
            jsonWriter.value(launchTime);
        }
        if (instanceDetails.getNetworkInterfaces() != null) {
            java.util.List<NetworkInterface> networkInterfaces = instanceDetails
                    .getNetworkInterfaces();
            jsonWriter.name("NetworkInterfaces");
            jsonWriter.beginArray();
            for (NetworkInterface networkInterfacesItem : networkInterfaces) {
                if (networkInterfacesItem != null) {
                    NetworkInterfaceJsonMarshaller.getInstance().marshall(networkInterfacesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceDetails.getPlatform() != null) {
            String platform = instanceDetails.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (instanceDetails.getProductCodes() != null) {
            java.util.List<ProductCode> productCodes = instanceDetails.getProductCodes();
            jsonWriter.name("ProductCodes");
            jsonWriter.beginArray();
            for (ProductCode productCodesItem : productCodes) {
                if (productCodesItem != null) {
                    ProductCodeJsonMarshaller.getInstance().marshall(productCodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceDetails.getTags() != null) {
            java.util.List<Tag> tags = instanceDetails.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceDetailsJsonMarshaller instance;

    public static InstanceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceDetailsJsonMarshaller();
        return instance;
    }
}
