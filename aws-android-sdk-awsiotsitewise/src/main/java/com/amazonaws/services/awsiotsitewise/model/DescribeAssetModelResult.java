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

public class DescribeAssetModelResult implements Serializable {
    /**
     * <p>
     * The ID of the asset model.
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
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String assetModelArn;

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String assetModelName;

    /**
     * <p>
     * The asset model's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String assetModelDescription;

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     */
    private java.util.List<AssetModelProperty> assetModelProperties;

    /**
     * <p>
     * A list of asset model hierarchies that each contain a
     * <code>childAssetModelId</code> and a <code>hierarchyId</code> (named
     * <code>id</code>). A hierarchy specifies allowed parent/child asset
     * relationships for an asset model.
     * </p>
     */
    private java.util.List<AssetModelHierarchy> assetModelHierarchies;

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetModelCreationDate;

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetModelLastUpdateDate;

    /**
     * <p>
     * The current status of the asset model, which contains a state and any
     * error message.
     * </p>
     */
    private AssetModelStatus assetModelStatus;

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model.
     *         </p>
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model.
     *            </p>
     */
    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
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
     *            The ID of the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the asset model, which has the following format.
     *         </p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     *         </p>
     */
    public String getAssetModelArn() {
        return assetModelArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param assetModelArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset model, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     *            </p>
     */
    public void setAssetModelArn(String assetModelArn) {
        this.assetModelArn = assetModelArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset model, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param assetModelArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset model, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelArn(String assetModelArn) {
        this.assetModelArn = assetModelArn;
        return this;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the asset model.
     *         </p>
     */
    public String getAssetModelName() {
        return assetModelName;
    }

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelName <p>
     *            The name of the asset model.
     *            </p>
     */
    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    /**
     * <p>
     * The name of the asset model.
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
     *            The name of the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
        return this;
    }

    /**
     * <p>
     * The asset model's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The asset model's description.
     *         </p>
     */
    public String getAssetModelDescription() {
        return assetModelDescription;
    }

    /**
     * <p>
     * The asset model's description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetModelDescription <p>
     *            The asset model's description.
     *            </p>
     */
    public void setAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
    }

    /**
     * <p>
     * The asset model's description.
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
     *            The asset model's description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelDescription(String assetModelDescription) {
        this.assetModelDescription = assetModelDescription;
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     *
     * @return <p>
     *         The list of asset properties for the asset model.
     *         </p>
     */
    public java.util.List<AssetModelProperty> getAssetModelProperties() {
        return assetModelProperties;
    }

    /**
     * <p>
     * The list of asset properties for the asset model.
     * </p>
     *
     * @param assetModelProperties <p>
     *            The list of asset properties for the asset model.
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
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelProperties <p>
     *            The list of asset properties for the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelProperties(
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
     * The list of asset properties for the asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelProperties <p>
     *            The list of asset properties for the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelProperties(
            java.util.Collection<AssetModelProperty> assetModelProperties) {
        setAssetModelProperties(assetModelProperties);
        return this;
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a
     * <code>childAssetModelId</code> and a <code>hierarchyId</code> (named
     * <code>id</code>). A hierarchy specifies allowed parent/child asset
     * relationships for an asset model.
     * </p>
     *
     * @return <p>
     *         A list of asset model hierarchies that each contain a
     *         <code>childAssetModelId</code> and a <code>hierarchyId</code>
     *         (named <code>id</code>). A hierarchy specifies allowed
     *         parent/child asset relationships for an asset model.
     *         </p>
     */
    public java.util.List<AssetModelHierarchy> getAssetModelHierarchies() {
        return assetModelHierarchies;
    }

    /**
     * <p>
     * A list of asset model hierarchies that each contain a
     * <code>childAssetModelId</code> and a <code>hierarchyId</code> (named
     * <code>id</code>). A hierarchy specifies allowed parent/child asset
     * relationships for an asset model.
     * </p>
     *
     * @param assetModelHierarchies <p>
     *            A list of asset model hierarchies that each contain a
     *            <code>childAssetModelId</code> and a <code>hierarchyId</code>
     *            (named <code>id</code>). A hierarchy specifies allowed
     *            parent/child asset relationships for an asset model.
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
     * A list of asset model hierarchies that each contain a
     * <code>childAssetModelId</code> and a <code>hierarchyId</code> (named
     * <code>id</code>). A hierarchy specifies allowed parent/child asset
     * relationships for an asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelHierarchies <p>
     *            A list of asset model hierarchies that each contain a
     *            <code>childAssetModelId</code> and a <code>hierarchyId</code>
     *            (named <code>id</code>). A hierarchy specifies allowed
     *            parent/child asset relationships for an asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelHierarchies(
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
     * A list of asset model hierarchies that each contain a
     * <code>childAssetModelId</code> and a <code>hierarchyId</code> (named
     * <code>id</code>). A hierarchy specifies allowed parent/child asset
     * relationships for an asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelHierarchies <p>
     *            A list of asset model hierarchies that each contain a
     *            <code>childAssetModelId</code> and a <code>hierarchyId</code>
     *            (named <code>id</code>). A hierarchy specifies allowed
     *            parent/child asset relationships for an asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelHierarchies(
            java.util.Collection<AssetModelHierarchy> assetModelHierarchies) {
        setAssetModelHierarchies(assetModelHierarchies);
        return this;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the asset model was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAssetModelCreationDate() {
        return assetModelCreationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     *
     * @param assetModelCreationDate <p>
     *            The date the asset model was created, in Unix epoch time.
     *            </p>
     */
    public void setAssetModelCreationDate(java.util.Date assetModelCreationDate) {
        this.assetModelCreationDate = assetModelCreationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelCreationDate <p>
     *            The date the asset model was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelCreationDate(java.util.Date assetModelCreationDate) {
        this.assetModelCreationDate = assetModelCreationDate;
        return this;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the asset model was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAssetModelLastUpdateDate() {
        return assetModelLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     *
     * @param assetModelLastUpdateDate <p>
     *            The date the asset model was last updated, in Unix epoch time.
     *            </p>
     */
    public void setAssetModelLastUpdateDate(java.util.Date assetModelLastUpdateDate) {
        this.assetModelLastUpdateDate = assetModelLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelLastUpdateDate <p>
     *            The date the asset model was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelLastUpdateDate(
            java.util.Date assetModelLastUpdateDate) {
        this.assetModelLastUpdateDate = assetModelLastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any
     * error message.
     * </p>
     *
     * @return <p>
     *         The current status of the asset model, which contains a state and
     *         any error message.
     *         </p>
     */
    public AssetModelStatus getAssetModelStatus() {
        return assetModelStatus;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any
     * error message.
     * </p>
     *
     * @param assetModelStatus <p>
     *            The current status of the asset model, which contains a state
     *            and any error message.
     *            </p>
     */
    public void setAssetModelStatus(AssetModelStatus assetModelStatus) {
        this.assetModelStatus = assetModelStatus;
    }

    /**
     * <p>
     * The current status of the asset model, which contains a state and any
     * error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetModelStatus <p>
     *            The current status of the asset model, which contains a state
     *            and any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetModelResult withAssetModelStatus(AssetModelStatus assetModelStatus) {
        this.assetModelStatus = assetModelStatus;
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
        if (getAssetModelArn() != null)
            sb.append("assetModelArn: " + getAssetModelArn() + ",");
        if (getAssetModelName() != null)
            sb.append("assetModelName: " + getAssetModelName() + ",");
        if (getAssetModelDescription() != null)
            sb.append("assetModelDescription: " + getAssetModelDescription() + ",");
        if (getAssetModelProperties() != null)
            sb.append("assetModelProperties: " + getAssetModelProperties() + ",");
        if (getAssetModelHierarchies() != null)
            sb.append("assetModelHierarchies: " + getAssetModelHierarchies() + ",");
        if (getAssetModelCreationDate() != null)
            sb.append("assetModelCreationDate: " + getAssetModelCreationDate() + ",");
        if (getAssetModelLastUpdateDate() != null)
            sb.append("assetModelLastUpdateDate: " + getAssetModelLastUpdateDate() + ",");
        if (getAssetModelStatus() != null)
            sb.append("assetModelStatus: " + getAssetModelStatus());
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
                + ((getAssetModelArn() == null) ? 0 : getAssetModelArn().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getAssetModelCreationDate() == null) ? 0 : getAssetModelCreationDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAssetModelLastUpdateDate() == null) ? 0 : getAssetModelLastUpdateDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelStatus() == null) ? 0 : getAssetModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetModelResult == false)
            return false;
        DescribeAssetModelResult other = (DescribeAssetModelResult) obj;

        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null
                && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetModelArn() == null ^ this.getAssetModelArn() == null)
            return false;
        if (other.getAssetModelArn() != null
                && other.getAssetModelArn().equals(this.getAssetModelArn()) == false)
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
        if (other.getAssetModelCreationDate() == null ^ this.getAssetModelCreationDate() == null)
            return false;
        if (other.getAssetModelCreationDate() != null
                && other.getAssetModelCreationDate().equals(this.getAssetModelCreationDate()) == false)
            return false;
        if (other.getAssetModelLastUpdateDate() == null
                ^ this.getAssetModelLastUpdateDate() == null)
            return false;
        if (other.getAssetModelLastUpdateDate() != null
                && other.getAssetModelLastUpdateDate().equals(this.getAssetModelLastUpdateDate()) == false)
            return false;
        if (other.getAssetModelStatus() == null ^ this.getAssetModelStatus() == null)
            return false;
        if (other.getAssetModelStatus() != null
                && other.getAssetModelStatus().equals(this.getAssetModelStatus()) == false)
            return false;
        return true;
    }
}
