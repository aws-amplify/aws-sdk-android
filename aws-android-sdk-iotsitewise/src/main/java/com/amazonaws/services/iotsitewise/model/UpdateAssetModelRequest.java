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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an asset model and all of the assets that were created from the
 * model. Each asset created from the model inherits the updated asset model's
 * property and hierarchy definitions. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-assets-and-models.html"
 * >Updating Assets and Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 * <important>
 * <p>
 * This operation overwrites the existing model with the provided model. To
 * avoid deleting your asset model's properties or hierarchies, you must include
 * their IDs and definitions in the updated asset model payload. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
 * >DescribeAssetModel</a>.
 * </p>
 * <p>
 * If you remove a property from an asset model or update a property's formula
 * expression, AWS IoT SiteWise deletes all previous data for that property. If
 * you remove a hierarchy definition from an asset model, AWS IoT SiteWise
 * disassociates every asset associated with that hierarchy. You can't change
 * the type or data type of an existing property.
 * </p>
 * </important>
 */
public class UpdateAssetModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetModelId;

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String assetModelName;

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String assetModelDescription;

    /**
     * <p>
     * The updated property definitions of the asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     * >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelProperty> assetModelProperties;

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy
     * specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.List<AssetModelHierarchy> assetModelHierarchies;

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model to update.
     *         </p>
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model to update.
     *            </p>
     */
    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model to update.
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
     * @param assetModelId <p>
     *            The ID of the asset model to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A unique, friendly name for the asset model.
     *         </p>
     */
    public String getAssetModelName() {
        return assetModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelName <p>
     *            A unique, friendly name for the asset model.
     *            </p>
     */
    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    /**
     * <p>
     * A unique, friendly name for the asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelName <p>
     *            A unique, friendly name for the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
        return this;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A description for the asset model.
     *         </p>
     */
    public String getAssetModelDescription() {
        return assetModelDescription;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelDescription <p>
     *            A description for the asset model.
     *            </p>
     */
    public void setAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
    }

    /**
     * <p>
     * A description for the asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelDescription <p>
     *            A description for the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
        return this;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     * >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The updated property definitions of the asset model. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     *         >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     *         <p>
     *         You can specify up to 200 properties per asset model. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *         >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public java.util.List<AssetModelProperty> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     * >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     *
     * @param assetModelProperties <p>
     *            The updated property definitions of the asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     *            >Asset Properties</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 200 properties per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setAssetModelProperties(
            java.util.Collection<AssetModelProperty> assetModelProperties) {
        if (assetModelProperties == null) {
            this.assetModelProperties = null;
            return;
        }

        this.assetModelProperties = new java.util.ArrayList<AssetModelProperty>(
                assetModelProperties);
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     * >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelProperties <p>
     *            The updated property definitions of the asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     *            >Asset Properties</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 200 properties per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelProperties(
            AssetModelProperty... assetModelProperties) {
        if (getAssetModelProperties() == null) {
            this.assetModelProperties = new java.util.ArrayList<AssetModelProperty>(
                    assetModelProperties.length);
        }
        for (AssetModelProperty value : assetModelProperties) {
            this.assetModelProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The updated property definitions of the asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     * >Asset Properties</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 200 properties per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelProperties <p>
     *            The updated property definitions of the asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html"
     *            >Asset Properties</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 200 properties per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelProperties(
            java.util.Collection<AssetModelProperty> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy
     * specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The updated hierarchy definitions of the asset model. Each
     *         hierarchy specifies an asset model whose assets can be children
     *         of any other assets created from this asset model. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *         >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     *         <p>
     *         You can specify up to 10 hierarchies per asset model. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *         >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public java.util.List<AssetModelHierarchy> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy
     * specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     *
     * @param assetModelHierarchies <p>
     *            The updated hierarchy definitions of the asset model. Each
     *            hierarchy specifies an asset model whose assets can be
     *            children of any other assets created from this asset model.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *            >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 10 hierarchies per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setAssetModelHierarchies(
            java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        if (assetModelHierarchies == null) {
            this.assetModelHierarchies = null;
            return;
        }

        this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchy>(
                assetModelHierarchies);
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy
     * specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelHierarchies <p>
     *            The updated hierarchy definitions of the asset model. Each
     *            hierarchy specifies an asset model whose assets can be
     *            children of any other assets created from this asset model.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *            >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 10 hierarchies per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelHierarchies(
            AssetModelHierarchy... assetModelHierarchies) {
        if (getAssetModelHierarchies() == null) {
            this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchy>(
                    assetModelHierarchies.length);
        }
        for (AssetModelHierarchy value : assetModelHierarchies) {
            this.assetModelHierarchies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The updated hierarchy definitions of the asset model. Each hierarchy
     * specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     * >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You can specify up to 10 hierarchies per asset model. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelHierarchies <p>
     *            The updated hierarchy definitions of the asset model. Each
     *            hierarchy specifies an asset model whose assets can be
     *            children of any other assets created from this asset model.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html"
     *            >Asset Hierarchies</a> in the <i>AWS IoT SiteWise User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            You can specify up to 10 hierarchies per asset model. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withAssetModelHierarchies(
            java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        setAssetModelHierarchies(assetModelHierarchies);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetModelRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getAssetModelId() != null)
            sb.append("assetModelId: " + getAssetModelId() + ",");
        if (getAssetModelName() != null)
            sb.append("assetModelName: " + getAssetModelName() + ",");
        if (getAssetModelDescription() != null)
            sb.append("assetModelDescription: " + getAssetModelDescription() + ",");
        if (getAssetModelProperties() != null)
            sb.append("assetModelProperties: " + getAssetModelProperties() + ",");
        if (getAssetModelHierarchies() != null)
            sb.append("assetModelHierarchies: " + getAssetModelHierarchies() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelName() == null) ? 0 : getAssetModelName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssetModelDescription() == null) ? 0 : getAssetModelDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelProperties() == null) ? 0 : getAssetModelProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssetModelHierarchies() == null) ? 0 : getAssetModelHierarchies().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssetModelRequest == false)
            return false;
        UpdateAssetModelRequest other = (UpdateAssetModelRequest) obj;

        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null
                && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelName() == null ^ this.getAssetModelName() == null)
            return false;
        if (other.getAssetModelName() != null
                && other.getAssetModelName().equals(this.getAssetModelName()) == false)
            return false;
        if (other.getAssetModelDescription() == null ^ this.getAssetModelDescription() == null)
            return false;
        if (other.getAssetModelDescription() != null
                && other.getAssetModelDescription().equals(this.getAssetModelDescription()) == false)
            return false;
        if (other.getAssetModelProperties() == null ^ this.getAssetModelProperties() == null)
            return false;
        if (other.getAssetModelProperties() != null
                && other.getAssetModelProperties().equals(this.getAssetModelProperties()) == false)
            return false;
        if (other.getAssetModelHierarchies() == null ^ this.getAssetModelHierarchies() == null)
            return false;
        if (other.getAssetModelHierarchies() != null
                && other.getAssetModelHierarchies().equals(this.getAssetModelHierarchies()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
