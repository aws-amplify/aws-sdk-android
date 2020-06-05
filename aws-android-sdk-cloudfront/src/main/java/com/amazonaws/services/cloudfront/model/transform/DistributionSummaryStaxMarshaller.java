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

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DistributionSummary
 */
class DistributionSummaryStaxMarshaller {

    public void marshall(DistributionSummary _distributionSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_distributionSummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _distributionSummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_distributionSummary.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _distributionSummary.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
        if (_distributionSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _distributionSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_distributionSummary.getLastModifiedTime() != null) {
            prefix = _prefix + "LastModifiedTime";
            java.util.Date lastModifiedTime = _distributionSummary.getLastModifiedTime();
            request.addParameter(prefix, StringUtils.fromDate(lastModifiedTime));
        }
        if (_distributionSummary.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _distributionSummary.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_distributionSummary.getAliases() != null) {
            prefix = _prefix + "Aliases";
            Aliases aliases = _distributionSummary.getAliases();
            AliasesStaxMarshaller.getInstance().marshall(aliases, request, prefix + ".");
        }
        if (_distributionSummary.getOrigins() != null) {
            prefix = _prefix + "Origins";
            Origins origins = _distributionSummary.getOrigins();
            OriginsStaxMarshaller.getInstance().marshall(origins, request, prefix + ".");
        }
        if (_distributionSummary.getOriginGroups() != null) {
            prefix = _prefix + "OriginGroups";
            OriginGroups originGroups = _distributionSummary.getOriginGroups();
            OriginGroupsStaxMarshaller.getInstance().marshall(originGroups, request, prefix + ".");
        }
        if (_distributionSummary.getDefaultCacheBehavior() != null) {
            prefix = _prefix + "DefaultCacheBehavior";
            DefaultCacheBehavior defaultCacheBehavior = _distributionSummary
                    .getDefaultCacheBehavior();
            DefaultCacheBehaviorStaxMarshaller.getInstance().marshall(defaultCacheBehavior,
                    request, prefix + ".");
        }
        if (_distributionSummary.getCacheBehaviors() != null) {
            prefix = _prefix + "CacheBehaviors";
            CacheBehaviors cacheBehaviors = _distributionSummary.getCacheBehaviors();
            CacheBehaviorsStaxMarshaller.getInstance().marshall(cacheBehaviors, request,
                    prefix + ".");
        }
        if (_distributionSummary.getCustomErrorResponses() != null) {
            prefix = _prefix + "CustomErrorResponses";
            CustomErrorResponses customErrorResponses = _distributionSummary
                    .getCustomErrorResponses();
            CustomErrorResponsesStaxMarshaller.getInstance().marshall(customErrorResponses,
                    request, prefix + ".");
        }
        if (_distributionSummary.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _distributionSummary.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_distributionSummary.getPriceClass() != null) {
            prefix = _prefix + "PriceClass";
            String priceClass = _distributionSummary.getPriceClass();
            request.addParameter(prefix, StringUtils.fromString(priceClass));
        }
        if (_distributionSummary.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _distributionSummary.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_distributionSummary.getViewerCertificate() != null) {
            prefix = _prefix + "ViewerCertificate";
            ViewerCertificate viewerCertificate = _distributionSummary.getViewerCertificate();
            ViewerCertificateStaxMarshaller.getInstance().marshall(viewerCertificate, request,
                    prefix + ".");
        }
        if (_distributionSummary.getRestrictions() != null) {
            prefix = _prefix + "Restrictions";
            Restrictions restrictions = _distributionSummary.getRestrictions();
            RestrictionsStaxMarshaller.getInstance().marshall(restrictions, request, prefix + ".");
        }
        if (_distributionSummary.getWebACLId() != null) {
            prefix = _prefix + "WebACLId";
            String webACLId = _distributionSummary.getWebACLId();
            request.addParameter(prefix, StringUtils.fromString(webACLId));
        }
        if (_distributionSummary.getHttpVersion() != null) {
            prefix = _prefix + "HttpVersion";
            String httpVersion = _distributionSummary.getHttpVersion();
            request.addParameter(prefix, StringUtils.fromString(httpVersion));
        }
        if (_distributionSummary.getIsIPV6Enabled() != null) {
            prefix = _prefix + "IsIPV6Enabled";
            Boolean isIPV6Enabled = _distributionSummary.getIsIPV6Enabled();
            request.addParameter(prefix, StringUtils.fromBoolean(isIPV6Enabled));
        }
        if (_distributionSummary.getAliasICPRecordals() != null) {
            prefix = _prefix + "AliasICPRecordals";
            java.util.List<AliasICPRecordal> aliasICPRecordals = _distributionSummary
                    .getAliasICPRecordals();
            int aliasICPRecordalsIndex = 1;
            String aliasICPRecordalsPrefix = prefix;
            for (AliasICPRecordal aliasICPRecordalsItem : aliasICPRecordals) {
                prefix = aliasICPRecordalsPrefix + "." + aliasICPRecordalsIndex;
                if (aliasICPRecordalsItem != null) {
                    AliasICPRecordalStaxMarshaller.getInstance().marshall(aliasICPRecordalsItem,
                            request, prefix + ".");
                }
                aliasICPRecordalsIndex++;
            }
            prefix = aliasICPRecordalsPrefix;
        }
    }

    private static DistributionSummaryStaxMarshaller instance;

    public static DistributionSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionSummaryStaxMarshaller();
        return instance;
    }
}
