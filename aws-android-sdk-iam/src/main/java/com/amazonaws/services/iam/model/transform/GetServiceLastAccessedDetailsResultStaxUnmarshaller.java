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
 * StAX unmarshaller for response GetServiceLastAccessedDetailsResult
 */
public class GetServiceLastAccessedDetailsResultStaxUnmarshaller implements
        Unmarshaller<GetServiceLastAccessedDetailsResult, StaxUnmarshallerContext> {

    public GetServiceLastAccessedDetailsResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        GetServiceLastAccessedDetailsResult getServiceLastAccessedDetailsResult = new GetServiceLastAccessedDetailsResult();

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
                    getServiceLastAccessedDetailsResult.setJobStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("JobType", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("JobCreationDate", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobCreationDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ServicesLastAccessed/member", targetDepth)) {
                    getServiceLastAccessedDetailsResult
                            .withServicesLastAccessed(ServiceLastAccessedStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("JobCompletionDate", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobCompletionDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setIsTruncated(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Marker", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setMarker(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Error", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setError(ErrorDetailsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getServiceLastAccessedDetailsResult;
    }

    private static GetServiceLastAccessedDetailsResultStaxUnmarshaller instance;

    public static GetServiceLastAccessedDetailsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceLastAccessedDetailsResultStaxUnmarshaller();
        return instance;
    }
}
