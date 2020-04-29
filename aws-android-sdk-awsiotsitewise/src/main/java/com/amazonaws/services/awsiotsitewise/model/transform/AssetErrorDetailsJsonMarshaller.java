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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetErrorDetails
 */
class AssetErrorDetailsJsonMarshaller {

    public void marshall(AssetErrorDetails assetErrorDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetErrorDetails.getAssetId() != null) {
            String assetId = assetErrorDetails.getAssetId();
            jsonWriter.name("assetId");
            jsonWriter.value(assetId);
        }
        if (assetErrorDetails.getCode() != null) {
            String code = assetErrorDetails.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (assetErrorDetails.getMessage() != null) {
            String message = assetErrorDetails.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static AssetErrorDetailsJsonMarshaller instance;

    public static AssetErrorDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetErrorDetailsJsonMarshaller();
        return instance;
    }
}
