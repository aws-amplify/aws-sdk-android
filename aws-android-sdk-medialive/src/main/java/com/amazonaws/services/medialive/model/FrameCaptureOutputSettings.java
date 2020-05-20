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
 * Frame Capture Output Settings
 */
public class FrameCaptureOutputSettings implements Serializable {
    /**
     * Required if the output group contains more than one output. This modifier
     * forms part of the output file name.
     */
    private String nameModifier;

    /**
     * Required if the output group contains more than one output. This modifier
     * forms part of the output file name.
     *
     * @return Required if the output group contains more than one output. This
     *         modifier forms part of the output file name.
     */
    public String getNameModifier() {
        return nameModifier;
    }

    /**
     * Required if the output group contains more than one output. This modifier
     * forms part of the output file name.
     *
     * @param nameModifier Required if the output group contains more than one
     *            output. This modifier forms part of the output file name.
     */
    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    /**
     * Required if the output group contains more than one output. This modifier
     * forms part of the output file name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nameModifier Required if the output group contains more than one
     *            output. This modifier forms part of the output file name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureOutputSettings withNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
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
        if (getNameModifier() != null)
            sb.append("NameModifier: " + getNameModifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNameModifier() == null) ? 0 : getNameModifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureOutputSettings == false)
            return false;
        FrameCaptureOutputSettings other = (FrameCaptureOutputSettings) obj;

        if (other.getNameModifier() == null ^ this.getNameModifier() == null)
            return false;
        if (other.getNameModifier() != null
                && other.getNameModifier().equals(this.getNameModifier()) == false)
            return false;
        return true;
    }
}
