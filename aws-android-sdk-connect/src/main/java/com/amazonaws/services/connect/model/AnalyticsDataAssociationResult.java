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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Information about associations that are successfully created:
 * <code>DataSetId</code>, <code>TargetAccountId</code>,
 * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
 * </p>
 */
public class AnalyticsDataAssociationResult implements Serializable {
    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String dataSetId;

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     */
    private String targetAccountId;

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     */
    private String resourceShareId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The identifier of the dataset.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dataSetId <p>
     *            The identifier of the dataset.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dataSetId <p>
     *            The identifier of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsDataAssociationResult withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     *
     * @return <p>
     *         The identifier of the target account.
     *         </p>
     */
    public String getTargetAccountId() {
        return targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     *
     * @param targetAccountId <p>
     *            The identifier of the target account.
     *            </p>
     */
    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetAccountId <p>
     *            The identifier of the target account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsDataAssociationResult withTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
        return this;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     *
     * @return <p>
     *         The Resource Access Manager share ID.
     *         </p>
     */
    public String getResourceShareId() {
        return resourceShareId;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     *
     * @param resourceShareId <p>
     *            The Resource Access Manager share ID.
     *            </p>
     */
    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareId <p>
     *            The Resource Access Manager share ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsDataAssociationResult withResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Resource Access Manager
     *         share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the Resource Access Manager
     *            share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the Resource Access Manager
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsDataAssociationResult withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
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
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: " + getTargetAccountId() + ",");
        if (getResourceShareId() != null)
            sb.append("ResourceShareId: " + getResourceShareId() + ",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: " + getResourceShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareId() == null) ? 0 : getResourceShareId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsDataAssociationResult == false)
            return false;
        AnalyticsDataAssociationResult other = (AnalyticsDataAssociationResult) obj;

        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null
                && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        if (other.getResourceShareId() == null ^ this.getResourceShareId() == null)
            return false;
        if (other.getResourceShareId() != null
                && other.getResourceShareId().equals(this.getResourceShareId()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        return true;
    }
}
