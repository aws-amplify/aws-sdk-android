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

import java.io.Serializable;

/**
 * <p>
 * The definition of the input.
 * </p>
 */
public class InputDefinition implements Serializable {
    /**
     * <p>
     * The attributes from the JSON payload that are made available by the
     * input. Inputs are derived from messages sent to the AWS IoT Events system
     * using <code>BatchPutMessage</code>. Each such message contains a JSON
     * payload, and those attributes (and their paired values) specified here
     * are available for use in the <code>condition</code> expressions used by
     * detectors that monitor this input.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the
     * input. Inputs are derived from messages sent to the AWS IoT Events system
     * using <code>BatchPutMessage</code>. Each such message contains a JSON
     * payload, and those attributes (and their paired values) specified here
     * are available for use in the <code>condition</code> expressions used by
     * detectors that monitor this input.
     * </p>
     *
     * @return <p>
     *         The attributes from the JSON payload that are made available by
     *         the input. Inputs are derived from messages sent to the AWS IoT
     *         Events system using <code>BatchPutMessage</code>. Each such
     *         message contains a JSON payload, and those attributes (and their
     *         paired values) specified here are available for use in the
     *         <code>condition</code> expressions used by detectors that monitor
     *         this input.
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the
     * input. Inputs are derived from messages sent to the AWS IoT Events system
     * using <code>BatchPutMessage</code>. Each such message contains a JSON
     * payload, and those attributes (and their paired values) specified here
     * are available for use in the <code>condition</code> expressions used by
     * detectors that monitor this input.
     * </p>
     *
     * @param attributes <p>
     *            The attributes from the JSON payload that are made available
     *            by the input. Inputs are derived from messages sent to the AWS
     *            IoT Events system using <code>BatchPutMessage</code>. Each
     *            such message contains a JSON payload, and those attributes
     *            (and their paired values) specified here are available for use
     *            in the <code>condition</code> expressions used by detectors
     *            that monitor this input.
     *            </p>
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the
     * input. Inputs are derived from messages sent to the AWS IoT Events system
     * using <code>BatchPutMessage</code>. Each such message contains a JSON
     * payload, and those attributes (and their paired values) specified here
     * are available for use in the <code>condition</code> expressions used by
     * detectors that monitor this input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes from the JSON payload that are made available
     *            by the input. Inputs are derived from messages sent to the AWS
     *            IoT Events system using <code>BatchPutMessage</code>. Each
     *            such message contains a JSON payload, and those attributes
     *            (and their paired values) specified here are available for use
     *            in the <code>condition</code> expressions used by detectors
     *            that monitor this input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDefinition withAttributes(Attribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<Attribute>(attributes.length);
        }
        for (Attribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attributes from the JSON payload that are made available by the
     * input. Inputs are derived from messages sent to the AWS IoT Events system
     * using <code>BatchPutMessage</code>. Each such message contains a JSON
     * payload, and those attributes (and their paired values) specified here
     * are available for use in the <code>condition</code> expressions used by
     * detectors that monitor this input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes from the JSON payload that are made available
     *            by the input. Inputs are derived from messages sent to the AWS
     *            IoT Events system using <code>BatchPutMessage</code>. Each
     *            such message contains a JSON payload, and those attributes
     *            (and their paired values) specified here are available for use
     *            in the <code>condition</code> expressions used by detectors
     *            that monitor this input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDefinition withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDefinition == false)
            return false;
        InputDefinition other = (InputDefinition) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
