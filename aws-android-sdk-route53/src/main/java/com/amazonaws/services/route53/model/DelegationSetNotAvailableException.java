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

package com.amazonaws.services.route53.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You can create a hosted zone that has the same name as an existing hosted
 * zone (example.com is common), but there is a limit to the number of hosted
 * zones that have the same name. If you get this error, Amazon Route 53 has
 * reached that limit. If you own the domain name and Route 53 generates this
 * error, contact Customer Support.
 * </p>
 */
public class DelegationSetNotAvailableException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DelegationSetNotAvailableException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public DelegationSetNotAvailableException(String message) {
        super(message);
    }
}
