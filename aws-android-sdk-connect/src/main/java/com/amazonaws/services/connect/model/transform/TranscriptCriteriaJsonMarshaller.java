/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TranscriptCriteria
 */
class TranscriptCriteriaJsonMarshaller {

    public void marshall(TranscriptCriteria transcriptCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transcriptCriteria.getParticipantRole() != null) {
            String participantRole = transcriptCriteria.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (transcriptCriteria.getSearchText() != null) {
            java.util.List<String> searchText = transcriptCriteria.getSearchText();
            jsonWriter.name("SearchText");
            jsonWriter.beginArray();
            for (String searchTextItem : searchText) {
                if (searchTextItem != null) {
                    jsonWriter.value(searchTextItem);
                }
            }
            jsonWriter.endArray();
        }
        if (transcriptCriteria.getMatchType() != null) {
            String matchType = transcriptCriteria.getMatchType();
            jsonWriter.name("MatchType");
            jsonWriter.value(matchType);
        }
        jsonWriter.endObject();
    }

    private static TranscriptCriteriaJsonMarshaller instance;

    public static TranscriptCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptCriteriaJsonMarshaller();
        return instance;
    }
}
