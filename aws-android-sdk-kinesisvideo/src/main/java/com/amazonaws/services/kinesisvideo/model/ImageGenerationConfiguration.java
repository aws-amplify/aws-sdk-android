/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The structure that contains the information required for the KVS images
 * delivery. If null, the configuration will be deleted from the stream.
 * </p>
 */
public class ImageGenerationConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     */
    private String imageSelectorType;

    /**
     * <p>
     * The structure that contains the information required to deliver images to
     * a customer.
     * </p>
     */
    private ImageGenerationDestinationConfig destinationConfig;

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream. The minimum value that can be provided is 33
     * ms, because a camera that generates content at 30 FPS would create a
     * frame every 33.3 ms. If the timestamp range is less than the sampling
     * interval, the Image from the <code>StartTimestamp</code> will be returned
     * if available.
     * </p>
     */
    private Integer samplingInterval;

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     */
    private String format;

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters
     * that can be applied when the image is generated. The
     * <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which
     * indicates the JPEG quality key to be used to generate the image. The
     * <code>FormatConfig</code> value accepts ints from 1 to 100. If the value
     * is 1, the image will be generated with less quality and the best
     * compression. If the value is 100, the image will be generated with the
     * best quality and less compression. If no value is provided, the default
     * value of the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     */
    private java.util.Map<String, String> formatConfig = new java.util.HashMap<String, String>();

    /**
     * <p>
     * The width of the output image that is used in conjunction with the
     * <code>HeightPixels</code> parameter. When both <code>WidthPixels</code>
     * and <code>HeightPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>WidthPixels</code> parameter is provided, its original aspect ratio
     * will be used to calculate the <code>HeightPixels</code> ratio. If neither
     * parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3840<br/>
     */
    private Integer widthPixels;

    /**
     * <p>
     * The height of the output image that is used in conjunction with the
     * <code>WidthPixels</code> parameter. When both <code>HeightPixels</code>
     * and <code>WidthPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     * neither parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2160<br/>
     */
    private Integer heightPixels;

    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Indicates whether the
     *         <code>ContinuousImageGenerationConfigurations</code> API is
     *         enabled or disabled.
     *         </p>
     * @see ConfigurationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates whether the
     *            <code>ContinuousImageGenerationConfigurations</code> API is
     *            enabled or disabled.
     *            </p>
     * @see ConfigurationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates whether the
     *            <code>ContinuousImageGenerationConfigurations</code> API is
     *            enabled or disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationStatus
     */
    public ImageGenerationConfiguration withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates whether the
     *            <code>ContinuousImageGenerationConfigurations</code> API is
     *            enabled or disabled.
     *            </p>
     * @see ConfigurationStatus
     */
    public void setStatus(ConfigurationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates whether the
     * <code>ContinuousImageGenerationConfigurations</code> API is enabled or
     * disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates whether the
     *            <code>ContinuousImageGenerationConfigurations</code> API is
     *            enabled or disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationStatus
     */
    public ImageGenerationConfiguration withStatus(ConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     *
     * @return <p>
     *         The origin of the Server or Producer timestamps to use to
     *         generate the images.
     *         </p>
     * @see ImageSelectorType
     */
    public String getImageSelectorType() {
        return imageSelectorType;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @see ImageSelectorType
     */
    public void setImageSelectorType(String imageSelectorType) {
        this.imageSelectorType = imageSelectorType;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageSelectorType
     */
    public ImageGenerationConfiguration withImageSelectorType(String imageSelectorType) {
        this.imageSelectorType = imageSelectorType;
        return this;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @see ImageSelectorType
     */
    public void setImageSelectorType(ImageSelectorType imageSelectorType) {
        this.imageSelectorType = imageSelectorType.toString();
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVER_TIMESTAMP, PRODUCER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageSelectorType
     */
    public ImageGenerationConfiguration withImageSelectorType(ImageSelectorType imageSelectorType) {
        this.imageSelectorType = imageSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to
     * a customer.
     * </p>
     *
     * @return <p>
     *         The structure that contains the information required to deliver
     *         images to a customer.
     *         </p>
     */
    public ImageGenerationDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to
     * a customer.
     * </p>
     *
     * @param destinationConfig <p>
     *            The structure that contains the information required to
     *            deliver images to a customer.
     *            </p>
     */
    public void setDestinationConfig(ImageGenerationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The structure that contains the information required to deliver images to
     * a customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationConfig <p>
     *            The structure that contains the information required to
     *            deliver images to a customer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration withDestinationConfig(
            ImageGenerationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream. The minimum value that can be provided is 33
     * ms, because a camera that generates content at 30 FPS would create a
     * frame every 33.3 ms. If the timestamp range is less than the sampling
     * interval, the Image from the <code>StartTimestamp</code> will be returned
     * if available.
     * </p>
     *
     * @return <p>
     *         The time interval in milliseconds (ms) at which the images need
     *         to be generated from the stream. The minimum value that can be
     *         provided is 33 ms, because a camera that generates content at 30
     *         FPS would create a frame every 33.3 ms. If the timestamp range is
     *         less than the sampling interval, the Image from the
     *         <code>StartTimestamp</code> will be returned if available.
     *         </p>
     */
    public Integer getSamplingInterval() {
        return samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream. The minimum value that can be provided is 33
     * ms, because a camera that generates content at 30 FPS would create a
     * frame every 33.3 ms. If the timestamp range is less than the sampling
     * interval, the Image from the <code>StartTimestamp</code> will be returned
     * if available.
     * </p>
     *
     * @param samplingInterval <p>
     *            The time interval in milliseconds (ms) at which the images
     *            need to be generated from the stream. The minimum value that
     *            can be provided is 33 ms, because a camera that generates
     *            content at 30 FPS would create a frame every 33.3 ms. If the
     *            timestamp range is less than the sampling interval, the Image
     *            from the <code>StartTimestamp</code> will be returned if
     *            available.
     *            </p>
     */
    public void setSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream. The minimum value that can be provided is 33
     * ms, because a camera that generates content at 30 FPS would create a
     * frame every 33.3 ms. If the timestamp range is less than the sampling
     * interval, the Image from the <code>StartTimestamp</code> will be returned
     * if available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samplingInterval <p>
     *            The time interval in milliseconds (ms) at which the images
     *            need to be generated from the stream. The minimum value that
     *            can be provided is 33 ms, because a camera that generates
     *            content at 30 FPS would create a frame every 33.3 ms. If the
     *            timestamp range is less than the sampling interval, the Image
     *            from the <code>StartTimestamp</code> will be returned if
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration withSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
        return this;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @return <p>
     *         The accepted image format.
     *         </p>
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The accepted image format.
     *            </p>
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The accepted image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImageGenerationConfiguration withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The accepted image format.
     *            </p>
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The accepted image format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The accepted image format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public ImageGenerationConfiguration withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters
     * that can be applied when the image is generated. The
     * <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which
     * indicates the JPEG quality key to be used to generate the image. The
     * <code>FormatConfig</code> value accepts ints from 1 to 100. If the value
     * is 1, the image will be generated with less quality and the best
     * compression. If the value is 100, the image will be generated with the
     * best quality and less compression. If no value is provided, the default
     * value of the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     *
     * @return <p>
     *         The list of a key-value pair structure that contains extra
     *         parameters that can be applied when the image is generated. The
     *         <code>FormatConfig</code> key is the <code>JPEGQuality</code>,
     *         which indicates the JPEG quality key to be used to generate the
     *         image. The <code>FormatConfig</code> value accepts ints from 1 to
     *         100. If the value is 1, the image will be generated with less
     *         quality and the best compression. If the value is 100, the image
     *         will be generated with the best quality and less compression. If
     *         no value is provided, the default value of the
     *         <code>JPEGQuality</code> key will be set to 80.
     *         </p>
     */
    public java.util.Map<String, String> getFormatConfig() {
        return formatConfig;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters
     * that can be applied when the image is generated. The
     * <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which
     * indicates the JPEG quality key to be used to generate the image. The
     * <code>FormatConfig</code> value accepts ints from 1 to 100. If the value
     * is 1, the image will be generated with less quality and the best
     * compression. If the value is 100, the image will be generated with the
     * best quality and less compression. If no value is provided, the default
     * value of the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     *
     * @param formatConfig <p>
     *            The list of a key-value pair structure that contains extra
     *            parameters that can be applied when the image is generated.
     *            The <code>FormatConfig</code> key is the
     *            <code>JPEGQuality</code>, which indicates the JPEG quality key
     *            to be used to generate the image. The
     *            <code>FormatConfig</code> value accepts ints from 1 to 100. If
     *            the value is 1, the image will be generated with less quality
     *            and the best compression. If the value is 100, the image will
     *            be generated with the best quality and less compression. If no
     *            value is provided, the default value of the
     *            <code>JPEGQuality</code> key will be set to 80.
     *            </p>
     */
    public void setFormatConfig(java.util.Map<String, String> formatConfig) {
        this.formatConfig = formatConfig;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters
     * that can be applied when the image is generated. The
     * <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which
     * indicates the JPEG quality key to be used to generate the image. The
     * <code>FormatConfig</code> value accepts ints from 1 to 100. If the value
     * is 1, the image will be generated with less quality and the best
     * compression. If the value is 100, the image will be generated with the
     * best quality and less compression. If no value is provided, the default
     * value of the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param formatConfig <p>
     *            The list of a key-value pair structure that contains extra
     *            parameters that can be applied when the image is generated.
     *            The <code>FormatConfig</code> key is the
     *            <code>JPEGQuality</code>, which indicates the JPEG quality key
     *            to be used to generate the image. The
     *            <code>FormatConfig</code> value accepts ints from 1 to 100. If
     *            the value is 1, the image will be generated with less quality
     *            and the best compression. If the value is 100, the image will
     *            be generated with the best quality and less compression. If no
     *            value is provided, the default value of the
     *            <code>JPEGQuality</code> key will be set to 80.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration withFormatConfig(java.util.Map<String, String> formatConfig) {
        this.formatConfig = formatConfig;
        return this;
    }

    /**
     * <p>
     * The list of a key-value pair structure that contains extra parameters
     * that can be applied when the image is generated. The
     * <code>FormatConfig</code> key is the <code>JPEGQuality</code>, which
     * indicates the JPEG quality key to be used to generate the image. The
     * <code>FormatConfig</code> value accepts ints from 1 to 100. If the value
     * is 1, the image will be generated with less quality and the best
     * compression. If the value is 100, the image will be generated with the
     * best quality and less compression. If no value is provided, the default
     * value of the <code>JPEGQuality</code> key will be set to 80.
     * </p>
     * <p>
     * The method adds a new key-value pair into FormatConfig parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into FormatConfig.
     * @param value The corresponding value of the entry to be added into
     *            FormatConfig.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration addFormatConfigEntry(String key, String value) {
        if (null == this.formatConfig) {
            this.formatConfig = new java.util.HashMap<String, String>();
        }
        if (this.formatConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.formatConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormatConfig.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ImageGenerationConfiguration clearFormatConfigEntries() {
        this.formatConfig = null;
        return this;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the
     * <code>HeightPixels</code> parameter. When both <code>WidthPixels</code>
     * and <code>HeightPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>WidthPixels</code> parameter is provided, its original aspect ratio
     * will be used to calculate the <code>HeightPixels</code> ratio. If neither
     * parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3840<br/>
     *
     * @return <p>
     *         The width of the output image that is used in conjunction with
     *         the <code>HeightPixels</code> parameter. When both
     *         <code>WidthPixels</code> and <code>HeightPixels</code> parameters
     *         are provided, the image will be stretched to fit the specified
     *         aspect ratio. If only the <code>WidthPixels</code> parameter is
     *         provided, its original aspect ratio will be used to calculate the
     *         <code>HeightPixels</code> ratio. If neither parameter is
     *         provided, the original image size will be returned.
     *         </p>
     */
    public Integer getWidthPixels() {
        return widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the
     * <code>HeightPixels</code> parameter. When both <code>WidthPixels</code>
     * and <code>HeightPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>WidthPixels</code> parameter is provided, its original aspect ratio
     * will be used to calculate the <code>HeightPixels</code> ratio. If neither
     * parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3840<br/>
     *
     * @param widthPixels <p>
     *            The width of the output image that is used in conjunction with
     *            the <code>HeightPixels</code> parameter. When both
     *            <code>WidthPixels</code> and <code>HeightPixels</code>
     *            parameters are provided, the image will be stretched to fit
     *            the specified aspect ratio. If only the
     *            <code>WidthPixels</code> parameter is provided, its original
     *            aspect ratio will be used to calculate the
     *            <code>HeightPixels</code> ratio. If neither parameter is
     *            provided, the original image size will be returned.
     *            </p>
     */
    public void setWidthPixels(Integer widthPixels) {
        this.widthPixels = widthPixels;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the
     * <code>HeightPixels</code> parameter. When both <code>WidthPixels</code>
     * and <code>HeightPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>WidthPixels</code> parameter is provided, its original aspect ratio
     * will be used to calculate the <code>HeightPixels</code> ratio. If neither
     * parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3840<br/>
     *
     * @param widthPixels <p>
     *            The width of the output image that is used in conjunction with
     *            the <code>HeightPixels</code> parameter. When both
     *            <code>WidthPixels</code> and <code>HeightPixels</code>
     *            parameters are provided, the image will be stretched to fit
     *            the specified aspect ratio. If only the
     *            <code>WidthPixels</code> parameter is provided, its original
     *            aspect ratio will be used to calculate the
     *            <code>HeightPixels</code> ratio. If neither parameter is
     *            provided, the original image size will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration withWidthPixels(Integer widthPixels) {
        this.widthPixels = widthPixels;
        return this;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the
     * <code>WidthPixels</code> parameter. When both <code>HeightPixels</code>
     * and <code>WidthPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     * neither parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2160<br/>
     *
     * @return <p>
     *         The height of the output image that is used in conjunction with
     *         the <code>WidthPixels</code> parameter. When both
     *         <code>HeightPixels</code> and <code>WidthPixels</code> parameters
     *         are provided, the image will be stretched to fit the specified
     *         aspect ratio. If only the <code>HeightPixels</code> parameter is
     *         provided, its original aspect ratio will be used to calculate the
     *         <code>WidthPixels</code> ratio. If neither parameter is provided,
     *         the original image size will be returned.
     *         </p>
     */
    public Integer getHeightPixels() {
        return heightPixels;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the
     * <code>WidthPixels</code> parameter. When both <code>HeightPixels</code>
     * and <code>WidthPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     * neither parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2160<br/>
     *
     * @param heightPixels <p>
     *            The height of the output image that is used in conjunction
     *            with the <code>WidthPixels</code> parameter. When both
     *            <code>HeightPixels</code> and <code>WidthPixels</code>
     *            parameters are provided, the image will be stretched to fit
     *            the specified aspect ratio. If only the
     *            <code>HeightPixels</code> parameter is provided, its original
     *            aspect ratio will be used to calculate the
     *            <code>WidthPixels</code> ratio. If neither parameter is
     *            provided, the original image size will be returned.
     *            </p>
     */
    public void setHeightPixels(Integer heightPixels) {
        this.heightPixels = heightPixels;
    }

    /**
     * <p>
     * The height of the output image that is used in conjunction with the
     * <code>WidthPixels</code> parameter. When both <code>HeightPixels</code>
     * and <code>WidthPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>HeightPixels</code> parameter is provided, its original aspect
     * ratio will be used to calculate the <code>WidthPixels</code> ratio. If
     * neither parameter is provided, the original image size will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2160<br/>
     *
     * @param heightPixels <p>
     *            The height of the output image that is used in conjunction
     *            with the <code>WidthPixels</code> parameter. When both
     *            <code>HeightPixels</code> and <code>WidthPixels</code>
     *            parameters are provided, the image will be stretched to fit
     *            the specified aspect ratio. If only the
     *            <code>HeightPixels</code> parameter is provided, its original
     *            aspect ratio will be used to calculate the
     *            <code>WidthPixels</code> ratio. If neither parameter is
     *            provided, the original image size will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationConfiguration withHeightPixels(Integer heightPixels) {
        this.heightPixels = heightPixels;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getImageSelectorType() != null)
            sb.append("ImageSelectorType: " + getImageSelectorType() + ",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: " + getDestinationConfig() + ",");
        if (getSamplingInterval() != null)
            sb.append("SamplingInterval: " + getSamplingInterval() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getFormatConfig() != null)
            sb.append("FormatConfig: " + getFormatConfig() + ",");
        if (getWidthPixels() != null)
            sb.append("WidthPixels: " + getWidthPixels() + ",");
        if (getHeightPixels() != null)
            sb.append("HeightPixels: " + getHeightPixels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getImageSelectorType() == null) ? 0 : getImageSelectorType().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode
                + ((getSamplingInterval() == null) ? 0 : getSamplingInterval().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getFormatConfig() == null) ? 0 : getFormatConfig().hashCode());
        hashCode = prime * hashCode
                + ((getWidthPixels() == null) ? 0 : getWidthPixels().hashCode());
        hashCode = prime * hashCode
                + ((getHeightPixels() == null) ? 0 : getHeightPixels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageGenerationConfiguration == false)
            return false;
        ImageGenerationConfiguration other = (ImageGenerationConfiguration) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getImageSelectorType() == null ^ this.getImageSelectorType() == null)
            return false;
        if (other.getImageSelectorType() != null
                && other.getImageSelectorType().equals(this.getImageSelectorType()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null
                && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getSamplingInterval() == null ^ this.getSamplingInterval() == null)
            return false;
        if (other.getSamplingInterval() != null
                && other.getSamplingInterval().equals(this.getSamplingInterval()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFormatConfig() == null ^ this.getFormatConfig() == null)
            return false;
        if (other.getFormatConfig() != null
                && other.getFormatConfig().equals(this.getFormatConfig()) == false)
            return false;
        if (other.getWidthPixels() == null ^ this.getWidthPixels() == null)
            return false;
        if (other.getWidthPixels() != null
                && other.getWidthPixels().equals(this.getWidthPixels()) == false)
            return false;
        if (other.getHeightPixels() == null ^ this.getHeightPixels() == null)
            return false;
        if (other.getHeightPixels() != null
                && other.getHeightPixels().equals(this.getHeightPixels()) == false)
            return false;
        return true;
    }
}
