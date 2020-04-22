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

package com.amazonaws.services.amazontranscribestreamingservice.model;

import java.io.Serializable;

/**
 * <p>
 * A word or phrase transcribed from the input audio.
 * </p>
 */
public class Item implements Serializable {
    /**
     * <p>
     * The offset from the beginning of the audio stream to the beginning of the
     * audio that resulted in the item.
     * </p>
     */
    private Double startTime;

    /**
     * <p>
     * The offset from the beginning of the audio stream to the end of the audio
     * that resulted in the item.
     * </p>
     */
    private Double endTime;

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     */
    private String type;

    /**
     * <p>
     * The word or punctuation that was recognized in the input audio.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The offset from the beginning of the audio stream to the beginning of the
     * audio that resulted in the item.
     * </p>
     *
     * @return <p>
     *         The offset from the beginning of the audio stream to the
     *         beginning of the audio that resulted in the item.
     *         </p>
     */
    public Double getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The offset from the beginning of the audio stream to the beginning of the
     * audio that resulted in the item.
     * </p>
     *
     * @param startTime <p>
     *            The offset from the beginning of the audio stream to the
     *            beginning of the audio that resulted in the item.
     *            </p>
     */
    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The offset from the beginning of the audio stream to the beginning of the
     * audio that resulted in the item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The offset from the beginning of the audio stream to the
     *            beginning of the audio that resulted in the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The offset from the beginning of the audio stream to the end of the audio
     * that resulted in the item.
     * </p>
     *
     * @return <p>
     *         The offset from the beginning of the audio stream to the end of
     *         the audio that resulted in the item.
     *         </p>
     */
    public Double getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The offset from the beginning of the audio stream to the end of the audio
     * that resulted in the item.
     * </p>
     *
     * @param endTime <p>
     *            The offset from the beginning of the audio stream to the end
     *            of the audio that resulted in the item.
     *            </p>
     */
    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The offset from the beginning of the audio stream to the end of the audio
     * that resulted in the item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The offset from the beginning of the audio stream to the end
     *            of the audio that resulted in the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withEndTime(Double endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     *
     * @return <p>
     *         The type of the item. <code>PRONUNCIATION</code> indicates that
     *         the item is a word that was recognized in the input audio.
     *         <code>PUNCTUATION</code> indicates that the item was interpreted
     *         as a pause in the input audio.
     *         </p>
     * @see ItemType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     *
     * @param type <p>
     *            The type of the item. <code>PRONUNCIATION</code> indicates
     *            that the item is a word that was recognized in the input
     *            audio. <code>PUNCTUATION</code> indicates that the item was
     *            interpreted as a pause in the input audio.
     *            </p>
     * @see ItemType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     *
     * @param type <p>
     *            The type of the item. <code>PRONUNCIATION</code> indicates
     *            that the item is a word that was recognized in the input
     *            audio. <code>PUNCTUATION</code> indicates that the item was
     *            interpreted as a pause in the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ItemType
     */
    public Item withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     *
     * @param type <p>
     *            The type of the item. <code>PRONUNCIATION</code> indicates
     *            that the item is a word that was recognized in the input
     *            audio. <code>PUNCTUATION</code> indicates that the item was
     *            interpreted as a pause in the input audio.
     *            </p>
     * @see ItemType
     */
    public void setType(ItemType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the item. <code>PRONUNCIATION</code> indicates that the item
     * is a word that was recognized in the input audio.
     * <code>PUNCTUATION</code> indicates that the item was interpreted as a
     * pause in the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pronunciation, punctuation
     *
     * @param type <p>
     *            The type of the item. <code>PRONUNCIATION</code> indicates
     *            that the item is a word that was recognized in the input
     *            audio. <code>PUNCTUATION</code> indicates that the item was
     *            interpreted as a pause in the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ItemType
     */
    public Item withType(ItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The word or punctuation that was recognized in the input audio.
     * </p>
     *
     * @return <p>
     *         The word or punctuation that was recognized in the input audio.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The word or punctuation that was recognized in the input audio.
     * </p>
     *
     * @param content <p>
     *            The word or punctuation that was recognized in the input
     *            audio.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The word or punctuation that was recognized in the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The word or punctuation that was recognized in the input
     *            audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Item withContent(String content) {
        this.content = content;
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
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
