/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the map tile style selected from an available provider.
 * </p>
 */
public class MapConfiguration implements Serializable {
    /**
     * <p>
     * Specifies the map style selected from an available data provider. For
     * additional information on each map style and to preview each map style,
     * see <a
     * href="location/latest/developerguide/esri.html#esri-map-styles">Esri map
     * styles</a> and <a
     * href="location/latest/developerguide/HERE.html#HERE-map-styles">HERE map
     * styles</a>.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map
     * style. A vector basemap with a dark gray, neutral background with minimal
     * colors, labels, and features that's designed to draw attention to your
     * thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster
     * basemap that provides one meter or better satellite and aerial imagery in
     * many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map
     * style, which provides a detailed vector basemap with a light gray,
     * neutral background style with minimal colors, labels, and features that's
     * designed to draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which
     * provides a detailed vector basemap with a classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri World Streets map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri World Navigation map style,
     * which provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereBerlin</code> – The HERE Berlin map style is a high
     * contrast detailed base map of the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Technologies maps for
     * Asset Management. See the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String style;

    /**
     * <p>
     * Specifies the map style selected from an available data provider. For
     * additional information on each map style and to preview each map style,
     * see <a
     * href="location/latest/developerguide/esri.html#esri-map-styles">Esri map
     * styles</a> and <a
     * href="location/latest/developerguide/HERE.html#HERE-map-styles">HERE map
     * styles</a>.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map
     * style. A vector basemap with a dark gray, neutral background with minimal
     * colors, labels, and features that's designed to draw attention to your
     * thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster
     * basemap that provides one meter or better satellite and aerial imagery in
     * many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map
     * style, which provides a detailed vector basemap with a light gray,
     * neutral background style with minimal colors, labels, and features that's
     * designed to draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which
     * provides a detailed vector basemap with a classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri World Streets map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri World Navigation map style,
     * which provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereBerlin</code> – The HERE Berlin map style is a high
     * contrast detailed base map of the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Technologies maps for
     * Asset Management. See the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         Specifies the map style selected from an available data provider.
     *         For additional information on each map style and to preview each
     *         map style, see <a
     *         href="location/latest/developerguide/esri.html#esri-map-styles"
     *         >Esri map styles</a> and <a
     *         href="location/latest/developerguide/HERE.html#HERE-map-styles"
     *         >HERE map styles</a>.
     *         </p>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *         >Esri</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas
     *         map style. A vector basemap with a dark gray, neutral background
     *         with minimal colors, labels, and features that's designed to draw
     *         attention to your thematic content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RasterEsriImagery</code> – The Esri Imagery map style. A
     *         raster basemap that provides one meter or better satellite and
     *         aerial imagery in many parts of the world and lower resolution
     *         satellite imagery worldwide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray
     *         Canvas map style, which provides a detailed vector basemap with a
     *         light gray, neutral background style with minimal colors, labels,
     *         and features that's designed to draw attention to your thematic
     *         content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriTopographic</code> – The Esri Light map style,
     *         which provides a detailed vector basemap with a classic Esri map
     *         style.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriStreets</code> – The Esri World Streets map
     *         style, which provides a detailed vector basemap for the world
     *         symbolized with a classic Esri street map style. The vector tile
     *         layer is similar in content and style to the World Street Map
     *         raster map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriNavigation</code> – The Esri World Navigation map
     *         style, which provides a detailed basemap for the world symbolized
     *         with a custom navigation map style that's designed for use during
     *         the day in mobile devices.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *         >HERE Technologies</a> styles:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorHereBerlin</code> – The HERE Berlin map style is a
     *         high contrast detailed base map of the world that blends 3D and
     *         2D rendering.
     *         </p>
     *         <note>
     *         <p>
     *         When using HERE as your data provider, and selecting the Style
     *         <code>VectorHereBerlin</code>, you may not use HERE Technologies
     *         maps for Asset Management. See the <a
     *         href="https://aws.amazon.com/service-terms/">AWS Service
     *         Terms</a> for Amazon Location Service.
     *         </p>
     *         </note></li>
     *         </ul>
     */
    public String getStyle() {
        return style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider. For
     * additional information on each map style and to preview each map style,
     * see <a
     * href="location/latest/developerguide/esri.html#esri-map-styles">Esri map
     * styles</a> and <a
     * href="location/latest/developerguide/HERE.html#HERE-map-styles">HERE map
     * styles</a>.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map
     * style. A vector basemap with a dark gray, neutral background with minimal
     * colors, labels, and features that's designed to draw attention to your
     * thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster
     * basemap that provides one meter or better satellite and aerial imagery in
     * many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map
     * style, which provides a detailed vector basemap with a light gray,
     * neutral background style with minimal colors, labels, and features that's
     * designed to draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which
     * provides a detailed vector basemap with a classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri World Streets map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri World Navigation map style,
     * which provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereBerlin</code> – The HERE Berlin map style is a high
     * contrast detailed base map of the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Technologies maps for
     * Asset Management. See the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider. For additional information on each map style and to
     *            preview each map style, see <a href=
     *            "location/latest/developerguide/esri.html#esri-map-styles"
     *            >Esri map styles</a> and <a href=
     *            "location/latest/developerguide/HERE.html#HERE-map-styles"
     *            >HERE map styles</a>.
     *            </p>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray
     *            Canvas map style. A vector basemap with a dark gray, neutral
     *            background with minimal colors, labels, and features that's
     *            designed to draw attention to your thematic content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RasterEsriImagery</code> – The Esri Imagery map style. A
     *            raster basemap that provides one meter or better satellite and
     *            aerial imagery in many parts of the world and lower resolution
     *            satellite imagery worldwide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray
     *            Canvas map style, which provides a detailed vector basemap
     *            with a light gray, neutral background style with minimal
     *            colors, labels, and features that's designed to draw attention
     *            to your thematic content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriTopographic</code> – The Esri Light map style,
     *            which provides a detailed vector basemap with a classic Esri
     *            map style.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriStreets</code> – The Esri World Streets map
     *            style, which provides a detailed vector basemap for the world
     *            symbolized with a classic Esri street map style. The vector
     *            tile layer is similar in content and style to the World Street
     *            Map raster map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriNavigation</code> – The Esri World Navigation
     *            map style, which provides a detailed basemap for the world
     *            symbolized with a custom navigation map style that's designed
     *            for use during the day in mobile devices.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorHereBerlin</code> – The HERE Berlin map style is a
     *            high contrast detailed base map of the world that blends 3D
     *            and 2D rendering.
     *            </p>
     *            <note>
     *            <p>
     *            When using HERE as your data provider, and selecting the Style
     *            <code>VectorHereBerlin</code>, you may not use HERE
     *            Technologies maps for Asset Management. See the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </note></li>
     *            </ul>
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider. For
     * additional information on each map style and to preview each map style,
     * see <a
     * href="location/latest/developerguide/esri.html#esri-map-styles">Esri map
     * styles</a> and <a
     * href="location/latest/developerguide/HERE.html#HERE-map-styles">HERE map
     * styles</a>.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray Canvas map
     * style. A vector basemap with a dark gray, neutral background with minimal
     * colors, labels, and features that's designed to draw attention to your
     * thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterEsriImagery</code> – The Esri Imagery map style. A raster
     * basemap that provides one meter or better satellite and aerial imagery in
     * many parts of the world and lower resolution satellite imagery worldwide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray Canvas map
     * style, which provides a detailed vector basemap with a light gray,
     * neutral background style with minimal colors, labels, and features that's
     * designed to draw attention to your thematic content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriTopographic</code> – The Esri Light map style, which
     * provides a detailed vector basemap with a classic Esri map style.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriStreets</code> – The Esri World Streets map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri World Navigation map style,
     * which provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies</a> styles:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereBerlin</code> – The HERE Berlin map style is a high
     * contrast detailed base map of the world that blends 3D and 2D rendering.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Technologies maps for
     * Asset Management. See the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for
     * Amazon Location Service.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider. For additional information on each map style and to
     *            preview each map style, see <a href=
     *            "location/latest/developerguide/esri.html#esri-map-styles"
     *            >Esri map styles</a> and <a href=
     *            "location/latest/developerguide/HERE.html#HERE-map-styles"
     *            >HERE map styles</a>.
     *            </p>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorEsriDarkGrayCanvas</code> – The Esri Dark Gray
     *            Canvas map style. A vector basemap with a dark gray, neutral
     *            background with minimal colors, labels, and features that's
     *            designed to draw attention to your thematic content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RasterEsriImagery</code> – The Esri Imagery map style. A
     *            raster basemap that provides one meter or better satellite and
     *            aerial imagery in many parts of the world and lower resolution
     *            satellite imagery worldwide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriLightGrayCanvas</code> – The Esri Light Gray
     *            Canvas map style, which provides a detailed vector basemap
     *            with a light gray, neutral background style with minimal
     *            colors, labels, and features that's designed to draw attention
     *            to your thematic content.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriTopographic</code> – The Esri Light map style,
     *            which provides a detailed vector basemap with a classic Esri
     *            map style.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriStreets</code> – The Esri World Streets map
     *            style, which provides a detailed vector basemap for the world
     *            symbolized with a classic Esri street map style. The vector
     *            tile layer is similar in content and style to the World Street
     *            Map raster map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriNavigation</code> – The Esri World Navigation
     *            map style, which provides a detailed basemap for the world
     *            symbolized with a custom navigation map style that's designed
     *            for use during the day in mobile devices.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies</a> styles:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorHereBerlin</code> – The HERE Berlin map style is a
     *            high contrast detailed base map of the world that blends 3D
     *            and 2D rendering.
     *            </p>
     *            <note>
     *            <p>
     *            When using HERE as your data provider, and selecting the Style
     *            <code>VectorHereBerlin</code>, you may not use HERE
     *            Technologies maps for Asset Management. See the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfiguration withStyle(String style) {
        this.style = style;
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
        if (getStyle() != null)
            sb.append("Style: " + getStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapConfiguration == false)
            return false;
        MapConfiguration other = (MapConfiguration) obj;

        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        return true;
    }
}
