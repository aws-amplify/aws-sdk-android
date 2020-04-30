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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCodeBindingSourceResult
 */
public class GetCodeBindingSourceResultJsonUnmarshaller implements
        Unmarshaller<GetCodeBindingSourceResult, JsonUnmarshallerContext> {

    public GetCodeBindingSourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCodeBindingSourceResult getCodeBindingSourceResult = new GetCodeBindingSourceResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getCodeBindingSourceResult.setBody(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        return getCodeBindingSourceResult;
    }

    private static GetCodeBindingSourceResultJsonUnmarshaller instance;

    public static GetCodeBindingSourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCodeBindingSourceResultJsonUnmarshaller();
        return instance;
    }
}
