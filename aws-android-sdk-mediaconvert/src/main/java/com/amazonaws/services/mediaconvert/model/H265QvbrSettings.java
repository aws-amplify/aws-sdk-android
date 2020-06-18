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
 * Settings for quality-defined variable bitrate encoding with the H.265 codec.
 * Required when you set Rate control mode to QVBR. Not valid when you set Rate
 * control mode to a value other than QVBR, or when you don't define Rate
 * control mode.
 */
public class H265QvbrSettings implements Serializable {
    /**
     * Use this setting only when Rate control mode is QVBR and Quality tuning
     * level is Multi-pass HQ. For Max average bitrate values suited to the
     * complexity of your input video, the service limits the average bitrate of
     * the video part of this output to the value that you choose. That is, the
     * total size of the video element is less than or equal to the value you
     * set multiplied by the number of seconds of encoded output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1466400000<br/>
     */
    private Integer maxAverageBitrate;

    /**
     * Required when you use QVBR rate control mode. That is, when you specify
     * qvbrSettings within h265Settings. Specify the general target quality
     * level for this output, from 1 to 10. Use higher numbers for greater
     * quality. Level 10 results in nearly lossless compression. The quality
     * level for most broadcast-quality transcodes is between 6 and 9.
     * Optionally, to specify a value between whole numbers, also provide a
     * value for the setting qvbrQualityLevelFineTune. For example, if you want
     * your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     * qvbrQualityLevelFineTune to .33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer qvbrQualityLevel;

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is
     * between whole numbers. For example, if you want your QVBR quality level
     * to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to
     * .33. MediaConvert rounds your QVBR quality level to the nearest third of
     * a whole number. For example, if you set qvbrQualityLevel to 7 and you set
     * qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     */
    private Double qvbrQualityLevelFineTune;

    /**
     * Use this setting only when Rate control mode is QVBR and Quality tuning
     * level is Multi-pass HQ. For Max average bitrate values suited to the
     * complexity of your input video, the service limits the average bitrate of
     * the video part of this output to the value that you choose. That is, the
     * total size of the video element is less than or equal to the value you
     * set multiplied by the number of seconds of encoded output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1466400000<br/>
     *
     * @return Use this setting only when Rate control mode is QVBR and Quality
     *         tuning level is Multi-pass HQ. For Max average bitrate values
     *         suited to the complexity of your input video, the service limits
     *         the average bitrate of the video part of this output to the value
     *         that you choose. That is, the total size of the video element is
     *         less than or equal to the value you set multiplied by the number
     *         of seconds of encoded output.
     */
    public Integer getMaxAverageBitrate() {
        return maxAverageBitrate;
    }

    /**
     * Use this setting only when Rate control mode is QVBR and Quality tuning
     * level is Multi-pass HQ. For Max average bitrate values suited to the
     * complexity of your input video, the service limits the average bitrate of
     * the video part of this output to the value that you choose. That is, the
     * total size of the video element is less than or equal to the value you
     * set multiplied by the number of seconds of encoded output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1466400000<br/>
     *
     * @param maxAverageBitrate Use this setting only when Rate control mode is
     *            QVBR and Quality tuning level is Multi-pass HQ. For Max
     *            average bitrate values suited to the complexity of your input
     *            video, the service limits the average bitrate of the video
     *            part of this output to the value that you choose. That is, the
     *            total size of the video element is less than or equal to the
     *            value you set multiplied by the number of seconds of encoded
     *            output.
     */
    public void setMaxAverageBitrate(Integer maxAverageBitrate) {
        this.maxAverageBitrate = maxAverageBitrate;
    }

    /**
     * Use this setting only when Rate control mode is QVBR and Quality tuning
     * level is Multi-pass HQ. For Max average bitrate values suited to the
     * complexity of your input video, the service limits the average bitrate of
     * the video part of this output to the value that you choose. That is, the
     * total size of the video element is less than or equal to the value you
     * set multiplied by the number of seconds of encoded output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1466400000<br/>
     *
     * @param maxAverageBitrate Use this setting only when Rate control mode is
     *            QVBR and Quality tuning level is Multi-pass HQ. For Max
     *            average bitrate values suited to the complexity of your input
     *            video, the service limits the average bitrate of the video
     *            part of this output to the value that you choose. That is, the
     *            total size of the video element is less than or equal to the
     *            value you set multiplied by the number of seconds of encoded
     *            output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265QvbrSettings withMaxAverageBitrate(Integer maxAverageBitrate) {
        this.maxAverageBitrate = maxAverageBitrate;
        return this;
    }

    /**
     * Required when you use QVBR rate control mode. That is, when you specify
     * qvbrSettings within h265Settings. Specify the general target quality
     * level for this output, from 1 to 10. Use higher numbers for greater
     * quality. Level 10 results in nearly lossless compression. The quality
     * level for most broadcast-quality transcodes is between 6 and 9.
     * Optionally, to specify a value between whole numbers, also provide a
     * value for the setting qvbrQualityLevelFineTune. For example, if you want
     * your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     * qvbrQualityLevelFineTune to .33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return Required when you use QVBR rate control mode. That is, when you
     *         specify qvbrSettings within h265Settings. Specify the general
     *         target quality level for this output, from 1 to 10. Use higher
     *         numbers for greater quality. Level 10 results in nearly lossless
     *         compression. The quality level for most broadcast-quality
     *         transcodes is between 6 and 9. Optionally, to specify a value
     *         between whole numbers, also provide a value for the setting
     *         qvbrQualityLevelFineTune. For example, if you want your QVBR
     *         quality level to be 7.33, set qvbrQualityLevel to 7 and set
     *         qvbrQualityLevelFineTune to .33.
     */
    public Integer getQvbrQualityLevel() {
        return qvbrQualityLevel;
    }

    /**
     * Required when you use QVBR rate control mode. That is, when you specify
     * qvbrSettings within h265Settings. Specify the general target quality
     * level for this output, from 1 to 10. Use higher numbers for greater
     * quality. Level 10 results in nearly lossless compression. The quality
     * level for most broadcast-quality transcodes is between 6 and 9.
     * Optionally, to specify a value between whole numbers, also provide a
     * value for the setting qvbrQualityLevelFineTune. For example, if you want
     * your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     * qvbrQualityLevelFineTune to .33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param qvbrQualityLevel Required when you use QVBR rate control mode.
     *            That is, when you specify qvbrSettings within h265Settings.
     *            Specify the general target quality level for this output, from
     *            1 to 10. Use higher numbers for greater quality. Level 10
     *            results in nearly lossless compression. The quality level for
     *            most broadcast-quality transcodes is between 6 and 9.
     *            Optionally, to specify a value between whole numbers, also
     *            provide a value for the setting qvbrQualityLevelFineTune. For
     *            example, if you want your QVBR quality level to be 7.33, set
     *            qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     */
    public void setQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
    }

    /**
     * Required when you use QVBR rate control mode. That is, when you specify
     * qvbrSettings within h265Settings. Specify the general target quality
     * level for this output, from 1 to 10. Use higher numbers for greater
     * quality. Level 10 results in nearly lossless compression. The quality
     * level for most broadcast-quality transcodes is between 6 and 9.
     * Optionally, to specify a value between whole numbers, also provide a
     * value for the setting qvbrQualityLevelFineTune. For example, if you want
     * your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set
     * qvbrQualityLevelFineTune to .33.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param qvbrQualityLevel Required when you use QVBR rate control mode.
     *            That is, when you specify qvbrSettings within h265Settings.
     *            Specify the general target quality level for this output, from
     *            1 to 10. Use higher numbers for greater quality. Level 10
     *            results in nearly lossless compression. The quality level for
     *            most broadcast-quality transcodes is between 6 and 9.
     *            Optionally, to specify a value between whole numbers, also
     *            provide a value for the setting qvbrQualityLevelFineTune. For
     *            example, if you want your QVBR quality level to be 7.33, set
     *            qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265QvbrSettings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
        return this;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is
     * between whole numbers. For example, if you want your QVBR quality level
     * to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to
     * .33. MediaConvert rounds your QVBR quality level to the nearest third of
     * a whole number. For example, if you set qvbrQualityLevel to 7 and you set
     * qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     *
     * @return Optional. Specify a value here to set the QVBR quality to a level
     *         that is between whole numbers. For example, if you want your QVBR
     *         quality level to be 7.33, set qvbrQualityLevel to 7 and set
     *         qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR
     *         quality level to the nearest third of a whole number. For
     *         example, if you set qvbrQualityLevel to 7 and you set
     *         qvbrQualityLevelFineTune to .25, your actual QVBR quality level
     *         is 7.33.
     */
    public Double getQvbrQualityLevelFineTune() {
        return qvbrQualityLevelFineTune;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is
     * between whole numbers. For example, if you want your QVBR quality level
     * to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to
     * .33. MediaConvert rounds your QVBR quality level to the nearest third of
     * a whole number. For example, if you set qvbrQualityLevel to 7 and you set
     * qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     *
     * @param qvbrQualityLevelFineTune Optional. Specify a value here to set the
     *            QVBR quality to a level that is between whole numbers. For
     *            example, if you want your QVBR quality level to be 7.33, set
     *            qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     *            MediaConvert rounds your QVBR quality level to the nearest
     *            third of a whole number. For example, if you set
     *            qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to
     *            .25, your actual QVBR quality level is 7.33.
     */
    public void setQvbrQualityLevelFineTune(Double qvbrQualityLevelFineTune) {
        this.qvbrQualityLevelFineTune = qvbrQualityLevelFineTune;
    }

    /**
     * Optional. Specify a value here to set the QVBR quality to a level that is
     * between whole numbers. For example, if you want your QVBR quality level
     * to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to
     * .33. MediaConvert rounds your QVBR quality level to the nearest third of
     * a whole number. For example, if you set qvbrQualityLevel to 7 and you set
     * qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qvbrQualityLevelFineTune Optional. Specify a value here to set the
     *            QVBR quality to a level that is between whole numbers. For
     *            example, if you want your QVBR quality level to be 7.33, set
     *            qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
     *            MediaConvert rounds your QVBR quality level to the nearest
     *            third of a whole number. For example, if you set
     *            qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to
     *            .25, your actual QVBR quality level is 7.33.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265QvbrSettings withQvbrQualityLevelFineTune(Double qvbrQualityLevelFineTune) {
        this.qvbrQualityLevelFineTune = qvbrQualityLevelFineTune;
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
        if (getMaxAverageBitrate() != null)
            sb.append("MaxAverageBitrate: " + getMaxAverageBitrate() + ",");
        if (getQvbrQualityLevel() != null)
            sb.append("QvbrQualityLevel: " + getQvbrQualityLevel() + ",");
        if (getQvbrQualityLevelFineTune() != null)
            sb.append("QvbrQualityLevelFineTune: " + getQvbrQualityLevelFineTune());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxAverageBitrate() == null) ? 0 : getMaxAverageBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getQvbrQualityLevelFineTune() == null) ? 0 : getQvbrQualityLevelFineTune()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H265QvbrSettings == false)
            return false;
        H265QvbrSettings other = (H265QvbrSettings) obj;

        if (other.getMaxAverageBitrate() == null ^ this.getMaxAverageBitrate() == null)
            return false;
        if (other.getMaxAverageBitrate() != null
                && other.getMaxAverageBitrate().equals(this.getMaxAverageBitrate()) == false)
            return false;
        if (other.getQvbrQualityLevel() == null ^ this.getQvbrQualityLevel() == null)
            return false;
        if (other.getQvbrQualityLevel() != null
                && other.getQvbrQualityLevel().equals(this.getQvbrQualityLevel()) == false)
            return false;
        if (other.getQvbrQualityLevelFineTune() == null
                ^ this.getQvbrQualityLevelFineTune() == null)
            return false;
        if (other.getQvbrQualityLevelFineTune() != null
                && other.getQvbrQualityLevelFineTune().equals(this.getQvbrQualityLevelFineTune()) == false)
            return false;
        return true;
    }
}
