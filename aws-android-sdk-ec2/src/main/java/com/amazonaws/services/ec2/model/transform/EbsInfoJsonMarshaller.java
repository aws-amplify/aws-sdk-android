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
 * JSON marshaller for POJO EbsInfo
 */
class EbsInfoJsonMarshaller {

    public void marshall(EbsInfo ebsInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ebsInfo.getEbsOptimizedSupport() != null) {
            String ebsOptimizedSupport = ebsInfo.getEbsOptimizedSupport();
            jsonWriter.name("EbsOptimizedSupport");
            jsonWriter.value(ebsOptimizedSupport);
        }
        if (ebsInfo.getEncryptionSupport() != null) {
            String encryptionSupport = ebsInfo.getEncryptionSupport();
            jsonWriter.name("EncryptionSupport");
            jsonWriter.value(encryptionSupport);
        }
        if (ebsInfo.getEbsOptimizedInfo() != null) {
            EbsOptimizedInfo ebsOptimizedInfo = ebsInfo.getEbsOptimizedInfo();
            jsonWriter.name("EbsOptimizedInfo");
            EbsOptimizedInfoJsonMarshaller.getInstance().marshall(ebsOptimizedInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EbsInfoJsonMarshaller instance;

    public static EbsInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsInfoJsonMarshaller();
        return instance;
    }
}
