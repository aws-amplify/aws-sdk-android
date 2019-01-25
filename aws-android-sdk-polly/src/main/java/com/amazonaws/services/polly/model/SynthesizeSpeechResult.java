/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

public class SynthesizeSpeechResult implements Serializable {
    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     */
    private java.io.InputStream audioStream;

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the
     * <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>,
     * the <code>ContentType</code> returned is audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/pcm in a signed 16-bit, 1
     * channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     */
    private Integer requestCharacters;

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     *
     * @return <p>
     *         Stream containing the synthesized speech.
     *         </p>
     */
    public java.io.InputStream getAudioStream() {
        return audioStream;
    }

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     *
     * @param audioStream <p>
     *            Stream containing the synthesized speech.
     *            </p>
     */
    public void setAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * Stream containing the synthesized speech.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioStream <p>
     *            Stream containing the synthesized speech.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechResult withAudioStream(java.io.InputStream audioStream) {
        this.audioStream = audioStream;
        return this;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the
     * <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>,
     * the <code>ContentType</code> returned is audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/pcm in a signed 16-bit, 1
     * channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     *
     * @return <p>
     *         Specifies the type audio stream. This should reflect the
     *         <code>OutputFormat</code> parameter in your request.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you request <code>mp3</code> as the <code>OutputFormat</code>,
     *         the <code>ContentType</code> returned is audio/mpeg.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>ogg_vorbis</code> as the
     *         <code>OutputFormat</code>, the <code>ContentType</code> returned
     *         is audio/ogg.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>pcm</code> as the <code>OutputFormat</code>,
     *         the <code>ContentType</code> returned is audio/pcm in a signed
     *         16-bit, 1 channel (mono), little-endian format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you request <code>json</code> as the <code>OutputFormat</code>
     *         , the <code>ContentType</code> returned is audio/json.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the
     * <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>,
     * the <code>ContentType</code> returned is audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/pcm in a signed 16-bit, 1
     * channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     *
     * @param contentType <p>
     *            Specifies the type audio stream. This should reflect the
     *            <code>OutputFormat</code> parameter in your request.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you request <code>mp3</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/mpeg.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>ogg_vorbis</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/ogg.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>pcm</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/pcm in a signed 16-bit, 1 channel (mono),
     *            little-endian format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>json</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/json.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Specifies the type audio stream. This should reflect the
     * <code>OutputFormat</code> parameter in your request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you request <code>mp3</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/mpeg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>ogg_vorbis</code> as the <code>OutputFormat</code>,
     * the <code>ContentType</code> returned is audio/ogg.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>pcm</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/pcm in a signed 16-bit, 1
     * channel (mono), little-endian format.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you request <code>json</code> as the <code>OutputFormat</code>, the
     * <code>ContentType</code> returned is audio/json.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            Specifies the type audio stream. This should reflect the
     *            <code>OutputFormat</code> parameter in your request.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you request <code>mp3</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/mpeg.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>ogg_vorbis</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/ogg.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>pcm</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/pcm in a signed 16-bit, 1 channel (mono),
     *            little-endian format.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you request <code>json</code> as the
     *            <code>OutputFormat</code>, the <code>ContentType</code>
     *            returned is audio/json.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     *
     * @return <p>
     *         Number of characters synthesized.
     *         </p>
     */
    public Integer getRequestCharacters() {
        return requestCharacters;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     *
     * @param requestCharacters <p>
     *            Number of characters synthesized.
     *            </p>
     */
    public void setRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
    }

    /**
     * <p>
     * Number of characters synthesized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestCharacters <p>
     *            Number of characters synthesized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechResult withRequestCharacters(Integer requestCharacters) {
        this.requestCharacters = requestCharacters;
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
        if (getAudioStream() != null)
            sb.append("AudioStream: " + getAudioStream() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getRequestCharacters() != null)
            sb.append("RequestCharacters: " + getRequestCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharacters() == null) ? 0 : getRequestCharacters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SynthesizeSpeechResult == false)
            return false;
        SynthesizeSpeechResult other = (SynthesizeSpeechResult) obj;

        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null
                && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getRequestCharacters() == null ^ this.getRequestCharacters() == null)
            return false;
        if (other.getRequestCharacters() != null
                && other.getRequestCharacters().equals(this.getRequestCharacters()) == false)
            return false;
        return true;
    }
}
