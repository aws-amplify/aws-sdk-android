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
 * Audio Selector
 */
public class AudioSelector implements Serializable {
    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to
     * uniquely identify this Selector. Selector names should be unique per
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * The audio selector settings.
     */
    private AudioSelectorSettings selectorSettings;

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to
     * uniquely identify this Selector. Selector names should be unique per
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The name of this AudioSelector. AudioDescriptions will use this
     *         name to uniquely identify this Selector. Selector names should be
     *         unique per input.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to
     * uniquely identify this Selector. Selector names should be unique per
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name The name of this AudioSelector. AudioDescriptions will use
     *            this name to uniquely identify this Selector. Selector names
     *            should be unique per input.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to
     * uniquely identify this Selector. Selector names should be unique per
     * input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name The name of this AudioSelector. AudioDescriptions will use
     *            this name to uniquely identify this Selector. Selector names
     *            should be unique per input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The audio selector settings.
     *
     * @return The audio selector settings.
     */
    public AudioSelectorSettings getSelectorSettings() {
        return selectorSettings;
    }

    /**
     * The audio selector settings.
     *
     * @param selectorSettings The audio selector settings.
     */
    public void setSelectorSettings(AudioSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * The audio selector settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectorSettings The audio selector settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelector withSelectorSettings(AudioSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
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
        if (getSelectorSettings() != null)
            sb.append("SelectorSettings: " + getSelectorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSelectorSettings() == null) ? 0 : getSelectorSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelector == false)
            return false;
        AudioSelector other = (AudioSelector) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSelectorSettings() == null ^ this.getSelectorSettings() == null)
            return false;
        if (other.getSelectorSettings() != null
                && other.getSelectorSettings().equals(this.getSelectorSettings()) == false)
            return false;
        return true;
    }
}
