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

package com.amazonaws.services.appconfig.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The configuration size is too large.
 * </p>
 */
public class PayloadTooLargeException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String measure;

    private Float limit;

    private Float size;

    /**
     * Constructs a new PayloadTooLargeException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public PayloadTooLargeException(String message) {
        super(message);
    }

    /**
     * Returns the value of the measure property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KILOBYTES
     *
     * @return The value of the measure property for this object.
     * @see BytesMeasure
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * Sets the value of measure
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KILOBYTES
     *
     * @param measure The new value for the measure property for this object.
     * @see BytesMeasure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * Returns the value of the limit property for this object.
     *
     * @return The value of the limit property for this object.
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Sets the value of limit
     *
     * @param limit The new value for the limit property for this object.
     */
    public void setLimit(Float limit) {
        this.limit = limit;
    }

    /**
     * Returns the value of the size property for this object.
     *
     * @return The value of the size property for this object.
     */
    public Float getSize() {
        return size;
    }

    /**
     * Sets the value of size
     *
     * @param size The new value for the size property for this object.
     */
    public void setSize(Float size) {
        this.size = size;
    }
}
