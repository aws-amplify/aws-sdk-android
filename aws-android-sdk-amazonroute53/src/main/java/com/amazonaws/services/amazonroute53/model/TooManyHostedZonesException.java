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

package com.amazonaws.services.amazonroute53.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This operation can't be completed either because the current account has
 * reached the limit on the number of hosted zones or because you've reached the
 * limit on the number of hosted zones that can be associated with a reusable
 * delegation set.
 * </p>
 * <p>
 * For information about default limits, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
 * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 * <p>
 * To get the current limit on hosted zones that can be created by an account,
 * see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetAccountLimit.html"
 * >GetAccountLimit</a>.
 * </p>
 * <p>
 * To get the current limit on hosted zones that can be associated with a
 * reusable delegation set, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSetLimit.html"
 * >GetReusableDelegationSetLimit</a>.
 * </p>
 * <p>
 * To request a higher limit, <a
 * href="http://aws.amazon.com/route53-request">create a case</a> with the AWS
 * Support Center.
 * </p>
 */
public class TooManyHostedZonesException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TooManyHostedZonesException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TooManyHostedZonesException(String message) {
        super(message);
    }
}
