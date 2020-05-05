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
 * JSON marshaller for POJO FpgaImageAttribute
 */
class FpgaImageAttributeJsonMarshaller {

    public void marshall(FpgaImageAttribute fpgaImageAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fpgaImageAttribute.getFpgaImageId() != null) {
            String fpgaImageId = fpgaImageAttribute.getFpgaImageId();
            jsonWriter.name("FpgaImageId");
            jsonWriter.value(fpgaImageId);
        }
        if (fpgaImageAttribute.getName() != null) {
            String name = fpgaImageAttribute.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (fpgaImageAttribute.getDescription() != null) {
            String description = fpgaImageAttribute.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (fpgaImageAttribute.getLoadPermissions() != null) {
            java.util.List<LoadPermission> loadPermissions = fpgaImageAttribute
                    .getLoadPermissions();
            jsonWriter.name("LoadPermissions");
            jsonWriter.beginArray();
            for (LoadPermission loadPermissionsItem : loadPermissions) {
                if (loadPermissionsItem != null) {
                    LoadPermissionJsonMarshaller.getInstance().marshall(loadPermissionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fpgaImageAttribute.getProductCodes() != null) {
            java.util.List<ProductCode> productCodes = fpgaImageAttribute.getProductCodes();
            jsonWriter.name("ProductCodes");
            jsonWriter.beginArray();
            for (ProductCode productCodesItem : productCodes) {
                if (productCodesItem != null) {
                    ProductCodeJsonMarshaller.getInstance().marshall(productCodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FpgaImageAttributeJsonMarshaller instance;

    public static FpgaImageAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FpgaImageAttributeJsonMarshaller();
        return instance;
    }
}
