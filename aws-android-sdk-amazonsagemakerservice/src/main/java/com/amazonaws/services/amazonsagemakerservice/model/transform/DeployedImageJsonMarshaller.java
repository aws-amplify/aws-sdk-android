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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeployedImage
 */
class DeployedImageJsonMarshaller {

    public void marshall(DeployedImage deployedImage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deployedImage.getSpecifiedImage() != null) {
            String specifiedImage = deployedImage.getSpecifiedImage();
            jsonWriter.name("SpecifiedImage");
            jsonWriter.value(specifiedImage);
        }
        if (deployedImage.getResolvedImage() != null) {
            String resolvedImage = deployedImage.getResolvedImage();
            jsonWriter.name("ResolvedImage");
            jsonWriter.value(resolvedImage);
        }
        if (deployedImage.getResolutionTime() != null) {
            java.util.Date resolutionTime = deployedImage.getResolutionTime();
            jsonWriter.name("ResolutionTime");
            jsonWriter.value(resolutionTime);
        }
        jsonWriter.endObject();
    }

    private static DeployedImageJsonMarshaller instance;

    public static DeployedImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeployedImageJsonMarshaller();
        return instance;
    }
}
