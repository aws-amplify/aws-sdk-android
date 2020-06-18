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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecentCaseCommunications
 */
class RecentCaseCommunicationsJsonMarshaller {

    public void marshall(RecentCaseCommunications recentCaseCommunications, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recentCaseCommunications.getCommunications() != null) {
            java.util.List<Communication> communications = recentCaseCommunications
                    .getCommunications();
            jsonWriter.name("communications");
            jsonWriter.beginArray();
            for (Communication communicationsItem : communications) {
                if (communicationsItem != null) {
                    CommunicationJsonMarshaller.getInstance().marshall(communicationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (recentCaseCommunications.getNextToken() != null) {
            String nextToken = recentCaseCommunications.getNextToken();
            jsonWriter.name("nextToken");
            jsonWriter.value(nextToken);
        }
        jsonWriter.endObject();
    }

    private static RecentCaseCommunicationsJsonMarshaller instance;

    public static RecentCaseCommunicationsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecentCaseCommunicationsJsonMarshaller();
        return instance;
    }
}
