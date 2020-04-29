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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an asset hierarchy that contains a hierarchy's name, ID, and child
 * asset model ID that specifies the type of asset that can be in this
 * hierarchy.
 * </p>
 */
public class AssetModelHierarchy implements Serializable {
    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a
     * <code>hierarchyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances
     * of the <code>childAssetModelId</code> asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String childAssetModelId;

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a
     * <code>hierarchyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model hierarchy. This ID is a
     *         <code>hierarchyId</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a
     * <code>hierarchyId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the asset model hierarchy. This ID is a
     *            <code>hierarchyId</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset model hierarchy. This ID is a
     * <code>hierarchyId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the asset model hierarchy. This ID is a
     *            <code>hierarchyId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelHierarchy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the asset model hierarchy that you specify by using
     *         the <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *         >CreateAssetModel</a> or <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *         >UpdateAssetModel</a> API.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the asset model hierarchy that you specify by
     *            using the <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *            >CreateAssetModel</a> or <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *            >UpdateAssetModel</a> API.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset model hierarchy that you specify by using the <a
     * href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     * >CreateAssetModel</a> or <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     * >UpdateAssetModel</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param name <p>
     *            The name of the asset model hierarchy that you specify by
     *            using the <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html"
     *            >CreateAssetModel</a> or <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html"
     *            >UpdateAssetModel</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelHierarchy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances
     * of the <code>childAssetModelId</code> asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model. All assets in this hierarchy must be
     *         instances of the <code>childAssetModelId</code> asset model.
     *         </p>
     */
    public String getChildAssetModelId() {
        return childAssetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances
     * of the <code>childAssetModelId</code> asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param childAssetModelId <p>
     *            The ID of the asset model. All assets in this hierarchy must
     *            be instances of the <code>childAssetModelId</code> asset
     *            model.
     *            </p>
     */
    public void setChildAssetModelId(String childAssetModelId) {
        this.childAssetModelId = childAssetModelId;
    }

    /**
     * <p>
     * The ID of the asset model. All assets in this hierarchy must be instances
     * of the <code>childAssetModelId</code> asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param childAssetModelId <p>
     *            The ID of the asset model. All assets in this hierarchy must
     *            be instances of the <code>childAssetModelId</code> asset
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelHierarchy withChildAssetModelId(String childAssetModelId) {
        this.childAssetModelId = childAssetModelId;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getChildAssetModelId() != null)
            sb.append("childAssetModelId: " + getChildAssetModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getChildAssetModelId() == null) ? 0 : getChildAssetModelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelHierarchy == false)
            return false;
        AssetModelHierarchy other = (AssetModelHierarchy) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChildAssetModelId() == null ^ this.getChildAssetModelId() == null)
            return false;
        if (other.getChildAssetModelId() != null
                && other.getChildAssetModelId().equals(this.getChildAssetModelId()) == false)
            return false;
        return true;
    }
}
