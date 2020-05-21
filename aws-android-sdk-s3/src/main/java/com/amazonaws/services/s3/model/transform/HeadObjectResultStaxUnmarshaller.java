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
 * StAX unmarshaller for response HeadObjectResult
 */
public class HeadObjectResultStaxUnmarshaller implements
        Unmarshaller<HeadObjectResult, StaxUnmarshallerContext> {

    private static class MetadataMapEntryUnmarshaller implements
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

        private static MetadataMapEntryUnmarshaller instance;

        public static MetadataMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new MetadataMapEntryUnmarshaller();
            return instance;
        }

    }

    public HeadObjectResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        HeadObjectResult headObjectResult = new HeadObjectResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("x-amz-delete-marker", targetDepth)) {
                    headObjectResult.setDeleteMarker(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("accept-ranges", targetDepth)) {
                    headObjectResult.setAcceptRanges(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-expiration", targetDepth)) {
                    headObjectResult.setExpiration(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-restore", targetDepth)) {
                    headObjectResult.setRestore(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Last-Modified", targetDepth)) {
                    headObjectResult.setLastModified(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Content-Length", targetDepth)) {
                    headObjectResult.setContentLength(LongStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ETag", targetDepth)) {
                    headObjectResult.setETag(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-missing-meta", targetDepth)) {
                    headObjectResult.setMissingMeta(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-version-id", targetDepth)) {
                    headObjectResult.setVersionId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Cache-Control", targetDepth)) {
                    headObjectResult.setCacheControl(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Disposition", targetDepth)) {
                    headObjectResult.setContentDisposition(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Encoding", targetDepth)) {
                    headObjectResult.setContentEncoding(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Language", targetDepth)) {
                    headObjectResult.setContentLanguage(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Type", targetDepth)) {
                    headObjectResult.setContentType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Expires", targetDepth)) {
                    headObjectResult.setExpires(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-website-redirect-location", targetDepth)) {
                    headObjectResult.setWebsiteRedirectLocation(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption", targetDepth)) {
                    headObjectResult.setServerSideEncryption(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-meta-/entry", targetDepth)) {
                    Entry<String, String> entry = MetadataMapEntryUnmarshaller.getInstance()
                            .unmarshall(context);
                    headObjectResult.addMetadataEntry(entry.getKey(), entry.getValue());
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-customer-algorithm",
                        targetDepth)) {
                    headObjectResult.setSSECustomerAlgorithm(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-customer-key-MD5",
                        targetDepth)) {
                    headObjectResult.setSSECustomerKeyMD5(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-aws-kms-key-id",
                        targetDepth)) {
                    headObjectResult.setSSEKMSKeyId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-storage-class", targetDepth)) {
                    headObjectResult.setStorageClass(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-request-charged", targetDepth)) {
                    headObjectResult.setRequestCharged(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-replication-status", targetDepth)) {
                    headObjectResult.setReplicationStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-mp-parts-count", targetDepth)) {
                    headObjectResult.setPartsCount(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-mode", targetDepth)) {
                    headObjectResult.setObjectLockMode(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-retain-until-date", targetDepth)) {
                    headObjectResult.setObjectLockRetainUntilDate(DateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-legal-hold", targetDepth)) {
                    headObjectResult.setObjectLockLegalHoldStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return headObjectResult;
    }

    private static HeadObjectResultStaxUnmarshaller instance;

    public static HeadObjectResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HeadObjectResultStaxUnmarshaller();
        return instance;
    }
}
