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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateDomainNameserversResult
 */
public class UpdateDomainNameserversResultJsonUnmarshaller implements
        Unmarshaller<UpdateDomainNameserversResult, JsonUnmarshallerContext> {

    public UpdateDomainNameserversResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateDomainNameserversResult updateDomainNameserversResult = new UpdateDomainNameserversResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OperationId")) {
                updateDomainNameserversResult.setOperationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateDomainNameserversResult;
    }

    private static UpdateDomainNameserversResultJsonUnmarshaller instance;

    public static UpdateDomainNameserversResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDomainNameserversResultJsonUnmarshaller();
        return instance;
    }
}
