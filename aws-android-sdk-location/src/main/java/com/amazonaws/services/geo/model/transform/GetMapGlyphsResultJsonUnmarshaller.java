/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetMapGlyphsResult
 */
public class GetMapGlyphsResultJsonUnmarshaller implements
        Unmarshaller<GetMapGlyphsResult, JsonUnmarshallerContext> {

    public GetMapGlyphsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMapGlyphsResult getMapGlyphsResult = new GetMapGlyphsResult();

        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            getMapGlyphsResult.setBlob(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils
                    .toByteArray(is)));
        }
        if (context.getHeader("Content-Type") != null)
            getMapGlyphsResult.setContentType(context.getHeader("Content-Type"));
        return getMapGlyphsResult;
    }

    private static GetMapGlyphsResultJsonUnmarshaller instance;

    public static GetMapGlyphsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMapGlyphsResultJsonUnmarshaller();
        return instance;
    }
}
