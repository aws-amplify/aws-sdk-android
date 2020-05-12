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

public class CreateAssetResult implements Serializable {
    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT
     * SiteWise and can be used with other AWS IoT SiteWise APIs.
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
     * The status of the asset, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     */
    private AssetStatus assetStatus;

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT
     * SiteWise and can be used with other AWS IoT SiteWise APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset. This ID uniquely identifies the asset within
     *         AWS IoT SiteWise and can be used with other AWS IoT SiteWise
     *         APIs.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT
     * SiteWise and can be used with other AWS IoT SiteWise APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset. This ID uniquely identifies the asset
     *            within AWS IoT SiteWise and can be used with other AWS IoT
     *            SiteWise APIs.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset. This ID uniquely identifies the asset within AWS IoT
     * SiteWise and can be used with other AWS IoT SiteWise APIs.
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
     *            The ID of the asset. This ID uniquely identifies the asset
     *            within AWS IoT SiteWise and can be used with other AWS IoT
     *            SiteWise APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssetResult withAssetId(String assetId) {
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
    public CreateAssetResult withAssetArn(String assetArn) {
        this.assetArn = assetArn;
        return this;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @return <p>
     *         The status of the asset, which contains a state (
     *         <code>CREATING</code> after successfully calling this action) and
     *         any error message.
     *         </p>
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     *
     * @param assetStatus <p>
     *            The status of the asset, which contains a state (
     *            <code>CREATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     */
    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * <p>
     * The status of the asset, which contains a state (<code>CREATING</code>
     * after successfully calling this action) and any error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetStatus <p>
     *            The status of the asset, which contains a state (
     *            <code>CREATING</code> after successfully calling this action)
     *            and any error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssetResult withAssetStatus(AssetStatus assetStatus) {
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

        if (obj instanceof CreateAssetResult == false)
            return false;
        CreateAssetResult other = (CreateAssetResult) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetArn() == null ^ this.getAssetArn() == null)
            return false;
        if (other.getAssetArn() != null && other.getAssetArn().equals(this.getAssetArn()) == false)
            return false;
        if (other.getAssetStatus() == null ^ this.getAssetStatus() == null)
            return false;
        if (other.getAssetStatus() != null
                && other.getAssetStatus().equals(this.getAssetStatus()) == false)
            return false;
        return true;
    }
}
