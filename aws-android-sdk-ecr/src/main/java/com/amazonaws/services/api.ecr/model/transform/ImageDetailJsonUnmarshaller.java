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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImageDetail
 */
class ImageDetailJsonUnmarshaller implements Unmarshaller<ImageDetail, JsonUnmarshallerContext> {

    public ImageDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageDetail imageDetail = new ImageDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("registryId")) {
                imageDetail.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                imageDetail.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageDigest")) {
                imageDetail.setImageDigest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageTags")) {
                imageDetail.setImageTags(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("imageSizeInBytes")) {
                imageDetail.setImageSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imagePushedAt")) {
                imageDetail.setImagePushedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanStatus")) {
                imageDetail.setImageScanStatus(ImageScanStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanFindingsSummary")) {
                imageDetail.setImageScanFindingsSummary(ImageScanFindingsSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageDetail;
    }

    private static ImageDetailJsonUnmarshaller instance;

    public static ImageDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageDetailJsonUnmarshaller();
        return instance;
    }
}
