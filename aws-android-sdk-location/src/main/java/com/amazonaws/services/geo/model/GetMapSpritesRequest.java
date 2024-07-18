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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the sprite sheet corresponding to a map resource. The sprite sheet
 * is a PNG image paired with a JSON document describing the offsets of
 * individual icons that will be displayed on a rendered map.
 * </p>
 */
public class GetMapSpritesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String mapName;

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite
     * sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document containing image offsets. Use the following ﬁle
     * names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>sprites(@2x)?\.(png|json)<br/>
     */
    private String fileName;

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String key;

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The map resource associated with the sprite ﬁle.
     *         </p>
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param mapName <p>
     *            The map resource associated with the sprite ﬁle.
     *            </p>
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The map resource associated with the sprite ﬁle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param mapName <p>
     *            The map resource associated with the sprite ﬁle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapSpritesRequest withMapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite
     * sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document containing image offsets. Use the following ﬁle
     * names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>sprites(@2x)?\.(png|json)<br/>
     *
     * @return <p>
     *         The name of the sprite ﬁle. Use the following ﬁle names for the
     *         sprite sheet:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sprites.png</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sprites@2x.png</code> for high pixel density displays
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the JSON document containing image offsets. Use the following
     *         ﬁle names:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sprites.json</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sprites@2x.json</code> for high pixel density displays
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite
     * sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document containing image offsets. Use the following ﬁle
     * names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>sprites(@2x)?\.(png|json)<br/>
     *
     * @param fileName <p>
     *            The name of the sprite ﬁle. Use the following ﬁle names for
     *            the sprite sheet:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sprites.png</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sprites@2x.png</code> for high pixel density displays
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For the JSON document containing image offsets. Use the
     *            following ﬁle names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sprites.json</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sprites@2x.json</code> for high pixel density displays
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the sprite ﬁle. Use the following ﬁle names for the sprite
     * sheet:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.png</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.png</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the JSON document containing image offsets. Use the following ﬁle
     * names:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sprites.json</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sprites@2x.json</code> for high pixel density displays
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>sprites(@2x)?\.(png|json)<br/>
     *
     * @param fileName <p>
     *            The name of the sprite ﬁle. Use the following ﬁle names for
     *            the sprite sheet:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sprites.png</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sprites@2x.png</code> for high pixel density displays
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For the JSON document containing image offsets. Use the
     *            following ﬁle names:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sprites.json</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sprites@2x.json</code> for high pixel density displays
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapSpritesRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *         >API key</a> to authorize the request.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     * >API key</a> to authorize the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The optional <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
     *            >API key</a> to authorize the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapSpritesRequest withKey(String key) {
        this.key = key;
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
        if (getFileName() != null)
            sb.append("FileName: " + getFileName() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapSpritesRequest == false)
            return false;
        GetMapSpritesRequest other = (GetMapSpritesRequest) obj;

        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }
}
