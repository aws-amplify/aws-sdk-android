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
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>,
     * <code>VectorEsriTopographic</code>, <code>VectorEsriNavigation</code>,
     * <code>VectorEsriDarkGrayCanvas</code>,
     * <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Maps for Asset
     * Management. See the <a href="https://aws.amazon.com/service-terms/">AWS
     * Service Terms</a> for Amazon Location Service.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String style;

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>,
     * <code>VectorEsriTopographic</code>, <code>VectorEsriNavigation</code>,
     * <code>VectorEsriDarkGrayCanvas</code>,
     * <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Maps for Asset
     * Management. See the <a href="https://aws.amazon.com/service-terms/">AWS
     * Service Terms</a> for Amazon Location Service.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @return <p>
     *         Specifies the map style selected from an available data provider.
     *         </p>
     *         <p>
     *         Valid styles: <code>VectorEsriStreets</code>,
     *         <code>VectorEsriTopographic</code>,
     *         <code>VectorEsriNavigation</code>,
     *         <code>VectorEsriDarkGrayCanvas</code>,
     *         <code>VectorEsriLightGrayCanvas</code>,
     *         <code>VectorHereBerlin</code>.
     *         </p>
     *         <note>
     *         <p>
     *         When using HERE as your data provider, and selecting the Style
     *         <code>VectorHereBerlin</code>, you may not use HERE Maps for
     *         Asset Management. See the <a
     *         href="https://aws.amazon.com/service-terms/">AWS Service
     *         Terms</a> for Amazon Location Service.
     *         </p>
     *         </note>
     */
    public String getStyle() {
        return style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>,
     * <code>VectorEsriTopographic</code>, <code>VectorEsriNavigation</code>,
     * <code>VectorEsriDarkGrayCanvas</code>,
     * <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Maps for Asset
     * Management. See the <a href="https://aws.amazon.com/service-terms/">AWS
     * Service Terms</a> for Amazon Location Service.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     *            <p>
     *            Valid styles: <code>VectorEsriStreets</code>,
     *            <code>VectorEsriTopographic</code>,
     *            <code>VectorEsriNavigation</code>,
     *            <code>VectorEsriDarkGrayCanvas</code>,
     *            <code>VectorEsriLightGrayCanvas</code>,
     *            <code>VectorHereBerlin</code>.
     *            </p>
     *            <note>
     *            <p>
     *            When using HERE as your data provider, and selecting the Style
     *            <code>VectorHereBerlin</code>, you may not use HERE Maps for
     *            Asset Management. See the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </note>
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Valid styles: <code>VectorEsriStreets</code>,
     * <code>VectorEsriTopographic</code>, <code>VectorEsriNavigation</code>,
     * <code>VectorEsriDarkGrayCanvas</code>,
     * <code>VectorEsriLightGrayCanvas</code>, <code>VectorHereBerlin</code>.
     * </p>
     * <note>
     * <p>
     * When using HERE as your data provider, and selecting the Style
     * <code>VectorHereBerlin</code>, you may not use HERE Maps for Asset
     * Management. See the <a href="https://aws.amazon.com/service-terms/">AWS
     * Service Terms</a> for Amazon Location Service.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param style <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     *            <p>
     *            Valid styles: <code>VectorEsriStreets</code>,
     *            <code>VectorEsriTopographic</code>,
     *            <code>VectorEsriNavigation</code>,
     *            <code>VectorEsriDarkGrayCanvas</code>,
     *            <code>VectorEsriLightGrayCanvas</code>,
     *            <code>VectorHereBerlin</code>.
     *            </p>
     *            <note>
     *            <p>
     *            When using HERE as your data provider, and selecting the Style
     *            <code>VectorHereBerlin</code>, you may not use HERE Maps for
     *            Asset Management. See the <a
     *            href="https://aws.amazon.com/service-terms/">AWS Service
     *            Terms</a> for Amazon Location Service.
     *            </p>
     *            </note>
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
