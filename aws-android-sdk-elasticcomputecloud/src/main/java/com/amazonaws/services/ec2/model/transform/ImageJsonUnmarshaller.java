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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Image
 */
class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {

    public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Image image = new Image();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Architecture")) {
                image.setArchitecture(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                image.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageId")) {
                image.setImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageLocation")) {
                image.setImageLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageType")) {
                image.setImageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Public")) {
                image.setPublic(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KernelId")) {
                image.setKernelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                image.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                image.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlatformDetails")) {
                image.setPlatformDetails(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UsageOperation")) {
                image.setUsageOperation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                image.setProductCodes(new ListUnmarshaller<ProductCode>(ProductCodeJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RamdiskId")) {
                image.setRamdiskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                image.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlockDeviceMappings")) {
                image.setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(
                        BlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Description")) {
                image.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnaSupport")) {
                image.setEnaSupport(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Hypervisor")) {
                image.setHypervisor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageOwnerAlias")) {
                image.setImageOwnerAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                image.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDeviceName")) {
                image.setRootDeviceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDeviceType")) {
                image.setRootDeviceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SriovNetSupport")) {
                image.setSriovNetSupport(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateReason")) {
                image.setStateReason(StateReasonJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                image.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VirtualizationType")) {
                image.setVirtualizationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return image;
    }

    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonUnmarshaller();
        return instance;
    }
}
