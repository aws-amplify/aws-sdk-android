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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Recommendations to rightsize resources.
 * </p>
 */
public class RightsizingRecommendation implements Serializable {
    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String accountId;

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     */
    private CurrentInstance currentInstance;

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     */
    private String rightsizingType;

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     */
    private ModifyRecommendationDetail modifyRecommendationDetail;

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     */
    private TerminateRecommendationDetail terminateRecommendationDetail;

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The account that this recommendation is for.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account that this recommendation is for.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account that this recommendation is for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendation withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     *
     * @return <p>
     *         Context regarding the current instance.
     *         </p>
     */
    public CurrentInstance getCurrentInstance() {
        return currentInstance;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     *
     * @param currentInstance <p>
     *            Context regarding the current instance.
     *            </p>
     */
    public void setCurrentInstance(CurrentInstance currentInstance) {
        this.currentInstance = currentInstance;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentInstance <p>
     *            Context regarding the current instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendation withCurrentInstance(CurrentInstance currentInstance) {
        this.currentInstance = currentInstance;
        return this;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     *
     * @return <p>
     *         Recommendation to either terminate or modify the resource.
     *         </p>
     * @see RightsizingType
     */
    public String getRightsizingType() {
        return rightsizingType;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     *
     * @param rightsizingType <p>
     *            Recommendation to either terminate or modify the resource.
     *            </p>
     * @see RightsizingType
     */
    public void setRightsizingType(String rightsizingType) {
        this.rightsizingType = rightsizingType;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     *
     * @param rightsizingType <p>
     *            Recommendation to either terminate or modify the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RightsizingType
     */
    public RightsizingRecommendation withRightsizingType(String rightsizingType) {
        this.rightsizingType = rightsizingType;
        return this;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     *
     * @param rightsizingType <p>
     *            Recommendation to either terminate or modify the resource.
     *            </p>
     * @see RightsizingType
     */
    public void setRightsizingType(RightsizingType rightsizingType) {
        this.rightsizingType = rightsizingType.toString();
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, MODIFY
     *
     * @param rightsizingType <p>
     *            Recommendation to either terminate or modify the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RightsizingType
     */
    public RightsizingRecommendation withRightsizingType(RightsizingType rightsizingType) {
        this.rightsizingType = rightsizingType.toString();
        return this;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     *
     * @return <p>
     *         Details for modification recommendations.
     *         </p>
     */
    public ModifyRecommendationDetail getModifyRecommendationDetail() {
        return modifyRecommendationDetail;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     *
     * @param modifyRecommendationDetail <p>
     *            Details for modification recommendations.
     *            </p>
     */
    public void setModifyRecommendationDetail(ModifyRecommendationDetail modifyRecommendationDetail) {
        this.modifyRecommendationDetail = modifyRecommendationDetail;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modifyRecommendationDetail <p>
     *            Details for modification recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendation withModifyRecommendationDetail(
            ModifyRecommendationDetail modifyRecommendationDetail) {
        this.modifyRecommendationDetail = modifyRecommendationDetail;
        return this;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     *
     * @return <p>
     *         Details for termination recommendations.
     *         </p>
     */
    public TerminateRecommendationDetail getTerminateRecommendationDetail() {
        return terminateRecommendationDetail;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     *
     * @param terminateRecommendationDetail <p>
     *            Details for termination recommendations.
     *            </p>
     */
    public void setTerminateRecommendationDetail(
            TerminateRecommendationDetail terminateRecommendationDetail) {
        this.terminateRecommendationDetail = terminateRecommendationDetail;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateRecommendationDetail <p>
     *            Details for termination recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendation withTerminateRecommendationDetail(
            TerminateRecommendationDetail terminateRecommendationDetail) {
        this.terminateRecommendationDetail = terminateRecommendationDetail;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getCurrentInstance() != null)
            sb.append("CurrentInstance: " + getCurrentInstance() + ",");
        if (getRightsizingType() != null)
            sb.append("RightsizingType: " + getRightsizingType() + ",");
        if (getModifyRecommendationDetail() != null)
            sb.append("ModifyRecommendationDetail: " + getModifyRecommendationDetail() + ",");
        if (getTerminateRecommendationDetail() != null)
            sb.append("TerminateRecommendationDetail: " + getTerminateRecommendationDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentInstance() == null) ? 0 : getCurrentInstance().hashCode());
        hashCode = prime * hashCode
                + ((getRightsizingType() == null) ? 0 : getRightsizingType().hashCode());
        hashCode = prime
                * hashCode
                + ((getModifyRecommendationDetail() == null) ? 0 : getModifyRecommendationDetail()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminateRecommendationDetail() == null) ? 0
                        : getTerminateRecommendationDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendation == false)
            return false;
        RightsizingRecommendation other = (RightsizingRecommendation) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentInstance() == null ^ this.getCurrentInstance() == null)
            return false;
        if (other.getCurrentInstance() != null
                && other.getCurrentInstance().equals(this.getCurrentInstance()) == false)
            return false;
        if (other.getRightsizingType() == null ^ this.getRightsizingType() == null)
            return false;
        if (other.getRightsizingType() != null
                && other.getRightsizingType().equals(this.getRightsizingType()) == false)
            return false;
        if (other.getModifyRecommendationDetail() == null
                ^ this.getModifyRecommendationDetail() == null)
            return false;
        if (other.getModifyRecommendationDetail() != null
                && other.getModifyRecommendationDetail().equals(
                        this.getModifyRecommendationDetail()) == false)
            return false;
        if (other.getTerminateRecommendationDetail() == null
                ^ this.getTerminateRecommendationDetail() == null)
            return false;
        if (other.getTerminateRecommendationDetail() != null
                && other.getTerminateRecommendationDetail().equals(
                        this.getTerminateRecommendationDetail()) == false)
            return false;
        return true;
    }
}
