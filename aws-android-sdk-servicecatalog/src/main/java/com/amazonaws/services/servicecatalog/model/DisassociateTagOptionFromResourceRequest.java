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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates the specified TagOption from the specified resource.
 * </p>
 */
public class DisassociateTagOptionFromResourceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The resource identifier.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String tagOptionId;

    /**
     * <p>
     * The resource identifier.
     * </p>
     *
     * @return <p>
     *         The resource identifier.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     *
     * @param resourceId <p>
     *            The resource identifier.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The resource identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateTagOptionFromResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The TagOption identifier.
     *         </p>
     */
    public String getTagOptionId() {
        return tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param tagOptionId <p>
     *            The TagOption identifier.
     *            </p>
     */
    public void setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param tagOptionId <p>
     *            The TagOption identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateTagOptionFromResourceRequest withTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTagOptionId() != null)
            sb.append("TagOptionId: " + getTagOptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getTagOptionId() == null) ? 0 : getTagOptionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTagOptionFromResourceRequest == false)
            return false;
        DisassociateTagOptionFromResourceRequest other = (DisassociateTagOptionFromResourceRequest) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagOptionId() == null ^ this.getTagOptionId() == null)
            return false;
        if (other.getTagOptionId() != null
                && other.getTagOptionId().equals(this.getTagOptionId()) == false)
            return false;
        return true;
    }
}
