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

package com.amazonaws.services.awsiotevents.model;

import com.amazonaws.AmazonServiceException;

/**
 * 
 */
public class TagrisInvalidArnException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private TagrisSweepListItem sweepListItem;

    /**
     * Constructs a new TagrisInvalidArnException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TagrisInvalidArnException(String message) {
        super(message);
    }

    /**
     * Returns the value of the sweepListItem property for this object.
     *
     * @return The value of the sweepListItem property for this object.
     */
    public TagrisSweepListItem getSweepListItem() {
        return sweepListItem;
    }

    /**
     * Sets the value of sweepListItem
     *
     * @param sweepListItem The new value for the sweepListItem property for
     *            this object.
     */
    public void setSweepListItem(TagrisSweepListItem sweepListItem) {
        this.sweepListItem = sweepListItem;
    }
}
