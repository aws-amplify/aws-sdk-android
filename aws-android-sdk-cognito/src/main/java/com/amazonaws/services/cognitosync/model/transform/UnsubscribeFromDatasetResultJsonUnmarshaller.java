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

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UnsubscribeFromDatasetResult
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class UnsubscribeFromDatasetResultJsonUnmarshaller implements
        Unmarshaller<UnsubscribeFromDatasetResult, JsonUnmarshallerContext> {

    public UnsubscribeFromDatasetResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UnsubscribeFromDatasetResult unsubscribeFromDatasetResult = new UnsubscribeFromDatasetResult();

        return unsubscribeFromDatasetResult;
    }

    private static UnsubscribeFromDatasetResultJsonUnmarshaller instance;

    public static UnsubscribeFromDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UnsubscribeFromDatasetResultJsonUnmarshaller();
        return instance;
    }
}
