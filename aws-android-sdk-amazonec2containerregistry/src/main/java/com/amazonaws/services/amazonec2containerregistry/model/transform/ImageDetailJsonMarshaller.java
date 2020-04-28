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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageDetail
 */
class ImageDetailJsonMarshaller {

    public void marshall(ImageDetail imageDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (imageDetail.getRegistryId() != null) {
            String registryId = imageDetail.getRegistryId();
            jsonWriter.name("registryId");
            jsonWriter.value(registryId);
        }
        if (imageDetail.getRepositoryName() != null) {
            String repositoryName = imageDetail.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (imageDetail.getImageDigest() != null) {
            String imageDigest = imageDetail.getImageDigest();
            jsonWriter.name("imageDigest");
            jsonWriter.value(imageDigest);
        }
        if (imageDetail.getImageTags() != null) {
            java.util.List<String> imageTags = imageDetail.getImageTags();
            jsonWriter.name("imageTags");
            jsonWriter.beginArray();
            for (String imageTagsItem : imageTags) {
                if (imageTagsItem != null) {
                    jsonWriter.value(imageTagsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (imageDetail.getImageSizeInBytes() != null) {
            Long imageSizeInBytes = imageDetail.getImageSizeInBytes();
            jsonWriter.name("imageSizeInBytes");
            jsonWriter.value(imageSizeInBytes);
        }
        if (imageDetail.getImagePushedAt() != null) {
            java.util.Date imagePushedAt = imageDetail.getImagePushedAt();
            jsonWriter.name("imagePushedAt");
            jsonWriter.value(imagePushedAt);
        }
        if (imageDetail.getImageScanStatus() != null) {
            ImageScanStatus imageScanStatus = imageDetail.getImageScanStatus();
            jsonWriter.name("imageScanStatus");
            ImageScanStatusJsonMarshaller.getInstance().marshall(imageScanStatus, jsonWriter);
        }
        if (imageDetail.getImageScanFindingsSummary() != null) {
            ImageScanFindingsSummary imageScanFindingsSummary = imageDetail
                    .getImageScanFindingsSummary();
            jsonWriter.name("imageScanFindingsSummary");
            ImageScanFindingsSummaryJsonMarshaller.getInstance().marshall(imageScanFindingsSummary,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ImageDetailJsonMarshaller instance;

    public static ImageDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageDetailJsonMarshaller();
        return instance;
    }
}
