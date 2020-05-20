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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

public class ListDeploymentTargetsResult implements Serializable {
    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     */
    private java.util.List<String> targetIds;

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also
     * returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of
     * deployment targets in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     *
     * @return <p>
     *         The unique IDs of deployment targets.
     *         </p>
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     *
     * @param targetIds <p>
     *            The unique IDs of deployment targets.
     *            </p>
     */
    public void setTargetIds(java.util.Collection<String> targetIds) {
        if (targetIds == null) {
            this.targetIds = null;
            return;
        }

        this.targetIds = new java.util.ArrayList<String>(targetIds);
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIds <p>
     *            The unique IDs of deployment targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsResult withTargetIds(String... targetIds) {
        if (getTargetIds() == null) {
            this.targetIds = new java.util.ArrayList<String>(targetIds.length);
        }
        for (String value : targetIds) {
            this.targetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIds <p>
     *            The unique IDs of deployment targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsResult withTargetIds(java.util.Collection<String> targetIds) {
        setTargetIds(targetIds);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also
     * returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of
     * deployment targets in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, a token identifier
     *         is also returned. It can be used in a subsequent
     *         <code>ListDeploymentTargets</code> call to return the next set of
     *         deployment targets in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also
     * returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of
     * deployment targets in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, a token
     *            identifier is also returned. It can be used in a subsequent
     *            <code>ListDeploymentTargets</code> call to return the next set
     *            of deployment targets in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also
     * returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of
     * deployment targets in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, a token
     *            identifier is also returned. It can be used in a subsequent
     *            <code>ListDeploymentTargets</code> call to return the next set
     *            of deployment targets in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeploymentTargetsResult withNextToken(String nextToken) {
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
        if (getTargetIds() != null)
            sb.append("targetIds: " + getTargetIds() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetIds() == null) ? 0 : getTargetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentTargetsResult == false)
            return false;
        ListDeploymentTargetsResult other = (ListDeploymentTargetsResult) obj;

        if (other.getTargetIds() == null ^ this.getTargetIds() == null)
            return false;
        if (other.getTargetIds() != null
                && other.getTargetIds().equals(this.getTargetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
