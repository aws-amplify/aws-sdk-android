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
 * StAX unmarshaller for model EvaluationResult
 */
class EvaluationResultStaxUnmarshaller implements
        Unmarshaller<EvaluationResult, StaxUnmarshallerContext> {

    private static class EvalDecisionDetailsMapEntryUnmarshaller implements
            Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {
        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry = new MapEntry<String, String>();

            while (true) {
                int xmlEvent = context.nextEvent();
                if (xmlEvent == XmlPullParser.END_DOCUMENT)
                    return entry;

                if (xmlEvent == XmlPullParser.START_TAG) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent == XmlPullParser.END_TAG) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static EvalDecisionDetailsMapEntryUnmarshaller instance;

        public static EvalDecisionDetailsMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new EvalDecisionDetailsMapEntryUnmarshaller();
            return instance;
        }

    }

    public EvaluationResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        EvaluationResult evaluationResult = new EvaluationResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("EvalActionName", targetDepth)) {
                    evaluationResult.setEvalActionName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EvalResourceName", targetDepth)) {
                    evaluationResult.setEvalResourceName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("EvalDecision", targetDepth)) {
                    evaluationResult.setEvalDecision(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MatchedStatements/member", targetDepth)) {
                    evaluationResult.withMatchedStatements(StatementStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("MissingContextValues/member", targetDepth)) {
                    evaluationResult.withMissingContextValues(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("OrganizationsDecisionDetail", targetDepth)) {
                    evaluationResult
                            .setOrganizationsDecisionDetail(OrganizationsDecisionDetailStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PermissionsBoundaryDecisionDetail", targetDepth)) {
                    evaluationResult
                            .setPermissionsBoundaryDecisionDetail(PermissionsBoundaryDecisionDetailStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EvalDecisionDetails/entry", targetDepth)) {
                    Entry<String, String> entry = EvalDecisionDetailsMapEntryUnmarshaller
                            .getInstance().unmarshall(context);
                    evaluationResult.addEvalDecisionDetailsEntry(entry.getKey(), entry.getValue());
                    continue;
                }
                if (context.testExpression("ResourceSpecificResults/member", targetDepth)) {
                    evaluationResult
                            .withResourceSpecificResults(ResourceSpecificResultStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return evaluationResult;
    }

    private static EvaluationResultStaxUnmarshaller instance;

    public static EvaluationResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultStaxUnmarshaller();
        return instance;
    }
}
