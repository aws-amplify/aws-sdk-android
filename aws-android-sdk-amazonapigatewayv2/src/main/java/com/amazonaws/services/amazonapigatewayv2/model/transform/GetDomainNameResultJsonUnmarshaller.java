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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetDomainNameResult
 */
public class GetDomainNameResultJsonUnmarshaller implements
        Unmarshaller<GetDomainNameResult, JsonUnmarshallerContext> {

    public GetDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainNameResult getDomainNameResult = new GetDomainNameResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApiMappingSelectionExpression")) {
                getDomainNameResult.setApiMappingSelectionExpression(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                getDomainNameResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainNameConfigurations")) {
                getDomainNameResult
                        .setDomainNameConfigurations(new ListUnmarshaller<DomainNameConfiguration>(
                                DomainNameConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                getDomainNameResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDomainNameResult;
    }

    private static GetDomainNameResultJsonUnmarshaller instance;

    public static GetDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainNameResultJsonUnmarshaller();
        return instance;
    }
}
