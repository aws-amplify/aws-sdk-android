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
 * Settings that specify how your still graphic overlay appears.
 */
public class InsertableImage implements Serializable {
    /**
     * Specify the time, in milliseconds, for the image to remain on the output
     * video. This duration includes fade-in time but not fade-out time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer duration;

    /**
     * Specify the length of time, in milliseconds, between the Start time that
     * you specify for the image insertion and the time that the image appears
     * at full opacity. Full opacity is the level that you specify for the
     * opacity setting. If you don't specify a value for Fade-in, the image will
     * appear abruptly at the overlay start time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer fadeIn;

    /**
     * Specify the length of time, in milliseconds, between the end of the time
     * that you have specified for the image overlay Duration and when the
     * overlaid image has faded to total transparency. If you don't specify a
     * value for Fade-out, the image will disappear abruptly at the end of the
     * inserted image duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer fadeOut;

    /**
     * Specify the height of the inserted image in pixels. If you specify a
     * value that's larger than the video resolution height, the service will
     * crop your overlaid image to fit. To use the native height of the image,
     * keep this setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer height;

    /**
     * Specify the HTTP, HTTPS, or Amazon S3 location of the image that you want
     * to overlay on the video. Use a PNG or TGA file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG|tga|TGA))|(https?://(.*?)\
     * .(bmp|BMP|png|PNG|tga|TGA)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     */
    private String imageInserterInput;

    /**
     * Specify the distance, in pixels, between the inserted image and the left
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer imageX;

    /**
     * Specify the distance, in pixels, between the overlaid image and the top
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer imageY;

    /**
     * Specify how overlapping inserted images appear. Images with higher values
     * for Layer appear on top of images with lower values for Layer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     */
    private Integer layer;

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows
     * through the inserted image. 0 is transparent and 100 is fully opaque.
     * Default is 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer opacity;

    /**
     * Specify the timecode of the frame that you want the overlay to first
     * appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format.
     * Remember to take into account your timecode source settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     */
    private String startTime;

    /**
     * Specify the width of the inserted image in pixels. If you specify a value
     * that's larger than the video resolution width, the service will crop your
     * overlaid image to fit. To use the native width of the image, keep this
     * setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer width;

    /**
     * Specify the time, in milliseconds, for the image to remain on the output
     * video. This duration includes fade-in time but not fade-out time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the time, in milliseconds, for the image to remain on the
     *         output video. This duration includes fade-in time but not
     *         fade-out time.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Specify the time, in milliseconds, for the image to remain on the output
     * video. This duration includes fade-in time but not fade-out time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param duration Specify the time, in milliseconds, for the image to
     *            remain on the output video. This duration includes fade-in
     *            time but not fade-out time.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Specify the time, in milliseconds, for the image to remain on the output
     * video. This duration includes fade-in time but not fade-out time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param duration Specify the time, in milliseconds, for the image to
     *            remain on the output video. This duration includes fade-in
     *            time but not fade-out time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that
     * you specify for the image insertion and the time that the image appears
     * at full opacity. Full opacity is the level that you specify for the
     * opacity setting. If you don't specify a value for Fade-in, the image will
     * appear abruptly at the overlay start time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the length of time, in milliseconds, between the Start
     *         time that you specify for the image insertion and the time that
     *         the image appears at full opacity. Full opacity is the level that
     *         you specify for the opacity setting. If you don't specify a value
     *         for Fade-in, the image will appear abruptly at the overlay start
     *         time.
     */
    public Integer getFadeIn() {
        return fadeIn;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that
     * you specify for the image insertion and the time that the image appears
     * at full opacity. Full opacity is the level that you specify for the
     * opacity setting. If you don't specify a value for Fade-in, the image will
     * appear abruptly at the overlay start time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param fadeIn Specify the length of time, in milliseconds, between the
     *            Start time that you specify for the image insertion and the
     *            time that the image appears at full opacity. Full opacity is
     *            the level that you specify for the opacity setting. If you
     *            don't specify a value for Fade-in, the image will appear
     *            abruptly at the overlay start time.
     */
    public void setFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that
     * you specify for the image insertion and the time that the image appears
     * at full opacity. Full opacity is the level that you specify for the
     * opacity setting. If you don't specify a value for Fade-in, the image will
     * appear abruptly at the overlay start time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param fadeIn Specify the length of time, in milliseconds, between the
     *            Start time that you specify for the image insertion and the
     *            time that the image appears at full opacity. Full opacity is
     *            the level that you specify for the opacity setting. If you
     *            don't specify a value for Fade-in, the image will appear
     *            abruptly at the overlay start time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
        return this;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time
     * that you have specified for the image overlay Duration and when the
     * overlaid image has faded to total transparency. If you don't specify a
     * value for Fade-out, the image will disappear abruptly at the end of the
     * inserted image duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the length of time, in milliseconds, between the end of
     *         the time that you have specified for the image overlay Duration
     *         and when the overlaid image has faded to total transparency. If
     *         you don't specify a value for Fade-out, the image will disappear
     *         abruptly at the end of the inserted image duration.
     */
    public Integer getFadeOut() {
        return fadeOut;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time
     * that you have specified for the image overlay Duration and when the
     * overlaid image has faded to total transparency. If you don't specify a
     * value for Fade-out, the image will disappear abruptly at the end of the
     * inserted image duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param fadeOut Specify the length of time, in milliseconds, between the
     *            end of the time that you have specified for the image overlay
     *            Duration and when the overlaid image has faded to total
     *            transparency. If you don't specify a value for Fade-out, the
     *            image will disappear abruptly at the end of the inserted image
     *            duration.
     */
    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time
     * that you have specified for the image overlay Duration and when the
     * overlaid image has faded to total transparency. If you don't specify a
     * value for Fade-out, the image will disappear abruptly at the end of the
     * inserted image duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param fadeOut Specify the length of time, in milliseconds, between the
     *            end of the time that you have specified for the image overlay
     *            Duration and when the overlaid image has faded to total
     *            transparency. If you don't specify a value for Fade-out, the
     *            image will disappear abruptly at the end of the inserted image
     *            duration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
        return this;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a
     * value that's larger than the video resolution height, the service will
     * crop your overlaid image to fit. To use the native height of the image,
     * keep this setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the height of the inserted image in pixels. If you
     *         specify a value that's larger than the video resolution height,
     *         the service will crop your overlaid image to fit. To use the
     *         native height of the image, keep this setting blank.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a
     * value that's larger than the video resolution height, the service will
     * crop your overlaid image to fit. To use the native height of the image,
     * keep this setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param height Specify the height of the inserted image in pixels. If you
     *            specify a value that's larger than the video resolution
     *            height, the service will crop your overlaid image to fit. To
     *            use the native height of the image, keep this setting blank.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a
     * value that's larger than the video resolution height, the service will
     * crop your overlaid image to fit. To use the native height of the image,
     * keep this setting blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param height Specify the height of the inserted image in pixels. If you
     *            specify a value that's larger than the video resolution
     *            height, the service will crop your overlaid image to fit. To
     *            use the native height of the image, keep this setting blank.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Specify the HTTP, HTTPS, or Amazon S3 location of the image that you want
     * to overlay on the video. Use a PNG or TGA file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG|tga|TGA))|(https?://(.*?)\
     * .(bmp|BMP|png|PNG|tga|TGA)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @return Specify the HTTP, HTTPS, or Amazon S3 location of the image that
     *         you want to overlay on the video. Use a PNG or TGA file.
     */
    public String getImageInserterInput() {
        return imageInserterInput;
    }

    /**
     * Specify the HTTP, HTTPS, or Amazon S3 location of the image that you want
     * to overlay on the video. Use a PNG or TGA file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG|tga|TGA))|(https?://(.*?)\
     * .(bmp|BMP|png|PNG|tga|TGA)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param imageInserterInput Specify the HTTP, HTTPS, or Amazon S3 location
     *            of the image that you want to overlay on the video. Use a PNG
     *            or TGA file.
     */
    public void setImageInserterInput(String imageInserterInput) {
        this.imageInserterInput = imageInserterInput;
    }

    /**
     * Specify the HTTP, HTTPS, or Amazon S3 location of the image that you want
     * to overlay on the video. Use a PNG or TGA file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG|tga|TGA))|(https?://(.*?)\
     * .(bmp|BMP|png|PNG|tga|TGA)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param imageInserterInput Specify the HTTP, HTTPS, or Amazon S3 location
     *            of the image that you want to overlay on the video. Use a PNG
     *            or TGA file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withImageInserterInput(String imageInserterInput) {
        this.imageInserterInput = imageInserterInput;
        return this;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the distance, in pixels, between the inserted image and
     *         the left edge of the video frame. Required for any image overlay
     *         that you specify.
     */
    public Integer getImageX() {
        return imageX;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageX Specify the distance, in pixels, between the inserted image
     *            and the left edge of the video frame. Required for any image
     *            overlay that you specify.
     */
    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageX Specify the distance, in pixels, between the inserted image
     *            and the left edge of the video frame. Required for any image
     *            overlay that you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withImageX(Integer imageX) {
        this.imageX = imageX;
        return this;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the distance, in pixels, between the overlaid image and
     *         the top edge of the video frame. Required for any image overlay
     *         that you specify.
     */
    public Integer getImageY() {
        return imageY;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageY Specify the distance, in pixels, between the overlaid image
     *            and the top edge of the video frame. Required for any image
     *            overlay that you specify.
     */
    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top
     * edge of the video frame. Required for any image overlay that you specify.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param imageY Specify the distance, in pixels, between the overlaid image
     *            and the top edge of the video frame. Required for any image
     *            overlay that you specify.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withImageY(Integer imageY) {
        this.imageY = imageY;
        return this;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values
     * for Layer appear on top of images with lower values for Layer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @return Specify how overlapping inserted images appear. Images with
     *         higher values for Layer appear on top of images with lower values
     *         for Layer.
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values
     * for Layer appear on top of images with lower values for Layer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @param layer Specify how overlapping inserted images appear. Images with
     *            higher values for Layer appear on top of images with lower
     *            values for Layer.
     */
    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values
     * for Layer appear on top of images with lower values for Layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 99<br/>
     *
     * @param layer Specify how overlapping inserted images appear. Images with
     *            higher values for Layer appear on top of images with lower
     *            values for Layer.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withLayer(Integer layer) {
        this.layer = layer;
        return this;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows
     * through the inserted image. 0 is transparent and 100 is fully opaque.
     * Default is 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Use Opacity (Opacity) to specify how much of the underlying video
     *         shows through the inserted image. 0 is transparent and 100 is
     *         fully opaque. Default is 50.
     */
    public Integer getOpacity() {
        return opacity;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows
     * through the inserted image. 0 is transparent and 100 is fully opaque.
     * Default is 50.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param opacity Use Opacity (Opacity) to specify how much of the
     *            underlying video shows through the inserted image. 0 is
     *            transparent and 100 is fully opaque. Default is 50.
     */
    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows
     * through the inserted image. 0 is transparent and 100 is fully opaque.
     * Default is 50.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param opacity Use Opacity (Opacity) to specify how much of the
     *            underlying video shows through the inserted image. 0 is
     *            transparent and 100 is fully opaque. Default is 50.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first
     * appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format.
     * Remember to take into account your timecode source settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @return Specify the timecode of the frame that you want the overlay to
     *         first appear on. This must be in timecode (HH:MM:SS:FF or
     *         HH:MM:SS;FF) format. Remember to take into account your timecode
     *         source settings.
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first
     * appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format.
     * Remember to take into account your timecode source settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param startTime Specify the timecode of the frame that you want the
     *            overlay to first appear on. This must be in timecode
     *            (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into
     *            account your timecode source settings.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first
     * appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format.
     * Remember to take into account your timecode source settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^((([0-1]\d)|(2[0-3]))(:[0-5]\d){2}([:;][0-5]\d))$<br/>
     *
     * @param startTime Specify the timecode of the frame that you want the
     *            overlay to first appear on. This must be in timecode
     *            (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into
     *            account your timecode source settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value
     * that's larger than the video resolution width, the service will crop your
     * overlaid image to fit. To use the native width of the image, keep this
     * setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the width of the inserted image in pixels. If you specify
     *         a value that's larger than the video resolution width, the
     *         service will crop your overlaid image to fit. To use the native
     *         width of the image, keep this setting blank.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value
     * that's larger than the video resolution width, the service will crop your
     * overlaid image to fit. To use the native width of the image, keep this
     * setting blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param width Specify the width of the inserted image in pixels. If you
     *            specify a value that's larger than the video resolution width,
     *            the service will crop your overlaid image to fit. To use the
     *            native width of the image, keep this setting blank.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value
     * that's larger than the video resolution width, the service will crop your
     * overlaid image to fit. To use the native width of the image, keep this
     * setting blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param width Specify the width of the inserted image in pixels. If you
     *            specify a value that's larger than the video resolution width,
     *            the service will crop your overlaid image to fit. To use the
     *            native width of the image, keep this setting blank.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InsertableImage withWidth(Integer width) {
        this.width = width;
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
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFadeIn() != null)
            sb.append("FadeIn: " + getFadeIn() + ",");
        if (getFadeOut() != null)
            sb.append("FadeOut: " + getFadeOut() + ",");
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getImageInserterInput() != null)
            sb.append("ImageInserterInput: " + getImageInserterInput() + ",");
        if (getImageX() != null)
            sb.append("ImageX: " + getImageX() + ",");
        if (getImageY() != null)
            sb.append("ImageY: " + getImageY() + ",");
        if (getLayer() != null)
            sb.append("Layer: " + getLayer() + ",");
        if (getOpacity() != null)
            sb.append("Opacity: " + getOpacity() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getWidth() != null)
            sb.append("Width: " + getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFadeIn() == null) ? 0 : getFadeIn().hashCode());
        hashCode = prime * hashCode + ((getFadeOut() == null) ? 0 : getFadeOut().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode
                + ((getImageInserterInput() == null) ? 0 : getImageInserterInput().hashCode());
        hashCode = prime * hashCode + ((getImageX() == null) ? 0 : getImageX().hashCode());
        hashCode = prime * hashCode + ((getImageY() == null) ? 0 : getImageY().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        hashCode = prime * hashCode + ((getOpacity() == null) ? 0 : getOpacity().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsertableImage == false)
            return false;
        InsertableImage other = (InsertableImage) obj;

        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFadeIn() == null ^ this.getFadeIn() == null)
            return false;
        if (other.getFadeIn() != null && other.getFadeIn().equals(this.getFadeIn()) == false)
            return false;
        if (other.getFadeOut() == null ^ this.getFadeOut() == null)
            return false;
        if (other.getFadeOut() != null && other.getFadeOut().equals(this.getFadeOut()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getImageInserterInput() == null ^ this.getImageInserterInput() == null)
            return false;
        if (other.getImageInserterInput() != null
                && other.getImageInserterInput().equals(this.getImageInserterInput()) == false)
            return false;
        if (other.getImageX() == null ^ this.getImageX() == null)
            return false;
        if (other.getImageX() != null && other.getImageX().equals(this.getImageX()) == false)
            return false;
        if (other.getImageY() == null ^ this.getImageY() == null)
            return false;
        if (other.getImageY() != null && other.getImageY().equals(this.getImageY()) == false)
            return false;
        if (other.getLayer() == null ^ this.getLayer() == null)
            return false;
        if (other.getLayer() != null && other.getLayer().equals(this.getLayer()) == false)
            return false;
        if (other.getOpacity() == null ^ this.getOpacity() == null)
            return false;
        if (other.getOpacity() != null && other.getOpacity().equals(this.getOpacity()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
