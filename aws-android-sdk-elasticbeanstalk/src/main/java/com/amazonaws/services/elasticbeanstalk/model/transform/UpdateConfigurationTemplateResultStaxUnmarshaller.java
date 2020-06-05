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
 * StAX unmarshaller for response UpdateConfigurationTemplateResult
 */
public class UpdateConfigurationTemplateResultStaxUnmarshaller implements
        Unmarshaller<UpdateConfigurationTemplateResult, StaxUnmarshallerContext> {

    public UpdateConfigurationTemplateResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        UpdateConfigurationTemplateResult updateConfigurationTemplateResult = new UpdateConfigurationTemplateResult();

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
                    updateConfigurationTemplateResult.setSolutionStackName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    updateConfigurationTemplateResult.setPlatformArn(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ApplicationName", targetDepth)) {
                    updateConfigurationTemplateResult.setApplicationName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    updateConfigurationTemplateResult.setTemplateName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    updateConfigurationTemplateResult.setDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnvironmentName", targetDepth)) {
                    updateConfigurationTemplateResult.setEnvironmentName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DeploymentStatus", targetDepth)) {
                    updateConfigurationTemplateResult.setDeploymentStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    updateConfigurationTemplateResult.setDateCreated(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    updateConfigurationTemplateResult.setDateUpdated(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OptionSettings/member", targetDepth)) {
                    updateConfigurationTemplateResult
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
        return updateConfigurationTemplateResult;
    }

    private static UpdateConfigurationTemplateResultStaxUnmarshaller instance;

    public static UpdateConfigurationTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateConfigurationTemplateResultStaxUnmarshaller();
        return instance;
    }
}
