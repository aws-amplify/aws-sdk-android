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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SpekeKeyProviderCmaf
 */
class SpekeKeyProviderCmafJsonMarshaller {

    public void marshall(SpekeKeyProviderCmaf spekeKeyProviderCmaf, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spekeKeyProviderCmaf.getCertificateArn() != null) {
            String certificateArn = spekeKeyProviderCmaf.getCertificateArn();
            jsonWriter.name("CertificateArn");
            jsonWriter.value(certificateArn);
        }
        if (spekeKeyProviderCmaf.getDashSignaledSystemIds() != null) {
            java.util.List<String> dashSignaledSystemIds = spekeKeyProviderCmaf
                    .getDashSignaledSystemIds();
            jsonWriter.name("DashSignaledSystemIds");
            jsonWriter.beginArray();
            for (String dashSignaledSystemIdsItem : dashSignaledSystemIds) {
                if (dashSignaledSystemIdsItem != null) {
                    jsonWriter.value(dashSignaledSystemIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (spekeKeyProviderCmaf.getHlsSignaledSystemIds() != null) {
            java.util.List<String> hlsSignaledSystemIds = spekeKeyProviderCmaf
                    .getHlsSignaledSystemIds();
            jsonWriter.name("HlsSignaledSystemIds");
            jsonWriter.beginArray();
            for (String hlsSignaledSystemIdsItem : hlsSignaledSystemIds) {
                if (hlsSignaledSystemIdsItem != null) {
                    jsonWriter.value(hlsSignaledSystemIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (spekeKeyProviderCmaf.getResourceId() != null) {
            String resourceId = spekeKeyProviderCmaf.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (spekeKeyProviderCmaf.getUrl() != null) {
            String url = spekeKeyProviderCmaf.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static SpekeKeyProviderCmafJsonMarshaller instance;

    public static SpekeKeyProviderCmafJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpekeKeyProviderCmafJsonMarshaller();
        return instance;
    }
}
