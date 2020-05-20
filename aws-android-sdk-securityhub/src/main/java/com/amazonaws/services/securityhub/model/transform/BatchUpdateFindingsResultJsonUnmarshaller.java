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

package com.amazonaws.services.securityhub.model.transform;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchUpdateFindingsResult
 */
public class BatchUpdateFindingsResultJsonUnmarshaller implements
        Unmarshaller<BatchUpdateFindingsResult, JsonUnmarshallerContext> {

    public BatchUpdateFindingsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchUpdateFindingsResult batchUpdateFindingsResult = new BatchUpdateFindingsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProcessedFindings")) {
                batchUpdateFindingsResult
                        .setProcessedFindings(new ListUnmarshaller<AwsSecurityFindingIdentifier>(
                                AwsSecurityFindingIdentifierJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UnprocessedFindings")) {
                batchUpdateFindingsResult
                        .setUnprocessedFindings(new ListUnmarshaller<BatchUpdateFindingsUnprocessedFinding>(
                                BatchUpdateFindingsUnprocessedFindingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchUpdateFindingsResult;
    }

    private static BatchUpdateFindingsResultJsonUnmarshaller instance;

    public static BatchUpdateFindingsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateFindingsResultJsonUnmarshaller();
        return instance;
    }
}
