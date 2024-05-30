/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about customer’s voice activity.
 * </p>
 */
public class CustomerVoiceActivity implements Serializable {
    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an
     * outbound voice call.
     * </p>
     */
    private java.util.Date greetingStartTimestamp;

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound
     * voice call.
     * </p>
     */
    private java.util.Date greetingEndTimestamp;

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an
     * outbound voice call.
     * </p>
     *
     * @return <p>
     *         Timestamp that measures the beginning of the customer greeting
     *         from an outbound voice call.
     *         </p>
     */
    public java.util.Date getGreetingStartTimestamp() {
        return greetingStartTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an
     * outbound voice call.
     * </p>
     *
     * @param greetingStartTimestamp <p>
     *            Timestamp that measures the beginning of the customer greeting
     *            from an outbound voice call.
     *            </p>
     */
    public void setGreetingStartTimestamp(java.util.Date greetingStartTimestamp) {
        this.greetingStartTimestamp = greetingStartTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an
     * outbound voice call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greetingStartTimestamp <p>
     *            Timestamp that measures the beginning of the customer greeting
     *            from an outbound voice call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerVoiceActivity withGreetingStartTimestamp(java.util.Date greetingStartTimestamp) {
        this.greetingStartTimestamp = greetingStartTimestamp;
        return this;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound
     * voice call.
     * </p>
     *
     * @return <p>
     *         Timestamp that measures the end of the customer greeting from an
     *         outbound voice call.
     *         </p>
     */
    public java.util.Date getGreetingEndTimestamp() {
        return greetingEndTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound
     * voice call.
     * </p>
     *
     * @param greetingEndTimestamp <p>
     *            Timestamp that measures the end of the customer greeting from
     *            an outbound voice call.
     *            </p>
     */
    public void setGreetingEndTimestamp(java.util.Date greetingEndTimestamp) {
        this.greetingEndTimestamp = greetingEndTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound
     * voice call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greetingEndTimestamp <p>
     *            Timestamp that measures the end of the customer greeting from
     *            an outbound voice call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerVoiceActivity withGreetingEndTimestamp(java.util.Date greetingEndTimestamp) {
        this.greetingEndTimestamp = greetingEndTimestamp;
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
        if (getGreetingStartTimestamp() != null)
            sb.append("GreetingStartTimestamp: " + getGreetingStartTimestamp() + ",");
        if (getGreetingEndTimestamp() != null)
            sb.append("GreetingEndTimestamp: " + getGreetingEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGreetingStartTimestamp() == null) ? 0 : getGreetingStartTimestamp()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGreetingEndTimestamp() == null) ? 0 : getGreetingEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerVoiceActivity == false)
            return false;
        CustomerVoiceActivity other = (CustomerVoiceActivity) obj;

        if (other.getGreetingStartTimestamp() == null ^ this.getGreetingStartTimestamp() == null)
            return false;
        if (other.getGreetingStartTimestamp() != null
                && other.getGreetingStartTimestamp().equals(this.getGreetingStartTimestamp()) == false)
            return false;
        if (other.getGreetingEndTimestamp() == null ^ this.getGreetingEndTimestamp() == null)
            return false;
        if (other.getGreetingEndTimestamp() != null
                && other.getGreetingEndTimestamp().equals(this.getGreetingEndTimestamp()) == false)
            return false;
        return true;
    }
}
