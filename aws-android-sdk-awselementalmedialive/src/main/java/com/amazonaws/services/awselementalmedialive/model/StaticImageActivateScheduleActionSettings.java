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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Settings for the action to activate a static image.
 */
public class StaticImageActivateScheduleActionSettings implements Serializable {
    /**
     * The duration in milliseconds for the image to remain on the video. If
     * omitted or set to 0 the duration is unlimited and the image will remain
     * until it is explicitly deactivated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer duration;

    /**
     * The time in milliseconds for the image to fade in. The fade-in starts at
     * the start time of the overlay. Default is 0 (no fade-in).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer fadeIn;

    /**
     * Applies only if a duration is specified. The time in milliseconds for the
     * image to fade out. The fade-out starts when the duration time is hit, so
     * it effectively extends the duration. Default is 0 (no fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer fadeOut;

    /**
     * The height of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified height. Leave blank to
     * use the native height of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer height;

    /**
     * The location and filename of the image file to overlay on the video. The
     * file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in
     * pixels) than the input video.
     */
    private InputLocation image;

    /**
     * Placement of the left edge of the overlay relative to the left edge of
     * the video frame, in pixels. 0 (the default) is the left edge of the
     * frame. If the placement causes the overlay to extend beyond the right
     * edge of the underlying video, then the overlay is cropped on the right.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer imageX;

    /**
     * Placement of the top edge of the overlay relative to the top edge of the
     * video frame, in pixels. 0 (the default) is the top edge of the frame. If
     * the placement causes the overlay to extend beyond the bottom edge of the
     * underlying video, then the overlay is cropped on the bottom.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer imageY;

    /**
     * The number of the layer, 0 to 7. There are 8 layers that can be overlaid
     * on the video, each layer with a different image. The layers are in Z
     * order, which means that overlays with higher values of layer are inserted
     * on top of overlays with lower values of layer. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     */
    private Integer layer;

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Default
     * is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer opacity;

    /**
     * The width of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified width. Leave blank to
     * use the native width of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer width;

    /**
     * The duration in milliseconds for the image to remain on the video. If
     * omitted or set to 0 the duration is unlimited and the image will remain
     * until it is explicitly deactivated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The duration in milliseconds for the image to remain on the
     *         video. If omitted or set to 0 the duration is unlimited and the
     *         image will remain until it is explicitly deactivated.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * The duration in milliseconds for the image to remain on the video. If
     * omitted or set to 0 the duration is unlimited and the image will remain
     * until it is explicitly deactivated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param duration The duration in milliseconds for the image to remain on
     *            the video. If omitted or set to 0 the duration is unlimited
     *            and the image will remain until it is explicitly deactivated.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The duration in milliseconds for the image to remain on the video. If
     * omitted or set to 0 the duration is unlimited and the image will remain
     * until it is explicitly deactivated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param duration The duration in milliseconds for the image to remain on
     *            the video. If omitted or set to 0 the duration is unlimited
     *            and the image will remain until it is explicitly deactivated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The time in milliseconds for the image to fade in. The fade-in starts at
     * the start time of the overlay. Default is 0 (no fade-in).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The time in milliseconds for the image to fade in. The fade-in
     *         starts at the start time of the overlay. Default is 0 (no
     *         fade-in).
     */
    public Integer getFadeIn() {
        return fadeIn;
    }

    /**
     * The time in milliseconds for the image to fade in. The fade-in starts at
     * the start time of the overlay. Default is 0 (no fade-in).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeIn The time in milliseconds for the image to fade in. The
     *            fade-in starts at the start time of the overlay. Default is 0
     *            (no fade-in).
     */
    public void setFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
    }

    /**
     * The time in milliseconds for the image to fade in. The fade-in starts at
     * the start time of the overlay. Default is 0 (no fade-in).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeIn The time in milliseconds for the image to fade in. The
     *            fade-in starts at the start time of the overlay. Default is 0
     *            (no fade-in).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
        return this;
    }

    /**
     * Applies only if a duration is specified. The time in milliseconds for the
     * image to fade out. The fade-out starts when the duration time is hit, so
     * it effectively extends the duration. Default is 0 (no fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Applies only if a duration is specified. The time in milliseconds
     *         for the image to fade out. The fade-out starts when the duration
     *         time is hit, so it effectively extends the duration. Default is 0
     *         (no fade-out).
     */
    public Integer getFadeOut() {
        return fadeOut;
    }

    /**
     * Applies only if a duration is specified. The time in milliseconds for the
     * image to fade out. The fade-out starts when the duration time is hit, so
     * it effectively extends the duration. Default is 0 (no fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeOut Applies only if a duration is specified. The time in
     *            milliseconds for the image to fade out. The fade-out starts
     *            when the duration time is hit, so it effectively extends the
     *            duration. Default is 0 (no fade-out).
     */
    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * Applies only if a duration is specified. The time in milliseconds for the
     * image to fade out. The fade-out starts when the duration time is hit, so
     * it effectively extends the duration. Default is 0 (no fade-out).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeOut Applies only if a duration is specified. The time in
     *            milliseconds for the image to fade out. The fade-out starts
     *            when the duration time is hit, so it effectively extends the
     *            duration. Default is 0 (no fade-out).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
        return this;
    }

    /**
     * The height of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified height. Leave blank to
     * use the native height of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The height of the image when inserted into the video, in pixels.
     *         The overlay will be scaled up or down to the specified height.
     *         Leave blank to use the native height of the overlay.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * The height of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified height. Leave blank to
     * use the native height of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param height The height of the image when inserted into the video, in
     *            pixels. The overlay will be scaled up or down to the specified
     *            height. Leave blank to use the native height of the overlay.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The height of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified height. Leave blank to
     * use the native height of the overlay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param height The height of the image when inserted into the video, in
     *            pixels. The overlay will be scaled up or down to the specified
     *            height. Leave blank to use the native height of the overlay.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The location and filename of the image file to overlay on the video. The
     * file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in
     * pixels) than the input video.
     *
     * @return The location and filename of the image file to overlay on the
     *         video. The file must be a 32-bit BMP, PNG, or TGA file, and must
     *         not be larger (in pixels) than the input video.
     */
    public InputLocation getImage() {
        return image;
    }

    /**
     * The location and filename of the image file to overlay on the video. The
     * file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in
     * pixels) than the input video.
     *
     * @param image The location and filename of the image file to overlay on
     *            the video. The file must be a 32-bit BMP, PNG, or TGA file,
     *            and must not be larger (in pixels) than the input video.
     */
    public void setImage(InputLocation image) {
        this.image = image;
    }

    /**
     * The location and filename of the image file to overlay on the video. The
     * file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in
     * pixels) than the input video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image The location and filename of the image file to overlay on
     *            the video. The file must be a 32-bit BMP, PNG, or TGA file,
     *            and must not be larger (in pixels) than the input video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withImage(InputLocation image) {
        this.image = image;
        return this;
    }

    /**
     * Placement of the left edge of the overlay relative to the left edge of
     * the video frame, in pixels. 0 (the default) is the left edge of the
     * frame. If the placement causes the overlay to extend beyond the right
     * edge of the underlying video, then the overlay is cropped on the right.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Placement of the left edge of the overlay relative to the left
     *         edge of the video frame, in pixels. 0 (the default) is the left
     *         edge of the frame. If the placement causes the overlay to extend
     *         beyond the right edge of the underlying video, then the overlay
     *         is cropped on the right.
     */
    public Integer getImageX() {
        return imageX;
    }

    /**
     * Placement of the left edge of the overlay relative to the left edge of
     * the video frame, in pixels. 0 (the default) is the left edge of the
     * frame. If the placement causes the overlay to extend beyond the right
     * edge of the underlying video, then the overlay is cropped on the right.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param imageX Placement of the left edge of the overlay relative to the
     *            left edge of the video frame, in pixels. 0 (the default) is
     *            the left edge of the frame. If the placement causes the
     *            overlay to extend beyond the right edge of the underlying
     *            video, then the overlay is cropped on the right.
     */
    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Placement of the left edge of the overlay relative to the left edge of
     * the video frame, in pixels. 0 (the default) is the left edge of the
     * frame. If the placement causes the overlay to extend beyond the right
     * edge of the underlying video, then the overlay is cropped on the right.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param imageX Placement of the left edge of the overlay relative to the
     *            left edge of the video frame, in pixels. 0 (the default) is
     *            the left edge of the frame. If the placement causes the
     *            overlay to extend beyond the right edge of the underlying
     *            video, then the overlay is cropped on the right.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withImageX(Integer imageX) {
        this.imageX = imageX;
        return this;
    }

    /**
     * Placement of the top edge of the overlay relative to the top edge of the
     * video frame, in pixels. 0 (the default) is the top edge of the frame. If
     * the placement causes the overlay to extend beyond the bottom edge of the
     * underlying video, then the overlay is cropped on the bottom.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Placement of the top edge of the overlay relative to the top edge
     *         of the video frame, in pixels. 0 (the default) is the top edge of
     *         the frame. If the placement causes the overlay to extend beyond
     *         the bottom edge of the underlying video, then the overlay is
     *         cropped on the bottom.
     */
    public Integer getImageY() {
        return imageY;
    }

    /**
     * Placement of the top edge of the overlay relative to the top edge of the
     * video frame, in pixels. 0 (the default) is the top edge of the frame. If
     * the placement causes the overlay to extend beyond the bottom edge of the
     * underlying video, then the overlay is cropped on the bottom.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param imageY Placement of the top edge of the overlay relative to the
     *            top edge of the video frame, in pixels. 0 (the default) is the
     *            top edge of the frame. If the placement causes the overlay to
     *            extend beyond the bottom edge of the underlying video, then
     *            the overlay is cropped on the bottom.
     */
    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Placement of the top edge of the overlay relative to the top edge of the
     * video frame, in pixels. 0 (the default) is the top edge of the frame. If
     * the placement causes the overlay to extend beyond the bottom edge of the
     * underlying video, then the overlay is cropped on the bottom.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param imageY Placement of the top edge of the overlay relative to the
     *            top edge of the video frame, in pixels. 0 (the default) is the
     *            top edge of the frame. If the placement causes the overlay to
     *            extend beyond the bottom edge of the underlying video, then
     *            the overlay is cropped on the bottom.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withImageY(Integer imageY) {
        this.imageY = imageY;
        return this;
    }

    /**
     * The number of the layer, 0 to 7. There are 8 layers that can be overlaid
     * on the video, each layer with a different image. The layers are in Z
     * order, which means that overlays with higher values of layer are inserted
     * on top of overlays with lower values of layer. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @return The number of the layer, 0 to 7. There are 8 layers that can be
     *         overlaid on the video, each layer with a different image. The
     *         layers are in Z order, which means that overlays with higher
     *         values of layer are inserted on top of overlays with lower values
     *         of layer. Default is 0.
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * The number of the layer, 0 to 7. There are 8 layers that can be overlaid
     * on the video, each layer with a different image. The layers are in Z
     * order, which means that overlays with higher values of layer are inserted
     * on top of overlays with lower values of layer. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param layer The number of the layer, 0 to 7. There are 8 layers that can
     *            be overlaid on the video, each layer with a different image.
     *            The layers are in Z order, which means that overlays with
     *            higher values of layer are inserted on top of overlays with
     *            lower values of layer. Default is 0.
     */
    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * The number of the layer, 0 to 7. There are 8 layers that can be overlaid
     * on the video, each layer with a different image. The layers are in Z
     * order, which means that overlays with higher values of layer are inserted
     * on top of overlays with lower values of layer. Default is 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param layer The number of the layer, 0 to 7. There are 8 layers that can
     *            be overlaid on the video, each layer with a different image.
     *            The layers are in Z order, which means that overlays with
     *            higher values of layer are inserted on top of overlays with
     *            lower values of layer. Default is 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withLayer(Integer layer) {
        this.layer = layer;
        return this;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Default
     * is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Opacity of image where 0 is transparent and 100 is fully opaque.
     *         Default is 100.
     */
    public Integer getOpacity() {
        return opacity;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Default
     * is 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param opacity Opacity of image where 0 is transparent and 100 is fully
     *            opaque. Default is 100.
     */
    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Default
     * is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param opacity Opacity of image where 0 is transparent and 100 is fully
     *            opaque. Default is 100.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * The width of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified width. Leave blank to
     * use the native width of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The width of the image when inserted into the video, in pixels.
     *         The overlay will be scaled up or down to the specified width.
     *         Leave blank to use the native width of the overlay.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * The width of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified width. Leave blank to
     * use the native width of the overlay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param width The width of the image when inserted into the video, in
     *            pixels. The overlay will be scaled up or down to the specified
     *            width. Leave blank to use the native width of the overlay.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * The width of the image when inserted into the video, in pixels. The
     * overlay will be scaled up or down to the specified width. Leave blank to
     * use the native width of the overlay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param width The width of the image when inserted into the video, in
     *            pixels. The overlay will be scaled up or down to the specified
     *            width. Leave blank to use the native width of the overlay.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageActivateScheduleActionSettings withWidth(Integer width) {
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getImageX() != null)
            sb.append("ImageX: " + getImageX() + ",");
        if (getImageY() != null)
            sb.append("ImageY: " + getImageY() + ",");
        if (getLayer() != null)
            sb.append("Layer: " + getLayer() + ",");
        if (getOpacity() != null)
            sb.append("Opacity: " + getOpacity() + ",");
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
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImageX() == null) ? 0 : getImageX().hashCode());
        hashCode = prime * hashCode + ((getImageY() == null) ? 0 : getImageY().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        hashCode = prime * hashCode + ((getOpacity() == null) ? 0 : getOpacity().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticImageActivateScheduleActionSettings == false)
            return false;
        StaticImageActivateScheduleActionSettings other = (StaticImageActivateScheduleActionSettings) obj;

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
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
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
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
