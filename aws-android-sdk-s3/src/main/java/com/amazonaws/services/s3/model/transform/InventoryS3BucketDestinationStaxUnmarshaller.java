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

package com.amazonaws.services.s3.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model InventoryS3BucketDestination
 */
class InventoryS3BucketDestinationStaxUnmarshaller implements
        Unmarshaller<InventoryS3BucketDestination, StaxUnmarshallerContext> {

    public InventoryS3BucketDestination unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        InventoryS3BucketDestination inventoryS3BucketDestination = new InventoryS3BucketDestination();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("AccountId", targetDepth)) {
                    inventoryS3BucketDestination.setAccountId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Bucket", targetDepth)) {
                    inventoryS3BucketDestination.setBucket(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Format", targetDepth)) {
                    inventoryS3BucketDestination.setFormat(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    inventoryS3BucketDestination.setPrefix(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    inventoryS3BucketDestination.setEncryption(InventoryEncryptionStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return inventoryS3BucketDestination;
    }

    private static InventoryS3BucketDestinationStaxUnmarshaller instance;

    public static InventoryS3BucketDestinationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InventoryS3BucketDestinationStaxUnmarshaller();
        return instance;
    }
}
