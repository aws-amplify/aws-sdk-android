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
 * Details about the Amazon Redshift instances that AWS recommends that you
 * purchase.
 * </p>
 */
public class RedshiftInstanceDetails implements Serializable {
    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String family;

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nodeType;

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String region;

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     */
    private Boolean currentGeneration;

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     */
    private Boolean sizeFlexEligible;

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The instance family of the recommended reservation.
     *         </p>
     */
    public String getFamily() {
        return family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param family <p>
     *            The instance family of the recommended reservation.
     *            </p>
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The instance family of the recommended reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param family <p>
     *            The instance family of the recommended reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftInstanceDetails withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The type of node that AWS recommends.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nodeType <p>
     *            The type of node that AWS recommends.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The type of node that AWS recommends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nodeType <p>
     *            The type of node that AWS recommends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftInstanceDetails withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The AWS Region of the recommended reservation.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param region <p>
     *            The AWS Region of the recommended reservation.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region of the recommended reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param region <p>
     *            The AWS Region of the recommended reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftInstanceDetails withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     *
     * @return <p>
     *         Whether the recommendation is for a current-generation instance.
     *         </p>
     */
    public Boolean isCurrentGeneration() {
        return currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     *
     * @return <p>
     *         Whether the recommendation is for a current-generation instance.
     *         </p>
     */
    public Boolean getCurrentGeneration() {
        return currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     *
     * @param currentGeneration <p>
     *            Whether the recommendation is for a current-generation
     *            instance.
     *            </p>
     */
    public void setCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Whether the recommendation is for a current-generation instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentGeneration <p>
     *            Whether the recommendation is for a current-generation
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftInstanceDetails withCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
        return this;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     *
     * @return <p>
     *         Whether the recommended reservation is size flexible.
     *         </p>
     */
    public Boolean isSizeFlexEligible() {
        return sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     *
     * @return <p>
     *         Whether the recommended reservation is size flexible.
     *         </p>
     */
    public Boolean getSizeFlexEligible() {
        return sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     *
     * @param sizeFlexEligible <p>
     *            Whether the recommended reservation is size flexible.
     *            </p>
     */
    public void setSizeFlexEligible(Boolean sizeFlexEligible) {
        this.sizeFlexEligible = sizeFlexEligible;
    }

    /**
     * <p>
     * Whether the recommended reservation is size flexible.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeFlexEligible <p>
     *            Whether the recommended reservation is size flexible.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedshiftInstanceDetails withSizeFlexEligible(Boolean sizeFlexEligible) {
        this.sizeFlexEligible = sizeFlexEligible;
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
        if (getFamily() != null)
            sb.append("Family: " + getFamily() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: " + getCurrentGeneration() + ",");
        if (getSizeFlexEligible() != null)
            sb.append("SizeFlexEligible: " + getSizeFlexEligible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode
                + ((getSizeFlexEligible() == null) ? 0 : getSizeFlexEligible().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftInstanceDetails == false)
            return false;
        RedshiftInstanceDetails other = (RedshiftInstanceDetails) obj;

        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null
                && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getSizeFlexEligible() == null ^ this.getSizeFlexEligible() == null)
            return false;
        if (other.getSizeFlexEligible() != null
                && other.getSizeFlexEligible().equals(this.getSizeFlexEligible()) == false)
            return false;
        return true;
    }
}
