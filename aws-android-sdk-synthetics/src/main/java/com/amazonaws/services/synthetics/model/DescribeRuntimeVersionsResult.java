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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

public class DescribeRuntimeVersionsResult implements Serializable {
    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary
     * runtime version.
     * </p>
     */
    private java.util.List<RuntimeVersion> runtimeVersions;

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeRuntimeVersions</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary
     * runtime version.
     * </p>
     *
     * @return <p>
     *         An array of objects that display the details about each
     *         Synthetics canary runtime version.
     *         </p>
     */
    public java.util.List<RuntimeVersion> getRuntimeVersions() {
        return runtimeVersions;
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary
     * runtime version.
     * </p>
     *
     * @param runtimeVersions <p>
     *            An array of objects that display the details about each
     *            Synthetics canary runtime version.
     *            </p>
     */
    public void setRuntimeVersions(java.util.Collection<RuntimeVersion> runtimeVersions) {
        if (runtimeVersions == null) {
            this.runtimeVersions = null;
            return;
        }

        this.runtimeVersions = new java.util.ArrayList<RuntimeVersion>(runtimeVersions);
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary
     * runtime version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runtimeVersions <p>
     *            An array of objects that display the details about each
     *            Synthetics canary runtime version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRuntimeVersionsResult withRuntimeVersions(RuntimeVersion... runtimeVersions) {
        if (getRuntimeVersions() == null) {
            this.runtimeVersions = new java.util.ArrayList<RuntimeVersion>(runtimeVersions.length);
        }
        for (RuntimeVersion value : runtimeVersions) {
            this.runtimeVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that display the details about each Synthetics canary
     * runtime version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runtimeVersions <p>
     *            An array of objects that display the details about each
     *            Synthetics canary runtime version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRuntimeVersionsResult withRuntimeVersions(
            java.util.Collection<RuntimeVersion> runtimeVersions) {
        setRuntimeVersions(runtimeVersions);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeRuntimeVersions</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @return <p>
     *         A token that indicates that there is more data available. You can
     *         use this token in a subsequent
     *         <code>DescribeRuntimeVersions</code> operation to retrieve the
     *         next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeRuntimeVersions</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent
     *            <code>DescribeRuntimeVersions</code> operation to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeRuntimeVersions</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent
     *            <code>DescribeRuntimeVersions</code> operation to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRuntimeVersionsResult withNextToken(String nextToken) {
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
        if (getRuntimeVersions() != null)
            sb.append("RuntimeVersions: " + getRuntimeVersions() + ",");
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
                + ((getRuntimeVersions() == null) ? 0 : getRuntimeVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRuntimeVersionsResult == false)
            return false;
        DescribeRuntimeVersionsResult other = (DescribeRuntimeVersionsResult) obj;

        if (other.getRuntimeVersions() == null ^ this.getRuntimeVersions() == null)
            return false;
        if (other.getRuntimeVersions() != null
                && other.getRuntimeVersions().equals(this.getRuntimeVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
