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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the default server-side-encryption configuration.
 * </p>
 */
public class ServerSideEncryptionConfiguration implements Serializable {
    /**
     * <p>
     * Container for information about a particular server-side encryption
     * configuration rule.
     * </p>
     */
    private java.util.List<ServerSideEncryptionRule> rules;

    /**
     * <p>
     * Container for information about a particular server-side encryption
     * configuration rule.
     * </p>
     *
     * @return <p>
     *         Container for information about a particular server-side
     *         encryption configuration rule.
     *         </p>
     */
    public java.util.List<ServerSideEncryptionRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Container for information about a particular server-side encryption
     * configuration rule.
     * </p>
     *
     * @param rules <p>
     *            Container for information about a particular server-side
     *            encryption configuration rule.
     *            </p>
     */
    public void setRules(java.util.Collection<ServerSideEncryptionRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ServerSideEncryptionRule>(rules);
    }

    /**
     * <p>
     * Container for information about a particular server-side encryption
     * configuration rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Container for information about a particular server-side
     *            encryption configuration rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerSideEncryptionConfiguration withRules(ServerSideEncryptionRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<ServerSideEncryptionRule>(rules.length);
        }
        for (ServerSideEncryptionRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for information about a particular server-side encryption
     * configuration rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            Container for information about a particular server-side
     *            encryption configuration rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerSideEncryptionConfiguration withRules(
            java.util.Collection<ServerSideEncryptionRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryptionConfiguration == false)
            return false;
        ServerSideEncryptionConfiguration other = (ServerSideEncryptionConfiguration) obj;

        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
