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
 * Maps a caption channel to an ISO 693-2 language code
 * (http://www.loc.gov/standards/iso639-2), with an optional description.
 */
public class CaptionLanguageMapping implements Serializable {
    /**
     * The closed caption channel being described by this
     * CaptionLanguageMapping. Each channel mapping must have a unique channel
     * number (maximum of 4)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     */
    private Integer captionChannel;

    /**
     * Three character ISO 639-2 language code (see
     * http://www.loc.gov/standards/iso639-2)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     */
    private String languageCode;

    /**
     * Textual description of language
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String languageDescription;

    /**
     * The closed caption channel being described by this
     * CaptionLanguageMapping. Each channel mapping must have a unique channel
     * number (maximum of 4)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @return The closed caption channel being described by this
     *         CaptionLanguageMapping. Each channel mapping must have a unique
     *         channel number (maximum of 4)
     */
    public Integer getCaptionChannel() {
        return captionChannel;
    }

    /**
     * The closed caption channel being described by this
     * CaptionLanguageMapping. Each channel mapping must have a unique channel
     * number (maximum of 4)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param captionChannel The closed caption channel being described by this
     *            CaptionLanguageMapping. Each channel mapping must have a
     *            unique channel number (maximum of 4)
     */
    public void setCaptionChannel(Integer captionChannel) {
        this.captionChannel = captionChannel;
    }

    /**
     * The closed caption channel being described by this
     * CaptionLanguageMapping. Each channel mapping must have a unique channel
     * number (maximum of 4)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param captionChannel The closed caption channel being described by this
     *            CaptionLanguageMapping. Each channel mapping must have a
     *            unique channel number (maximum of 4)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionLanguageMapping withCaptionChannel(Integer captionChannel) {
        this.captionChannel = captionChannel;
        return this;
    }

    /**
     * Three character ISO 639-2 language code (see
     * http://www.loc.gov/standards/iso639-2)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @return Three character ISO 639-2 language code (see
     *         http://www.loc.gov/standards/iso639-2)
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Three character ISO 639-2 language code (see
     * http://www.loc.gov/standards/iso639-2)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @param languageCode Three character ISO 639-2 language code (see
     *            http://www.loc.gov/standards/iso639-2)
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Three character ISO 639-2 language code (see
     * http://www.loc.gov/standards/iso639-2)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     *
     * @param languageCode Three character ISO 639-2 language code (see
     *            http://www.loc.gov/standards/iso639-2)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionLanguageMapping withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Textual description of language
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Textual description of language
     */
    public String getLanguageDescription() {
        return languageDescription;
    }

    /**
     * Textual description of language
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param languageDescription Textual description of language
     */
    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Textual description of language
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param languageDescription Textual description of language
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptionLanguageMapping withLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
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
        if (getCaptionChannel() != null)
            sb.append("CaptionChannel: " + getCaptionChannel() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: " + getLanguageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaptionChannel() == null) ? 0 : getCaptionChannel().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionLanguageMapping == false)
            return false;
        CaptionLanguageMapping other = (CaptionLanguageMapping) obj;

        if (other.getCaptionChannel() == null ^ this.getCaptionChannel() == null)
            return false;
        if (other.getCaptionChannel() != null
                && other.getCaptionChannel().equals(this.getCaptionChannel()) == false)
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
        return true;
    }
}
