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
 * StAX marshaller for POJO StreamingDistributionConfig
 */
class StreamingDistributionConfigStaxMarshaller {

    public void marshall(StreamingDistributionConfig _streamingDistributionConfig,
            Request<?> request, String _prefix) {
        String prefix;
        if (_streamingDistributionConfig.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _streamingDistributionConfig.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_streamingDistributionConfig.getS3Origin() != null) {
            prefix = _prefix + "S3Origin";
            S3Origin s3Origin = _streamingDistributionConfig.getS3Origin();
            S3OriginStaxMarshaller.getInstance().marshall(s3Origin, request, prefix + ".");
        }
        if (_streamingDistributionConfig.getAliases() != null) {
            prefix = _prefix + "Aliases";
            Aliases aliases = _streamingDistributionConfig.getAliases();
            AliasesStaxMarshaller.getInstance().marshall(aliases, request, prefix + ".");
        }
        if (_streamingDistributionConfig.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _streamingDistributionConfig.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_streamingDistributionConfig.getLogging() != null) {
            prefix = _prefix + "Logging";
            StreamingLoggingConfig logging = _streamingDistributionConfig.getLogging();
            StreamingLoggingConfigStaxMarshaller.getInstance().marshall(logging, request,
                    prefix + ".");
        }
        if (_streamingDistributionConfig.getTrustedSigners() != null) {
            prefix = _prefix + "TrustedSigners";
            TrustedSigners trustedSigners = _streamingDistributionConfig.getTrustedSigners();
            TrustedSignersStaxMarshaller.getInstance().marshall(trustedSigners, request,
                    prefix + ".");
        }
        if (_streamingDistributionConfig.getPriceClass() != null) {
            prefix = _prefix + "PriceClass";
            String priceClass = _streamingDistributionConfig.getPriceClass();
            request.addParameter(prefix, StringUtils.fromString(priceClass));
        }
        if (_streamingDistributionConfig.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _streamingDistributionConfig.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
    }

    private static StreamingDistributionConfigStaxMarshaller instance;

    public static StreamingDistributionConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionConfigStaxMarshaller();
        return instance;
    }
}
