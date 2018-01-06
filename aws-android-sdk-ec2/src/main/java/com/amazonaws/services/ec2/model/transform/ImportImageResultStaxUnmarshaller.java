/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Import Image Result StAX Unmarshaller
 */
public class ImportImageResultStaxUnmarshaller implements Unmarshaller<ImportImageResult, StaxUnmarshallerContext> {

    public ImportImageResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ImportImageResult importImageResult = new ImportImageResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT) return importImageResult;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("importTaskId", targetDepth)) {
                    importImageResult.setImportTaskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("architecture", targetDepth)) {
                    importImageResult.setArchitecture(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("licenseType", targetDepth)) {
                    importImageResult.setLicenseType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("platform", targetDepth)) {
                    importImageResult.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("hypervisor", targetDepth)) {
                    importImageResult.setHypervisor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("description", targetDepth)) {
                    importImageResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("snapshotDetailSet/item", targetDepth)) {
                    importImageResult.getSnapshotDetails().add(SnapshotDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("imageId", targetDepth)) {
                    importImageResult.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("progress", targetDepth)) {
                    importImageResult.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    importImageResult.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("status", targetDepth)) {
                    importImageResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    return importImageResult;
                }
            }
        }
    }

    private static ImportImageResultStaxUnmarshaller instance;
    public static ImportImageResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ImportImageResultStaxUnmarshaller();
        return instance;
    }
}
    