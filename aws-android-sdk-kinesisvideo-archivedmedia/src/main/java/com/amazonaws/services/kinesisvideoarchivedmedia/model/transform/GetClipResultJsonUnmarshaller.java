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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetClipResult
 */
public class GetClipResultJsonUnmarshaller implements
        Unmarshaller<GetClipResult, JsonUnmarshallerContext> {

    public GetClipResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetClipResult getClipResult = new GetClipResult();

        if (context.getHeader("Content-Type") != null)
            getClipResult.setContentType(context.getHeader("Content-Type"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            byte[] bytes = com.amazonaws.util.IOUtils.toByteArray(is);
            java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            getClipResult.setPayload(bis);
        }
        return getClipResult;
    }

    private static GetClipResultJsonUnmarshaller instance;

    public static GetClipResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetClipResultJsonUnmarshaller();
        return instance;
    }
}
