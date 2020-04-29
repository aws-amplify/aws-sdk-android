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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

public class ListIPSetsResult implements Serializable {
    /**
     * <p>
     * To list more <code>IPSet</code> objects, submit another
     * <code>ListIPSets</code> request, and in the next request use the
     * <code>NextMarker</code> response value as the <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>IPSetSummary</a> objects.
     * </p>
     */
    private java.util.List<IPSetSummary> iPSets;

    /**
     * <p>
     * To list more <code>IPSet</code> objects, submit another
     * <code>ListIPSets</code> request, and in the next request use the
     * <code>NextMarker</code> response value as the <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         To list more <code>IPSet</code> objects, submit another
     *         <code>ListIPSets</code> request, and in the next request use the
     *         <code>NextMarker</code> response value as the
     *         <code>NextMarker</code> value.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * To list more <code>IPSet</code> objects, submit another
     * <code>ListIPSets</code> request, and in the next request use the
     * <code>NextMarker</code> response value as the <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            To list more <code>IPSet</code> objects, submit another
     *            <code>ListIPSets</code> request, and in the next request use
     *            the <code>NextMarker</code> response value as the
     *            <code>NextMarker</code> value.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * To list more <code>IPSet</code> objects, submit another
     * <code>ListIPSets</code> request, and in the next request use the
     * <code>NextMarker</code> response value as the <code>NextMarker</code>
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            To list more <code>IPSet</code> objects, submit another
     *            <code>ListIPSets</code> request, and in the next request use
     *            the <code>NextMarker</code> response value as the
     *            <code>NextMarker</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of <a>IPSetSummary</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>IPSetSummary</a> objects.
     *         </p>
     */
    public java.util.List<IPSetSummary> getIPSets() {
        return iPSets;
    }

    /**
     * <p>
     * An array of <a>IPSetSummary</a> objects.
     * </p>
     *
     * @param iPSets <p>
     *            An array of <a>IPSetSummary</a> objects.
     *            </p>
     */
    public void setIPSets(java.util.Collection<IPSetSummary> iPSets) {
        if (iPSets == null) {
            this.iPSets = null;
            return;
        }

        this.iPSets = new java.util.ArrayList<IPSetSummary>(iPSets);
    }

    /**
     * <p>
     * An array of <a>IPSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSets <p>
     *            An array of <a>IPSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withIPSets(IPSetSummary... iPSets) {
        if (getIPSets() == null) {
            this.iPSets = new java.util.ArrayList<IPSetSummary>(iPSets.length);
        }
        for (IPSetSummary value : iPSets) {
            this.iPSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>IPSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSets <p>
     *            An array of <a>IPSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIPSetsResult withIPSets(java.util.Collection<IPSetSummary> iPSets) {
        setIPSets(iPSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getIPSets() != null)
            sb.append("IPSets: " + getIPSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getIPSets() == null) ? 0 : getIPSets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIPSetsResult == false)
            return false;
        ListIPSetsResult other = (ListIPSetsResult) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getIPSets() == null ^ this.getIPSets() == null)
            return false;
        if (other.getIPSets() != null && other.getIPSets().equals(this.getIPSets()) == false)
            return false;
        return true;
    }
}
