/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class TestMetricFilterResult implements Serializable {
    /**
     * <p>
     * The matched events.
     * </p>
     */
    private java.util.List<MetricFilterMatchRecord> matches;

    /**
     * <p>
     * The matched events.
     * </p>
     *
     * @return <p>
     *         The matched events.
     *         </p>
     */
    public java.util.List<MetricFilterMatchRecord> getMatches() {
        return matches;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     *
     * @param matches <p>
     *            The matched events.
     *            </p>
     */
    public void setMatches(java.util.Collection<MetricFilterMatchRecord> matches) {
        if (matches == null) {
            this.matches = null;
            return;
        }

        this.matches = new java.util.ArrayList<MetricFilterMatchRecord>(matches);
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matches <p>
     *            The matched events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestMetricFilterResult withMatches(MetricFilterMatchRecord... matches) {
        if (getMatches() == null) {
            this.matches = new java.util.ArrayList<MetricFilterMatchRecord>(matches.length);
        }
        for (MetricFilterMatchRecord value : matches) {
            this.matches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matches <p>
     *            The matched events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestMetricFilterResult withMatches(java.util.Collection<MetricFilterMatchRecord> matches) {
        setMatches(matches);
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
        if (getMatches() != null)
            sb.append("matches: " + getMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatches() == null) ? 0 : getMatches().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMetricFilterResult == false)
            return false;
        TestMetricFilterResult other = (TestMetricFilterResult) obj;

        if (other.getMatches() == null ^ this.getMatches() == null)
            return false;
        if (other.getMatches() != null && other.getMatches().equals(this.getMatches()) == false)
            return false;
        return true;
    }
}
