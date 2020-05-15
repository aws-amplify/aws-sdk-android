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
 * StAX unmarshaller for response DescribeTypeResult
 */
public class DescribeTypeResultStaxUnmarshaller implements
        Unmarshaller<DescribeTypeResult, StaxUnmarshallerContext> {

    public DescribeTypeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeTypeResult describeTypeResult = new DescribeTypeResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Arn", targetDepth)) {
                    describeTypeResult.setArn(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Type", targetDepth)) {
                    describeTypeResult.setType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("TypeName", targetDepth)) {
                    describeTypeResult.setTypeName(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("DefaultVersionId", targetDepth)) {
                    describeTypeResult.setDefaultVersionId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsDefaultVersion", targetDepth)) {
                    describeTypeResult.setIsDefaultVersion(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    describeTypeResult.setDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Schema", targetDepth)) {
                    describeTypeResult.setSchema(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ProvisioningType", targetDepth)) {
                    describeTypeResult.setProvisioningType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeprecatedStatus", targetDepth)) {
                    describeTypeResult.setDeprecatedStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoggingConfig", targetDepth)) {
                    describeTypeResult.setLoggingConfig(LoggingConfigStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    describeTypeResult.setExecutionRoleArn(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Visibility", targetDepth)) {
                    describeTypeResult.setVisibility(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    describeTypeResult.setSourceUrl(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DocumentationUrl", targetDepth)) {
                    describeTypeResult.setDocumentationUrl(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    describeTypeResult.setLastUpdated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("TimeCreated", targetDepth)) {
                    describeTypeResult.setTimeCreated(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return describeTypeResult;
    }

    private static DescribeTypeResultStaxUnmarshaller instance;

    public static DescribeTypeResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTypeResultStaxUnmarshaller();
        return instance;
    }
}
