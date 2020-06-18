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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml
 * file, specify the URI of the input caption source file. If your caption
 * source is IMSC in an IMF package, use TrackSourceSettings instead of
 * FileSoureSettings.
 */
public class FileSourceSettings implements Serializable {
    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     */
    private String convert608To708;

    /**
     * Ignore this setting unless your input captions format is SCC. To have the
     * service compensate for differing frame rates between your input captions
     * and input video, specify the frame rate of the captions file. Specify
     * this value as a fraction, using the settings Framerate numerator
     * (framerateNumerator) and Framerate denominator (framerateDenominator).
     * For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps,
     * 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     */
    private CaptionSourceFramerate framerate;

    /**
     * External caption file used for loading captions. Accepted file extensions
     * are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt|SRT
     * |xml|XML|smi
     * |SMI))|(https?://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt
     * |SRT|xml|XML|smi|SMI)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     */
    private String sourceFile;

    /**
     * Specifies a time delta in seconds to offset the captions from the source
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     */
    private Integer timeDelta;

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @return Specify whether this set of input captions appears in your
     *         outputs in both 608 and 708 format. If you choose Upconvert
     *         (UPCONVERT), MediaConvert includes the captions data in two ways:
     *         it passes the 608 data through using the 608 compatibility bytes
     *         fields of the 708 wrapper, and it also translates the 608 data
     *         into 708.
     * @see FileSourceConvert608To708
     */
    public String getConvert608To708() {
        return convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @see FileSourceConvert608To708
     */
    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSourceConvert608To708
     */
    public FileSourceSettings withConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
        return this;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @see FileSourceConvert608To708
     */
    public void setConvert608To708(FileSourceConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSourceConvert608To708
     */
    public FileSourceSettings withConvert608To708(FileSourceConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the
     * service compensate for differing frame rates between your input captions
     * and input video, specify the frame rate of the captions file. Specify
     * this value as a fraction, using the settings Framerate numerator
     * (framerateNumerator) and Framerate denominator (framerateDenominator).
     * For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps,
     * 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     *
     * @return Ignore this setting unless your input captions format is SCC. To
     *         have the service compensate for differing frame rates between
     *         your input captions and input video, specify the frame rate of
     *         the captions file. Specify this value as a fraction, using the
     *         settings Framerate numerator (framerateNumerator) and Framerate
     *         denominator (framerateDenominator). For example, you might
     *         specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for
     *         23.976 fps, or 30000 / 1001 for 29.97 fps.
     */
    public CaptionSourceFramerate getFramerate() {
        return framerate;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the
     * service compensate for differing frame rates between your input captions
     * and input video, specify the frame rate of the captions file. Specify
     * this value as a fraction, using the settings Framerate numerator
     * (framerateNumerator) and Framerate denominator (framerateDenominator).
     * For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps,
     * 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     *
     * @param framerate Ignore this setting unless your input captions format is
     *            SCC. To have the service compensate for differing frame rates
     *            between your input captions and input video, specify the frame
     *            rate of the captions file. Specify this value as a fraction,
     *            using the settings Framerate numerator (framerateNumerator)
     *            and Framerate denominator (framerateDenominator). For example,
     *            you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000
     *            / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     */
    public void setFramerate(CaptionSourceFramerate framerate) {
        this.framerate = framerate;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the
     * service compensate for differing frame rates between your input captions
     * and input video, specify the frame rate of the captions file. Specify
     * this value as a fraction, using the settings Framerate numerator
     * (framerateNumerator) and Framerate denominator (framerateDenominator).
     * For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps,
     * 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param framerate Ignore this setting unless your input captions format is
     *            SCC. To have the service compensate for differing frame rates
     *            between your input captions and input video, specify the frame
     *            rate of the captions file. Specify this value as a fraction,
     *            using the settings Framerate numerator (framerateNumerator)
     *            and Framerate denominator (framerateDenominator). For example,
     *            you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000
     *            / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSourceSettings withFramerate(CaptionSourceFramerate framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions
     * are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt|SRT
     * |xml|XML|smi
     * |SMI))|(https?://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt
     * |SRT|xml|XML|smi|SMI)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @return External caption file used for loading captions. Accepted file
     *         extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and
     *         'smi'.
     */
    public String getSourceFile() {
        return sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions
     * are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt|SRT
     * |xml|XML|smi
     * |SMI))|(https?://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt
     * |SRT|xml|XML|smi|SMI)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param sourceFile External caption file used for loading captions.
     *            Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     *            'srt', 'xml', and 'smi'.
     */
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions
     * are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt|SRT
     * |xml|XML|smi
     * |SMI))|(https?://(.*?)\.(scc|SCC|ttml|TTML|dfxp|DFXP|stl|STL|srt
     * |SRT|xml|XML|smi|SMI)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param sourceFile External caption file used for loading captions.
     *            Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     *            'srt', 'xml', and 'smi'.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSourceSettings withSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @return Specifies a time delta in seconds to offset the captions from the
     *         source file.
     */
    public Integer getTimeDelta() {
        return timeDelta;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @param timeDelta Specifies a time delta in seconds to offset the captions
     *            from the source file.
     */
    public void setTimeDelta(Integer timeDelta) {
        this.timeDelta = timeDelta;
    }

    /**
     * Specifies a time delta in seconds to offset the captions from the source
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     *
     * @param timeDelta Specifies a time delta in seconds to offset the captions
     *            from the source file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileSourceSettings withTimeDelta(Integer timeDelta) {
        this.timeDelta = timeDelta;
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
        if (getConvert608To708() != null)
            sb.append("Convert608To708: " + getConvert608To708() + ",");
        if (getFramerate() != null)
            sb.append("Framerate: " + getFramerate() + ",");
        if (getSourceFile() != null)
            sb.append("SourceFile: " + getSourceFile() + ",");
        if (getTimeDelta() != null)
            sb.append("TimeDelta: " + getTimeDelta());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConvert608To708() == null) ? 0 : getConvert608To708().hashCode());
        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        hashCode = prime * hashCode + ((getTimeDelta() == null) ? 0 : getTimeDelta().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSourceSettings == false)
            return false;
        FileSourceSettings other = (FileSourceSettings) obj;

        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null
                && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null
                && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getSourceFile() == null ^ this.getSourceFile() == null)
            return false;
        if (other.getSourceFile() != null
                && other.getSourceFile().equals(this.getSourceFile()) == false)
            return false;
        if (other.getTimeDelta() == null ^ this.getTimeDelta() == null)
            return false;
        if (other.getTimeDelta() != null
                && other.getTimeDelta().equals(this.getTimeDelta()) == false)
            return false;
        return true;
    }
}
