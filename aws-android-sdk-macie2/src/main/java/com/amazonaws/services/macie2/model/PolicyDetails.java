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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides detailed information about a policy finding.
 * </p>
 */
public class PolicyDetails implements Serializable {
    /**
     * <p>
     * The action that occurred and produced the finding.
     * </p>
     */
    private FindingAction action;

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     */
    private FindingActor actor;

    /**
     * <p>
     * The action that occurred and produced the finding.
     * </p>
     *
     * @return <p>
     *         The action that occurred and produced the finding.
     *         </p>
     */
    public FindingAction getAction() {
        return action;
    }

    /**
     * <p>
     * The action that occurred and produced the finding.
     * </p>
     *
     * @param action <p>
     *            The action that occurred and produced the finding.
     *            </p>
     */
    public void setAction(FindingAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that occurred and produced the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The action that occurred and produced the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withAction(FindingAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     *
     * @return <p>
     *         The entity that performed the action that produced the finding.
     *         </p>
     */
    public FindingActor getActor() {
        return actor;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     *
     * @param actor <p>
     *            The entity that performed the action that produced the
     *            finding.
     *            </p>
     */
    public void setActor(FindingActor actor) {
        this.actor = actor;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actor <p>
     *            The entity that performed the action that produced the
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withActor(FindingActor actor) {
        this.actor = actor;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getActor() != null)
            sb.append("actor: " + getActor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getActor() == null) ? 0 : getActor().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDetails == false)
            return false;
        PolicyDetails other = (PolicyDetails) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getActor() == null ^ this.getActor() == null)
            return false;
        if (other.getActor() != null && other.getActor().equals(this.getActor()) == false)
            return false;
        return true;
    }
}
