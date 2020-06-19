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

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Image
 */
class ImageJsonMarshaller {

    public void marshall(Image image, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (image.getArchitecture() != null) {
            String architecture = image.getArchitecture();
            jsonWriter.name("Architecture");
            jsonWriter.value(architecture);
        }
        if (image.getCreationDate() != null) {
            String creationDate = image.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (image.getImageId() != null) {
            String imageId = image.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (image.getImageLocation() != null) {
            String imageLocation = image.getImageLocation();
            jsonWriter.name("ImageLocation");
            jsonWriter.value(imageLocation);
        }
        if (image.getImageType() != null) {
            String imageType = image.getImageType();
            jsonWriter.name("ImageType");
            jsonWriter.value(imageType);
        }
        if (image.getPublic() != null) {
            Boolean publicValue = image.getPublic();
            jsonWriter.name("Public");
            jsonWriter.value(publicValue);
        }
        if (image.getKernelId() != null) {
            String kernelId = image.getKernelId();
            jsonWriter.name("KernelId");
            jsonWriter.value(kernelId);
        }
        if (image.getOwnerId() != null) {
            String ownerId = image.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (image.getPlatform() != null) {
            String platform = image.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (image.getPlatformDetails() != null) {
            String platformDetails = image.getPlatformDetails();
            jsonWriter.name("PlatformDetails");
            jsonWriter.value(platformDetails);
        }
        if (image.getUsageOperation() != null) {
            String usageOperation = image.getUsageOperation();
            jsonWriter.name("UsageOperation");
            jsonWriter.value(usageOperation);
        }
        if (image.getProductCodes() != null) {
            java.util.List<ProductCode> productCodes = image.getProductCodes();
            jsonWriter.name("ProductCodes");
            jsonWriter.beginArray();
            for (ProductCode productCodesItem : productCodes) {
                if (productCodesItem != null) {
                    ProductCodeJsonMarshaller.getInstance().marshall(productCodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (image.getRamdiskId() != null) {
            String ramdiskId = image.getRamdiskId();
            jsonWriter.name("RamdiskId");
            jsonWriter.value(ramdiskId);
        }
        if (image.getState() != null) {
            String state = image.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (image.getBlockDeviceMappings() != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappings = image.getBlockDeviceMappings();
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
        if (image.getDescription() != null) {
            String description = image.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (image.getEnaSupport() != null) {
            Boolean enaSupport = image.getEnaSupport();
            jsonWriter.name("EnaSupport");
            jsonWriter.value(enaSupport);
        }
        if (image.getHypervisor() != null) {
            String hypervisor = image.getHypervisor();
            jsonWriter.name("Hypervisor");
            jsonWriter.value(hypervisor);
        }
        if (image.getImageOwnerAlias() != null) {
            String imageOwnerAlias = image.getImageOwnerAlias();
            jsonWriter.name("ImageOwnerAlias");
            jsonWriter.value(imageOwnerAlias);
        }
        if (image.getName() != null) {
            String name = image.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (image.getRootDeviceName() != null) {
            String rootDeviceName = image.getRootDeviceName();
            jsonWriter.name("RootDeviceName");
            jsonWriter.value(rootDeviceName);
        }
        if (image.getRootDeviceType() != null) {
            String rootDeviceType = image.getRootDeviceType();
            jsonWriter.name("RootDeviceType");
            jsonWriter.value(rootDeviceType);
        }
        if (image.getSriovNetSupport() != null) {
            String sriovNetSupport = image.getSriovNetSupport();
            jsonWriter.name("SriovNetSupport");
            jsonWriter.value(sriovNetSupport);
        }
        if (image.getStateReason() != null) {
            StateReason stateReason = image.getStateReason();
            jsonWriter.name("StateReason");
            StateReasonJsonMarshaller.getInstance().marshall(stateReason, jsonWriter);
        }
        if (image.getTags() != null) {
            java.util.List<Tag> tags = image.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (image.getVirtualizationType() != null) {
            String virtualizationType = image.getVirtualizationType();
            jsonWriter.name("VirtualizationType");
            jsonWriter.value(virtualizationType);
        }
        jsonWriter.endObject();
    }

    private static ImageJsonMarshaller instance;

    public static ImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonMarshaller();
        return instance;
    }
}
