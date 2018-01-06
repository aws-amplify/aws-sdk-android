/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetThingShadowResult
 */
public class GetThingShadowResultJsonUnmarshaller implements
        Unmarshaller<GetThingShadowResult, JsonUnmarshallerContext> {

    public GetThingShadowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetThingShadowResult getThingShadowResult = new GetThingShadowResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getThingShadowResult.setPayload(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        return getThingShadowResult;
    }

    private static GetThingShadowResultJsonUnmarshaller instance;

    public static GetThingShadowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetThingShadowResultJsonUnmarshaller();
        return instance;
    }
}
