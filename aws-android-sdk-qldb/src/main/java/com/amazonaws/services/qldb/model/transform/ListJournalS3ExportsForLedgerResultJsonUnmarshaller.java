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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListJournalS3ExportsForLedgerResult
 */
public class ListJournalS3ExportsForLedgerResultJsonUnmarshaller implements
        Unmarshaller<ListJournalS3ExportsForLedgerResult, JsonUnmarshallerContext> {

    public ListJournalS3ExportsForLedgerResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedgerResult = new ListJournalS3ExportsForLedgerResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JournalS3Exports")) {
                listJournalS3ExportsForLedgerResult
                        .setJournalS3Exports(new ListUnmarshaller<JournalS3ExportDescription>(
                                JournalS3ExportDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listJournalS3ExportsForLedgerResult.setNextToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listJournalS3ExportsForLedgerResult;
    }

    private static ListJournalS3ExportsForLedgerResultJsonUnmarshaller instance;

    public static ListJournalS3ExportsForLedgerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListJournalS3ExportsForLedgerResultJsonUnmarshaller();
        return instance;
    }
}
