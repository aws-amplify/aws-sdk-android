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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an asset model from specified property and hierarchy definitions. You
 * create assets from asset models. With asset models, you can easily create
 * assets of the same type that have standardized definitions. Each asset
 * created from a model inherits the asset model's property and hierarchy
 * definitions. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html"
 * >Defining Asset Models</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 */
public class CreateAssetModelRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The property definitions of the asset model. For more information, see <a
     * href=
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
    private java.util.List<AssetModelPropertyDefinition> assetModelProperties;

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an
     * asset model whose assets can be children of any other assets created from
     * this asset model. For more information, see <a href=
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
    private java.util.List<AssetModelHierarchyDefinition> assetModelHierarchies;

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
     * A list of key-value pairs that contain metadata for the asset model. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreateAssetModelRequest withAssetModelName(String assetModelName) {
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
    public CreateAssetModelRequest withAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
        return this;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
     * href=
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
     *         The property definitions of the asset model. For more
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
    public java.util.List<AssetModelPropertyDefinition> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
     * href=
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
     *            The property definitions of the asset model. For more
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
            java.util.Collection<AssetModelPropertyDefinition> assetModelProperties) {
        if (assetModelProperties == null) {
            this.assetModelProperties = null;
            return;
        }

        this.assetModelProperties = new java.util.ArrayList<AssetModelPropertyDefinition>(
                assetModelProperties);
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
     * href=
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
     *            The property definitions of the asset model. For more
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
    public CreateAssetModelRequest withAssetModelProperties(
            AssetModelPropertyDefinition... assetModelProperties) {
        if (getAssetModelProperties() == null) {
            this.assetModelProperties = new java.util.ArrayList<AssetModelPropertyDefinition>(
                    assetModelProperties.length);
        }
        for (AssetModelPropertyDefinition value : assetModelProperties) {
            this.assetModelProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The property definitions of the asset model. For more information, see <a
     * href=
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
     *            The property definitions of the asset model. For more
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
    public CreateAssetModelRequest withAssetModelProperties(
            java.util.Collection<AssetModelPropertyDefinition> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an
     * asset model whose assets can be children of any other assets created from
     * this asset model. For more information, see <a href=
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
     *         The hierarchy definitions of the asset model. Each hierarchy
     *         specifies an asset model whose assets can be children of any
     *         other assets created from this asset model. For more information,
     *         see <a href=
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
    public java.util.List<AssetModelHierarchyDefinition> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an
     * asset model whose assets can be children of any other assets created from
     * this asset model. For more information, see <a href=
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
     *            The hierarchy definitions of the asset model. Each hierarchy
     *            specifies an asset model whose assets can be children of any
     *            other assets created from this asset model. For more
     *            information, see <a href=
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
            java.util.Collection<AssetModelHierarchyDefinition> assetModelHierarchies) {
        if (assetModelHierarchies == null) {
            this.assetModelHierarchies = null;
            return;
        }

        this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchyDefinition>(
                assetModelHierarchies);
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an
     * asset model whose assets can be children of any other assets created from
     * this asset model. For more information, see <a href=
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
     *            The hierarchy definitions of the asset model. Each hierarchy
     *            specifies an asset model whose assets can be children of any
     *            other assets created from this asset model. For more
     *            information, see <a href=
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
    public CreateAssetModelRequest withAssetModelHierarchies(
            AssetModelHierarchyDefinition... assetModelHierarchies) {
        if (getAssetModelHierarchies() == null) {
            this.assetModelHierarchies = new java.util.ArrayList<AssetModelHierarchyDefinition>(
                    assetModelHierarchies.length);
        }
        for (AssetModelHierarchyDefinition value : assetModelHierarchies) {
            this.assetModelHierarchies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The hierarchy definitions of the asset model. Each hierarchy specifies an
     * asset model whose assets can be children of any other assets created from
     * this asset model. For more information, see <a href=
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
     *            The hierarchy definitions of the asset model. Each hierarchy
     *            specifies an asset model whose assets can be children of any
     *            other assets created from this asset model. For more
     *            information, see <a href=
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
    public CreateAssetModelRequest withAssetModelHierarchies(
            java.util.Collection<AssetModelHierarchyDefinition> assetModelHierarchies) {
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
    public CreateAssetModelRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that contain metadata for the asset
     *         model. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *         >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the asset
     *            model. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the asset
     *            model. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssetModelRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the asset model. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssetModelRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateAssetModelRequest cleartagsEntries() {
        this.tags = null;
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
        if (getAssetModelName() != null)
            sb.append("assetModelName: " + getAssetModelName() + ",");
        if (getAssetModelDescription() != null)
            sb.append("assetModelDescription: " + getAssetModelDescription() + ",");
        if (getAssetModelProperties() != null)
            sb.append("assetModelProperties: " + getAssetModelProperties() + ",");
        if (getAssetModelHierarchies() != null)
            sb.append("assetModelHierarchies: " + getAssetModelHierarchies() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetModelRequest == false)
            return false;
        CreateAssetModelRequest other = (CreateAssetModelRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
