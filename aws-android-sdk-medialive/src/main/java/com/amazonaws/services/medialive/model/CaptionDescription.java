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
 * Caption Description
 */
public class CaptionDescription implements Serializable {
    /**
     * Specifies which input caption selector to use as a caption source when
     * generating output captions. This field should match a captionSelector
     * name.
     */
    private String captionSelectorName;

    /**
     * Additional settings for captions destination that depend on the
     * destination type.
     */
    private CaptionDestinationSettings destinationSettings;

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     */
    private String languageCode;

    /**
     * Human readable information to indicate captions available for players
     * (eg. English, or Spanish).
     */
    private String languageDescription;

    /**
     * Name of the caption description. Used to associate a caption description
     * with an output. Names must be unique within an event.
     */
    private String name;

    /**
     * Specifies which input caption selector to use as a caption source when
     * generating output captions. This field should match a captionSelector
     * name.
     *
     * @return Specifies which input caption selector to use as a caption source
     *         when generating output captions. This field should match a
     *         captionSelector name.
     */
    public String getCaptionSelectorName() {
        return captionSelectorName;
    }

    /**
     * Specifies which input caption selector to use as a caption source when
     * generating output captions. This field should match a captionSelector
     * name.
     *
     * @param captionSelectorName Specifies which input caption selector to use
     *            as a caption source when generating output captions. This
     *            field should match a captionSelector name.
     */
    public void setCaptionSelectorName(String captionSelectorName) {
        this.captionSelectorName = captionSelectorName;
    }

    /**
     * Specifies which input caption selector to use as a caption source when
     * generating output captions. This field should match a captionSelector
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionSelectorName Specifies which input caption selector to use
     *            as a caption source when generating output captions. This
     *            field should match a captionSelector name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescription withCaptionSelectorName(String captionSelectorName) {
        this.captionSelectorName = captionSelectorName;
        return this;
    }

    /**
     * Additional settings for captions destination that depend on the
     * destination type.
     *
     * @return Additional settings for captions destination that depend on the
     *         destination type.
     */
    public CaptionDestinationSettings getDestinationSettings() {
        return destinationSettings;
    }

    /**
     * Additional settings for captions destination that depend on the
     * destination type.
     *
     * @param destinationSettings Additional settings for captions destination
     *            that depend on the destination type.
     */
    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Additional settings for captions destination that depend on the
     * destination type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSettings Additional settings for captions destination
     *            that depend on the destination type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescription withDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     *
     * @return ISO 639-2 three-digit code:
     *         http://www.loc.gov/standards/iso639-2/
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     *
     * @param languageCode ISO 639-2 three-digit code:
     *            http://www.loc.gov/standards/iso639-2/
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCode ISO 639-2 three-digit code:
     *            http://www.loc.gov/standards/iso639-2/
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescription withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Human readable information to indicate captions available for players
     * (eg. English, or Spanish).
     *
     * @return Human readable information to indicate captions available for
     *         players (eg. English, or Spanish).
     */
    public String getLanguageDescription() {
        return languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players
     * (eg. English, or Spanish).
     *
     * @param languageDescription Human readable information to indicate
     *            captions available for players (eg. English, or Spanish).
     */
    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players
     * (eg. English, or Spanish).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageDescription Human readable information to indicate
     *            captions available for players (eg. English, or Spanish).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescription withLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
        return this;
    }

    /**
     * Name of the caption description. Used to associate a caption description
     * with an output. Names must be unique within an event.
     *
     * @return Name of the caption description. Used to associate a caption
     *         description with an output. Names must be unique within an event.
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the caption description. Used to associate a caption description
     * with an output. Names must be unique within an event.
     *
     * @param name Name of the caption description. Used to associate a caption
     *            description with an output. Names must be unique within an
     *            event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the caption description. Used to associate a caption description
     * with an output. Names must be unique within an event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name Name of the caption description. Used to associate a caption
     *            description with an output. Names must be unique within an
     *            event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionDescription withName(String name) {
        this.name = name;
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
        if (getCaptionSelectorName() != null)
            sb.append("CaptionSelectorName: " + getCaptionSelectorName() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: " + getLanguageDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaptionSelectorName() == null) ? 0 : getCaptionSelectorName().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDescription == false)
            return false;
        CaptionDescription other = (CaptionDescription) obj;

        if (other.getCaptionSelectorName() == null ^ this.getCaptionSelectorName() == null)
            return false;
        if (other.getCaptionSelectorName() != null
                && other.getCaptionSelectorName().equals(this.getCaptionSelectorName()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null
                && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null
                && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
