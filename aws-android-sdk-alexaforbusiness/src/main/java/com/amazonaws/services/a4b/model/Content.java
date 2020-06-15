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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The content definition. This can contain only one text, SSML, or audio list
 * object.
 * </p>
 */
public class Content implements Serializable {
    /**
     * <p>
     * The list of text messages.
     * </p>
     */
    private java.util.List<Text> textList;

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     */
    private java.util.List<Ssml> ssmlList;

    /**
     * <p>
     * The list of audio messages.
     * </p>
     */
    private java.util.List<Audio> audioList;

    /**
     * <p>
     * The list of text messages.
     * </p>
     *
     * @return <p>
     *         The list of text messages.
     *         </p>
     */
    public java.util.List<Text> getTextList() {
        return textList;
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     *
     * @param textList <p>
     *            The list of text messages.
     *            </p>
     */
    public void setTextList(java.util.Collection<Text> textList) {
        if (textList == null) {
            this.textList = null;
            return;
        }

        this.textList = new java.util.ArrayList<Text>(textList);
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            The list of text messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withTextList(Text... textList) {
        if (getTextList() == null) {
            this.textList = new java.util.ArrayList<Text>(textList.length);
        }
        for (Text value : textList) {
            this.textList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            The list of text messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withTextList(java.util.Collection<Text> textList) {
        setTextList(textList);
        return this;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     *
     * @return <p>
     *         The list of SSML messages.
     *         </p>
     */
    public java.util.List<Ssml> getSsmlList() {
        return ssmlList;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     *
     * @param ssmlList <p>
     *            The list of SSML messages.
     *            </p>
     */
    public void setSsmlList(java.util.Collection<Ssml> ssmlList) {
        if (ssmlList == null) {
            this.ssmlList = null;
            return;
        }

        this.ssmlList = new java.util.ArrayList<Ssml>(ssmlList);
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ssmlList <p>
     *            The list of SSML messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withSsmlList(Ssml... ssmlList) {
        if (getSsmlList() == null) {
            this.ssmlList = new java.util.ArrayList<Ssml>(ssmlList.length);
        }
        for (Ssml value : ssmlList) {
            this.ssmlList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ssmlList <p>
     *            The list of SSML messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withSsmlList(java.util.Collection<Ssml> ssmlList) {
        setSsmlList(ssmlList);
        return this;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     *
     * @return <p>
     *         The list of audio messages.
     *         </p>
     */
    public java.util.List<Audio> getAudioList() {
        return audioList;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     *
     * @param audioList <p>
     *            The list of audio messages.
     *            </p>
     */
    public void setAudioList(java.util.Collection<Audio> audioList) {
        if (audioList == null) {
            this.audioList = null;
            return;
        }

        this.audioList = new java.util.ArrayList<Audio>(audioList);
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioList <p>
     *            The list of audio messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withAudioList(Audio... audioList) {
        if (getAudioList() == null) {
            this.audioList = new java.util.ArrayList<Audio>(audioList.length);
        }
        for (Audio value : audioList) {
            this.audioList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioList <p>
     *            The list of audio messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Content withAudioList(java.util.Collection<Audio> audioList) {
        setAudioList(audioList);
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
        if (getTextList() != null)
            sb.append("TextList: " + getTextList() + ",");
        if (getSsmlList() != null)
            sb.append("SsmlList: " + getSsmlList() + ",");
        if (getAudioList() != null)
            sb.append("AudioList: " + getAudioList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextList() == null) ? 0 : getTextList().hashCode());
        hashCode = prime * hashCode + ((getSsmlList() == null) ? 0 : getSsmlList().hashCode());
        hashCode = prime * hashCode + ((getAudioList() == null) ? 0 : getAudioList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Content == false)
            return false;
        Content other = (Content) obj;

        if (other.getTextList() == null ^ this.getTextList() == null)
            return false;
        if (other.getTextList() != null && other.getTextList().equals(this.getTextList()) == false)
            return false;
        if (other.getSsmlList() == null ^ this.getSsmlList() == null)
            return false;
        if (other.getSsmlList() != null && other.getSsmlList().equals(this.getSsmlList()) == false)
            return false;
        if (other.getAudioList() == null ^ this.getAudioList() == null)
            return false;
        if (other.getAudioList() != null
                && other.getAudioList().equals(this.getAudioList()) == false)
            return false;
        return true;
    }
}
