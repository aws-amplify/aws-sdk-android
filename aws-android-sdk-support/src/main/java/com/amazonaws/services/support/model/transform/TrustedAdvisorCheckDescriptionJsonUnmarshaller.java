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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrustedAdvisorCheckDescription
 */
class TrustedAdvisorCheckDescriptionJsonUnmarshaller implements
        Unmarshaller<TrustedAdvisorCheckDescription, JsonUnmarshallerContext> {

    public TrustedAdvisorCheckDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrustedAdvisorCheckDescription trustedAdvisorCheckDescription = new TrustedAdvisorCheckDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                trustedAdvisorCheckDescription.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                trustedAdvisorCheckDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                trustedAdvisorCheckDescription.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("category")) {
                trustedAdvisorCheckDescription.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("metadata")) {
                trustedAdvisorCheckDescription.setMetadata(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trustedAdvisorCheckDescription;
    }

    private static TrustedAdvisorCheckDescriptionJsonUnmarshaller instance;

    public static TrustedAdvisorCheckDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCheckDescriptionJsonUnmarshaller();
        return instance;
    }
}
