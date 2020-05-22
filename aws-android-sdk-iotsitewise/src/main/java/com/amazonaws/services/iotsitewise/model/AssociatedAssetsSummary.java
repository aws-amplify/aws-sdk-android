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

/**
 * <p>
 * Contains a summary of an associated asset.
 * </p>
 */
public class AssociatedAssetsSummary implements Serializable {
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
    private String id;

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
    private String arn;

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the asset model used to create the asset.
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
     * The date the asset was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The current status of the asset.
     * </p>
     */
    private AssetStatus status;

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     */
    private java.util.List<AssetHierarchy> hierarchies;

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
    public String getId() {
        return id;
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
     * @param id <p>
     *            The ID of the asset.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
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
     * @param id <p>
     *            The ID of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withId(String id) {
        this.id = id;
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
    public String getArn() {
        return arn;
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
     * @param arn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId}</code>
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
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
     * @param arn <p>
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
    public AssociatedAssetsSummary withArn(String arn) {
        this.arn = arn;
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
    public String getName() {
        return name;
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
     * @param name <p>
     *            The name of the asset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            The name of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the asset model used to create the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model used to create the asset.
     *         </p>
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model used to create the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model used to create the asset.
     *            </p>
     */
    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model used to create the asset.
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
     *            The ID of the asset model used to create the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
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
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     *
     * @param creationDate <p>
     *            The date the asset was created, in Unix epoch time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the asset was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the asset was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     *
     * @param lastUpdateDate <p>
     *            The date the asset was last updated, in Unix epoch time.
     *            </p>
     */
    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDate <p>
     *            The date the asset was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     *
     * @return <p>
     *         The current status of the asset.
     *         </p>
     */
    public AssetStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     *
     * @param status <p>
     *            The current status of the asset.
     *            </p>
     */
    public void setStatus(AssetStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withStatus(AssetStatus status) {
        this.status = status;
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
    public java.util.List<AssetHierarchy> getHierarchies() {
        return hierarchies;
    }

    /**
     * <p>
     * A list of asset hierarchies that each contain a <code>hierarchyId</code>.
     * A hierarchy specifies allowed parent/child asset relationships.
     * </p>
     *
     * @param hierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     */
    public void setHierarchies(java.util.Collection<AssetHierarchy> hierarchies) {
        if (hierarchies == null) {
            this.hierarchies = null;
            return;
        }

        this.hierarchies = new java.util.ArrayList<AssetHierarchy>(hierarchies);
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
     * @param hierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withHierarchies(AssetHierarchy... hierarchies) {
        if (getHierarchies() == null) {
            this.hierarchies = new java.util.ArrayList<AssetHierarchy>(hierarchies.length);
        }
        for (AssetHierarchy value : hierarchies) {
            this.hierarchies.add(value);
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
     * @param hierarchies <p>
     *            A list of asset hierarchies that each contain a
     *            <code>hierarchyId</code>. A hierarchy specifies allowed
     *            parent/child asset relationships.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedAssetsSummary withHierarchies(java.util.Collection<AssetHierarchy> hierarchies) {
        setHierarchies(hierarchies);
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAssetModelId() != null)
            sb.append("assetModelId: " + getAssetModelId() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastUpdateDate() != null)
            sb.append("lastUpdateDate: " + getLastUpdateDate() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getHierarchies() != null)
            sb.append("hierarchies: " + getHierarchies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchies() == null) ? 0 : getHierarchies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedAssetsSummary == false)
            return false;
        AssociatedAssetsSummary other = (AssociatedAssetsSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null
                && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null
                && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getHierarchies() == null ^ this.getHierarchies() == null)
            return false;
        if (other.getHierarchies() != null
                && other.getHierarchies().equals(this.getHierarchies()) == false)
            return false;
        return true;
    }
}
