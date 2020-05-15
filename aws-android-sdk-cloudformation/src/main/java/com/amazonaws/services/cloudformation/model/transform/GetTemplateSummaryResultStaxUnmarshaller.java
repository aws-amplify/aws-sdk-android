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

package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response GetTemplateSummaryResult
 */
public class GetTemplateSummaryResultStaxUnmarshaller implements
        Unmarshaller<GetTemplateSummaryResult, StaxUnmarshallerContext> {

    public GetTemplateSummaryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetTemplateSummaryResult getTemplateSummaryResult = new GetTemplateSummaryResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Parameters/member", targetDepth)) {
                    getTemplateSummaryResult.withParameters(ParameterDeclarationStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    getTemplateSummaryResult.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Capabilities/member", targetDepth)) {
                    getTemplateSummaryResult.withCapabilities(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("CapabilitiesReason", targetDepth)) {
                    getTemplateSummaryResult.setCapabilitiesReason(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceTypes/member", targetDepth)) {
                    getTemplateSummaryResult.withResourceTypes(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Version", targetDepth)) {
                    getTemplateSummaryResult.setVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    getTemplateSummaryResult.setMetadata(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeclaredTransforms/member", targetDepth)) {
                    getTemplateSummaryResult.withDeclaredTransforms(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceIdentifierSummaries/member", targetDepth)) {
                    getTemplateSummaryResult
                            .withResourceIdentifierSummaries(ResourceIdentifierSummaryStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getTemplateSummaryResult;
    }

    private static GetTemplateSummaryResultStaxUnmarshaller instance;

    public static GetTemplateSummaryResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTemplateSummaryResultStaxUnmarshaller();
        return instance;
    }
}
