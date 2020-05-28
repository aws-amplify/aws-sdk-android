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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class Firehose implements Serializable {
    /**
     * The new value for the deliveryStream property for this object.
     */
    private String deliveryStream;

    /**
     * The new value for the enabled property for this object.
     */
    private Boolean enabled;

    /**
     * Returns the value of the deliveryStream property for this object.
     *
     * @return The value of the deliveryStream property for this object.
     */
    public String getDeliveryStream() {
        return deliveryStream;
    }

    /**
     * Sets the value of deliveryStream
     *
     * @param deliveryStream The new value for the deliveryStream property for
     *            this object.
     */
    public void setDeliveryStream(String deliveryStream) {
        this.deliveryStream = deliveryStream;
    }

    /**
     * Sets the value of the deliveryStream property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryStream The new value for the deliveryStream property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Firehose withDeliveryStream(String deliveryStream) {
        this.deliveryStream = deliveryStream;
        return this;
    }

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of enabled
     *
     * @param enabled The new value for the enabled property for this object.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets the value of the enabled property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled The new value for the enabled property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Firehose withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getDeliveryStream() != null)
            sb.append("DeliveryStream: " + getDeliveryStream() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryStream() == null) ? 0 : getDeliveryStream().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Firehose == false)
            return false;
        Firehose other = (Firehose) obj;

        if (other.getDeliveryStream() == null ^ this.getDeliveryStream() == null)
            return false;
        if (other.getDeliveryStream() != null
                && other.getDeliveryStream().equals(this.getDeliveryStream()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
