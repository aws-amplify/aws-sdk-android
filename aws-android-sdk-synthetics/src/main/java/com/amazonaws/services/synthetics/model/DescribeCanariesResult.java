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

public class DescribeCanariesResult implements Serializable {
    /**
     * <p>
     * Returns an array. Each item in the array contains the full information
     * about one canary.
     * </p>
     */
    private java.util.List<Canary> canaries;

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanaries</code> operation to
     * retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information
     * about one canary.
     * </p>
     *
     * @return <p>
     *         Returns an array. Each item in the array contains the full
     *         information about one canary.
     *         </p>
     */
    public java.util.List<Canary> getCanaries() {
        return canaries;
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information
     * about one canary.
     * </p>
     *
     * @param canaries <p>
     *            Returns an array. Each item in the array contains the full
     *            information about one canary.
     *            </p>
     */
    public void setCanaries(java.util.Collection<Canary> canaries) {
        if (canaries == null) {
            this.canaries = null;
            return;
        }

        this.canaries = new java.util.ArrayList<Canary>(canaries);
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information
     * about one canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canaries <p>
     *            Returns an array. Each item in the array contains the full
     *            information about one canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesResult withCanaries(Canary... canaries) {
        if (getCanaries() == null) {
            this.canaries = new java.util.ArrayList<Canary>(canaries.length);
        }
        for (Canary value : canaries) {
            this.canaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array. Each item in the array contains the full information
     * about one canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canaries <p>
     *            Returns an array. Each item in the array contains the full
     *            information about one canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesResult withCanaries(java.util.Collection<Canary> canaries) {
        setCanaries(canaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanaries</code> operation to
     * retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @return <p>
     *         A token that indicates that there is more data available. You can
     *         use this token in a subsequent <code>DescribeCanaries</code>
     *         operation to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanaries</code> operation to
     * retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent
     *            <code>DescribeCanaries</code> operation to retrieve the next
     *            set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanaries</code> operation to
     * retrieve the next set of results.
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
     *            <code>DescribeCanaries</code> operation to retrieve the next
     *            set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesResult withNextToken(String nextToken) {
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
        if (getCanaries() != null)
            sb.append("Canaries: " + getCanaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanaries() == null) ? 0 : getCanaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCanariesResult == false)
            return false;
        DescribeCanariesResult other = (DescribeCanariesResult) obj;

        if (other.getCanaries() == null ^ this.getCanaries() == null)
            return false;
        if (other.getCanaries() != null && other.getCanaries().equals(this.getCanaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
