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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class BatchGetTriggersResult implements Serializable {
    /**
     * <p>
     * A list of trigger definitions.
     * </p>
     */
    private java.util.List<Trigger> triggers;

    /**
     * <p>
     * A list of names of triggers not found.
     * </p>
     */
    private java.util.List<String> triggersNotFound;

    /**
     * <p>
     * A list of trigger definitions.
     * </p>
     *
     * @return <p>
     *         A list of trigger definitions.
     *         </p>
     */
    public java.util.List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of trigger definitions.
     * </p>
     *
     * @param triggers <p>
     *            A list of trigger definitions.
     *            </p>
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<Trigger>(triggers);
    }

    /**
     * <p>
     * A list of trigger definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            A list of trigger definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersResult withTriggers(Trigger... triggers) {
        if (getTriggers() == null) {
            this.triggers = new java.util.ArrayList<Trigger>(triggers.length);
        }
        for (Trigger value : triggers) {
            this.triggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of trigger definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            A list of trigger definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersResult withTriggers(java.util.Collection<Trigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * A list of names of triggers not found.
     * </p>
     *
     * @return <p>
     *         A list of names of triggers not found.
     *         </p>
     */
    public java.util.List<String> getTriggersNotFound() {
        return triggersNotFound;
    }

    /**
     * <p>
     * A list of names of triggers not found.
     * </p>
     *
     * @param triggersNotFound <p>
     *            A list of names of triggers not found.
     *            </p>
     */
    public void setTriggersNotFound(java.util.Collection<String> triggersNotFound) {
        if (triggersNotFound == null) {
            this.triggersNotFound = null;
            return;
        }

        this.triggersNotFound = new java.util.ArrayList<String>(triggersNotFound);
    }

    /**
     * <p>
     * A list of names of triggers not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggersNotFound <p>
     *            A list of names of triggers not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersResult withTriggersNotFound(String... triggersNotFound) {
        if (getTriggersNotFound() == null) {
            this.triggersNotFound = new java.util.ArrayList<String>(triggersNotFound.length);
        }
        for (String value : triggersNotFound) {
            this.triggersNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of triggers not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggersNotFound <p>
     *            A list of names of triggers not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetTriggersResult withTriggersNotFound(java.util.Collection<String> triggersNotFound) {
        setTriggersNotFound(triggersNotFound);
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
        if (getTriggers() != null)
            sb.append("Triggers: " + getTriggers() + ",");
        if (getTriggersNotFound() != null)
            sb.append("TriggersNotFound: " + getTriggersNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode
                + ((getTriggersNotFound() == null) ? 0 : getTriggersNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTriggersResult == false)
            return false;
        BatchGetTriggersResult other = (BatchGetTriggersResult) obj;

        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getTriggersNotFound() == null ^ this.getTriggersNotFound() == null)
            return false;
        if (other.getTriggersNotFound() != null
                && other.getTriggersNotFound().equals(this.getTriggersNotFound()) == false)
            return false;
        return true;
    }
}
