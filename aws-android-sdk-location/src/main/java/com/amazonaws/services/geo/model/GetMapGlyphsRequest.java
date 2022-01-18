/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves glyphs used to display labels on a map.
 * </p>
 */
public class GetMapGlyphsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of
     * preference. For example, <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid fonts stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     * <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     * <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> |
     * <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     * <code>Noto Serif Regular</code> |
     * <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereBerlin – <code>Fira GO Regular</code> |
     * <code>Fira GO Bold</code>
     * </p>
     * </li>
     * </ul>
     */
    private String fontStack;

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will
     * contain 256 characters. For example, 0–255 includes all characters from
     * range <code>U+0000</code> to <code>00FF</code>. Must be aligned to
     * multiples of 256.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+-[0-9]+\.pbf$<br/>
     */
    private String fontUnicodeRange;

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String mapName;

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of
     * preference. For example, <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid fonts stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     * <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     * <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> |
     * <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     * <code>Noto Serif Regular</code> |
     * <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereBerlin – <code>Fira GO Regular</code> |
     * <code>Fira GO Bold</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A comma-separated list of fonts to load glyphs from in order of
     *         preference. For example,
     *         <code>Noto Sans Regular, Arial Unicode</code>.
     *         </p>
     *         <p>
     *         Valid fonts stacks for <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *         >Esri</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     *         <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     *         <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     *         <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     *         <code>Ubuntu Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriTopographic – <code>Noto Sans Italic</code> |
     *         <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     *         <code>Noto Serif Regular</code> |
     *         <code>Roboto Condensed Light Italic</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriStreets – <code>Arial Regular</code> |
     *         <code>Arial Italic</code> | <code>Arial Bold</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VectorEsriNavigation – <code>Arial Regular</code> |
     *         <code>Arial Italic</code> | <code>Arial Bold</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid font stacks for <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *         >HERE Technologies</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VectorHereBerlin – <code>Fira GO Regular</code> |
     *         <code>Fira GO Bold</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFontStack() {
        return fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of
     * preference. For example, <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid fonts stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     * <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     * <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> |
     * <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     * <code>Noto Serif Regular</code> |
     * <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereBerlin – <code>Fira GO Regular</code> |
     * <code>Fira GO Bold</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param fontStack <p>
     *            A comma-separated list of fonts to load glyphs from in order
     *            of preference. For example,
     *            <code>Noto Sans Regular, Arial Unicode</code>.
     *            </p>
     *            <p>
     *            Valid fonts stacks for <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     *            <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     *            <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     *            <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     *            <code>Ubuntu Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriTopographic – <code>Noto Sans Italic</code> |
     *            <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     *            <code>Noto Serif Regular</code> |
     *            <code>Roboto Condensed Light Italic</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriStreets – <code>Arial Regular</code> |
     *            <code>Arial Italic</code> | <code>Arial Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriNavigation – <code>Arial Regular</code> |
     *            <code>Arial Italic</code> | <code>Arial Bold</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid font stacks for <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VectorHereBerlin – <code>Fira GO Regular</code> |
     *            <code>Fira GO Bold</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFontStack(String fontStack) {
        this.fontStack = fontStack;
    }

    /**
     * <p>
     * A comma-separated list of fonts to load glyphs from in order of
     * preference. For example, <code>Noto Sans Regular, Arial Unicode</code>.
     * </p>
     * <p>
     * Valid fonts stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     * <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     * <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     * <code>Ubuntu Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriTopographic – <code>Noto Sans Italic</code> |
     * <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     * <code>Noto Serif Regular</code> |
     * <code>Roboto Condensed Light Italic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriStreets – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VectorEsriNavigation – <code>Arial Regular</code> |
     * <code>Arial Italic</code> | <code>Arial Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid font stacks for <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VectorHereBerlin – <code>Fira GO Regular</code> |
     * <code>Fira GO Bold</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fontStack <p>
     *            A comma-separated list of fonts to load glyphs from in order
     *            of preference. For example,
     *            <code>Noto Sans Regular, Arial Unicode</code>.
     *            </p>
     *            <p>
     *            Valid fonts stacks for <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VectorEsriDarkGrayCanvas – <code>Ubuntu Medium Italic</code> |
     *            <code>Ubuntu Medium</code> | <code>Ubuntu Italic</code> |
     *            <code>Ubuntu Regular</code> | <code>Ubuntu Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriLightGrayCanvas – <code>Ubuntu Italic</code> |
     *            <code>Ubuntu Regular</code> | <code>Ubuntu Light</code> |
     *            <code>Ubuntu Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriTopographic – <code>Noto Sans Italic</code> |
     *            <code>Noto Sans Regular</code> | <code>Noto Sans Bold</code> |
     *            <code>Noto Serif Regular</code> |
     *            <code>Roboto Condensed Light Italic</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriStreets – <code>Arial Regular</code> |
     *            <code>Arial Italic</code> | <code>Arial Bold</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            VectorEsriNavigation – <code>Arial Regular</code> |
     *            <code>Arial Italic</code> | <code>Arial Bold</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid font stacks for <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VectorHereBerlin – <code>Fira GO Regular</code> |
     *            <code>Fira GO Bold</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsRequest withFontStack(String fontStack) {
        this.fontStack = fontStack;
        return this;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will
     * contain 256 characters. For example, 0–255 includes all characters from
     * range <code>U+0000</code> to <code>00FF</code>. Must be aligned to
     * multiples of 256.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+-[0-9]+\.pbf$<br/>
     *
     * @return <p>
     *         A Unicode range of characters to download glyphs for. Each
     *         response will contain 256 characters. For example, 0–255 includes
     *         all characters from range <code>U+0000</code> to
     *         <code>00FF</code>. Must be aligned to multiples of 256.
     *         </p>
     */
    public String getFontUnicodeRange() {
        return fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will
     * contain 256 characters. For example, 0–255 includes all characters from
     * range <code>U+0000</code> to <code>00FF</code>. Must be aligned to
     * multiples of 256.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+-[0-9]+\.pbf$<br/>
     *
     * @param fontUnicodeRange <p>
     *            A Unicode range of characters to download glyphs for. Each
     *            response will contain 256 characters. For example, 0–255
     *            includes all characters from range <code>U+0000</code> to
     *            <code>00FF</code>. Must be aligned to multiples of 256.
     *            </p>
     */
    public void setFontUnicodeRange(String fontUnicodeRange) {
        this.fontUnicodeRange = fontUnicodeRange;
    }

    /**
     * <p>
     * A Unicode range of characters to download glyphs for. Each response will
     * contain 256 characters. For example, 0–255 includes all characters from
     * range <code>U+0000</code> to <code>00FF</code>. Must be aligned to
     * multiples of 256.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+-[0-9]+\.pbf$<br/>
     *
     * @param fontUnicodeRange <p>
     *            A Unicode range of characters to download glyphs for. Each
     *            response will contain 256 characters. For example, 0–255
     *            includes all characters from range <code>U+0000</code> to
     *            <code>00FF</code>. Must be aligned to multiples of 256.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsRequest withFontUnicodeRange(String fontUnicodeRange) {
        this.fontUnicodeRange = fontUnicodeRange;
        return this;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The map resource associated with the glyph ﬁle.
     *         </p>
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param mapName <p>
     *            The map resource associated with the glyph ﬁle.
     *            </p>
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource associated with the glyph ﬁle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param mapName <p>
     *            The map resource associated with the glyph ﬁle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsRequest withMapName(String mapName) {
        this.mapName = mapName;
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
        if (getFontStack() != null)
            sb.append("FontStack: " + getFontStack() + ",");
        if (getFontUnicodeRange() != null)
            sb.append("FontUnicodeRange: " + getFontUnicodeRange() + ",");
        if (getMapName() != null)
            sb.append("MapName: " + getMapName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontStack() == null) ? 0 : getFontStack().hashCode());
        hashCode = prime * hashCode
                + ((getFontUnicodeRange() == null) ? 0 : getFontUnicodeRange().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapGlyphsRequest == false)
            return false;
        GetMapGlyphsRequest other = (GetMapGlyphsRequest) obj;

        if (other.getFontStack() == null ^ this.getFontStack() == null)
            return false;
        if (other.getFontStack() != null
                && other.getFontStack().equals(this.getFontStack()) == false)
            return false;
        if (other.getFontUnicodeRange() == null ^ this.getFontUnicodeRange() == null)
            return false;
        if (other.getFontUnicodeRange() != null
                && other.getFontUnicodeRange().equals(this.getFontUnicodeRange()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        return true;
    }
}
