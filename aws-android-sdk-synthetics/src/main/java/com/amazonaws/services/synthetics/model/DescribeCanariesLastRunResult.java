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

public class DescribeCanariesLastRunResult implements Serializable {
    /**
     * <p>
     * An array that contains the information from the most recent run of each
     * canary.
     * </p>
     */
    private java.util.List<CanaryLastRun> canariesLastRun;

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanariesLastRun</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains the information from the most recent run of each
     * canary.
     * </p>
     *
     * @return <p>
     *         An array that contains the information from the most recent run
     *         of each canary.
     *         </p>
     */
    public java.util.List<CanaryLastRun> getCanariesLastRun() {
        return canariesLastRun;
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each
     * canary.
     * </p>
     *
     * @param canariesLastRun <p>
     *            An array that contains the information from the most recent
     *            run of each canary.
     *            </p>
     */
    public void setCanariesLastRun(java.util.Collection<CanaryLastRun> canariesLastRun) {
        if (canariesLastRun == null) {
            this.canariesLastRun = null;
            return;
        }

        this.canariesLastRun = new java.util.ArrayList<CanaryLastRun>(canariesLastRun);
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each
     * canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canariesLastRun <p>
     *            An array that contains the information from the most recent
     *            run of each canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesLastRunResult withCanariesLastRun(CanaryLastRun... canariesLastRun) {
        if (getCanariesLastRun() == null) {
            this.canariesLastRun = new java.util.ArrayList<CanaryLastRun>(canariesLastRun.length);
        }
        for (CanaryLastRun value : canariesLastRun) {
            this.canariesLastRun.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each
     * canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canariesLastRun <p>
     *            An array that contains the information from the most recent
     *            run of each canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesLastRunResult withCanariesLastRun(
            java.util.Collection<CanaryLastRun> canariesLastRun) {
        setCanariesLastRun(canariesLastRun);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanariesLastRun</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @return <p>
     *         A token that indicates that there is more data available. You can
     *         use this token in a subsequent
     *         <code>DescribeCanariesLastRun</code> operation to retrieve the
     *         next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanariesLastRun</code> operation
     * to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent
     *            <code>DescribeCanariesLastRun</code> operation to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent <code>DescribeCanariesLastRun</code> operation
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
     *            <code>DescribeCanariesLastRun</code> operation to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesLastRunResult withNextToken(String nextToken) {
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
        if (getCanariesLastRun() != null)
            sb.append("CanariesLastRun: " + getCanariesLastRun() + ",");
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
                + ((getCanariesLastRun() == null) ? 0 : getCanariesLastRun().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCanariesLastRunResult == false)
            return false;
        DescribeCanariesLastRunResult other = (DescribeCanariesLastRunResult) obj;

        if (other.getCanariesLastRun() == null ^ this.getCanariesLastRun() == null)
            return false;
        if (other.getCanariesLastRun() != null
                && other.getCanariesLastRun().equals(this.getCanariesLastRun()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
