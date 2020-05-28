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

public class GetCompatibleKafkaVersionsResult implements Serializable {
    /**
     * 
     <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     */
    private java.util.List<CompatibleKafkaVersion> compatibleKafkaVersions;

    /**
     * 
     <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * @return <p>
     *         A list of CompatibleKafkaVersion objects.
     *         </p>
     */
    public java.util.List<CompatibleKafkaVersion> getCompatibleKafkaVersions() {
        return compatibleKafkaVersions;
    }

    /**
     * 
     <p>
     * A list of CompatibleKafkaVersion objects.
     * </p>
     * 
     * @param compatibleKafkaVersions <p>
     *            A list of CompatibleKafkaVersion objects.
     *            </p>
     */
    public void setCompatibleKafkaVersions(
            java.util.Collection<CompatibleKafkaVersion> compatibleKafkaVersions) {
        if (compatibleKafkaVersions == null) {
            this.compatibleKafkaVersions = null;
            return;
        }

        this.compatibleKafkaVersions = new java.util.ArrayList<CompatibleKafkaVersion>(
                compatibleKafkaVersions);
    }

    /**
     * 
     <p>
     * A list of CompatibleKafkaVersion objects.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleKafkaVersions <p>
     *            A list of CompatibleKafkaVersion objects.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCompatibleKafkaVersionsResult withCompatibleKafkaVersions(
            CompatibleKafkaVersion... compatibleKafkaVersions) {
        if (getCompatibleKafkaVersions() == null) {
            this.compatibleKafkaVersions = new java.util.ArrayList<CompatibleKafkaVersion>(
                    compatibleKafkaVersions.length);
        }
        for (CompatibleKafkaVersion value : compatibleKafkaVersions) {
            this.compatibleKafkaVersions.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * A list of CompatibleKafkaVersion objects.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleKafkaVersions <p>
     *            A list of CompatibleKafkaVersion objects.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCompatibleKafkaVersionsResult withCompatibleKafkaVersions(
            java.util.Collection<CompatibleKafkaVersion> compatibleKafkaVersions) {
        setCompatibleKafkaVersions(compatibleKafkaVersions);
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
        if (getCompatibleKafkaVersions() != null)
            sb.append("CompatibleKafkaVersions: " + getCompatibleKafkaVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCompatibleKafkaVersions() == null) ? 0 : getCompatibleKafkaVersions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCompatibleKafkaVersionsResult == false)
            return false;
        GetCompatibleKafkaVersionsResult other = (GetCompatibleKafkaVersionsResult) obj;

        if (other.getCompatibleKafkaVersions() == null ^ this.getCompatibleKafkaVersions() == null)
            return false;
        if (other.getCompatibleKafkaVersions() != null
                && other.getCompatibleKafkaVersions().equals(this.getCompatibleKafkaVersions()) == false)
            return false;
        return true;
    }
}
