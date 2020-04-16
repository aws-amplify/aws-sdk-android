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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SpekeKeyProviderCmaf
 */
class SpekeKeyProviderCmafJsonUnmarshaller implements
        Unmarshaller<SpekeKeyProviderCmaf, JsonUnmarshallerContext> {

    public SpekeKeyProviderCmaf unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SpekeKeyProviderCmaf spekeKeyProviderCmaf = new SpekeKeyProviderCmaf();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CertificateArn")) {
                spekeKeyProviderCmaf.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashSignaledSystemIds")) {
                spekeKeyProviderCmaf.setDashSignaledSystemIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HlsSignaledSystemIds")) {
                spekeKeyProviderCmaf.setHlsSignaledSystemIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                spekeKeyProviderCmaf.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Url")) {
                spekeKeyProviderCmaf.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return spekeKeyProviderCmaf;
    }

    private static SpekeKeyProviderCmafJsonUnmarshaller instance;

    public static SpekeKeyProviderCmafJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpekeKeyProviderCmafJsonUnmarshaller();
        return instance;
    }
}
