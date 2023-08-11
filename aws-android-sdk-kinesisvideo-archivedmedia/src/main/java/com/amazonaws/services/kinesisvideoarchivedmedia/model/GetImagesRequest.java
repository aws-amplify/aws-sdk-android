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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a list of Images corresponding to each timestamp for a given time
 * range, sampling interval, and image format configuration.
 * </p>
 */
public class GetImagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must
     * specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the
     * images. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     */
    private String imageSelectorType;

    /**
     * <p>
     * The starting point from which the images should be generated. This
     * <code>StartTimestamp</code> must be within an inclusive range of
     * timestamps for an image to be returned.
     * </p>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The end timestamp for the range of images to be generated. If the time
     * range between <code>StartTimestamp</code> and <code>EndTimestamp</code>
     * is more than 300 seconds above <code>StartTimestamp</code>, you will
     * receive an <code>IllegalArgumentException</code>.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream, with a default of 3000 ms. The minimum value
     * that can be provided is 200 ms. If the timestamp range is less than the
     * sampling interval, the Image from the <code>startTimestamp</code> will be
     * returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 200 ms is a hard limit.
     * </p>
     * </note>
     */
    private Integer samplingInterval;

    /**
     * <p>
     * The format that will be used to encode the image.
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
     * <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code>
     * will be thrown. If neither parameter is provided, the original image size
     * from the stream will be returned.
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
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 25 images per API response. Providing a
     * <code>MaxResults</code> greater than this value will result in a page
     * size of 25. Any additional results will be paginated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Long maxResults;

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images.
     * This is the <code>GetImages:NextToken</code> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must
     * specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream from which to retrieve the images. You
     *         must specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must
     * specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve the images. You
     *            must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to retrieve the images. You must
     * specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to retrieve the images. You
     *            must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the
     * images. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream from which to
     *         retrieve the images. You must specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the
     * images. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream from which to
     *            retrieve the images. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream from which to retrieve the
     * images. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream from which to
     *            retrieve the images. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The origin of the Server or Producer timestamps to use to generate the
     * images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
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
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
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
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageSelectorType
     */
    public GetImagesRequest withImageSelectorType(String imageSelectorType) {
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
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
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
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param imageSelectorType <p>
     *            The origin of the Server or Producer timestamps to use to
     *            generate the images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageSelectorType
     */
    public GetImagesRequest withImageSelectorType(ImageSelectorType imageSelectorType) {
        this.imageSelectorType = imageSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This
     * <code>StartTimestamp</code> must be within an inclusive range of
     * timestamps for an image to be returned.
     * </p>
     *
     * @return <p>
     *         The starting point from which the images should be generated.
     *         This <code>StartTimestamp</code> must be within an inclusive
     *         range of timestamps for an image to be returned.
     *         </p>
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This
     * <code>StartTimestamp</code> must be within an inclusive range of
     * timestamps for an image to be returned.
     * </p>
     *
     * @param startTimestamp <p>
     *            The starting point from which the images should be generated.
     *            This <code>StartTimestamp</code> must be within an inclusive
     *            range of timestamps for an image to be returned.
     *            </p>
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The starting point from which the images should be generated. This
     * <code>StartTimestamp</code> must be within an inclusive range of
     * timestamps for an image to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The starting point from which the images should be generated.
     *            This <code>StartTimestamp</code> must be within an inclusive
     *            range of timestamps for an image to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated. If the time
     * range between <code>StartTimestamp</code> and <code>EndTimestamp</code>
     * is more than 300 seconds above <code>StartTimestamp</code>, you will
     * receive an <code>IllegalArgumentException</code>.
     * </p>
     *
     * @return <p>
     *         The end timestamp for the range of images to be generated. If the
     *         time range between <code>StartTimestamp</code> and
     *         <code>EndTimestamp</code> is more than 300 seconds above
     *         <code>StartTimestamp</code>, you will receive an
     *         <code>IllegalArgumentException</code>.
     *         </p>
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated. If the time
     * range between <code>StartTimestamp</code> and <code>EndTimestamp</code>
     * is more than 300 seconds above <code>StartTimestamp</code>, you will
     * receive an <code>IllegalArgumentException</code>.
     * </p>
     *
     * @param endTimestamp <p>
     *            The end timestamp for the range of images to be generated. If
     *            the time range between <code>StartTimestamp</code> and
     *            <code>EndTimestamp</code> is more than 300 seconds above
     *            <code>StartTimestamp</code>, you will receive an
     *            <code>IllegalArgumentException</code>.
     *            </p>
     */
    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The end timestamp for the range of images to be generated. If the time
     * range between <code>StartTimestamp</code> and <code>EndTimestamp</code>
     * is more than 300 seconds above <code>StartTimestamp</code>, you will
     * receive an <code>IllegalArgumentException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp <p>
     *            The end timestamp for the range of images to be generated. If
     *            the time range between <code>StartTimestamp</code> and
     *            <code>EndTimestamp</code> is more than 300 seconds above
     *            <code>StartTimestamp</code>, you will receive an
     *            <code>IllegalArgumentException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream, with a default of 3000 ms. The minimum value
     * that can be provided is 200 ms. If the timestamp range is less than the
     * sampling interval, the Image from the <code>startTimestamp</code> will be
     * returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 200 ms is a hard limit.
     * </p>
     * </note>
     *
     * @return <p>
     *         The time interval in milliseconds (ms) at which the images need
     *         to be generated from the stream, with a default of 3000 ms. The
     *         minimum value that can be provided is 200 ms. If the timestamp
     *         range is less than the sampling interval, the Image from the
     *         <code>startTimestamp</code> will be returned if available.
     *         </p>
     *         <note>
     *         <p>
     *         The minimum value of 200 ms is a hard limit.
     *         </p>
     *         </note>
     */
    public Integer getSamplingInterval() {
        return samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream, with a default of 3000 ms. The minimum value
     * that can be provided is 200 ms. If the timestamp range is less than the
     * sampling interval, the Image from the <code>startTimestamp</code> will be
     * returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 200 ms is a hard limit.
     * </p>
     * </note>
     *
     * @param samplingInterval <p>
     *            The time interval in milliseconds (ms) at which the images
     *            need to be generated from the stream, with a default of 3000
     *            ms. The minimum value that can be provided is 200 ms. If the
     *            timestamp range is less than the sampling interval, the Image
     *            from the <code>startTimestamp</code> will be returned if
     *            available.
     *            </p>
     *            <note>
     *            <p>
     *            The minimum value of 200 ms is a hard limit.
     *            </p>
     *            </note>
     */
    public void setSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
    }

    /**
     * <p>
     * The time interval in milliseconds (ms) at which the images need to be
     * generated from the stream, with a default of 3000 ms. The minimum value
     * that can be provided is 200 ms. If the timestamp range is less than the
     * sampling interval, the Image from the <code>startTimestamp</code> will be
     * returned if available.
     * </p>
     * <note>
     * <p>
     * The minimum value of 200 ms is a hard limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samplingInterval <p>
     *            The time interval in milliseconds (ms) at which the images
     *            need to be generated from the stream, with a default of 3000
     *            ms. The minimum value that can be provided is 200 ms. If the
     *            timestamp range is less than the sampling interval, the Image
     *            from the <code>startTimestamp</code> will be returned if
     *            available.
     *            </p>
     *            <note>
     *            <p>
     *            The minimum value of 200 ms is a hard limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
        return this;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @return <p>
     *         The format that will be used to encode the image.
     *         </p>
     * @see Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The format that will be used to encode the image.
     *            </p>
     * @see Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The format that will be used to encode the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public GetImagesRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The format that will be used to encode the image.
     *            </p>
     * @see Format
     */
    public void setFormat(Format format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format that will be used to encode the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JPEG, PNG
     *
     * @param format <p>
     *            The format that will be used to encode the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Format
     */
    public GetImagesRequest withFormat(Format format) {
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
    public GetImagesRequest withFormatConfig(java.util.Map<String, String> formatConfig) {
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
    public GetImagesRequest addFormatConfigEntry(String key, String value) {
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
    public GetImagesRequest clearFormatConfigEntries() {
        this.formatConfig = null;
        return this;
    }

    /**
     * <p>
     * The width of the output image that is used in conjunction with the
     * <code>HeightPixels</code> parameter. When both <code>WidthPixels</code>
     * and <code>HeightPixels</code> parameters are provided, the image will be
     * stretched to fit the specified aspect ratio. If only the
     * <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code>
     * will be thrown. If neither parameter is provided, the original image size
     * from the stream will be returned.
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
     *         provided or if only the <code>HeightPixels</code> is provided, a
     *         <code>ValidationException</code> will be thrown. If neither
     *         parameter is provided, the original image size from the stream
     *         will be returned.
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
     * <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code>
     * will be thrown. If neither parameter is provided, the original image size
     * from the stream will be returned.
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
     *            <code>WidthPixels</code> parameter is provided or if only the
     *            <code>HeightPixels</code> is provided, a
     *            <code>ValidationException</code> will be thrown. If neither
     *            parameter is provided, the original image size from the stream
     *            will be returned.
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
     * <code>WidthPixels</code> parameter is provided or if only the
     * <code>HeightPixels</code> is provided, a <code>ValidationException</code>
     * will be thrown. If neither parameter is provided, the original image size
     * from the stream will be returned.
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
     *            <code>WidthPixels</code> parameter is provided or if only the
     *            <code>HeightPixels</code> is provided, a
     *            <code>ValidationException</code> will be thrown. If neither
     *            parameter is provided, the original image size from the stream
     *            will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withWidthPixels(Integer widthPixels) {
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
    public GetImagesRequest withHeightPixels(Integer heightPixels) {
        this.heightPixels = heightPixels;
        return this;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 25 images per API response. Providing a
     * <code>MaxResults</code> greater than this value will result in a page
     * size of 25. Any additional results will be paginated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of images to be returned by the API.
     *         </p>
     *         <note>
     *         <p>
     *         The default limit is 25 images per API response. Providing a
     *         <code>MaxResults</code> greater than this value will result in a
     *         page size of 25. Any additional results will be paginated.
     *         </p>
     *         </note>
     */
    public Long getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 25 images per API response. Providing a
     * <code>MaxResults</code> greater than this value will result in a page
     * size of 25. Any additional results will be paginated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of images to be returned by the API.
     *            </p>
     *            <note>
     *            <p>
     *            The default limit is 25 images per API response. Providing a
     *            <code>MaxResults</code> greater than this value will result in
     *            a page size of 25. Any additional results will be paginated.
     *            </p>
     *            </note>
     */
    public void setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of images to be returned by the API.
     * </p>
     * <note>
     * <p>
     * The default limit is 25 images per API response. Providing a
     * <code>MaxResults</code> greater than this value will result in a page
     * size of 25. Any additional results will be paginated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of images to be returned by the API.
     *            </p>
     *            <note>
     *            <p>
     *            The default limit is 25 images per API response. Providing a
     *            <code>MaxResults</code> greater than this value will result in
     *            a page size of 25. Any additional results will be paginated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images.
     * This is the <code>GetImages:NextToken</code> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         A token that specifies where to start paginating the next set of
     *         Images. This is the <code>GetImages:NextToken</code> from a
     *         previously truncated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images.
     * This is the <code>GetImages:NextToken</code> from a previously truncated
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            A token that specifies where to start paginating the next set
     *            of Images. This is the <code>GetImages:NextToken</code> from a
     *            previously truncated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that specifies where to start paginating the next set of Images.
     * This is the <code>GetImages:NextToken</code> from a previously truncated
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            A token that specifies where to start paginating the next set
     *            of Images. This is the <code>GetImages:NextToken</code> from a
     *            previously truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getImageSelectorType() != null)
            sb.append("ImageSelectorType: " + getImageSelectorType() + ",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp() + ",");
        if (getSamplingInterval() != null)
            sb.append("SamplingInterval: " + getSamplingInterval() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getFormatConfig() != null)
            sb.append("FormatConfig: " + getFormatConfig() + ",");
        if (getWidthPixels() != null)
            sb.append("WidthPixels: " + getWidthPixels() + ",");
        if (getHeightPixels() != null)
            sb.append("HeightPixels: " + getHeightPixels() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getImageSelectorType() == null) ? 0 : getImageSelectorType().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getSamplingInterval() == null) ? 0 : getSamplingInterval().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getFormatConfig() == null) ? 0 : getFormatConfig().hashCode());
        hashCode = prime * hashCode
                + ((getWidthPixels() == null) ? 0 : getWidthPixels().hashCode());
        hashCode = prime * hashCode
                + ((getHeightPixels() == null) ? 0 : getHeightPixels().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImagesRequest == false)
            return false;
        GetImagesRequest other = (GetImagesRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getImageSelectorType() == null ^ this.getImageSelectorType() == null)
            return false;
        if (other.getImageSelectorType() != null
                && other.getImageSelectorType().equals(this.getImageSelectorType()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null
                && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
