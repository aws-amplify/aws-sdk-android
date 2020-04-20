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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDetails
 */
class ResourceDetailsJsonMarshaller {

    public void marshall(ResourceDetails resourceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceDetails.getEC2ResourceDetails() != null) {
            EC2ResourceDetails eC2ResourceDetails = resourceDetails.getEC2ResourceDetails();
            jsonWriter.name("EC2ResourceDetails");
            EC2ResourceDetailsJsonMarshaller.getInstance().marshall(eC2ResourceDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourceDetailsJsonMarshaller instance;

    public static ResourceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailsJsonMarshaller();
        return instance;
    }
}
