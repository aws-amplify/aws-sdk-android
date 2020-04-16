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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Ec2AmiResource
 */
class Ec2AmiResourceJsonMarshaller {

    public void marshall(Ec2AmiResource ec2AmiResource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ec2AmiResource.getAmiId() != null) {
            String amiId = ec2AmiResource.getAmiId();
            jsonWriter.name("AmiId");
            jsonWriter.value(amiId);
        }
        if (ec2AmiResource.getSnowballAmiId() != null) {
            String snowballAmiId = ec2AmiResource.getSnowballAmiId();
            jsonWriter.name("SnowballAmiId");
            jsonWriter.value(snowballAmiId);
        }
        jsonWriter.endObject();
    }

    private static Ec2AmiResourceJsonMarshaller instance;

    public static Ec2AmiResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ec2AmiResourceJsonMarshaller();
        return instance;
    }
}
