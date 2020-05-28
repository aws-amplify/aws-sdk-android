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

public class ListKafkaVersionsResult implements Serializable {
    /**
     * The new value for the kafkaVersions property for this object.
     */
    private java.util.List<KafkaVersion> kafkaVersions;

    /**
     * The new value for the nextToken property for this object.
     */
    private String nextToken;

    /**
     * Returns the value of the kafkaVersions property for this object.
     *
     * @return The value of the kafkaVersions property for this object.
     */
    public java.util.List<KafkaVersion> getKafkaVersions() {
        return kafkaVersions;
    }

    /**
     * Sets the value of kafkaVersions
     *
     * @param kafkaVersions The new value for the kafkaVersions property for
     *            this object.
     */
    public void setKafkaVersions(java.util.Collection<KafkaVersion> kafkaVersions) {
        if (kafkaVersions == null) {
            this.kafkaVersions = null;
            return;
        }

        this.kafkaVersions = new java.util.ArrayList<KafkaVersion>(kafkaVersions);
    }

    /**
     * Sets the value of the kafkaVersions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersions The new value for the kafkaVersions property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKafkaVersionsResult withKafkaVersions(KafkaVersion... kafkaVersions) {
        if (getKafkaVersions() == null) {
            this.kafkaVersions = new java.util.ArrayList<KafkaVersion>(kafkaVersions.length);
        }
        for (KafkaVersion value : kafkaVersions) {
            this.kafkaVersions.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the kafkaVersions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersions The new value for the kafkaVersions property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKafkaVersionsResult withKafkaVersions(
            java.util.Collection<KafkaVersion> kafkaVersions) {
        setKafkaVersions(kafkaVersions);
        return this;
    }

    /**
     * Returns the value of the nextToken property for this object.
     *
     * @return The value of the nextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of nextToken
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Sets the value of the nextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKafkaVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getKafkaVersions() != null)
            sb.append("KafkaVersions: " + getKafkaVersions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKafkaVersions() == null) ? 0 : getKafkaVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKafkaVersionsResult == false)
            return false;
        ListKafkaVersionsResult other = (ListKafkaVersionsResult) obj;

        if (other.getKafkaVersions() == null ^ this.getKafkaVersions() == null)
            return false;
        if (other.getKafkaVersions() != null
                && other.getKafkaVersions().equals(this.getKafkaVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
