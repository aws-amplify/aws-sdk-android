/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListMitigationActionsResult implements Serializable {
    /**
     * <p>
     * A set of actions that matched the specified filter criteria.
     * </p>
     */
    private java.util.List<MitigationActionIdentifier> actionIdentifiers;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A set of actions that matched the specified filter criteria.
     * </p>
     *
     * @return <p>
     *         A set of actions that matched the specified filter criteria.
     *         </p>
     */
    public java.util.List<MitigationActionIdentifier> getActionIdentifiers() {
        return actionIdentifiers;
    }

    /**
     * <p>
     * A set of actions that matched the specified filter criteria.
     * </p>
     *
     * @param actionIdentifiers <p>
     *            A set of actions that matched the specified filter criteria.
     *            </p>
     */
    public void setActionIdentifiers(
            java.util.Collection<MitigationActionIdentifier> actionIdentifiers) {
        if (actionIdentifiers == null) {
            this.actionIdentifiers = null;
            return;
        }

        this.actionIdentifiers = new java.util.ArrayList<MitigationActionIdentifier>(
                actionIdentifiers);
    }

    /**
     * <p>
     * A set of actions that matched the specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionIdentifiers <p>
     *            A set of actions that matched the specified filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMitigationActionsResult withActionIdentifiers(
            MitigationActionIdentifier... actionIdentifiers) {
        if (getActionIdentifiers() == null) {
            this.actionIdentifiers = new java.util.ArrayList<MitigationActionIdentifier>(
                    actionIdentifiers.length);
        }
        for (MitigationActionIdentifier value : actionIdentifiers) {
            this.actionIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of actions that matched the specified filter criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionIdentifiers <p>
     *            A set of actions that matched the specified filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMitigationActionsResult withActionIdentifiers(
            java.util.Collection<MitigationActionIdentifier> actionIdentifiers) {
        setActionIdentifiers(actionIdentifiers);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMitigationActionsResult withNextToken(String nextToken) {
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
        if (getActionIdentifiers() != null)
            sb.append("actionIdentifiers: " + getActionIdentifiers() + ",");
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
                + ((getActionIdentifiers() == null) ? 0 : getActionIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMitigationActionsResult == false)
            return false;
        ListMitigationActionsResult other = (ListMitigationActionsResult) obj;

        if (other.getActionIdentifiers() == null ^ this.getActionIdentifiers() == null)
            return false;
        if (other.getActionIdentifiers() != null
                && other.getActionIdentifiers().equals(this.getActionIdentifiers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
