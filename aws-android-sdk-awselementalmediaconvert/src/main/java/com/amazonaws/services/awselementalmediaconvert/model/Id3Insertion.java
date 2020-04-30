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
 * To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to
 * specify the base 64 encoded string and use Timecode (TimeCode) to specify the
 * time when the tag should be inserted. To insert multiple ID3 tags in your
 * output, create multiple instances of ID3 insertion (Id3Insertion).
 */
public class Id3Insertion implements Serializable {
    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     */
    private String id3;

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     */
    private String timecode;

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @return Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     */
    public String getId3() {
        return id3;
    }

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @param id3 Use ID3 tag (Id3) to provide a tag value in base64-encode
     *            format.
     */
    public void setId3(String id3) {
        this.id3 = id3;
    }

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[A-Za-z0-9+\/]+={0,2}$<br/>
     *
     * @param id3 Use ID3 tag (Id3) to provide a tag value in base64-encode
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Id3Insertion withId3(String id3) {
        this.id3 = id3;
        return this;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @return Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF
     *         format.
     */
    public String getTimecode() {
        return timecode;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param timecode Provide a Timecode (TimeCode) in HH:MM:SS:FF or
     *            HH:MM:SS;FF format.
     */
    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([01][0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9][:;][0-9]{2}$
     * <br/>
     *
     * @param timecode Provide a Timecode (TimeCode) in HH:MM:SS:FF or
     *            HH:MM:SS;FF format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Id3Insertion withTimecode(String timecode) {
        this.timecode = timecode;
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
        if (getId3() != null)
            sb.append("Id3: " + getId3() + ",");
        if (getTimecode() != null)
            sb.append("Timecode: " + getTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId3() == null) ? 0 : getId3().hashCode());
        hashCode = prime * hashCode + ((getTimecode() == null) ? 0 : getTimecode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Id3Insertion == false)
            return false;
        Id3Insertion other = (Id3Insertion) obj;

        if (other.getId3() == null ^ this.getId3() == null)
            return false;
        if (other.getId3() != null && other.getId3().equals(this.getId3()) == false)
            return false;
        if (other.getTimecode() == null ^ this.getTimecode() == null)
            return false;
        if (other.getTimecode() != null && other.getTimecode().equals(this.getTimecode()) == false)
            return false;
        return true;
    }
}
