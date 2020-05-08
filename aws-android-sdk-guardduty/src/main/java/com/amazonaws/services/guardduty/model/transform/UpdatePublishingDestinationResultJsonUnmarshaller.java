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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdatePublishingDestinationResult
 */
public class UpdatePublishingDestinationResultJsonUnmarshaller implements
        Unmarshaller<UpdatePublishingDestinationResult, JsonUnmarshallerContext> {

    public UpdatePublishingDestinationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdatePublishingDestinationResult updatePublishingDestinationResult = new UpdatePublishingDestinationResult();

        return updatePublishingDestinationResult;
    }

    private static UpdatePublishingDestinationResultJsonUnmarshaller instance;

    public static UpdatePublishingDestinationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePublishingDestinationResultJsonUnmarshaller();
        return instance;
    }
}
