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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the information about a production branch for an Amplify app.
 * </p>
 */
public class ProductionBranch implements Serializable {
    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     */
    private java.util.Date lastDeployTime;

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     */
    private String status;

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String thumbnailUrl;

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     *
     * @return <p>
     *         The last deploy time of the production branch.
     *         </p>
     */
    public java.util.Date getLastDeployTime() {
        return lastDeployTime;
    }

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     *
     * @param lastDeployTime <p>
     *            The last deploy time of the production branch.
     *            </p>
     */
    public void setLastDeployTime(java.util.Date lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
    }

    /**
     * <p>
     * The last deploy time of the production branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastDeployTime <p>
     *            The last deploy time of the production branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionBranch withLastDeployTime(java.util.Date lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
        return this;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @return <p>
     *         The status of the production branch.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @param status <p>
     *            The status of the production branch.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the production branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 7<br/>
     *
     * @param status <p>
     *            The status of the production branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionBranch withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The thumbnail URL for the production branch.
     *         </p>
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param thumbnailUrl <p>
     *            The thumbnail URL for the production branch.
     *            </p>
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * <p>
     * The thumbnail URL for the production branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param thumbnailUrl <p>
     *            The thumbnail URL for the production branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionBranch withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The branch name for the production branch.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The branch name for the production branch.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The branch name for the production branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The branch name for the production branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductionBranch withBranchName(String branchName) {
        this.branchName = branchName;
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
        if (getLastDeployTime() != null)
            sb.append("lastDeployTime: " + getLastDeployTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getThumbnailUrl() != null)
            sb.append("thumbnailUrl: " + getThumbnailUrl() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLastDeployTime() == null) ? 0 : getLastDeployTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getThumbnailUrl() == null) ? 0 : getThumbnailUrl().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionBranch == false)
            return false;
        ProductionBranch other = (ProductionBranch) obj;

        if (other.getLastDeployTime() == null ^ this.getLastDeployTime() == null)
            return false;
        if (other.getLastDeployTime() != null
                && other.getLastDeployTime().equals(this.getLastDeployTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getThumbnailUrl() == null ^ this.getThumbnailUrl() == null)
            return false;
        if (other.getThumbnailUrl() != null
                && other.getThumbnailUrl().equals(this.getThumbnailUrl()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }
}
