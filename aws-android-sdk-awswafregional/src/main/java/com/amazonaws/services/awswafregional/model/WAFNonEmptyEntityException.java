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

package com.amazonaws.services.awswafregional.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation failed because you tried to delete an object that isn't empty.
 * For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You tried to delete a <code>WebACL</code> that still contains one or more
 * <code>Rule</code> objects.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to delete a <code>Rule</code> that still contains one or more
 * <code>ByteMatchSet</code> objects or other predicates.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to delete a <code>ByteMatchSet</code> that contains one or more
 * <code>ByteMatchTuple</code> objects.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to delete an <code>IPSet</code> that references one or more IP
 * addresses.
 * </p>
 * </li>
 * </ul>
 */
public class WAFNonEmptyEntityException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new WAFNonEmptyEntityException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public WAFNonEmptyEntityException(String message) {
        super(message);
    }
}
