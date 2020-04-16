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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Group of outputs
 */
public class OutputGroup implements Serializable {
    /**
     * Use Custom Group Name (CustomName) to specify a name for the output
     * group. This value is displayed on the console and can make your job
     * settings JSON more human-readable. It does not affect your outputs. Use
     * up to twelve characters that are either letters, numbers, spaces, or
     * underscores.
     */
    private String customName;

    /**
     * Name of the output group
     */
    private String name;

    /**
     * Output Group settings, including type
     */
    private OutputGroupSettings outputGroupSettings;

    /**
     * This object holds groups of encoding settings, one group of settings per
     * output.
     */
    private java.util.List<Output> outputs;

    /**
     * Use Custom Group Name (CustomName) to specify a name for the output
     * group. This value is displayed on the console and can make your job
     * settings JSON more human-readable. It does not affect your outputs. Use
     * up to twelve characters that are either letters, numbers, spaces, or
     * underscores.
     *
     * @return Use Custom Group Name (CustomName) to specify a name for the
     *         output group. This value is displayed on the console and can make
     *         your job settings JSON more human-readable. It does not affect
     *         your outputs. Use up to twelve characters that are either
     *         letters, numbers, spaces, or underscores.
     */
    public String getCustomName() {
        return customName;
    }

    /**
     * Use Custom Group Name (CustomName) to specify a name for the output
     * group. This value is displayed on the console and can make your job
     * settings JSON more human-readable. It does not affect your outputs. Use
     * up to twelve characters that are either letters, numbers, spaces, or
     * underscores.
     *
     * @param customName Use Custom Group Name (CustomName) to specify a name
     *            for the output group. This value is displayed on the console
     *            and can make your job settings JSON more human-readable. It
     *            does not affect your outputs. Use up to twelve characters that
     *            are either letters, numbers, spaces, or underscores.
     */
    public void setCustomName(String customName) {
        this.customName = customName;
    }

    /**
     * Use Custom Group Name (CustomName) to specify a name for the output
     * group. This value is displayed on the console and can make your job
     * settings JSON more human-readable. It does not affect your outputs. Use
     * up to twelve characters that are either letters, numbers, spaces, or
     * underscores.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customName Use Custom Group Name (CustomName) to specify a name
     *            for the output group. This value is displayed on the console
     *            and can make your job settings JSON more human-readable. It
     *            does not affect your outputs. Use up to twelve characters that
     *            are either letters, numbers, spaces, or underscores.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withCustomName(String customName) {
        this.customName = customName;
        return this;
    }

    /**
     * Name of the output group
     *
     * @return Name of the output group
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the output group
     *
     * @param name Name of the output group
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the output group
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of the output group
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Output Group settings, including type
     *
     * @return Output Group settings, including type
     */
    public OutputGroupSettings getOutputGroupSettings() {
        return outputGroupSettings;
    }

    /**
     * Output Group settings, including type
     *
     * @param outputGroupSettings Output Group settings, including type
     */
    public void setOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        this.outputGroupSettings = outputGroupSettings;
    }

    /**
     * Output Group settings, including type
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroupSettings Output Group settings, including type
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputGroup withOutputGroupSettings(OutputGroupSettings outputGroupSettings) {
        this.outputGroupSettings = outputGroupSettings;
        return this;
    }

    /**
     * This object holds groups of encoding settings, one group of settings per
     * output.
     *
     * @return This object holds groups of encoding settings, one group of
     *         settings per output.
     */
    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * This object holds groups of encoding settings, one group of settings per
     * output.
     *
     * @param outputs This object holds groups of encoding settings, one group
     *            of settings per output.
     */
    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * This object holds groups of encoding settings, one group of settings per
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs This object holds groups of encoding settings, one group
     *            of settings per output.
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
     * This object holds groups of encoding settings, one group of settings per
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs This object holds groups of encoding settings, one group
     *            of settings per output.
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
        if (getCustomName() != null)
            sb.append("CustomName: " + getCustomName() + ",");
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

        hashCode = prime * hashCode + ((getCustomName() == null) ? 0 : getCustomName().hashCode());
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

        if (other.getCustomName() == null ^ this.getCustomName() == null)
            return false;
        if (other.getCustomName() != null
                && other.getCustomName().equals(this.getCustomName()) == false)
            return false;
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
