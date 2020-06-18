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
 * For forensic video watermarking, MediaConvert supports Nagra NexGuard File
 * Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2)
 * and OTT Streaming workflows.
 */
public class NexGuardFileMarkerSettings implements Serializable {
    /**
     * Use the base64 license string that Nagra provides you. Enter it directly
     * in your JSON job specification or in the console. Required when you
     * include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String license;

    /**
     * Specify the payload ID that you want associated with this output. Valid
     * values vary depending on your Nagra NexGuard forensic watermarking
     * workflow. Required when you include Nagra NexGuard File Marker
     * watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease
     * Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must
     * generate a unique ID for each asset you watermark, and keep a record of
     * which ID you have assigned to each asset. Neither Nagra nor MediaConvert
     * keep track of the relationship between output files and your IDs. For OTT
     * Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do
     * this by setting up two output groups. For one output group, set the value
     * of Payload ID (payload) to 0 in every output. For the other output group,
     * set Payload ID (payload) to 1 in every output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4194303<br/>
     */
    private Integer payload;

    /**
     * Enter one of the watermarking preset strings that Nagra provides you.
     * Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String preset;

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     */
    private String strength;

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly
     * in your JSON job specification or in the console. Required when you
     * include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @return Use the base64 license string that Nagra provides you. Enter it
     *         directly in your JSON job specification or in the console.
     *         Required when you include Nagra NexGuard File Marker watermarking
     *         (NexGuardWatermarkingSettings) in your job.
     */
    public String getLicense() {
        return license;
    }

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly
     * in your JSON job specification or in the console. Required when you
     * include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param license Use the base64 license string that Nagra provides you.
     *            Enter it directly in your JSON job specification or in the
     *            console. Required when you include Nagra NexGuard File Marker
     *            watermarking (NexGuardWatermarkingSettings) in your job.
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly
     * in your JSON job specification or in the console. Required when you
     * include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param license Use the base64 license string that Nagra provides you.
     *            Enter it directly in your JSON job specification or in the
     *            console. Required when you include Nagra NexGuard File Marker
     *            watermarking (NexGuardWatermarkingSettings) in your job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NexGuardFileMarkerSettings withLicense(String license) {
        this.license = license;
        return this;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid
     * values vary depending on your Nagra NexGuard forensic watermarking
     * workflow. Required when you include Nagra NexGuard File Marker
     * watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease
     * Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must
     * generate a unique ID for each asset you watermark, and keep a record of
     * which ID you have assigned to each asset. Neither Nagra nor MediaConvert
     * keep track of the relationship between output files and your IDs. For OTT
     * Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do
     * this by setting up two output groups. For one output group, set the value
     * of Payload ID (payload) to 0 in every output. For the other output group,
     * set Payload ID (payload) to 1 in every output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4194303<br/>
     *
     * @return Specify the payload ID that you want associated with this output.
     *         Valid values vary depending on your Nagra NexGuard forensic
     *         watermarking workflow. Required when you include Nagra NexGuard
     *         File Marker watermarking (NexGuardWatermarkingSettings) in your
     *         job. For PreRelease Content (NGPR/G2), specify an integer from 1
     *         through 4,194,303. You must generate a unique ID for each asset
     *         you watermark, and keep a record of which ID you have assigned to
     *         each asset. Neither Nagra nor MediaConvert keep track of the
     *         relationship between output files and your IDs. For OTT
     *         Streaming, create two adaptive bitrate (ABR) stacks for each
     *         asset. Do this by setting up two output groups. For one output
     *         group, set the value of Payload ID (payload) to 0 in every
     *         output. For the other output group, set Payload ID (payload) to 1
     *         in every output.
     */
    public Integer getPayload() {
        return payload;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid
     * values vary depending on your Nagra NexGuard forensic watermarking
     * workflow. Required when you include Nagra NexGuard File Marker
     * watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease
     * Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must
     * generate a unique ID for each asset you watermark, and keep a record of
     * which ID you have assigned to each asset. Neither Nagra nor MediaConvert
     * keep track of the relationship between output files and your IDs. For OTT
     * Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do
     * this by setting up two output groups. For one output group, set the value
     * of Payload ID (payload) to 0 in every output. For the other output group,
     * set Payload ID (payload) to 1 in every output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4194303<br/>
     *
     * @param payload Specify the payload ID that you want associated with this
     *            output. Valid values vary depending on your Nagra NexGuard
     *            forensic watermarking workflow. Required when you include
     *            Nagra NexGuard File Marker watermarking
     *            (NexGuardWatermarkingSettings) in your job. For PreRelease
     *            Content (NGPR/G2), specify an integer from 1 through
     *            4,194,303. You must generate a unique ID for each asset you
     *            watermark, and keep a record of which ID you have assigned to
     *            each asset. Neither Nagra nor MediaConvert keep track of the
     *            relationship between output files and your IDs. For OTT
     *            Streaming, create two adaptive bitrate (ABR) stacks for each
     *            asset. Do this by setting up two output groups. For one output
     *            group, set the value of Payload ID (payload) to 0 in every
     *            output. For the other output group, set Payload ID (payload)
     *            to 1 in every output.
     */
    public void setPayload(Integer payload) {
        this.payload = payload;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid
     * values vary depending on your Nagra NexGuard forensic watermarking
     * workflow. Required when you include Nagra NexGuard File Marker
     * watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease
     * Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must
     * generate a unique ID for each asset you watermark, and keep a record of
     * which ID you have assigned to each asset. Neither Nagra nor MediaConvert
     * keep track of the relationship between output files and your IDs. For OTT
     * Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do
     * this by setting up two output groups. For one output group, set the value
     * of Payload ID (payload) to 0 in every output. For the other output group,
     * set Payload ID (payload) to 1 in every output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4194303<br/>
     *
     * @param payload Specify the payload ID that you want associated with this
     *            output. Valid values vary depending on your Nagra NexGuard
     *            forensic watermarking workflow. Required when you include
     *            Nagra NexGuard File Marker watermarking
     *            (NexGuardWatermarkingSettings) in your job. For PreRelease
     *            Content (NGPR/G2), specify an integer from 1 through
     *            4,194,303. You must generate a unique ID for each asset you
     *            watermark, and keep a record of which ID you have assigned to
     *            each asset. Neither Nagra nor MediaConvert keep track of the
     *            relationship between output files and your IDs. For OTT
     *            Streaming, create two adaptive bitrate (ABR) stacks for each
     *            asset. Do this by setting up two output groups. For one output
     *            group, set the value of Payload ID (payload) to 0 in every
     *            output. For the other output group, set Payload ID (payload)
     *            to 1 in every output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NexGuardFileMarkerSettings withPayload(Integer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you.
     * Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Enter one of the watermarking preset strings that Nagra provides
     *         you. Required when you include Nagra NexGuard File Marker
     *         watermarking (NexGuardWatermarkingSettings) in your job.
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you.
     * Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param preset Enter one of the watermarking preset strings that Nagra
     *            provides you. Required when you include Nagra NexGuard File
     *            Marker watermarking (NexGuardWatermarkingSettings) in your
     *            job.
     */
    public void setPreset(String preset) {
        this.preset = preset;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you.
     * Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param preset Enter one of the watermarking preset strings that Nagra
     *            provides you. Required when you include Nagra NexGuard File
     *            Marker watermarking (NexGuardWatermarkingSettings) in your
     *            job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NexGuardFileMarkerSettings withPreset(String preset) {
        this.preset = preset;
        return this;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     *
     * @return Optional. Ignore this setting unless Nagra support directs you to
     *         specify a value. When you don't specify a value here, the Nagra
     *         NexGuard library uses its default value.
     * @see WatermarkingStrength
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     *
     * @param strength Optional. Ignore this setting unless Nagra support
     *            directs you to specify a value. When you don't specify a value
     *            here, the Nagra NexGuard library uses its default value.
     * @see WatermarkingStrength
     */
    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     *
     * @param strength Optional. Ignore this setting unless Nagra support
     *            directs you to specify a value. When you don't specify a value
     *            here, the Nagra NexGuard library uses its default value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WatermarkingStrength
     */
    public NexGuardFileMarkerSettings withStrength(String strength) {
        this.strength = strength;
        return this;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     *
     * @param strength Optional. Ignore this setting unless Nagra support
     *            directs you to specify a value. When you don't specify a value
     *            here, the Nagra NexGuard library uses its default value.
     * @see WatermarkingStrength
     */
    public void setStrength(WatermarkingStrength strength) {
        this.strength = strength.toString();
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify
     * a value. When you don't specify a value here, the Nagra NexGuard library
     * uses its default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST
     *
     * @param strength Optional. Ignore this setting unless Nagra support
     *            directs you to specify a value. When you don't specify a value
     *            here, the Nagra NexGuard library uses its default value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WatermarkingStrength
     */
    public NexGuardFileMarkerSettings withStrength(WatermarkingStrength strength) {
        this.strength = strength.toString();
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
        if (getLicense() != null)
            sb.append("License: " + getLicense() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload() + ",");
        if (getPreset() != null)
            sb.append("Preset: " + getPreset() + ",");
        if (getStrength() != null)
            sb.append("Strength: " + getStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicense() == null) ? 0 : getLicense().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NexGuardFileMarkerSettings == false)
            return false;
        NexGuardFileMarkerSettings other = (NexGuardFileMarkerSettings) obj;

        if (other.getLicense() == null ^ this.getLicense() == null)
            return false;
        if (other.getLicense() != null && other.getLicense().equals(this.getLicense()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }
}
