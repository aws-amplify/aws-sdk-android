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

package com.amazonaws.services.iam.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response GetOrganizationsAccessReportResult
 */
public class GetOrganizationsAccessReportResultStaxUnmarshaller implements
        Unmarshaller<GetOrganizationsAccessReportResult, StaxUnmarshallerContext> {

    public GetOrganizationsAccessReportResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        GetOrganizationsAccessReportResult getOrganizationsAccessReportResult = new GetOrganizationsAccessReportResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("JobStatus", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("JobCreationDate", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobCreationDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("JobCompletionDate", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobCompletionDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumberOfServicesAccessible", targetDepth)) {
                    getOrganizationsAccessReportResult
                            .setNumberOfServicesAccessible(IntegerStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumberOfServicesNotAccessed", targetDepth)) {
                    getOrganizationsAccessReportResult
                            .setNumberOfServicesNotAccessed(IntegerStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AccessDetails/member", targetDepth)) {
                    getOrganizationsAccessReportResult
                            .withAccessDetails(AccessDetailStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    getOrganizationsAccessReportResult.setIsTruncated(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Marker", targetDepth)) {
                    getOrganizationsAccessReportResult.setMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ErrorDetails", targetDepth)) {
                    getOrganizationsAccessReportResult.setErrorDetails(ErrorDetailsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getOrganizationsAccessReportResult;
    }

    private static GetOrganizationsAccessReportResultStaxUnmarshaller instance;

    public static GetOrganizationsAccessReportResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOrganizationsAccessReportResultStaxUnmarshaller();
        return instance;
    }
}
