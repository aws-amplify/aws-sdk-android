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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Burn In Destination Settings
 */
public class BurnInDestinationSettings implements Serializable {
    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     */
    private String alignment;

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     */
    private String backgroundColor;

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is
     * transparent. Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer backgroundOpacity;

    /**
     * External font file used for caption burn-in. File extension must be 'ttf'
     * or 'tte'. Although the user can select output fonts for many different
     * types of input captions, embedded, STL and teletext sources use a strict
     * grid system. Using external fonts with these caption sources could cause
     * unexpected display of proportional fonts. All burn-in and DVB-Sub font
     * settings must match.
     */
    private InputLocation font;

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     */
    private String fontColor;

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is
     * transparent. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer fontOpacity;

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in
     * and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>96 - 600<br/>
     */
    private Integer fontResolution;

    /**
     * When set to 'auto' fontSize will scale depending on the size of the
     * output. Giving a positive integer will specify the exact font size in
     * points. All burn-in and DVB-Sub font settings must match.
     */
    private String fontSize;

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     */
    private String outlineColor;

    /**
     * Specifies font outline size in pixels. This option is not valid for
     * source captions that are either 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     */
    private Integer outlineSize;

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     */
    private String shadowColor;

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent.
     * Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Integer shadowOpacity;

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels to the
     * left. All burn-in and DVB-Sub font settings must match.
     */
    private Integer shadowXOffset;

    /**
     * Specifies the vertical offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels above the
     * text. All burn-in and DVB-Sub font settings must match.
     */
    private Integer shadowYOffset;

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     */
    private String teletextGridControl;

    /**
     * Specifies the horizontal position of the caption relative to the left
     * side of the output in pixels. A value of 10 would result in the captions
     * starting 10 pixels from the left of the output. If no explicit xPosition
     * is provided, the horizontal caption position will be determined by the
     * alignment parameter. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer xPosition;

    /**
     * Specifies the vertical position of the caption relative to the top of the
     * output in pixels. A value of 10 would result in the captions starting 10
     * pixels from the top of the output. If no explicit yPosition is provided,
     * the caption will be positioned towards the bottom of the output. All
     * burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer yPosition;

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     *
     * @return If no explicit xPosition or yPosition is provided, setting
     *         alignment to centered will place the captions at the bottom
     *         center of the output. Similarly, setting a left alignment will
     *         align captions to the bottom left of the output. If x and y
     *         positions are given in conjunction with the alignment parameter,
     *         the font will be justified (either left or centered) relative to
     *         those coordinates. Selecting "smart" justification will
     *         left-justify live subtitles and center-justify pre-recorded
     *         subtitles. All burn-in and DVB-Sub font settings must match.
     * @see BurnInAlignment
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     *
     * @param alignment If no explicit xPosition or yPosition is provided,
     *            setting alignment to centered will place the captions at the
     *            bottom center of the output. Similarly, setting a left
     *            alignment will align captions to the bottom left of the
     *            output. If x and y positions are given in conjunction with the
     *            alignment parameter, the font will be justified (either left
     *            or centered) relative to those coordinates. Selecting "smart"
     *            justification will left-justify live subtitles and
     *            center-justify pre-recorded subtitles. All burn-in and DVB-Sub
     *            font settings must match.
     * @see BurnInAlignment
     */
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     *
     * @param alignment If no explicit xPosition or yPosition is provided,
     *            setting alignment to centered will place the captions at the
     *            bottom center of the output. Similarly, setting a left
     *            alignment will align captions to the bottom left of the
     *            output. If x and y positions are given in conjunction with the
     *            alignment parameter, the font will be justified (either left
     *            or centered) relative to those coordinates. Selecting "smart"
     *            justification will left-justify live subtitles and
     *            center-justify pre-recorded subtitles. All burn-in and DVB-Sub
     *            font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInAlignment
     */
    public BurnInDestinationSettings withAlignment(String alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     *
     * @param alignment If no explicit xPosition or yPosition is provided,
     *            setting alignment to centered will place the captions at the
     *            bottom center of the output. Similarly, setting a left
     *            alignment will align captions to the bottom left of the
     *            output. If x and y positions are given in conjunction with the
     *            alignment parameter, the font will be justified (either left
     *            or centered) relative to those coordinates. Selecting "smart"
     *            justification will left-justify live subtitles and
     *            center-justify pre-recorded subtitles. All burn-in and DVB-Sub
     *            font settings must match.
     * @see BurnInAlignment
     */
    public void setAlignment(BurnInAlignment alignment) {
        this.alignment = alignment.toString();
    }

    /**
     * If no explicit xPosition or yPosition is provided, setting alignment to
     * centered will place the captions at the bottom center of the output.
     * Similarly, setting a left alignment will align captions to the bottom
     * left of the output. If x and y positions are given in conjunction with
     * the alignment parameter, the font will be justified (either left or
     * centered) relative to those coordinates. Selecting "smart" justification
     * will left-justify live subtitles and center-justify pre-recorded
     * subtitles. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENTERED, LEFT, SMART
     *
     * @param alignment If no explicit xPosition or yPosition is provided,
     *            setting alignment to centered will place the captions at the
     *            bottom center of the output. Similarly, setting a left
     *            alignment will align captions to the bottom left of the
     *            output. If x and y positions are given in conjunction with the
     *            alignment parameter, the font will be justified (either left
     *            or centered) relative to those coordinates. Selecting "smart"
     *            justification will left-justify live subtitles and
     *            center-justify pre-recorded subtitles. All burn-in and DVB-Sub
     *            font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInAlignment
     */
    public BurnInDestinationSettings withAlignment(BurnInAlignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @return Specifies the color of the rectangle behind the captions. All
     *         burn-in and DVB-Sub font settings must match.
     * @see BurnInBackgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param backgroundColor Specifies the color of the rectangle behind the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @see BurnInBackgroundColor
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param backgroundColor Specifies the color of the rectangle behind the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInBackgroundColor
     */
    public BurnInDestinationSettings withBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param backgroundColor Specifies the color of the rectangle behind the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @see BurnInBackgroundColor
     */
    public void setBackgroundColor(BurnInBackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor.toString();
    }

    /**
     * Specifies the color of the rectangle behind the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param backgroundColor Specifies the color of the rectangle behind the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInBackgroundColor
     */
    public BurnInDestinationSettings withBackgroundColor(BurnInBackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is
     * transparent. Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Specifies the opacity of the background rectangle. 255 is opaque;
     *         0 is transparent. Leaving this parameter out is equivalent to
     *         setting it to 0 (transparent). All burn-in and DVB-Sub font
     *         settings must match.
     */
    public Integer getBackgroundOpacity() {
        return backgroundOpacity;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is
     * transparent. Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param backgroundOpacity Specifies the opacity of the background
     *            rectangle. 255 is opaque; 0 is transparent. Leaving this
     *            parameter out is equivalent to setting it to 0 (transparent).
     *            All burn-in and DVB-Sub font settings must match.
     */
    public void setBackgroundOpacity(Integer backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
    }

    /**
     * Specifies the opacity of the background rectangle. 255 is opaque; 0 is
     * transparent. Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param backgroundOpacity Specifies the opacity of the background
     *            rectangle. 255 is opaque; 0 is transparent. Leaving this
     *            parameter out is equivalent to setting it to 0 (transparent).
     *            All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withBackgroundOpacity(Integer backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
        return this;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf'
     * or 'tte'. Although the user can select output fonts for many different
     * types of input captions, embedded, STL and teletext sources use a strict
     * grid system. Using external fonts with these caption sources could cause
     * unexpected display of proportional fonts. All burn-in and DVB-Sub font
     * settings must match.
     *
     * @return External font file used for caption burn-in. File extension must
     *         be 'ttf' or 'tte'. Although the user can select output fonts for
     *         many different types of input captions, embedded, STL and
     *         teletext sources use a strict grid system. Using external fonts
     *         with these caption sources could cause unexpected display of
     *         proportional fonts. All burn-in and DVB-Sub font settings must
     *         match.
     */
    public InputLocation getFont() {
        return font;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf'
     * or 'tte'. Although the user can select output fonts for many different
     * types of input captions, embedded, STL and teletext sources use a strict
     * grid system. Using external fonts with these caption sources could cause
     * unexpected display of proportional fonts. All burn-in and DVB-Sub font
     * settings must match.
     *
     * @param font External font file used for caption burn-in. File extension
     *            must be 'ttf' or 'tte'. Although the user can select output
     *            fonts for many different types of input captions, embedded,
     *            STL and teletext sources use a strict grid system. Using
     *            external fonts with these caption sources could cause
     *            unexpected display of proportional fonts. All burn-in and
     *            DVB-Sub font settings must match.
     */
    public void setFont(InputLocation font) {
        this.font = font;
    }

    /**
     * External font file used for caption burn-in. File extension must be 'ttf'
     * or 'tte'. Although the user can select output fonts for many different
     * types of input captions, embedded, STL and teletext sources use a strict
     * grid system. Using external fonts with these caption sources could cause
     * unexpected display of proportional fonts. All burn-in and DVB-Sub font
     * settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param font External font file used for caption burn-in. File extension
     *            must be 'ttf' or 'tte'. Although the user can select output
     *            fonts for many different types of input captions, embedded,
     *            STL and teletext sources use a strict grid system. Using
     *            external fonts with these caption sources could cause
     *            unexpected display of proportional fonts. All burn-in and
     *            DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withFont(InputLocation font) {
        this.font = font;
        return this;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @return Specifies the color of the burned-in captions. This option is not
     *         valid for source captions that are STL, 608/embedded or teletext.
     *         These source settings are already pre-defined by the caption
     *         stream. All burn-in and DVB-Sub font settings must match.
     * @see BurnInFontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param fontColor Specifies the color of the burned-in captions. This
     *            option is not valid for source captions that are STL,
     *            608/embedded or teletext. These source settings are already
     *            pre-defined by the caption stream. All burn-in and DVB-Sub
     *            font settings must match.
     * @see BurnInFontColor
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param fontColor Specifies the color of the burned-in captions. This
     *            option is not valid for source captions that are STL,
     *            608/embedded or teletext. These source settings are already
     *            pre-defined by the caption stream. All burn-in and DVB-Sub
     *            font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInFontColor
     */
    public BurnInDestinationSettings withFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param fontColor Specifies the color of the burned-in captions. This
     *            option is not valid for source captions that are STL,
     *            608/embedded or teletext. These source settings are already
     *            pre-defined by the caption stream. All burn-in and DVB-Sub
     *            font settings must match.
     * @see BurnInFontColor
     */
    public void setFontColor(BurnInFontColor fontColor) {
        this.fontColor = fontColor.toString();
    }

    /**
     * Specifies the color of the burned-in captions. This option is not valid
     * for source captions that are STL, 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param fontColor Specifies the color of the burned-in captions. This
     *            option is not valid for source captions that are STL,
     *            608/embedded or teletext. These source settings are already
     *            pre-defined by the caption stream. All burn-in and DVB-Sub
     *            font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInFontColor
     */
    public BurnInDestinationSettings withFontColor(BurnInFontColor fontColor) {
        this.fontColor = fontColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is
     * transparent. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Specifies the opacity of the burned-in captions. 255 is opaque; 0
     *         is transparent. All burn-in and DVB-Sub font settings must match.
     */
    public Integer getFontOpacity() {
        return fontOpacity;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is
     * transparent. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param fontOpacity Specifies the opacity of the burned-in captions. 255
     *            is opaque; 0 is transparent. All burn-in and DVB-Sub font
     *            settings must match.
     */
    public void setFontOpacity(Integer fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    /**
     * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is
     * transparent. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param fontOpacity Specifies the opacity of the burned-in captions. 255
     *            is opaque; 0 is transparent. All burn-in and DVB-Sub font
     *            settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withFontOpacity(Integer fontOpacity) {
        this.fontOpacity = fontOpacity;
        return this;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in
     * and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>96 - 600<br/>
     *
     * @return Font resolution in DPI (dots per inch); default is 96 dpi. All
     *         burn-in and DVB-Sub font settings must match.
     */
    public Integer getFontResolution() {
        return fontResolution;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in
     * and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>96 - 600<br/>
     *
     * @param fontResolution Font resolution in DPI (dots per inch); default is
     *            96 dpi. All burn-in and DVB-Sub font settings must match.
     */
    public void setFontResolution(Integer fontResolution) {
        this.fontResolution = fontResolution;
    }

    /**
     * Font resolution in DPI (dots per inch); default is 96 dpi. All burn-in
     * and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>96 - 600<br/>
     *
     * @param fontResolution Font resolution in DPI (dots per inch); default is
     *            96 dpi. All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withFontResolution(Integer fontResolution) {
        this.fontResolution = fontResolution;
        return this;
    }

    /**
     * When set to 'auto' fontSize will scale depending on the size of the
     * output. Giving a positive integer will specify the exact font size in
     * points. All burn-in and DVB-Sub font settings must match.
     *
     * @return When set to 'auto' fontSize will scale depending on the size of
     *         the output. Giving a positive integer will specify the exact font
     *         size in points. All burn-in and DVB-Sub font settings must match.
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * When set to 'auto' fontSize will scale depending on the size of the
     * output. Giving a positive integer will specify the exact font size in
     * points. All burn-in and DVB-Sub font settings must match.
     *
     * @param fontSize When set to 'auto' fontSize will scale depending on the
     *            size of the output. Giving a positive integer will specify the
     *            exact font size in points. All burn-in and DVB-Sub font
     *            settings must match.
     */
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * When set to 'auto' fontSize will scale depending on the size of the
     * output. Giving a positive integer will specify the exact font size in
     * points. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fontSize When set to 'auto' fontSize will scale depending on the
     *            size of the output. Giving a positive integer will specify the
     *            exact font size in points. All burn-in and DVB-Sub font
     *            settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @return Specifies font outline color. This option is not valid for source
     *         captions that are either 608/embedded or teletext. These source
     *         settings are already pre-defined by the caption stream. All
     *         burn-in and DVB-Sub font settings must match.
     * @see BurnInOutlineColor
     */
    public String getOutlineColor() {
        return outlineColor;
    }

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param outlineColor Specifies font outline color. This option is not
     *            valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     * @see BurnInOutlineColor
     */
    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param outlineColor Specifies font outline color. This option is not
     *            valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInOutlineColor
     */
    public BurnInDestinationSettings withOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param outlineColor Specifies font outline color. This option is not
     *            valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     * @see BurnInOutlineColor
     */
    public void setOutlineColor(BurnInOutlineColor outlineColor) {
        this.outlineColor = outlineColor.toString();
    }

    /**
     * Specifies font outline color. This option is not valid for source
     * captions that are either 608/embedded or teletext. These source settings
     * are already pre-defined by the caption stream. All burn-in and DVB-Sub
     * font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, BLUE, GREEN, RED, WHITE, YELLOW
     *
     * @param outlineColor Specifies font outline color. This option is not
     *            valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInOutlineColor
     */
    public BurnInDestinationSettings withOutlineColor(BurnInOutlineColor outlineColor) {
        this.outlineColor = outlineColor.toString();
        return this;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for
     * source captions that are either 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @return Specifies font outline size in pixels. This option is not valid
     *         for source captions that are either 608/embedded or teletext.
     *         These source settings are already pre-defined by the caption
     *         stream. All burn-in and DVB-Sub font settings must match.
     */
    public Integer getOutlineSize() {
        return outlineSize;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for
     * source captions that are either 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param outlineSize Specifies font outline size in pixels. This option is
     *            not valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     */
    public void setOutlineSize(Integer outlineSize) {
        this.outlineSize = outlineSize;
    }

    /**
     * Specifies font outline size in pixels. This option is not valid for
     * source captions that are either 608/embedded or teletext. These source
     * settings are already pre-defined by the caption stream. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10<br/>
     *
     * @param outlineSize Specifies font outline size in pixels. This option is
     *            not valid for source captions that are either 608/embedded or
     *            teletext. These source settings are already pre-defined by the
     *            caption stream. All burn-in and DVB-Sub font settings must
     *            match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withOutlineSize(Integer outlineSize) {
        this.outlineSize = outlineSize;
        return this;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @return Specifies the color of the shadow cast by the captions. All
     *         burn-in and DVB-Sub font settings must match.
     * @see BurnInShadowColor
     */
    public String getShadowColor() {
        return shadowColor;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param shadowColor Specifies the color of the shadow cast by the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @see BurnInShadowColor
     */
    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param shadowColor Specifies the color of the shadow cast by the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInShadowColor
     */
    public BurnInDestinationSettings withShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param shadowColor Specifies the color of the shadow cast by the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @see BurnInShadowColor
     */
    public void setShadowColor(BurnInShadowColor shadowColor) {
        this.shadowColor = shadowColor.toString();
    }

    /**
     * Specifies the color of the shadow cast by the captions. All burn-in and
     * DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLACK, NONE, WHITE
     *
     * @param shadowColor Specifies the color of the shadow cast by the
     *            captions. All burn-in and DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInShadowColor
     */
    public BurnInDestinationSettings withShadowColor(BurnInShadowColor shadowColor) {
        this.shadowColor = shadowColor.toString();
        return this;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent.
     * Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return Specifies the opacity of the shadow. 255 is opaque; 0 is
     *         transparent. Leaving this parameter out is equivalent to setting
     *         it to 0 (transparent). All burn-in and DVB-Sub font settings must
     *         match.
     */
    public Integer getShadowOpacity() {
        return shadowOpacity;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent.
     * Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param shadowOpacity Specifies the opacity of the shadow. 255 is opaque;
     *            0 is transparent. Leaving this parameter out is equivalent to
     *            setting it to 0 (transparent). All burn-in and DVB-Sub font
     *            settings must match.
     */
    public void setShadowOpacity(Integer shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    /**
     * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent.
     * Leaving this parameter out is equivalent to setting it to 0
     * (transparent). All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param shadowOpacity Specifies the opacity of the shadow. 255 is opaque;
     *            0 is transparent. Leaving this parameter out is equivalent to
     *            setting it to 0 (transparent). All burn-in and DVB-Sub font
     *            settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withShadowOpacity(Integer shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
        return this;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels to the
     * left. All burn-in and DVB-Sub font settings must match.
     *
     * @return Specifies the horizontal offset of the shadow relative to the
     *         captions in pixels. A value of -2 would result in a shadow offset
     *         2 pixels to the left. All burn-in and DVB-Sub font settings must
     *         match.
     */
    public Integer getShadowXOffset() {
        return shadowXOffset;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels to the
     * left. All burn-in and DVB-Sub font settings must match.
     *
     * @param shadowXOffset Specifies the horizontal offset of the shadow
     *            relative to the captions in pixels. A value of -2 would result
     *            in a shadow offset 2 pixels to the left. All burn-in and
     *            DVB-Sub font settings must match.
     */
    public void setShadowXOffset(Integer shadowXOffset) {
        this.shadowXOffset = shadowXOffset;
    }

    /**
     * Specifies the horizontal offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels to the
     * left. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shadowXOffset Specifies the horizontal offset of the shadow
     *            relative to the captions in pixels. A value of -2 would result
     *            in a shadow offset 2 pixels to the left. All burn-in and
     *            DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withShadowXOffset(Integer shadowXOffset) {
        this.shadowXOffset = shadowXOffset;
        return this;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels above the
     * text. All burn-in and DVB-Sub font settings must match.
     *
     * @return Specifies the vertical offset of the shadow relative to the
     *         captions in pixels. A value of -2 would result in a shadow offset
     *         2 pixels above the text. All burn-in and DVB-Sub font settings
     *         must match.
     */
    public Integer getShadowYOffset() {
        return shadowYOffset;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels above the
     * text. All burn-in and DVB-Sub font settings must match.
     *
     * @param shadowYOffset Specifies the vertical offset of the shadow relative
     *            to the captions in pixels. A value of -2 would result in a
     *            shadow offset 2 pixels above the text. All burn-in and DVB-Sub
     *            font settings must match.
     */
    public void setShadowYOffset(Integer shadowYOffset) {
        this.shadowYOffset = shadowYOffset;
    }

    /**
     * Specifies the vertical offset of the shadow relative to the captions in
     * pixels. A value of -2 would result in a shadow offset 2 pixels above the
     * text. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shadowYOffset Specifies the vertical offset of the shadow relative
     *            to the captions in pixels. A value of -2 would result in a
     *            shadow offset 2 pixels above the text. All burn-in and DVB-Sub
     *            font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withShadowYOffset(Integer shadowYOffset) {
        this.shadowYOffset = shadowYOffset;
        return this;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     *
     * @return Controls whether a fixed grid size will be used to generate the
     *         output subtitles bitmap. Only applicable for Teletext inputs and
     *         DVB-Sub/Burn-in outputs.
     * @see BurnInTeletextGridControl
     */
    public String getTeletextGridControl() {
        return teletextGridControl;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     *
     * @param teletextGridControl Controls whether a fixed grid size will be
     *            used to generate the output subtitles bitmap. Only applicable
     *            for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @see BurnInTeletextGridControl
     */
    public void setTeletextGridControl(String teletextGridControl) {
        this.teletextGridControl = teletextGridControl;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     *
     * @param teletextGridControl Controls whether a fixed grid size will be
     *            used to generate the output subtitles bitmap. Only applicable
     *            for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInTeletextGridControl
     */
    public BurnInDestinationSettings withTeletextGridControl(String teletextGridControl) {
        this.teletextGridControl = teletextGridControl;
        return this;
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     *
     * @param teletextGridControl Controls whether a fixed grid size will be
     *            used to generate the output subtitles bitmap. Only applicable
     *            for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @see BurnInTeletextGridControl
     */
    public void setTeletextGridControl(BurnInTeletextGridControl teletextGridControl) {
        this.teletextGridControl = teletextGridControl.toString();
    }

    /**
     * Controls whether a fixed grid size will be used to generate the output
     * subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in
     * outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIXED, SCALED
     *
     * @param teletextGridControl Controls whether a fixed grid size will be
     *            used to generate the output subtitles bitmap. Only applicable
     *            for Teletext inputs and DVB-Sub/Burn-in outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BurnInTeletextGridControl
     */
    public BurnInDestinationSettings withTeletextGridControl(
            BurnInTeletextGridControl teletextGridControl) {
        this.teletextGridControl = teletextGridControl.toString();
        return this;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left
     * side of the output in pixels. A value of 10 would result in the captions
     * starting 10 pixels from the left of the output. If no explicit xPosition
     * is provided, the horizontal caption position will be determined by the
     * alignment parameter. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Specifies the horizontal position of the caption relative to the
     *         left side of the output in pixels. A value of 10 would result in
     *         the captions starting 10 pixels from the left of the output. If
     *         no explicit xPosition is provided, the horizontal caption
     *         position will be determined by the alignment parameter. All
     *         burn-in and DVB-Sub font settings must match.
     */
    public Integer getXPosition() {
        return xPosition;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left
     * side of the output in pixels. A value of 10 would result in the captions
     * starting 10 pixels from the left of the output. If no explicit xPosition
     * is provided, the horizontal caption position will be determined by the
     * alignment parameter. All burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param xPosition Specifies the horizontal position of the caption
     *            relative to the left side of the output in pixels. A value of
     *            10 would result in the captions starting 10 pixels from the
     *            left of the output. If no explicit xPosition is provided, the
     *            horizontal caption position will be determined by the
     *            alignment parameter. All burn-in and DVB-Sub font settings
     *            must match.
     */
    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Specifies the horizontal position of the caption relative to the left
     * side of the output in pixels. A value of 10 would result in the captions
     * starting 10 pixels from the left of the output. If no explicit xPosition
     * is provided, the horizontal caption position will be determined by the
     * alignment parameter. All burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param xPosition Specifies the horizontal position of the caption
     *            relative to the left side of the output in pixels. A value of
     *            10 would result in the captions starting 10 pixels from the
     *            left of the output. If no explicit xPosition is provided, the
     *            horizontal caption position will be determined by the
     *            alignment parameter. All burn-in and DVB-Sub font settings
     *            must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withXPosition(Integer xPosition) {
        this.xPosition = xPosition;
        return this;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the
     * output in pixels. A value of 10 would result in the captions starting 10
     * pixels from the top of the output. If no explicit yPosition is provided,
     * the caption will be positioned towards the bottom of the output. All
     * burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Specifies the vertical position of the caption relative to the
     *         top of the output in pixels. A value of 10 would result in the
     *         captions starting 10 pixels from the top of the output. If no
     *         explicit yPosition is provided, the caption will be positioned
     *         towards the bottom of the output. All burn-in and DVB-Sub font
     *         settings must match.
     */
    public Integer getYPosition() {
        return yPosition;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the
     * output in pixels. A value of 10 would result in the captions starting 10
     * pixels from the top of the output. If no explicit yPosition is provided,
     * the caption will be positioned towards the bottom of the output. All
     * burn-in and DVB-Sub font settings must match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param yPosition Specifies the vertical position of the caption relative
     *            to the top of the output in pixels. A value of 10 would result
     *            in the captions starting 10 pixels from the top of the output.
     *            If no explicit yPosition is provided, the caption will be
     *            positioned towards the bottom of the output. All burn-in and
     *            DVB-Sub font settings must match.
     */
    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Specifies the vertical position of the caption relative to the top of the
     * output in pixels. A value of 10 would result in the captions starting 10
     * pixels from the top of the output. If no explicit yPosition is provided,
     * the caption will be positioned towards the bottom of the output. All
     * burn-in and DVB-Sub font settings must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param yPosition Specifies the vertical position of the caption relative
     *            to the top of the output in pixels. A value of 10 would result
     *            in the captions starting 10 pixels from the top of the output.
     *            If no explicit yPosition is provided, the caption will be
     *            positioned towards the bottom of the output. All burn-in and
     *            DVB-Sub font settings must match.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BurnInDestinationSettings withYPosition(Integer yPosition) {
        this.yPosition = yPosition;
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
        if (getAlignment() != null)
            sb.append("Alignment: " + getAlignment() + ",");
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: " + getBackgroundColor() + ",");
        if (getBackgroundOpacity() != null)
            sb.append("BackgroundOpacity: " + getBackgroundOpacity() + ",");
        if (getFont() != null)
            sb.append("Font: " + getFont() + ",");
        if (getFontColor() != null)
            sb.append("FontColor: " + getFontColor() + ",");
        if (getFontOpacity() != null)
            sb.append("FontOpacity: " + getFontOpacity() + ",");
        if (getFontResolution() != null)
            sb.append("FontResolution: " + getFontResolution() + ",");
        if (getFontSize() != null)
            sb.append("FontSize: " + getFontSize() + ",");
        if (getOutlineColor() != null)
            sb.append("OutlineColor: " + getOutlineColor() + ",");
        if (getOutlineSize() != null)
            sb.append("OutlineSize: " + getOutlineSize() + ",");
        if (getShadowColor() != null)
            sb.append("ShadowColor: " + getShadowColor() + ",");
        if (getShadowOpacity() != null)
            sb.append("ShadowOpacity: " + getShadowOpacity() + ",");
        if (getShadowXOffset() != null)
            sb.append("ShadowXOffset: " + getShadowXOffset() + ",");
        if (getShadowYOffset() != null)
            sb.append("ShadowYOffset: " + getShadowYOffset() + ",");
        if (getTeletextGridControl() != null)
            sb.append("TeletextGridControl: " + getTeletextGridControl() + ",");
        if (getXPosition() != null)
            sb.append("XPosition: " + getXPosition() + ",");
        if (getYPosition() != null)
            sb.append("YPosition: " + getYPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlignment() == null) ? 0 : getAlignment().hashCode());
        hashCode = prime * hashCode
                + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode
                + ((getBackgroundOpacity() == null) ? 0 : getBackgroundOpacity().hashCode());
        hashCode = prime * hashCode + ((getFont() == null) ? 0 : getFont().hashCode());
        hashCode = prime * hashCode + ((getFontColor() == null) ? 0 : getFontColor().hashCode());
        hashCode = prime * hashCode
                + ((getFontOpacity() == null) ? 0 : getFontOpacity().hashCode());
        hashCode = prime * hashCode
                + ((getFontResolution() == null) ? 0 : getFontResolution().hashCode());
        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode
                + ((getOutlineColor() == null) ? 0 : getOutlineColor().hashCode());
        hashCode = prime * hashCode
                + ((getOutlineSize() == null) ? 0 : getOutlineSize().hashCode());
        hashCode = prime * hashCode
                + ((getShadowColor() == null) ? 0 : getShadowColor().hashCode());
        hashCode = prime * hashCode
                + ((getShadowOpacity() == null) ? 0 : getShadowOpacity().hashCode());
        hashCode = prime * hashCode
                + ((getShadowXOffset() == null) ? 0 : getShadowXOffset().hashCode());
        hashCode = prime * hashCode
                + ((getShadowYOffset() == null) ? 0 : getShadowYOffset().hashCode());
        hashCode = prime * hashCode
                + ((getTeletextGridControl() == null) ? 0 : getTeletextGridControl().hashCode());
        hashCode = prime * hashCode + ((getXPosition() == null) ? 0 : getXPosition().hashCode());
        hashCode = prime * hashCode + ((getYPosition() == null) ? 0 : getYPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BurnInDestinationSettings == false)
            return false;
        BurnInDestinationSettings other = (BurnInDestinationSettings) obj;

        if (other.getAlignment() == null ^ this.getAlignment() == null)
            return false;
        if (other.getAlignment() != null
                && other.getAlignment().equals(this.getAlignment()) == false)
            return false;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null
                && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getBackgroundOpacity() == null ^ this.getBackgroundOpacity() == null)
            return false;
        if (other.getBackgroundOpacity() != null
                && other.getBackgroundOpacity().equals(this.getBackgroundOpacity()) == false)
            return false;
        if (other.getFont() == null ^ this.getFont() == null)
            return false;
        if (other.getFont() != null && other.getFont().equals(this.getFont()) == false)
            return false;
        if (other.getFontColor() == null ^ this.getFontColor() == null)
            return false;
        if (other.getFontColor() != null
                && other.getFontColor().equals(this.getFontColor()) == false)
            return false;
        if (other.getFontOpacity() == null ^ this.getFontOpacity() == null)
            return false;
        if (other.getFontOpacity() != null
                && other.getFontOpacity().equals(this.getFontOpacity()) == false)
            return false;
        if (other.getFontResolution() == null ^ this.getFontResolution() == null)
            return false;
        if (other.getFontResolution() != null
                && other.getFontResolution().equals(this.getFontResolution()) == false)
            return false;
        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getOutlineColor() == null ^ this.getOutlineColor() == null)
            return false;
        if (other.getOutlineColor() != null
                && other.getOutlineColor().equals(this.getOutlineColor()) == false)
            return false;
        if (other.getOutlineSize() == null ^ this.getOutlineSize() == null)
            return false;
        if (other.getOutlineSize() != null
                && other.getOutlineSize().equals(this.getOutlineSize()) == false)
            return false;
        if (other.getShadowColor() == null ^ this.getShadowColor() == null)
            return false;
        if (other.getShadowColor() != null
                && other.getShadowColor().equals(this.getShadowColor()) == false)
            return false;
        if (other.getShadowOpacity() == null ^ this.getShadowOpacity() == null)
            return false;
        if (other.getShadowOpacity() != null
                && other.getShadowOpacity().equals(this.getShadowOpacity()) == false)
            return false;
        if (other.getShadowXOffset() == null ^ this.getShadowXOffset() == null)
            return false;
        if (other.getShadowXOffset() != null
                && other.getShadowXOffset().equals(this.getShadowXOffset()) == false)
            return false;
        if (other.getShadowYOffset() == null ^ this.getShadowYOffset() == null)
            return false;
        if (other.getShadowYOffset() != null
                && other.getShadowYOffset().equals(this.getShadowYOffset()) == false)
            return false;
        if (other.getTeletextGridControl() == null ^ this.getTeletextGridControl() == null)
            return false;
        if (other.getTeletextGridControl() != null
                && other.getTeletextGridControl().equals(this.getTeletextGridControl()) == false)
            return false;
        if (other.getXPosition() == null ^ this.getXPosition() == null)
            return false;
        if (other.getXPosition() != null
                && other.getXPosition().equals(this.getXPosition()) == false)
            return false;
        if (other.getYPosition() == null ^ this.getYPosition() == null)
            return false;
        if (other.getYPosition() != null
                && other.getYPosition().equals(this.getYPosition()) == false)
            return false;
        return true;
    }
}
