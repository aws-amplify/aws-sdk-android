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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the integrity algorithm for the VPN tunnel for phase 2 IKE
 * negotiations.
 * </p>
 */
public class Phase2IntegrityAlgorithmsRequestListValue implements Serializable {
    /**
     * <p>
     * The integrity algorithm.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The integrity algorithm.
     * </p>
     *
     * @return <p>
     *         The integrity algorithm.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The integrity algorithm.
     * </p>
     *
     * @param value <p>
     *            The integrity algorithm.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The integrity algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The integrity algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Phase2IntegrityAlgorithmsRequestListValue withValue(String value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Phase2IntegrityAlgorithmsRequestListValue == false)
            return false;
        Phase2IntegrityAlgorithmsRequestListValue other = (Phase2IntegrityAlgorithmsRequestListValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
