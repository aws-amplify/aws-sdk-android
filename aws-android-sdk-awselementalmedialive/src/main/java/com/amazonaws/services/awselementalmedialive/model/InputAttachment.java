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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for InputAttachment
 */
public class InputAttachment implements Serializable {
    /**
     * User-specified settings for defining what the conditions are for
     * declaring the input unhealthy and failing over to a different input.
     */
    private AutomaticInputFailoverSettings automaticInputFailoverSettings;

    /**
     * User-specified name for the attachment. This is required if the user
     * wants to use this input in an input switch action.
     */
    private String inputAttachmentName;

    /**
     * The ID of the input
     */
    private String inputId;

    /**
     * Settings of an input (caption selector, etc.)
     */
    private InputSettings inputSettings;

    /**
     * User-specified settings for defining what the conditions are for
     * declaring the input unhealthy and failing over to a different input.
     *
     * @return User-specified settings for defining what the conditions are for
     *         declaring the input unhealthy and failing over to a different
     *         input.
     */
    public AutomaticInputFailoverSettings getAutomaticInputFailoverSettings() {
        return automaticInputFailoverSettings;
    }

    /**
     * User-specified settings for defining what the conditions are for
     * declaring the input unhealthy and failing over to a different input.
     *
     * @param automaticInputFailoverSettings User-specified settings for
     *            defining what the conditions are for declaring the input
     *            unhealthy and failing over to a different input.
     */
    public void setAutomaticInputFailoverSettings(
            AutomaticInputFailoverSettings automaticInputFailoverSettings) {
        this.automaticInputFailoverSettings = automaticInputFailoverSettings;
    }

    /**
     * User-specified settings for defining what the conditions are for
     * declaring the input unhealthy and failing over to a different input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticInputFailoverSettings User-specified settings for
     *            defining what the conditions are for declaring the input
     *            unhealthy and failing over to a different input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputAttachment withAutomaticInputFailoverSettings(
            AutomaticInputFailoverSettings automaticInputFailoverSettings) {
        this.automaticInputFailoverSettings = automaticInputFailoverSettings;
        return this;
    }

    /**
     * User-specified name for the attachment. This is required if the user
     * wants to use this input in an input switch action.
     *
     * @return User-specified name for the attachment. This is required if the
     *         user wants to use this input in an input switch action.
     */
    public String getInputAttachmentName() {
        return inputAttachmentName;
    }

    /**
     * User-specified name for the attachment. This is required if the user
     * wants to use this input in an input switch action.
     *
     * @param inputAttachmentName User-specified name for the attachment. This
     *            is required if the user wants to use this input in an input
     *            switch action.
     */
    public void setInputAttachmentName(String inputAttachmentName) {
        this.inputAttachmentName = inputAttachmentName;
    }

    /**
     * User-specified name for the attachment. This is required if the user
     * wants to use this input in an input switch action.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputAttachmentName User-specified name for the attachment. This
     *            is required if the user wants to use this input in an input
     *            switch action.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputAttachment withInputAttachmentName(String inputAttachmentName) {
        this.inputAttachmentName = inputAttachmentName;
        return this;
    }

    /**
     * The ID of the input
     *
     * @return The ID of the input
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * The ID of the input
     *
     * @param inputId The ID of the input
     */
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * The ID of the input
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputId The ID of the input
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputAttachment withInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }

    /**
     * Settings of an input (caption selector, etc.)
     *
     * @return Settings of an input (caption selector, etc.)
     */
    public InputSettings getInputSettings() {
        return inputSettings;
    }

    /**
     * Settings of an input (caption selector, etc.)
     *
     * @param inputSettings Settings of an input (caption selector, etc.)
     */
    public void setInputSettings(InputSettings inputSettings) {
        this.inputSettings = inputSettings;
    }

    /**
     * Settings of an input (caption selector, etc.)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSettings Settings of an input (caption selector, etc.)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputAttachment withInputSettings(InputSettings inputSettings) {
        this.inputSettings = inputSettings;
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
        if (getAutomaticInputFailoverSettings() != null)
            sb.append("AutomaticInputFailoverSettings: " + getAutomaticInputFailoverSettings()
                    + ",");
        if (getInputAttachmentName() != null)
            sb.append("InputAttachmentName: " + getInputAttachmentName() + ",");
        if (getInputId() != null)
            sb.append("InputId: " + getInputId() + ",");
        if (getInputSettings() != null)
            sb.append("InputSettings: " + getInputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomaticInputFailoverSettings() == null) ? 0
                        : getAutomaticInputFailoverSettings().hashCode());
        hashCode = prime * hashCode
                + ((getInputAttachmentName() == null) ? 0 : getInputAttachmentName().hashCode());
        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode
                + ((getInputSettings() == null) ? 0 : getInputSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputAttachment == false)
            return false;
        InputAttachment other = (InputAttachment) obj;

        if (other.getAutomaticInputFailoverSettings() == null
                ^ this.getAutomaticInputFailoverSettings() == null)
            return false;
        if (other.getAutomaticInputFailoverSettings() != null
                && other.getAutomaticInputFailoverSettings().equals(
                        this.getAutomaticInputFailoverSettings()) == false)
            return false;
        if (other.getInputAttachmentName() == null ^ this.getInputAttachmentName() == null)
            return false;
        if (other.getInputAttachmentName() != null
                && other.getInputAttachmentName().equals(this.getInputAttachmentName()) == false)
            return false;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getInputSettings() == null ^ this.getInputSettings() == null)
            return false;
        if (other.getInputSettings() != null
                && other.getInputSettings().equals(this.getInputSettings()) == false)
            return false;
        return true;
    }
}
