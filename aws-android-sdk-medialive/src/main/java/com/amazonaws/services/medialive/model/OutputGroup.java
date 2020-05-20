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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Output groups for this Live Event. Output groups contain information about
 * where streams should be distributed.
 */
public class OutputGroup implements Serializable {
    /**
     * Custom output group name optionally defined by the user. Only letters,
     * numbers, and the underscore character allowed; only 32 characters
     * allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String name;

    /**
     * Settings associated with the output group.
     */
    private OutputGroupSettings outputGroupSettings;

    /**
     * Placeholder documentation for __listOfOutput
     */
    private java.util.List<Output> outputs;

    /**
     * Custom output group name optionally defined by the user. Only letters,
     * numbers, and the underscore character allowed; only 32 characters
     * allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return Custom output group name optionally defined by the user. Only
     *         letters, numbers, and the underscore character allowed; only 32
     *         characters allowed.
     */
    public String getName() {
        return name;
    }

    /**
     * Custom output group name optionally defined by the user. Only letters,
     * numbers, and the underscore character allowed; only 32 characters
     * allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param name Custom output group name optionally defined by the user. Only
     *            letters, numbers, and the underscore character allowed; only
     *            32 characters allowed.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Custom output group name optionally defined by the user. Only letters,
     * numbers, and the underscore character allowed; only 32 characters
     * allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param name Custom output group name optionally defined by the user. Only
     *            letters, numbers, and the underscore character allowed; only
     *            32 characters allowed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Settings associated with the output group.
     *
     * @return Settings associated with the output group.
     */
    public OutputGroupSettings getOutputGroupSettings() {
        return outputGroupSettings;
    }

    /**
     * Settings associated with the output group.
     *
     * @param outputGroupSettings Settings associated with the output group.
     */
    public void setOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        this.outputGroupSettings = outputGroupSettings;
    }

    /**
     * Settings associated with the output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroupSettings Settings associated with the output group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        this.outputGroupSettings = outputGroupSettings;
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutput
     *
     * @return Placeholder documentation for __listOfOutput
     */
    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * Placeholder documentation for __listOfOutput
     *
     * @param outputs Placeholder documentation for __listOfOutput
     */
    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * Placeholder documentation for __listOfOutput
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs Placeholder documentation for __listOfOutput
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withOutputs(Output... outputs) {
        if (getOutputs() == null) {
            this.outputs = new java.util.ArrayList<Output>(outputs.length);
        }
        for (Output value : outputs) {
            this.outputs.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutput
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs Placeholder documentation for __listOfOutput
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOutputGroupSettings() != null)
            sb.append("OutputGroupSettings: " + getOutputGroupSettings() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputGroupSettings() == null) ? 0 : getOutputGroupSettings().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroup == false)
            return false;
        OutputGroup other = (OutputGroup) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputGroupSettings() == null ^ this.getOutputGroupSettings() == null)
            return false;
        if (other.getOutputGroupSettings() != null
                && other.getOutputGroupSettings().equals(this.getOutputGroupSettings()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        return true;
    }
}
