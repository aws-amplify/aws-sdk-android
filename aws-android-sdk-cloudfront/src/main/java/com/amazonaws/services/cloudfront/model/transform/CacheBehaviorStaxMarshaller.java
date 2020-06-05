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
 * StAX marshaller for POJO CacheBehavior
 */
class CacheBehaviorStaxMarshaller {

    public void marshall(CacheBehavior _cacheBehavior, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheBehavior.getPathPattern() != null) {
            prefix = _prefix + "PathPattern";
            String pathPattern = _cacheBehavior.getPathPattern();
            request.addParameter(prefix, StringUtils.fromString(pathPattern));
        }
        if (_cacheBehavior.getTargetOriginId() != null) {
            prefix = _prefix + "TargetOriginId";
            String targetOriginId = _cacheBehavior.getTargetOriginId();
            request.addParameter(prefix, StringUtils.fromString(targetOriginId));
        }
        if (_cacheBehavior.getForwardedValues() != null) {
            prefix = _prefix + "ForwardedValues";
            ForwardedValues forwardedValues = _cacheBehavior.getForwardedValues();
            ForwardedValuesStaxMarshaller.getInstance().marshall(forwardedValues, request,
                    prefix + ".");
        }
        if (_cacheBehavior.getTrustedSigners() != null) {
            prefix = _prefix + "TrustedSigners";
            TrustedSigners trustedSigners = _cacheBehavior.getTrustedSigners();
            TrustedSignersStaxMarshaller.getInstance().marshall(trustedSigners, request,
                    prefix + ".");
        }
        if (_cacheBehavior.getViewerProtocolPolicy() != null) {
            prefix = _prefix + "ViewerProtocolPolicy";
            String viewerProtocolPolicy = _cacheBehavior.getViewerProtocolPolicy();
            request.addParameter(prefix, StringUtils.fromString(viewerProtocolPolicy));
        }
        if (_cacheBehavior.getMinTTL() != null) {
            prefix = _prefix + "MinTTL";
            Long minTTL = _cacheBehavior.getMinTTL();
            request.addParameter(prefix, StringUtils.fromLong(minTTL));
        }
        if (_cacheBehavior.getAllowedMethods() != null) {
            prefix = _prefix + "AllowedMethods";
            AllowedMethods allowedMethods = _cacheBehavior.getAllowedMethods();
            AllowedMethodsStaxMarshaller.getInstance().marshall(allowedMethods, request,
                    prefix + ".");
        }
        if (_cacheBehavior.getSmoothStreaming() != null) {
            prefix = _prefix + "SmoothStreaming";
            Boolean smoothStreaming = _cacheBehavior.getSmoothStreaming();
            request.addParameter(prefix, StringUtils.fromBoolean(smoothStreaming));
        }
        if (_cacheBehavior.getDefaultTTL() != null) {
            prefix = _prefix + "DefaultTTL";
            Long defaultTTL = _cacheBehavior.getDefaultTTL();
            request.addParameter(prefix, StringUtils.fromLong(defaultTTL));
        }
        if (_cacheBehavior.getMaxTTL() != null) {
            prefix = _prefix + "MaxTTL";
            Long maxTTL = _cacheBehavior.getMaxTTL();
            request.addParameter(prefix, StringUtils.fromLong(maxTTL));
        }
        if (_cacheBehavior.getCompress() != null) {
            prefix = _prefix + "Compress";
            Boolean compress = _cacheBehavior.getCompress();
            request.addParameter(prefix, StringUtils.fromBoolean(compress));
        }
        if (_cacheBehavior.getLambdaFunctionAssociations() != null) {
            prefix = _prefix + "LambdaFunctionAssociations";
            LambdaFunctionAssociations lambdaFunctionAssociations = _cacheBehavior
                    .getLambdaFunctionAssociations();
            LambdaFunctionAssociationsStaxMarshaller.getInstance().marshall(
                    lambdaFunctionAssociations, request, prefix + ".");
        }
        if (_cacheBehavior.getFieldLevelEncryptionId() != null) {
            prefix = _prefix + "FieldLevelEncryptionId";
            String fieldLevelEncryptionId = _cacheBehavior.getFieldLevelEncryptionId();
            request.addParameter(prefix, StringUtils.fromString(fieldLevelEncryptionId));
        }
    }

    private static CacheBehaviorStaxMarshaller instance;

    public static CacheBehaviorStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheBehaviorStaxMarshaller();
        return instance;
    }
}
