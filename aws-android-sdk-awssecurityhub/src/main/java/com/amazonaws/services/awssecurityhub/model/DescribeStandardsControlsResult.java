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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class DescribeStandardsControlsResult implements Serializable {
    /**
     * <p>
     * A list of security standards controls.
     * </p>
     */
    private java.util.List<StandardsControl> controls;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of security standards controls.
     * </p>
     *
     * @return <p>
     *         A list of security standards controls.
     *         </p>
     */
    public java.util.List<StandardsControl> getControls() {
        return controls;
    }

    /**
     * <p>
     * A list of security standards controls.
     * </p>
     *
     * @param controls <p>
     *            A list of security standards controls.
     *            </p>
     */
    public void setControls(java.util.Collection<StandardsControl> controls) {
        if (controls == null) {
            this.controls = null;
            return;
        }

        this.controls = new java.util.ArrayList<StandardsControl>(controls);
    }

    /**
     * <p>
     * A list of security standards controls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param controls <p>
     *            A list of security standards controls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStandardsControlsResult withControls(StandardsControl... controls) {
        if (getControls() == null) {
            this.controls = new java.util.ArrayList<StandardsControl>(controls.length);
        }
        for (StandardsControl value : controls) {
            this.controls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of security standards controls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param controls <p>
     *            A list of security standards controls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStandardsControlsResult withControls(
            java.util.Collection<StandardsControl> controls) {
        setControls(controls);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStandardsControlsResult withNextToken(String nextToken) {
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
        if (getControls() != null)
            sb.append("Controls: " + getControls() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControls() == null) ? 0 : getControls().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStandardsControlsResult == false)
            return false;
        DescribeStandardsControlsResult other = (DescribeStandardsControlsResult) obj;

        if (other.getControls() == null ^ this.getControls() == null)
            return false;
        if (other.getControls() != null && other.getControls().equals(this.getControls()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
