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
 * The audio message. There is a 1 MB limit on the audio file input and the only
 * supported format is MP3. To convert your MP3 audio files to an
 * Alexa-friendly,
 * </p>
 * <p>
 * required codec version (MPEG version 2) and bit rate (48 kbps), you might use
 * converter software. One option for this is a command-line tool, FFmpeg. For
 * more information, see <a href="https://www.ffmpeg.org/">FFmpeg</a>. The
 * following command converts the provided &lt;input-file&gt; to an MP3 file
 * that is played in the announcement:
 * </p>
 * <p>
 * <code>ffmpeg -i &lt;input-file&gt; -ac 2 -codec:a libmp3lame -b:a 48k -ar 16000 &lt;output-file.mp3&gt;</code>
 * </p>
 */
public class Audio implements Serializable {
    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     */
    private String locale;

    /**
     * <p>
     * The location of the audio file. Currently, S3 URLs are supported. Only S3
     * locations comprised of safe characters are valid. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     * >Safe Characters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1200<br/>
     * <b>Pattern: </b>https://([A-Za-z0-
     * 9_.-]+)?(s3-[A-Za-z0-9-]+|s3\.([A-Za-z0-9-])+|s3|s3.dualstack\.([A-Za-z0-9-])+)+.amazonaws.com/.
     * *<br/>
     */
    private String location;

    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @return <p>
     *         The locale of the audio message. Currently, en-US is supported.
     *         </p>
     * @see Locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param locale <p>
     *            The locale of the audio message. Currently, en-US is
     *            supported.
     *            </p>
     * @see Locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param locale <p>
     *            The locale of the audio message. Currently, en-US is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public Audio withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param locale <p>
     *            The locale of the audio message. Currently, en-US is
     *            supported.
     *            </p>
     * @see Locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * The locale of the audio message. Currently, en-US is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US
     *
     * @param locale <p>
     *            The locale of the audio message. Currently, en-US is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Locale
     */
    public Audio withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * The location of the audio file. Currently, S3 URLs are supported. Only S3
     * locations comprised of safe characters are valid. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     * >Safe Characters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1200<br/>
     * <b>Pattern: </b>https://([A-Za-z0-
     * 9_.-]+)?(s3-[A-Za-z0-9-]+|s3\.([A-Za-z0-9-])+|s3|s3.dualstack\.([A-Za-z0-9-])+)+.amazonaws.com/.
     * *<br/>
     *
     * @return <p>
     *         The location of the audio file. Currently, S3 URLs are supported.
     *         Only S3 locations comprised of safe characters are valid. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     *         >Safe Characters</a>.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the audio file. Currently, S3 URLs are supported. Only S3
     * locations comprised of safe characters are valid. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     * >Safe Characters</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1200<br/>
     * <b>Pattern: </b>https://([A-Za-z0-
     * 9_.-]+)?(s3-[A-Za-z0-9-]+|s3\.([A-Za-z0-9-])+|s3|s3.dualstack\.([A-Za-z0-9-])+)+.amazonaws.com/.
     * *<br/>
     *
     * @param location <p>
     *            The location of the audio file. Currently, S3 URLs are
     *            supported. Only S3 locations comprised of safe characters are
     *            valid. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     *            >Safe Characters</a>.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the audio file. Currently, S3 URLs are supported. Only S3
     * locations comprised of safe characters are valid. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     * >Safe Characters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1200<br/>
     * <b>Pattern: </b>https://([A-Za-z0-
     * 9_.-]+)?(s3-[A-Za-z0-9-]+|s3\.([A-Za-z0-9-])+|s3|s3.dualstack\.([A-Za-z0-9-])+)+.amazonaws.com/.
     * *<br/>
     *
     * @param location <p>
     *            The location of the audio file. Currently, S3 URLs are
     *            supported. Only S3 locations comprised of safe characters are
     *            valid. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#Safe%20Characters"
     *            >Safe Characters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Audio withLocation(String location) {
        this.location = location;
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
        if (getLocale() != null)
            sb.append("Locale: " + getLocale() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Audio == false)
            return false;
        Audio other = (Audio) obj;

        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
