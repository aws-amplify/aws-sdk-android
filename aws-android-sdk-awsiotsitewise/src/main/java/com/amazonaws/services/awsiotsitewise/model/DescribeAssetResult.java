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

public class DescribeAssetResult implements Serializable {
    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetId;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String assetArn;

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String assetName;

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
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
     * The list of asset properties for the asset.
     * </p>
     */
    private java.util.List<AssetProperty> assetProperties;

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     */
    private java.util.List<AssetHierarchy> assetHierarchies;

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetCreationDate;

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date assetLastUpdateDate;

    /**
     * <p>
     * The current status of the asset, which contains a state and any error
     * message.
     * </p>
     */
    private AssetStatus assetStatus;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
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
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >ARN</a> of the asset, which has the following format.
     *         </p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     *         </p>
     */
    public String getAssetArn() {
        return assetArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param assetArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     *            </p>
     */
    public void setAssetArn(String assetArn) {
        this.assetArn = assetArn;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >ARN</a> of the asset, which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param assetArn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetArn(String assetArn) {
        this.assetArn = assetArn;
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The name of the asset.
     *         </p>
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetName <p>
     *            The name of the asset.
     *            </p>
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param assetName <p>
     *            The name of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model that was used to create the asset.
     *         </p>
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model that was used to create the asset.
     *            </p>
     */
    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model that was used to create the asset.
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
     *            The ID of the asset model that was used to create the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     *
     * @return <p>
     *         The list of asset properties for the asset.
     *         </p>
     */
    public java.util.List<AssetProperty> getAssetProperties() {
        return assetProperties;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     *
     * @param assetProperties <p>
     *            The list of asset properties for the asset.
     *            </p>
     */
    public void setAssetProperties(java.util.Collection<AssetProperty> assetProperties) {
        if (assetProperties == null) {
            this.assetProperties = null;
            return;
        }

        this.assetProperties = new java.util.ArrayList<AssetProperty>(assetProperties);
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetProperties <p>
     *            The list of asset properties for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetProperties(AssetProperty... assetProperties) {
        if (getAssetProperties() == null) {
            this.assetProperties = new java.util.ArrayList<AssetProperty>(assetProperties.length);
        }
        for (AssetProperty value : assetProperties) {
            this.assetProperties.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset properties for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetProperties <p>
     *            The list of asset properties for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetProperties(
            java.util.Collection<AssetProperty> assetProperties) {
        setAssetProperties(assetProperties);
        return this;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     *
     * @return <p>
     *         A list of asset hierarchies that each contain a
     *         <code>hierarchyId</code>. A hierarchy specifies allowed
     *         parent/child asset relationships.
     *         </p>
     */
    public java.util.List<AssetHierarchy> getAssetHierarchies() {
        return assetHierarchies;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     *
     * @param assetHierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     */
    public void setAssetHierarchies(java.util.Collection<AssetHierarchy> assetHierarchies) {
        if (assetHierarchies == null) {
            this.assetHierarchies = null;
            return;
        }

        this.assetHierarchies = new java.util.ArrayList<AssetHierarchy>(assetHierarchies);
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetHierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetHierarchies(AssetHierarchy... assetHierarchies) {
        if (getAssetHierarchies() == null) {
            this.assetHierarchies = new java.util.ArrayList<AssetHierarchy>(assetHierarchies.length);
        }
        for (AssetHierarchy value : assetHierarchies) {
            this.assetHierarchies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetHierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetHierarchies(
            java.util.Collection<AssetHierarchy> assetHierarchies) {
        setAssetHierarchies(assetHierarchies);
        return this;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the asset was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAssetCreationDate() {
        return assetCreationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     *
     * @param assetCreationDate <p>
     *            The date the asset was created, in Unix epoch time.
     *            </p>
     */
    public void setAssetCreationDate(java.util.Date assetCreationDate) {
        this.assetCreationDate = assetCreationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetCreationDate <p>
     *            The date the asset was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetCreationDate(java.util.Date assetCreationDate) {
        this.assetCreationDate = assetCreationDate;
        return this;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the asset was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getAssetLastUpdateDate() {
        return assetLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     *
     * @param assetLastUpdateDate <p>
     *            The date the asset was last updated, in Unix epoch time.
     *            </p>
     */
    public void setAssetLastUpdateDate(java.util.Date assetLastUpdateDate) {
        this.assetLastUpdateDate = assetLastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetLastUpdateDate <p>
     *            The date the asset was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetLastUpdateDate(java.util.Date assetLastUpdateDate) {
        this.assetLastUpdateDate = assetLastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error
     * message.
     * </p>
     *
     * @return <p>
     *         The current status of the asset, which contains a state and any
     *         error message.
     *         </p>
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error
     * message.
     * </p>
     *
     * @param assetStatus <p>
     *            The current status of the asset, which contains a state and
     *            any error message.
     *            </p>
     */
    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * <p>
     * The current status of the asset, which contains a state and any error
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetStatus <p>
     *            The current status of the asset, which contains a state and
     *            any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssetResult withAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
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
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getAssetArn() != null)
            sb.append("assetArn: " + getAssetArn() + ",");
        if (getAssetName() != null)
            sb.append("assetName: " + getAssetName() + ",");
        if (getAssetModelId() != null)
            sb.append("assetModelId: " + getAssetModelId() + ",");
        if (getAssetProperties() != null)
            sb.append("assetProperties: " + getAssetProperties() + ",");
        if (getAssetHierarchies() != null)
            sb.append("assetHierarchies: " + getAssetHierarchies() + ",");
        if (getAssetCreationDate() != null)
            sb.append("assetCreationDate: " + getAssetCreationDate() + ",");
        if (getAssetLastUpdateDate() != null)
            sb.append("assetLastUpdateDate: " + getAssetLastUpdateDate() + ",");
        if (getAssetStatus() != null)
            sb.append("assetStatus: " + getAssetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetArn() == null) ? 0 : getAssetArn().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode
                + ((getAssetProperties() == null) ? 0 : getAssetProperties().hashCode());
        hashCode = prime * hashCode
                + ((getAssetHierarchies() == null) ? 0 : getAssetHierarchies().hashCode());
        hashCode = prime * hashCode
                + ((getAssetCreationDate() == null) ? 0 : getAssetCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getAssetLastUpdateDate() == null) ? 0 : getAssetLastUpdateDate().hashCode());
        hashCode = prime * hashCode
                + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetResult == false)
            return false;
        DescribeAssetResult other = (DescribeAssetResult) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetArn() == null ^ this.getAssetArn() == null)
            return false;
        if (other.getAssetArn() != null && other.getAssetArn().equals(this.getAssetArn()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null
                && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null
                && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getAssetProperties() == null ^ this.getAssetProperties() == null)
            return false;
        if (other.getAssetProperties() != null
                && other.getAssetProperties().equals(this.getAssetProperties()) == false)
            return false;
        if (other.getAssetHierarchies() == null ^ this.getAssetHierarchies() == null)
            return false;
        if (other.getAssetHierarchies() != null
                && other.getAssetHierarchies().equals(this.getAssetHierarchies()) == false)
            return false;
        if (other.getAssetCreationDate() == null ^ this.getAssetCreationDate() == null)
            return false;
        if (other.getAssetCreationDate() != null
                && other.getAssetCreationDate().equals(this.getAssetCreationDate()) == false)
            return false;
        if (other.getAssetLastUpdateDate() == null ^ this.getAssetLastUpdateDate() == null)
            return false;
        if (other.getAssetLastUpdateDate() != null
                && other.getAssetLastUpdateDate().equals(this.getAssetLastUpdateDate()) == false)
            return false;
        if (other.getAssetStatus() == null ^ this.getAssetStatus() == null)
            return false;
        if (other.getAssetStatus() != null
                && other.getAssetStatus().equals(this.getAssetStatus()) == false)
            return false;
        return true;
    }
}
