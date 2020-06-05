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
 * StAX marshaller for POJO DefaultCacheBehavior
 */
class DefaultCacheBehaviorStaxMarshaller {

    public void marshall(DefaultCacheBehavior _defaultCacheBehavior, Request<?> request,
            String _prefix) {
        String prefix;
        if (_defaultCacheBehavior.getTargetOriginId() != null) {
            prefix = _prefix + "TargetOriginId";
            String targetOriginId = _defaultCacheBehavior.getTargetOriginId();
            request.addParameter(prefix, StringUtils.fromString(targetOriginId));
        }
        if (_defaultCacheBehavior.getForwardedValues() != null) {
            prefix = _prefix + "ForwardedValues";
            ForwardedValues forwardedValues = _defaultCacheBehavior.getForwardedValues();
            ForwardedValuesStaxMarshaller.getInstance().marshall(forwardedValues, request,
                    prefix + ".");
        }
        if (_defaultCacheBehavior.getTrustedSigners() != null) {
            prefix = _prefix + "TrustedSigners";
            TrustedSigners trustedSigners = _defaultCacheBehavior.getTrustedSigners();
            TrustedSignersStaxMarshaller.getInstance().marshall(trustedSigners, request,
                    prefix + ".");
        }
        if (_defaultCacheBehavior.getViewerProtocolPolicy() != null) {
            prefix = _prefix + "ViewerProtocolPolicy";
            String viewerProtocolPolicy = _defaultCacheBehavior.getViewerProtocolPolicy();
            request.addParameter(prefix, StringUtils.fromString(viewerProtocolPolicy));
        }
        if (_defaultCacheBehavior.getMinTTL() != null) {
            prefix = _prefix + "MinTTL";
            Long minTTL = _defaultCacheBehavior.getMinTTL();
            request.addParameter(prefix, StringUtils.fromLong(minTTL));
        }
        if (_defaultCacheBehavior.getAllowedMethods() != null) {
            prefix = _prefix + "AllowedMethods";
            AllowedMethods allowedMethods = _defaultCacheBehavior.getAllowedMethods();
            AllowedMethodsStaxMarshaller.getInstance().marshall(allowedMethods, request,
                    prefix + ".");
        }
        if (_defaultCacheBehavior.getSmoothStreaming() != null) {
            prefix = _prefix + "SmoothStreaming";
            Boolean smoothStreaming = _defaultCacheBehavior.getSmoothStreaming();
            request.addParameter(prefix, StringUtils.fromBoolean(smoothStreaming));
        }
        if (_defaultCacheBehavior.getDefaultTTL() != null) {
            prefix = _prefix + "DefaultTTL";
            Long defaultTTL = _defaultCacheBehavior.getDefaultTTL();
            request.addParameter(prefix, StringUtils.fromLong(defaultTTL));
        }
        if (_defaultCacheBehavior.getMaxTTL() != null) {
            prefix = _prefix + "MaxTTL";
            Long maxTTL = _defaultCacheBehavior.getMaxTTL();
            request.addParameter(prefix, StringUtils.fromLong(maxTTL));
        }
        if (_defaultCacheBehavior.getCompress() != null) {
            prefix = _prefix + "Compress";
            Boolean compress = _defaultCacheBehavior.getCompress();
            request.addParameter(prefix, StringUtils.fromBoolean(compress));
        }
        if (_defaultCacheBehavior.getLambdaFunctionAssociations() != null) {
            prefix = _prefix + "LambdaFunctionAssociations";
            LambdaFunctionAssociations lambdaFunctionAssociations = _defaultCacheBehavior
                    .getLambdaFunctionAssociations();
            LambdaFunctionAssociationsStaxMarshaller.getInstance().marshall(
                    lambdaFunctionAssociations, request, prefix + ".");
        }
        if (_defaultCacheBehavior.getFieldLevelEncryptionId() != null) {
            prefix = _prefix + "FieldLevelEncryptionId";
            String fieldLevelEncryptionId = _defaultCacheBehavior.getFieldLevelEncryptionId();
            request.addParameter(prefix, StringUtils.fromString(fieldLevelEncryptionId));
        }
    }

    private static DefaultCacheBehaviorStaxMarshaller instance;

    public static DefaultCacheBehaviorStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultCacheBehaviorStaxMarshaller();
        return instance;
    }
}
