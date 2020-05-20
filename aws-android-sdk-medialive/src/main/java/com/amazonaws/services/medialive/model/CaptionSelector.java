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
public class CaptionSelector implements Serializable {
    /**
     * When specified this field indicates the three letter language code of the
     * caption track to extract from the source.
     */
    private String languageCode;

    /**
     * Name identifier for a caption selector. This name is used to associate
     * this caption selector with one or more caption descriptions. Names must
     * be unique within an event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * Caption selector settings.
     */
    private CaptionSelectorSettings selectorSettings;

    /**
     * When specified this field indicates the three letter language code of the
     * caption track to extract from the source.
     *
     * @return When specified this field indicates the three letter language
     *         code of the caption track to extract from the source.
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * When specified this field indicates the three letter language code of the
     * caption track to extract from the source.
     *
     * @param languageCode When specified this field indicates the three letter
     *            language code of the caption track to extract from the source.
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * When specified this field indicates the three letter language code of the
     * caption track to extract from the source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCode When specified this field indicates the three letter
     *            language code of the caption track to extract from the source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelector withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate
     * this caption selector with one or more caption descriptions. Names must
     * be unique within an event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Name identifier for a caption selector. This name is used to
     *         associate this caption selector with one or more caption
     *         descriptions. Names must be unique within an event.
     */
    public String getName() {
        return name;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate
     * this caption selector with one or more caption descriptions. Names must
     * be unique within an event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name Name identifier for a caption selector. This name is used to
     *            associate this caption selector with one or more caption
     *            descriptions. Names must be unique within an event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate
     * this caption selector with one or more caption descriptions. Names must
     * be unique within an event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name Name identifier for a caption selector. This name is used to
     *            associate this caption selector with one or more caption
     *            descriptions. Names must be unique within an event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelector withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Caption selector settings.
     *
     * @return Caption selector settings.
     */
    public CaptionSelectorSettings getSelectorSettings() {
        return selectorSettings;
    }

    /**
     * Caption selector settings.
     *
     * @param selectorSettings Caption selector settings.
     */
    public void setSelectorSettings(CaptionSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * Caption selector settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectorSettings Caption selector settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionSelector withSelectorSettings(CaptionSelectorSettings selectorSettings) {
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
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

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
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

        if (obj instanceof CaptionSelector == false)
            return false;
        CaptionSelector other = (CaptionSelector) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
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
