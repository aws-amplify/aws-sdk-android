/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the status code and message that result from processing data for an
 * endpoint.
 * </p>
 */
public class EndpointItemResponse implements Serializable {
    /**
     * <p>
     * The custom message that's returned in the response as a result of
     * processing the endpoint data.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code that's returned in the response as a result of processing
     * the endpoint data.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The custom message that's returned in the response as a result of
     * processing the endpoint data.
     * </p>
     *
     * @return <p>
     *         The custom message that's returned in the response as a result of
     *         processing the endpoint data.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The custom message that's returned in the response as a result of
     * processing the endpoint data.
     * </p>
     *
     * @param message <p>
     *            The custom message that's returned in the response as a result
     *            of processing the endpoint data.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The custom message that's returned in the response as a result of
     * processing the endpoint data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The custom message that's returned in the response as a result
     *            of processing the endpoint data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointItemResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The status code that's returned in the response as a result of processing
     * the endpoint data.
     * </p>
     *
     * @return <p>
     *         The status code that's returned in the response as a result of
     *         processing the endpoint data.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The status code that's returned in the response as a result of processing
     * the endpoint data.
     * </p>
     *
     * @param statusCode <p>
     *            The status code that's returned in the response as a result of
     *            processing the endpoint data.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code that's returned in the response as a result of processing
     * the endpoint data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The status code that's returned in the response as a result of
     *            processing the endpoint data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointItemResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointItemResponse == false)
            return false;
        EndpointItemResponse other = (EndpointItemResponse) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }
}
