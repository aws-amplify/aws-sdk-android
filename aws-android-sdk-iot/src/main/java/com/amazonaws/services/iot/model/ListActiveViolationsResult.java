/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListActiveViolationsResult implements Serializable {
    /**
     * <p>
     * The list of active violations.
     * </p>
     */
    private java.util.List<ActiveViolation> activeViolations;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of active violations.
     * </p>
     *
     * @return <p>
     *         The list of active violations.
     *         </p>
     */
    public java.util.List<ActiveViolation> getActiveViolations() {
        return activeViolations;
    }

    /**
     * <p>
     * The list of active violations.
     * </p>
     *
     * @param activeViolations <p>
     *            The list of active violations.
     *            </p>
     */
    public void setActiveViolations(java.util.Collection<ActiveViolation> activeViolations) {
        if (activeViolations == null) {
            this.activeViolations = null;
            return;
        }

        this.activeViolations = new java.util.ArrayList<ActiveViolation>(activeViolations);
    }

    /**
     * <p>
     * The list of active violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeViolations <p>
     *            The list of active violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsResult withActiveViolations(ActiveViolation... activeViolations) {
        if (getActiveViolations() == null) {
            this.activeViolations = new java.util.ArrayList<ActiveViolation>(
                    activeViolations.length);
        }
        for (ActiveViolation value : activeViolations) {
            this.activeViolations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of active violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeViolations <p>
     *            The list of active violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsResult withActiveViolations(
            java.util.Collection<ActiveViolation> activeViolations) {
        setActiveViolations(activeViolations);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListActiveViolationsResult withNextToken(String nextToken) {
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
        if (getActiveViolations() != null)
            sb.append("activeViolations: " + getActiveViolations() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActiveViolations() == null) ? 0 : getActiveViolations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListActiveViolationsResult == false)
            return false;
        ListActiveViolationsResult other = (ListActiveViolationsResult) obj;

        if (other.getActiveViolations() == null ^ this.getActiveViolations() == null)
            return false;
        if (other.getActiveViolations() != null
                && other.getActiveViolations().equals(this.getActiveViolations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
