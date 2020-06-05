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

package com.amazonaws.services.cloudfront.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model DistributionSummary
 */
class DistributionSummaryStaxUnmarshaller implements
        Unmarshaller<DistributionSummary, StaxUnmarshallerContext> {

    public DistributionSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionSummary distributionSummary = new DistributionSummary();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("Id", targetDepth)) {
                    distributionSummary.setId(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("ARN", targetDepth)) {
                    distributionSummary.setARN(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    distributionSummary.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    distributionSummary.setLastModifiedTime(DateStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    distributionSummary.setDomainName(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Aliases", targetDepth)) {
                    distributionSummary.setAliases(AliasesStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Origins", targetDepth)) {
                    distributionSummary.setOrigins(OriginsStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("OriginGroups", targetDepth)) {
                    distributionSummary.setOriginGroups(OriginGroupsStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultCacheBehavior", targetDepth)) {
                    distributionSummary
                            .setDefaultCacheBehavior(DefaultCacheBehaviorStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CacheBehaviors", targetDepth)) {
                    distributionSummary.setCacheBehaviors(CacheBehaviorsStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomErrorResponses", targetDepth)) {
                    distributionSummary
                            .setCustomErrorResponses(CustomErrorResponsesStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Comment", targetDepth)) {
                    distributionSummary.setComment(StringStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("PriceClass", targetDepth)) {
                    distributionSummary.setPriceClass(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    distributionSummary.setEnabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("ViewerCertificate", targetDepth)) {
                    distributionSummary.setViewerCertificate(ViewerCertificateStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Restrictions", targetDepth)) {
                    distributionSummary.setRestrictions(RestrictionsStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("WebACLId", targetDepth)) {
                    distributionSummary.setWebACLId(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("HttpVersion", targetDepth)) {
                    distributionSummary.setHttpVersion(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsIPV6Enabled", targetDepth)) {
                    distributionSummary.setIsIPV6Enabled(BooleanStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("AliasICPRecordals", targetDepth)) {
                    distributionSummary.withAliasICPRecordals(AliasICPRecordalStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return distributionSummary;
    }

    private static DistributionSummaryStaxUnmarshaller instance;

    public static DistributionSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DistributionSummaryStaxUnmarshaller();
        return instance;
    }
}
