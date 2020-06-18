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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CaseDetails
 */
class CaseDetailsJsonUnmarshaller implements Unmarshaller<CaseDetails, JsonUnmarshallerContext> {

    public CaseDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CaseDetails caseDetails = new CaseDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("caseId")) {
                caseDetails.setCaseId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("displayId")) {
                caseDetails.setDisplayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("subject")) {
                caseDetails.setSubject(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                caseDetails.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceCode")) {
                caseDetails.setServiceCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("categoryCode")) {
                caseDetails.setCategoryCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("severityCode")) {
                caseDetails.setSeverityCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("submittedBy")) {
                caseDetails.setSubmittedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timeCreated")) {
                caseDetails.setTimeCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("recentCommunications")) {
                caseDetails.setRecentCommunications(RecentCaseCommunicationsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ccEmailAddresses")) {
                caseDetails.setCcEmailAddresses(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("language")) {
                caseDetails.setLanguage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return caseDetails;
    }

    private static CaseDetailsJsonUnmarshaller instance;

    public static CaseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaseDetailsJsonUnmarshaller();
        return instance;
    }
}
