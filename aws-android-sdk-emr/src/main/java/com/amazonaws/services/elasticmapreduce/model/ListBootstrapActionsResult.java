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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * This output contains the bootstrap actions detail.
 * </p>
 */
public class ListBootstrapActionsResult implements Serializable {
    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     */
    private java.util.List<Command> bootstrapActions;

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     *
     * @return <p>
     *         The bootstrap actions associated with the cluster.
     *         </p>
     */
    public java.util.List<Command> getBootstrapActions() {
        return bootstrapActions;
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     *
     * @param bootstrapActions <p>
     *            The bootstrap actions associated with the cluster.
     *            </p>
     */
    public void setBootstrapActions(java.util.Collection<Command> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new java.util.ArrayList<Command>(bootstrapActions);
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            The bootstrap actions associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBootstrapActionsResult withBootstrapActions(Command... bootstrapActions) {
        if (getBootstrapActions() == null) {
            this.bootstrapActions = new java.util.ArrayList<Command>(bootstrapActions.length);
        }
        for (Command value : bootstrapActions) {
            this.bootstrapActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bootstrapActions <p>
     *            The bootstrap actions associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBootstrapActionsResult withBootstrapActions(
            java.util.Collection<Command> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results to
     *         retrieve.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBootstrapActionsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBootstrapActionsResult == false)
            return false;
        ListBootstrapActionsResult other = (ListBootstrapActionsResult) obj;

        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null)
            return false;
        if (other.getBootstrapActions() != null
                && other.getBootstrapActions().equals(this.getBootstrapActions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
