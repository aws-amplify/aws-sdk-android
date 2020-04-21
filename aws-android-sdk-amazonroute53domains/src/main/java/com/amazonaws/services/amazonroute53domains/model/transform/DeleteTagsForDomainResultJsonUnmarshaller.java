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
 * JSON unmarshaller for response DeleteTagsForDomainResult
 */
public class DeleteTagsForDomainResultJsonUnmarshaller implements
        Unmarshaller<DeleteTagsForDomainResult, JsonUnmarshallerContext> {

    public DeleteTagsForDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteTagsForDomainResult deleteTagsForDomainResult = new DeleteTagsForDomainResult();

        return deleteTagsForDomainResult;
    }

    private static DeleteTagsForDomainResultJsonUnmarshaller instance;

    public static DeleteTagsForDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteTagsForDomainResultJsonUnmarshaller();
        return instance;
    }
}
