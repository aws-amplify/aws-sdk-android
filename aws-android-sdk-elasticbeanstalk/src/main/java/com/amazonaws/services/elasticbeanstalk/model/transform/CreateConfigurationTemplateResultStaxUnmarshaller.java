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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for response CreateConfigurationTemplateResult
 */
public class CreateConfigurationTemplateResultStaxUnmarshaller implements
        Unmarshaller<CreateConfigurationTemplateResult, StaxUnmarshallerContext> {

    public CreateConfigurationTemplateResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        CreateConfigurationTemplateResult createConfigurationTemplateResult = new CreateConfigurationTemplateResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("SolutionStackName", targetDepth)) {
                    createConfigurationTemplateResult.setSolutionStackName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    createConfigurationTemplateResult.setPlatformArn(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ApplicationName", targetDepth)) {
                    createConfigurationTemplateResult.setApplicationName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    createConfigurationTemplateResult.setTemplateName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    createConfigurationTemplateResult.setDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentName", targetDepth)) {
                    createConfigurationTemplateResult.setEnvironmentName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeploymentStatus", targetDepth)) {
                    createConfigurationTemplateResult.setDeploymentStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    createConfigurationTemplateResult.setDateCreated(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    createConfigurationTemplateResult.setDateUpdated(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OptionSettings/member", targetDepth)) {
                    createConfigurationTemplateResult
                            .withOptionSettings(ConfigurationOptionSettingStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return createConfigurationTemplateResult;
    }

    private static CreateConfigurationTemplateResultStaxUnmarshaller instance;

    public static CreateConfigurationTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateConfigurationTemplateResultStaxUnmarshaller();
        return instance;
    }
}
