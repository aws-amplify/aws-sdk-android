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
 * Retrieves a vector data tile from the map resource. Map tiles are used by
 * clients to render a map. they're addressed using a grid arrangement with an X
 * coordinate, Y coordinate, and Z (zoom) level.
 * </p>
 * <p>
 * The origin (0, 0) is the top left of the map. Increasing the zoom level by 1
 * doubles both the X and Y dimensions, so a tile containing data for the entire
 * world at (0/0/0) will be split into 4 tiles at zoom 1 (1/0/0, 1/0/1, 1/1/0,
 * 1/1/1).
 * </p>
 */
public class GetMapTileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String mapName;

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String x;

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String y;

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String z;

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The map resource to retrieve the map tiles from.
     *         </p>
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param mapName <p>
     *            The map resource to retrieve the map tiles from.
     *            </p>
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource to retrieve the map tiles from.
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
     *            The map resource to retrieve the map tiles from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapTileRequest withMapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The X axis value for the map tile.
     *         </p>
     */
    public String getX() {
        return x;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param x <p>
     *            The X axis value for the map tile.
     *            </p>
     */
    public void setX(String x) {
        this.x = x;
    }

    /**
     * <p>
     * The X axis value for the map tile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param x <p>
     *            The X axis value for the map tile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapTileRequest withX(String x) {
        this.x = x;
        return this;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The Y axis value for the map tile.
     *         </p>
     */
    public String getY() {
        return y;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param y <p>
     *            The Y axis value for the map tile.
     *            </p>
     */
    public void setY(String y) {
        this.y = y;
    }

    /**
     * <p>
     * The Y axis value for the map tile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param y <p>
     *            The Y axis value for the map tile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapTileRequest withY(String y) {
        this.y = y;
        return this;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The zoom value for the map tile.
     *         </p>
     */
    public String getZ() {
        return z;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param z <p>
     *            The zoom value for the map tile.
     *            </p>
     */
    public void setZ(String z) {
        this.z = z;
    }

    /**
     * <p>
     * The zoom value for the map tile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param z <p>
     *            The zoom value for the map tile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapTileRequest withZ(String z) {
        this.z = z;
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
        if (getMapName() != null)
            sb.append("MapName: " + getMapName() + ",");
        if (getX() != null)
            sb.append("X: " + getX() + ",");
        if (getY() != null)
            sb.append("Y: " + getY() + ",");
        if (getZ() != null)
            sb.append("Z: " + getZ());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        hashCode = prime * hashCode + ((getZ() == null) ? 0 : getZ().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapTileRequest == false)
            return false;
        GetMapTileRequest other = (GetMapTileRequest) obj;

        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        if (other.getZ() == null ^ this.getZ() == null)
            return false;
        if (other.getZ() != null && other.getZ().equals(this.getZ()) == false)
            return false;
        return true;
    }
}
