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
 * JSON marshaller for POJO FpgaImage
 */
class FpgaImageJsonMarshaller {

    public void marshall(FpgaImage fpgaImage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fpgaImage.getFpgaImageId() != null) {
            String fpgaImageId = fpgaImage.getFpgaImageId();
            jsonWriter.name("FpgaImageId");
            jsonWriter.value(fpgaImageId);
        }
        if (fpgaImage.getFpgaImageGlobalId() != null) {
            String fpgaImageGlobalId = fpgaImage.getFpgaImageGlobalId();
            jsonWriter.name("FpgaImageGlobalId");
            jsonWriter.value(fpgaImageGlobalId);
        }
        if (fpgaImage.getName() != null) {
            String name = fpgaImage.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (fpgaImage.getDescription() != null) {
            String description = fpgaImage.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (fpgaImage.getShellVersion() != null) {
            String shellVersion = fpgaImage.getShellVersion();
            jsonWriter.name("ShellVersion");
            jsonWriter.value(shellVersion);
        }
        if (fpgaImage.getPciId() != null) {
            PciId pciId = fpgaImage.getPciId();
            jsonWriter.name("PciId");
            PciIdJsonMarshaller.getInstance().marshall(pciId, jsonWriter);
        }
        if (fpgaImage.getState() != null) {
            FpgaImageState state = fpgaImage.getState();
            jsonWriter.name("State");
            FpgaImageStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (fpgaImage.getCreateTime() != null) {
            java.util.Date createTime = fpgaImage.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (fpgaImage.getUpdateTime() != null) {
            java.util.Date updateTime = fpgaImage.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(updateTime);
        }
        if (fpgaImage.getOwnerId() != null) {
            String ownerId = fpgaImage.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (fpgaImage.getOwnerAlias() != null) {
            String ownerAlias = fpgaImage.getOwnerAlias();
            jsonWriter.name("OwnerAlias");
            jsonWriter.value(ownerAlias);
        }
        if (fpgaImage.getProductCodes() != null) {
            java.util.List<ProductCode> productCodes = fpgaImage.getProductCodes();
            jsonWriter.name("ProductCodes");
            jsonWriter.beginArray();
            for (ProductCode productCodesItem : productCodes) {
                if (productCodesItem != null) {
                    ProductCodeJsonMarshaller.getInstance().marshall(productCodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fpgaImage.getTags() != null) {
            java.util.List<Tag> tags = fpgaImage.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fpgaImage.getPublic() != null) {
            Boolean publicValue = fpgaImage.getPublic();
            jsonWriter.name("Public");
            jsonWriter.value(publicValue);
        }
        if (fpgaImage.getDataRetentionSupport() != null) {
            Boolean dataRetentionSupport = fpgaImage.getDataRetentionSupport();
            jsonWriter.name("DataRetentionSupport");
            jsonWriter.value(dataRetentionSupport);
        }
        jsonWriter.endObject();
    }

    private static FpgaImageJsonMarshaller instance;

    public static FpgaImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FpgaImageJsonMarshaller();
        return instance;
    }
}
