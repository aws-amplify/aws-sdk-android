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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DBEngineVersion
 */
class DBEngineVersionStaxUnmarshaller implements
        Unmarshaller<DBEngineVersion, StaxUnmarshallerContext> {

    public DBEngineVersion unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBEngineVersion dBEngineVersion = new DBEngineVersion();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Engine", targetDepth)) {
                    dBEngineVersion.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBEngineVersion.setEngineVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    dBEngineVersion.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBEngineDescription", targetDepth)) {
                    dBEngineVersion.setDBEngineDescription(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBEngineVersionDescription", targetDepth)) {
                    dBEngineVersion.setDBEngineVersionDescription(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultCharacterSet", targetDepth)) {
                    dBEngineVersion.setDefaultCharacterSet(CharacterSetStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedCharacterSets", targetDepth)) {
                    dBEngineVersion.withSupportedCharacterSets(CharacterSetStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ValidUpgradeTarget", targetDepth)) {
                    dBEngineVersion.withValidUpgradeTarget(UpgradeTargetStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedTimezones", targetDepth)) {
                    dBEngineVersion.withSupportedTimezones(TimezoneStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ExportableLogTypes/member", targetDepth)) {
                    dBEngineVersion.withExportableLogTypes(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportsLogExportsToCloudwatchLogs", targetDepth)) {
                    dBEngineVersion.setSupportsLogExportsToCloudwatchLogs(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportsReadReplica", targetDepth)) {
                    dBEngineVersion.setSupportsReadReplica(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedEngineModes/member", targetDepth)) {
                    dBEngineVersion.withSupportedEngineModes(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("SupportedFeatureNames/member", targetDepth)) {
                    dBEngineVersion.withSupportedFeatureNames(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBEngineVersion.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return dBEngineVersion;
    }

    private static DBEngineVersionStaxUnmarshaller instance;

    public static DBEngineVersionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBEngineVersionStaxUnmarshaller();
        return instance;
    }
}
