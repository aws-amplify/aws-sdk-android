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
 * StAX marshaller for POJO DistributionConfig
 */
class DistributionConfigStaxMarshaller {

    public void marshall(DistributionConfig _distributionConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_distributionConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _distributionConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_distributionConfig.getAliases() != null) {
            prefix = _prefix + "Aliases";
            Aliases aliases = _distributionConfig.getAliases();
            AliasesStaxMarshaller.getInstance().marshall(aliases, request, prefix + ".");
        }
        if (_distributionConfig.getDefaultRootObject() != null) {
            prefix = _prefix + "DefaultRootObject";
            String defaultRootObject = _distributionConfig.getDefaultRootObject();
            request.addParameter(prefix, StringUtils.fromString(defaultRootObject));
        }
        if (_distributionConfig.getOrigins() != null) {
            prefix = _prefix + "Origins";
            Origins origins = _distributionConfig.getOrigins();
            OriginsStaxMarshaller.getInstance().marshall(origins, request, prefix + ".");
        }
        if (_distributionConfig.getOriginGroups() != null) {
            prefix = _prefix + "OriginGroups";
            OriginGroups originGroups = _distributionConfig.getOriginGroups();
            OriginGroupsStaxMarshaller.getInstance().marshall(originGroups, request, prefix + ".");
        }
        if (_distributionConfig.getDefaultCacheBehavior() != null) {
            prefix = _prefix + "DefaultCacheBehavior";
            DefaultCacheBehavior defaultCacheBehavior = _distributionConfig
                    .getDefaultCacheBehavior();
            DefaultCacheBehaviorStaxMarshaller.getInstance().marshall(defaultCacheBehavior,
                    request, prefix + ".");
        }
        if (_distributionConfig.getCacheBehaviors() != null) {
            prefix = _prefix + "CacheBehaviors";
            CacheBehaviors cacheBehaviors = _distributionConfig.getCacheBehaviors();
            CacheBehaviorsStaxMarshaller.getInstance().marshall(cacheBehaviors, request,
                    prefix + ".");
        }
        if (_distributionConfig.getCustomErrorResponses() != null) {
            prefix = _prefix + "CustomErrorResponses";
            CustomErrorResponses customErrorResponses = _distributionConfig
                    .getCustomErrorResponses();
            CustomErrorResponsesStaxMarshaller.getInstance().marshall(customErrorResponses,
                    request, prefix + ".");
        }
        if (_distributionConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _distributionConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_distributionConfig.getLogging() != null) {
            prefix = _prefix + "Logging";
            LoggingConfig logging = _distributionConfig.getLogging();
            LoggingConfigStaxMarshaller.getInstance().marshall(logging, request, prefix + ".");
        }
        if (_distributionConfig.getPriceClass() != null) {
            prefix = _prefix + "PriceClass";
            String priceClass = _distributionConfig.getPriceClass();
            request.addParameter(prefix, StringUtils.fromString(priceClass));
        }
        if (_distributionConfig.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _distributionConfig.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_distributionConfig.getViewerCertificate() != null) {
            prefix = _prefix + "ViewerCertificate";
            ViewerCertificate viewerCertificate = _distributionConfig.getViewerCertificate();
            ViewerCertificateStaxMarshaller.getInstance().marshall(viewerCertificate, request,
                    prefix + ".");
        }
        if (_distributionConfig.getRestrictions() != null) {
            prefix = _prefix + "Restrictions";
            Restrictions restrictions = _distributionConfig.getRestrictions();
            RestrictionsStaxMarshaller.getInstance().marshall(restrictions, request, prefix + ".");
        }
        if (_distributionConfig.getWebACLId() != null) {
            prefix = _prefix + "WebACLId";
            String webACLId = _distributionConfig.getWebACLId();
            request.addParameter(prefix, StringUtils.fromString(webACLId));
        }
        if (_distributionConfig.getHttpVersion() != null) {
            prefix = _prefix + "HttpVersion";
            String httpVersion = _distributionConfig.getHttpVersion();
            request.addParameter(prefix, StringUtils.fromString(httpVersion));
        }
        if (_distributionConfig.getIsIPV6Enabled() != null) {
            prefix = _prefix + "IsIPV6Enabled";
            Boolean isIPV6Enabled = _distributionConfig.getIsIPV6Enabled();
            request.addParameter(prefix, StringUtils.fromBoolean(isIPV6Enabled));
        }
    }

    private static DistributionConfigStaxMarshaller instance;

    public static DistributionConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DistributionConfigStaxMarshaller();
        return instance;
    }
}
