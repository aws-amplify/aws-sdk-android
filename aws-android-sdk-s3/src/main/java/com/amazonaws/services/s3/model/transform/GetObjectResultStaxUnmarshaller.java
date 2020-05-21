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
 * StAX unmarshaller for response GetObjectResult
 */
public class GetObjectResultStaxUnmarshaller implements
        Unmarshaller<GetObjectResult, StaxUnmarshallerContext> {

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

    public GetObjectResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetObjectResult getObjectResult = new GetObjectResult();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Body", targetDepth)) {
                    getObjectResult.setBody(ByteBufferStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-delete-marker", targetDepth)) {
                    getObjectResult.setDeleteMarker(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("accept-ranges", targetDepth)) {
                    getObjectResult.setAcceptRanges(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-expiration", targetDepth)) {
                    getObjectResult.setExpiration(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-restore", targetDepth)) {
                    getObjectResult.setRestore(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Last-Modified", targetDepth)) {
                    getObjectResult.setLastModified(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Content-Length", targetDepth)) {
                    getObjectResult.setContentLength(LongStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ETag", targetDepth)) {
                    getObjectResult.setETag(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-missing-meta", targetDepth)) {
                    getObjectResult.setMissingMeta(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-version-id", targetDepth)) {
                    getObjectResult.setVersionId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Cache-Control", targetDepth)) {
                    getObjectResult.setCacheControl(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Disposition", targetDepth)) {
                    getObjectResult.setContentDisposition(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Encoding", targetDepth)) {
                    getObjectResult.setContentEncoding(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Language", targetDepth)) {
                    getObjectResult.setContentLanguage(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Range", targetDepth)) {
                    getObjectResult.setContentRange(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Content-Type", targetDepth)) {
                    getObjectResult.setContentType(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Expires", targetDepth)) {
                    getObjectResult.setExpires(DateStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-website-redirect-location", targetDepth)) {
                    getObjectResult.setWebsiteRedirectLocation(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption", targetDepth)) {
                    getObjectResult.setServerSideEncryption(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-meta-/entry", targetDepth)) {
                    Entry<String, String> entry = MetadataMapEntryUnmarshaller.getInstance()
                            .unmarshall(context);
                    getObjectResult.addMetadataEntry(entry.getKey(), entry.getValue());
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-customer-algorithm",
                        targetDepth)) {
                    getObjectResult.setSSECustomerAlgorithm(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-customer-key-MD5",
                        targetDepth)) {
                    getObjectResult.setSSECustomerKeyMD5(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-server-side-encryption-aws-kms-key-id",
                        targetDepth)) {
                    getObjectResult.setSSEKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-storage-class", targetDepth)) {
                    getObjectResult.setStorageClass(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-request-charged", targetDepth)) {
                    getObjectResult.setRequestCharged(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-replication-status", targetDepth)) {
                    getObjectResult.setReplicationStatus(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-mp-parts-count", targetDepth)) {
                    getObjectResult.setPartsCount(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-tagging-count", targetDepth)) {
                    getObjectResult.setTagCount(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-mode", targetDepth)) {
                    getObjectResult.setObjectLockMode(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-retain-until-date", targetDepth)) {
                    getObjectResult.setObjectLockRetainUntilDate(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("x-amz-object-lock-legal-hold", targetDepth)) {
                    getObjectResult.setObjectLockLegalHoldStatus(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return getObjectResult;
    }

    private static GetObjectResultStaxUnmarshaller instance;

    public static GetObjectResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetObjectResultStaxUnmarshaller();
        return instance;
    }
}
