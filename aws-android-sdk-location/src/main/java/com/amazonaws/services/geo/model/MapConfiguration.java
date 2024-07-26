/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri map styles</a>:
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
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which
     * provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is
     * a high contrast detailed base map of the world that blends 3D and 2D
     * rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from
     * <code>VectorHereBerlin</code>. <code>VectorHereBerlin</code> has been
     * deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a
     * neutral, global map and its features including roads, buildings,
     * landmarks, and water features. It also now includes a fully designed map
     * of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck
     * restrictions and attributes (e.g. width / height / HAZMAT) symbolized
     * with highlighted segments and icons on top of HERE Explore to support use
     * cases within transport and logistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high
     * resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the
     * road network, street names, and city labels over satellite imagery. This
     * style will automatically retrieve both raster and vector tiles, and your
     * charges will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map
     * that you see. This means that more tiles are retrieved than when using
     * either vector or raster tiles alone. Your charges will include all tiles
     * retrieved.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     * >GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style
     * provides a basemap with detailed land use coloring, area names, roads,
     * landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style
     * provides a dark variation of the standard basemap covering Southeast
     * Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only
     * available in the Asia Pacific (Singapore) Region (
     * <code>ap-southeast-1</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     * >GrabMaps countries and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     * >Open Data map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light
     * map style provides a detailed basemap for the world suitable for website
     * and mobile application use. The map includes highways major roads, minor
     * roads, railways, water features, cities, parks, landmarks, building
     * footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a
     * dark-themed map style that provides a detailed basemap for the world
     * suitable for website and mobile application use. The map includes
     * highways major roads, minor roads, railways, water features, cities,
     * parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data
     * Visualization Light map style is a light-themed style with muted colors
     * and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data
     * Visualization Dark map style is a dark-themed style with muted colors and
     * fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String style;

    /**
     * <p>
     * Specifies the political view for the style. Leave unset to not use a
     * political view, or, for styles that support specific political views, you
     * can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>[A-Z]{3}<br/>
     */
    private String politicalView;

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any
     * custom layer, or, for styles that support custom layers, you can enable
     * layer(s), such as POI layer for the VectorEsriNavigation style. Default
     * is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support custom layers. See Custom Layers
     * for more information.
     * </p>
     * </note>
     */
    private java.util.List<String> customLayers;

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri map styles</a>:
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
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which
     * provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is
     * a high contrast detailed base map of the world that blends 3D and 2D
     * rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from
     * <code>VectorHereBerlin</code>. <code>VectorHereBerlin</code> has been
     * deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a
     * neutral, global map and its features including roads, buildings,
     * landmarks, and water features. It also now includes a fully designed map
     * of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck
     * restrictions and attributes (e.g. width / height / HAZMAT) symbolized
     * with highlighted segments and icons on top of HERE Explore to support use
     * cases within transport and logistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high
     * resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the
     * road network, street names, and city labels over satellite imagery. This
     * style will automatically retrieve both raster and vector tiles, and your
     * charges will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map
     * that you see. This means that more tiles are retrieved than when using
     * either vector or raster tiles alone. Your charges will include all tiles
     * retrieved.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     * >GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style
     * provides a basemap with detailed land use coloring, area names, roads,
     * landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style
     * provides a dark variation of the standard basemap covering Southeast
     * Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only
     * available in the Asia Pacific (Singapore) Region (
     * <code>ap-southeast-1</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     * >GrabMaps countries and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     * >Open Data map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light
     * map style provides a detailed basemap for the world suitable for website
     * and mobile application use. The map includes highways major roads, minor
     * roads, railways, water features, cities, parks, landmarks, building
     * footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a
     * dark-themed map style that provides a detailed basemap for the world
     * suitable for website and mobile application use. The map includes
     * highways major roads, minor roads, railways, water features, cities,
     * parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data
     * Visualization Light map style is a light-themed style with muted colors
     * and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data
     * Visualization Dark map style is a dark-themed style with muted colors and
     * fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         Specifies the map style selected from an available data provider.
     *         </p>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *         >Esri map styles</a>:
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
     *         <code>VectorEsriStreets</code> – The Esri Street Map style, which
     *         provides a detailed vector basemap for the world symbolized with
     *         a classic Esri street map style. The vector tile layer is similar
     *         in content and style to the World Street Map raster map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorEsriNavigation</code> – The Esri Navigation map
     *         style, which provides a detailed basemap for the world symbolized
     *         with a custom navigation map style that's designed for use during
     *         the day in mobile devices.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *         >HERE Technologies map styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map
     *         style is a high contrast detailed base map of the world that
     *         blends 3D and 2D rendering.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>VectorHereContrast</code> style has been renamed from
     *         <code>VectorHereBerlin</code>. <code>VectorHereBerlin</code> has
     *         been deprecated, but will continue to work in applications that
     *         use it.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>VectorHereExplore</code> – A default HERE map style
     *         containing a neutral, global map and its features including
     *         roads, buildings, landmarks, and water features. It also now
     *         includes a fully designed map of Japan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorHereExploreTruck</code> – A global map containing
     *         truck restrictions and attributes (e.g. width / height / HAZMAT)
     *         symbolized with highlighted segments and icons on top of HERE
     *         Explore to support use cases within transport and logistics.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RasterHereExploreSatellite</code> – A global map containing
     *         high resolution satellite imagery.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HybridHereExploreSatellite</code> – A global map displaying
     *         the road network, street names, and city labels over satellite
     *         imagery. This style will automatically retrieve both raster and
     *         vector tiles, and your charges will be based on total tiles
     *         retrieved.
     *         </p>
     *         <note>
     *         <p>
     *         Hybrid styles use both vector and raster tiles when rendering the
     *         map that you see. This means that more tiles are retrieved than
     *         when using either vector or raster tiles alone. Your charges will
     *         include all tiles retrieved.
     *         </p>
     *         </note></li>
     *         </ul>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     *         >GrabMaps map styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorGrabStandardLight</code> – The Grab Standard Light
     *         map style provides a basemap with detailed land use coloring,
     *         area names, roads, landmarks, and points of interest covering
     *         Southeast Asia.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorGrabStandardDark</code> – The Grab Standard Dark map
     *         style provides a dark variation of the standard basemap covering
     *         Southeast Asia.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Grab provides maps only for countries in Southeast Asia, and is
     *         only available in the Asia Pacific (Singapore) Region (
     *         <code>ap-southeast-1</code>). For more information, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     *         >GrabMaps countries and area covered</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     *         >Open Data map styles</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataStandardLight</code> – The Open Data Standard
     *         Light map style provides a detailed basemap for the world
     *         suitable for website and mobile application use. The map includes
     *         highways major roads, minor roads, railways, water features,
     *         cities, parks, landmarks, building footprints, and administrative
     *         boundaries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark
     *         is a dark-themed map style that provides a detailed basemap for
     *         the world suitable for website and mobile application use. The
     *         map includes highways major roads, minor roads, railways, water
     *         features, cities, parks, landmarks, building footprints, and
     *         administrative boundaries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataVisualizationLight</code> – The Open Data
     *         Visualization Light map style is a light-themed style with muted
     *         colors and fewer features that aids in understanding overlaid
     *         data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VectorOpenDataVisualizationDark</code> – The Open Data
     *         Visualization Dark map style is a dark-themed style with muted
     *         colors and fewer features that aids in understanding overlaid
     *         data.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStyle() {
        return style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri map styles</a>:
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
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which
     * provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is
     * a high contrast detailed base map of the world that blends 3D and 2D
     * rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from
     * <code>VectorHereBerlin</code>. <code>VectorHereBerlin</code> has been
     * deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a
     * neutral, global map and its features including roads, buildings,
     * landmarks, and water features. It also now includes a fully designed map
     * of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck
     * restrictions and attributes (e.g. width / height / HAZMAT) symbolized
     * with highlighted segments and icons on top of HERE Explore to support use
     * cases within transport and logistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high
     * resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the
     * road network, street names, and city labels over satellite imagery. This
     * style will automatically retrieve both raster and vector tiles, and your
     * charges will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map
     * that you see. This means that more tiles are retrieved than when using
     * either vector or raster tiles alone. Your charges will include all tiles
     * retrieved.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     * >GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style
     * provides a basemap with detailed land use coloring, area names, roads,
     * landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style
     * provides a dark variation of the standard basemap covering Southeast
     * Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only
     * available in the Asia Pacific (Singapore) Region (
     * <code>ap-southeast-1</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     * >GrabMaps countries and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     * >Open Data map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light
     * map style provides a detailed basemap for the world suitable for website
     * and mobile application use. The map includes highways major roads, minor
     * roads, railways, water features, cities, parks, landmarks, building
     * footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a
     * dark-themed map style that provides a detailed basemap for the world
     * suitable for website and mobile application use. The map includes
     * highways major roads, minor roads, railways, water features, cities,
     * parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data
     * Visualization Light map style is a light-themed style with muted colors
     * and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data
     * Visualization Dark map style is a dark-themed style with muted colors and
     * fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri map styles</a>:
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
     *            <code>VectorEsriStreets</code> – The Esri Street Map style,
     *            which provides a detailed vector basemap for the world
     *            symbolized with a classic Esri street map style. The vector
     *            tile layer is similar in content and style to the World Street
     *            Map raster map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriNavigation</code> – The Esri Navigation map
     *            style, which provides a detailed basemap for the world
     *            symbolized with a custom navigation map style that's designed
     *            for use during the day in mobile devices.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorHereContrast</code> – The HERE Contrast (Berlin)
     *            map style is a high contrast detailed base map of the world
     *            that blends 3D and 2D rendering.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>VectorHereContrast</code> style has been renamed
     *            from <code>VectorHereBerlin</code>.
     *            <code>VectorHereBerlin</code> has been deprecated, but will
     *            continue to work in applications that use it.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VectorHereExplore</code> – A default HERE map style
     *            containing a neutral, global map and its features including
     *            roads, buildings, landmarks, and water features. It also now
     *            includes a fully designed map of Japan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorHereExploreTruck</code> – A global map containing
     *            truck restrictions and attributes (e.g. width / height /
     *            HAZMAT) symbolized with highlighted segments and icons on top
     *            of HERE Explore to support use cases within transport and
     *            logistics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RasterHereExploreSatellite</code> – A global map
     *            containing high resolution satellite imagery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HybridHereExploreSatellite</code> – A global map
     *            displaying the road network, street names, and city labels
     *            over satellite imagery. This style will automatically retrieve
     *            both raster and vector tiles, and your charges will be based
     *            on total tiles retrieved.
     *            </p>
     *            <note>
     *            <p>
     *            Hybrid styles use both vector and raster tiles when rendering
     *            the map that you see. This means that more tiles are retrieved
     *            than when using either vector or raster tiles alone. Your
     *            charges will include all tiles retrieved.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     *            >GrabMaps map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorGrabStandardLight</code> – The Grab Standard Light
     *            map style provides a basemap with detailed land use coloring,
     *            area names, roads, landmarks, and points of interest covering
     *            Southeast Asia.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorGrabStandardDark</code> – The Grab Standard Dark
     *            map style provides a dark variation of the standard basemap
     *            covering Southeast Asia.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Grab provides maps only for countries in Southeast Asia, and
     *            is only available in the Asia Pacific (Singapore) Region (
     *            <code>ap-southeast-1</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     *            >GrabMaps countries and area covered</a>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     *            >Open Data map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataStandardLight</code> – The Open Data
     *            Standard Light map style provides a detailed basemap for the
     *            world suitable for website and mobile application use. The map
     *            includes highways major roads, minor roads, railways, water
     *            features, cities, parks, landmarks, building footprints, and
     *            administrative boundaries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataStandardDark</code> – Open Data Standard
     *            Dark is a dark-themed map style that provides a detailed
     *            basemap for the world suitable for website and mobile
     *            application use. The map includes highways major roads, minor
     *            roads, railways, water features, cities, parks, landmarks,
     *            building footprints, and administrative boundaries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataVisualizationLight</code> – The Open Data
     *            Visualization Light map style is a light-themed style with
     *            muted colors and fewer features that aids in understanding
     *            overlaid data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataVisualizationDark</code> – The Open Data
     *            Visualization Dark map style is a dark-themed style with muted
     *            colors and fewer features that aids in understanding overlaid
     *            data.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     * >Esri map styles</a>:
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
     * <code>VectorEsriStreets</code> – The Esri Street Map style, which
     * provides a detailed vector basemap for the world symbolized with a
     * classic Esri street map style. The vector tile layer is similar in
     * content and style to the World Street Map raster map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorEsriNavigation</code> – The Esri Navigation map style, which
     * provides a detailed basemap for the world symbolized with a custom
     * navigation map style that's designed for use during the day in mobile
     * devices.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     * >HERE Technologies map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorHereContrast</code> – The HERE Contrast (Berlin) map style is
     * a high contrast detailed base map of the world that blends 3D and 2D
     * rendering.
     * </p>
     * <note>
     * <p>
     * The <code>VectorHereContrast</code> style has been renamed from
     * <code>VectorHereBerlin</code>. <code>VectorHereBerlin</code> has been
     * deprecated, but will continue to work in applications that use it.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>VectorHereExplore</code> – A default HERE map style containing a
     * neutral, global map and its features including roads, buildings,
     * landmarks, and water features. It also now includes a fully designed map
     * of Japan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorHereExploreTruck</code> – A global map containing truck
     * restrictions and attributes (e.g. width / height / HAZMAT) symbolized
     * with highlighted segments and icons on top of HERE Explore to support use
     * cases within transport and logistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RasterHereExploreSatellite</code> – A global map containing high
     * resolution satellite imagery.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HybridHereExploreSatellite</code> – A global map displaying the
     * road network, street names, and city labels over satellite imagery. This
     * style will automatically retrieve both raster and vector tiles, and your
     * charges will be based on total tiles retrieved.
     * </p>
     * <note>
     * <p>
     * Hybrid styles use both vector and raster tiles when rendering the map
     * that you see. This means that more tiles are retrieved than when using
     * either vector or raster tiles alone. Your charges will include all tiles
     * retrieved.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     * >GrabMaps map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorGrabStandardLight</code> – The Grab Standard Light map style
     * provides a basemap with detailed land use coloring, area names, roads,
     * landmarks, and points of interest covering Southeast Asia.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorGrabStandardDark</code> – The Grab Standard Dark map style
     * provides a dark variation of the standard basemap covering Southeast
     * Asia.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Grab provides maps only for countries in Southeast Asia, and is only
     * available in the Asia Pacific (Singapore) Region (
     * <code>ap-southeast-1</code>). For more information, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     * >GrabMaps countries and area covered</a>.
     * </p>
     * </note>
     * <p>
     * Valid <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     * >Open Data map styles</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardLight</code> – The Open Data Standard Light
     * map style provides a detailed basemap for the world suitable for website
     * and mobile application use. The map includes highways major roads, minor
     * roads, railways, water features, cities, parks, landmarks, building
     * footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataStandardDark</code> – Open Data Standard Dark is a
     * dark-themed map style that provides a detailed basemap for the world
     * suitable for website and mobile application use. The map includes
     * highways major roads, minor roads, railways, water features, cities,
     * parks, landmarks, building footprints, and administrative boundaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationLight</code> – The Open Data
     * Visualization Light map style is a light-themed style with muted colors
     * and fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VectorOpenDataVisualizationDark</code> – The Open Data
     * Visualization Dark map style is a dark-themed style with muted colors and
     * fewer features that aids in understanding overlaid data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/esri.html"
     *            >Esri map styles</a>:
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
     *            <code>VectorEsriStreets</code> – The Esri Street Map style,
     *            which provides a detailed vector basemap for the world
     *            symbolized with a classic Esri street map style. The vector
     *            tile layer is similar in content and style to the World Street
     *            Map raster map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorEsriNavigation</code> – The Esri Navigation map
     *            style, which provides a detailed basemap for the world
     *            symbolized with a custom navigation map style that's designed
     *            for use during the day in mobile devices.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/HERE.html"
     *            >HERE Technologies map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorHereContrast</code> – The HERE Contrast (Berlin)
     *            map style is a high contrast detailed base map of the world
     *            that blends 3D and 2D rendering.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>VectorHereContrast</code> style has been renamed
     *            from <code>VectorHereBerlin</code>.
     *            <code>VectorHereBerlin</code> has been deprecated, but will
     *            continue to work in applications that use it.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>VectorHereExplore</code> – A default HERE map style
     *            containing a neutral, global map and its features including
     *            roads, buildings, landmarks, and water features. It also now
     *            includes a fully designed map of Japan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorHereExploreTruck</code> – A global map containing
     *            truck restrictions and attributes (e.g. width / height /
     *            HAZMAT) symbolized with highlighted segments and icons on top
     *            of HERE Explore to support use cases within transport and
     *            logistics.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RasterHereExploreSatellite</code> – A global map
     *            containing high resolution satellite imagery.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HybridHereExploreSatellite</code> – A global map
     *            displaying the road network, street names, and city labels
     *            over satellite imagery. This style will automatically retrieve
     *            both raster and vector tiles, and your charges will be based
     *            on total tiles retrieved.
     *            </p>
     *            <note>
     *            <p>
     *            Hybrid styles use both vector and raster tiles when rendering
     *            the map that you see. This means that more tiles are retrieved
     *            than when using either vector or raster tiles alone. Your
     *            charges will include all tiles retrieved.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/grab.html"
     *            >GrabMaps map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorGrabStandardLight</code> – The Grab Standard Light
     *            map style provides a basemap with detailed land use coloring,
     *            area names, roads, landmarks, and points of interest covering
     *            Southeast Asia.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorGrabStandardDark</code> – The Grab Standard Dark
     *            map style provides a dark variation of the standard basemap
     *            covering Southeast Asia.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            Grab provides maps only for countries in Southeast Asia, and
     *            is only available in the Asia Pacific (Singapore) Region (
     *            <code>ap-southeast-1</code>). For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area"
     *            >GrabMaps countries and area covered</a>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/open-data.html"
     *            >Open Data map styles</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataStandardLight</code> – The Open Data
     *            Standard Light map style provides a detailed basemap for the
     *            world suitable for website and mobile application use. The map
     *            includes highways major roads, minor roads, railways, water
     *            features, cities, parks, landmarks, building footprints, and
     *            administrative boundaries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataStandardDark</code> – Open Data Standard
     *            Dark is a dark-themed map style that provides a detailed
     *            basemap for the world suitable for website and mobile
     *            application use. The map includes highways major roads, minor
     *            roads, railways, water features, cities, parks, landmarks,
     *            building footprints, and administrative boundaries.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataVisualizationLight</code> – The Open Data
     *            Visualization Light map style is a light-themed style with
     *            muted colors and fewer features that aids in understanding
     *            overlaid data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VectorOpenDataVisualizationDark</code> – The Open Data
     *            Visualization Dark map style is a dark-themed style with muted
     *            colors and fewer features that aids in understanding overlaid
     *            data.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfiguration withStyle(String style) {
        this.style = style;
        return this;
    }

    /**
     * <p>
     * Specifies the political view for the style. Leave unset to not use a
     * political view, or, for styles that support specific political views, you
     * can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>[A-Z]{3}<br/>
     *
     * @return <p>
     *         Specifies the political view for the style. Leave unset to not
     *         use a political view, or, for styles that support specific
     *         political views, you can choose a view, such as <code>IND</code>
     *         for the Indian view.
     *         </p>
     *         <p>
     *         Default is unset.
     *         </p>
     *         <note>
     *         <p>
     *         Not all map resources or styles support political view styles.
     *         See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *         >Political views</a> for more information.
     *         </p>
     *         </note>
     */
    public String getPoliticalView() {
        return politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Leave unset to not use a
     * political view, or, for styles that support specific political views, you
     * can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>[A-Z]{3}<br/>
     *
     * @param politicalView <p>
     *            Specifies the political view for the style. Leave unset to not
     *            use a political view, or, for styles that support specific
     *            political views, you can choose a view, such as
     *            <code>IND</code> for the Indian view.
     *            </p>
     *            <p>
     *            Default is unset.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support political view styles.
     *            See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *            >Political views</a> for more information.
     *            </p>
     *            </note>
     */
    public void setPoliticalView(String politicalView) {
        this.politicalView = politicalView;
    }

    /**
     * <p>
     * Specifies the political view for the style. Leave unset to not use a
     * political view, or, for styles that support specific political views, you
     * can choose a view, such as <code>IND</code> for the Indian view.
     * </p>
     * <p>
     * Default is unset.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support political view styles. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     * >Political views</a> for more information.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>[A-Z]{3}<br/>
     *
     * @param politicalView <p>
     *            Specifies the political view for the style. Leave unset to not
     *            use a political view, or, for styles that support specific
     *            political views, you can choose a view, such as
     *            <code>IND</code> for the Indian view.
     *            </p>
     *            <p>
     *            Default is unset.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support political view styles.
     *            See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/map-concepts.html#political-views"
     *            >Political views</a> for more information.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfiguration withPoliticalView(String politicalView) {
        this.politicalView = politicalView;
        return this;
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any
     * custom layer, or, for styles that support custom layers, you can enable
     * layer(s), such as POI layer for the VectorEsriNavigation style. Default
     * is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support custom layers. See Custom Layers
     * for more information.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies the custom layers for the style. Leave unset to not
     *         enable any custom layer, or, for styles that support custom
     *         layers, you can enable layer(s), such as POI layer for the
     *         VectorEsriNavigation style. Default is <code>unset</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Not all map resources or styles support custom layers. See Custom
     *         Layers for more information.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getCustomLayers() {
        return customLayers;
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any
     * custom layer, or, for styles that support custom layers, you can enable
     * layer(s), such as POI layer for the VectorEsriNavigation style. Default
     * is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support custom layers. See Custom Layers
     * for more information.
     * </p>
     * </note>
     *
     * @param customLayers <p>
     *            Specifies the custom layers for the style. Leave unset to not
     *            enable any custom layer, or, for styles that support custom
     *            layers, you can enable layer(s), such as POI layer for the
     *            VectorEsriNavigation style. Default is <code>unset</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support custom layers. See
     *            Custom Layers for more information.
     *            </p>
     *            </note>
     */
    public void setCustomLayers(java.util.Collection<String> customLayers) {
        if (customLayers == null) {
            this.customLayers = null;
            return;
        }

        this.customLayers = new java.util.ArrayList<String>(customLayers);
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any
     * custom layer, or, for styles that support custom layers, you can enable
     * layer(s), such as POI layer for the VectorEsriNavigation style. Default
     * is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support custom layers. See Custom Layers
     * for more information.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customLayers <p>
     *            Specifies the custom layers for the style. Leave unset to not
     *            enable any custom layer, or, for styles that support custom
     *            layers, you can enable layer(s), such as POI layer for the
     *            VectorEsriNavigation style. Default is <code>unset</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support custom layers. See
     *            Custom Layers for more information.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfiguration withCustomLayers(String... customLayers) {
        if (getCustomLayers() == null) {
            this.customLayers = new java.util.ArrayList<String>(customLayers.length);
        }
        for (String value : customLayers) {
            this.customLayers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the custom layers for the style. Leave unset to not enable any
     * custom layer, or, for styles that support custom layers, you can enable
     * layer(s), such as POI layer for the VectorEsriNavigation style. Default
     * is <code>unset</code>.
     * </p>
     * <note>
     * <p>
     * Not all map resources or styles support custom layers. See Custom Layers
     * for more information.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customLayers <p>
     *            Specifies the custom layers for the style. Leave unset to not
     *            enable any custom layer, or, for styles that support custom
     *            layers, you can enable layer(s), such as POI layer for the
     *            VectorEsriNavigation style. Default is <code>unset</code>.
     *            </p>
     *            <note>
     *            <p>
     *            Not all map resources or styles support custom layers. See
     *            Custom Layers for more information.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapConfiguration withCustomLayers(java.util.Collection<String> customLayers) {
        setCustomLayers(customLayers);
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
            sb.append("Style: " + getStyle() + ",");
        if (getPoliticalView() != null)
            sb.append("PoliticalView: " + getPoliticalView() + ",");
        if (getCustomLayers() != null)
            sb.append("CustomLayers: " + getCustomLayers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        hashCode = prime * hashCode
                + ((getPoliticalView() == null) ? 0 : getPoliticalView().hashCode());
        hashCode = prime * hashCode
                + ((getCustomLayers() == null) ? 0 : getCustomLayers().hashCode());
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
        if (other.getPoliticalView() == null ^ this.getPoliticalView() == null)
            return false;
        if (other.getPoliticalView() != null
                && other.getPoliticalView().equals(this.getPoliticalView()) == false)
            return false;
        if (other.getCustomLayers() == null ^ this.getCustomLayers() == null)
            return false;
        if (other.getCustomLayers() != null
                && other.getCustomLayers().equals(this.getCustomLayers()) == false)
            return false;
        return true;
    }
}
