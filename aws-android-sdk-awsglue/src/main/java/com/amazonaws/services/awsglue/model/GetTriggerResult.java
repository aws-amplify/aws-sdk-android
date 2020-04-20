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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetTriggerResult implements Serializable {
    /**
     * <p>
     * The requested trigger definition.
     * </p>
     */
    private Trigger trigger;

    /**
     * <p>
     * The requested trigger definition.
     * </p>
     *
     * @return <p>
     *         The requested trigger definition.
     *         </p>
     */
    public Trigger getTrigger() {
        return trigger;
    }

    /**
     * <p>
     * The requested trigger definition.
     * </p>
     *
     * @param trigger <p>
     *            The requested trigger definition.
     *            </p>
     */
    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The requested trigger definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trigger <p>
     *            The requested trigger definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTriggerResult withTrigger(Trigger trigger) {
        this.trigger = trigger;
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
        if (getTrigger() != null)
            sb.append("Trigger: " + getTrigger());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTriggerResult == false)
            return false;
        GetTriggerResult other = (GetTriggerResult) obj;

        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        return true;
    }
}
