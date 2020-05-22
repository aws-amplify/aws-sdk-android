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
 * Contains a summary of an asset model.
 * </p>
 */
public class AssetModelSummary implements Serializable {
    /**
     * <p>
     * The ID of the asset model (used with AWS IoT SiteWise APIs).
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
    private String arn;

    /**
     * <p>
     * The name of the asset model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String name;

    /**
     * <p>
     * The asset model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String description;

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     */
    private AssetModelStatus status;

    /**
     * <p>
     * The ID of the asset model (used with AWS IoT SiteWise APIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model (used with AWS IoT SiteWise APIs).
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the asset model (used with AWS IoT SiteWise APIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the asset model (used with AWS IoT SiteWise APIs).
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset model (used with AWS IoT SiteWise APIs).
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
     *            The ID of the asset model (used with AWS IoT SiteWise APIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withId(String id) {
        this.id = id;
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
    public String getArn() {
        return arn;
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
     * @param arn <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >ARN</a> of the asset model, which has the following format.
     *            </p>
     *            <p>
     *            <code>arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId}</code>
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
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
     * @param arn <p>
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
    public AssetModelSummary withArn(String arn) {
        this.arn = arn;
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
    public String getName() {
        return name;
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
     * @param name <p>
     *            The name of the asset model.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            The name of the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The asset model description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param description <p>
     *            The asset model description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The asset model description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param description <p>
     *            The asset model description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withDescription(String description) {
        this.description = description;
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
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     *
     * @param creationDate <p>
     *            The date the asset model was created, in Unix epoch time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the asset model was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the asset model was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     *
     * @param lastUpdateDate <p>
     *            The date the asset model was last updated, in Unix epoch time.
     *            </p>
     */
    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the asset model was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDate <p>
     *            The date the asset model was last updated, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     *
     * @return <p>
     *         The current status of the asset model.
     *         </p>
     */
    public AssetModelStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     *
     * @param status <p>
     *            The current status of the asset model.
     *            </p>
     */
    public void setStatus(AssetModelStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the asset model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the asset model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetModelSummary withStatus(AssetModelStatus status) {
        this.status = status;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastUpdateDate() != null)
            sb.append("lastUpdateDate: " + getLastUpdateDate() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetModelSummary == false)
            return false;
        AssetModelSummary other = (AssetModelSummary) obj;

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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }
}
