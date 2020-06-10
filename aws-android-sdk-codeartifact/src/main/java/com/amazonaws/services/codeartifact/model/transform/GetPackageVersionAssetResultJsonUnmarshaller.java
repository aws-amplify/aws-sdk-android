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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetPackageVersionAssetResult
 */
public class GetPackageVersionAssetResultJsonUnmarshaller implements
        Unmarshaller<GetPackageVersionAssetResult, JsonUnmarshallerContext> {

    public GetPackageVersionAssetResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetPackageVersionAssetResult getPackageVersionAssetResult = new GetPackageVersionAssetResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            byte[] bytes = com.amazonaws.util.IOUtils.toByteArray(is);
            java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            getPackageVersionAssetResult.setAsset(bis);
        }
        if (context.getHeader("X-AssetName") != null)
            getPackageVersionAssetResult.setAssetName(context.getHeader("X-AssetName"));
        if (context.getHeader("X-PackageVersion") != null)
            getPackageVersionAssetResult.setPackageVersion(context.getHeader("X-PackageVersion"));
        if (context.getHeader("X-PackageVersionRevision") != null)
            getPackageVersionAssetResult.setPackageVersionRevision(context
                    .getHeader("X-PackageVersionRevision"));
        return getPackageVersionAssetResult;
    }

    private static GetPackageVersionAssetResultJsonUnmarshaller instance;

    public static GetPackageVersionAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPackageVersionAssetResultJsonUnmarshaller();
        return instance;
    }
}
