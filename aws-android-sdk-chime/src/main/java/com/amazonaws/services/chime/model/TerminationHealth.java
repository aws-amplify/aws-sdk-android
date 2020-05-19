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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The termination health details, including the source IP address and timestamp
 * of the last successful SIP <code>OPTIONS</code> message from your SIP
 * infrastructure.
 * </p>
 */
public class TerminationHealth implements Serializable {
    /**
     * <p>
     * The timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The source IP address.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The timestamp, in ISO 8601 format.
     * </p>
     *
     * @param timestamp <p>
     *            The timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminationHealth withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The source IP address.
     * </p>
     *
     * @return <p>
     *         The source IP address.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The source IP address.
     * </p>
     *
     * @param source <p>
     *            The source IP address.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The source IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminationHealth withSource(String source) {
        this.source = source;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminationHealth == false)
            return false;
        TerminationHealth other = (TerminationHealth) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }
}
