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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables an add-on for an Amazon Lightsail resource. For more information,
 * see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DisableAddOnRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     */
    private String addOnType;

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     *
     * @return <p>
     *         The add-on type to disable.
     *         </p>
     * @see AddOnType
     */
    public String getAddOnType() {
        return addOnType;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     *
     * @param addOnType <p>
     *            The add-on type to disable.
     *            </p>
     * @see AddOnType
     */
    public void setAddOnType(String addOnType) {
        this.addOnType = addOnType;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     *
     * @param addOnType <p>
     *            The add-on type to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddOnType
     */
    public DisableAddOnRequest withAddOnType(String addOnType) {
        this.addOnType = addOnType;
        return this;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     *
     * @param addOnType <p>
     *            The add-on type to disable.
     *            </p>
     * @see AddOnType
     */
    public void setAddOnType(AddOnType addOnType) {
        this.addOnType = addOnType.toString();
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AutoSnapshot
     *
     * @param addOnType <p>
     *            The add-on type to disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AddOnType
     */
    public DisableAddOnRequest withAddOnType(AddOnType addOnType) {
        this.addOnType = addOnType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source resource for which to disable the add-on.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source resource for which to disable the
     *            add-on.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source resource for which to disable the
     *            add-on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableAddOnRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        if (getAddOnType() != null)
            sb.append("addOnType: " + getAddOnType() + ",");
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOnType() == null) ? 0 : getAddOnType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAddOnRequest == false)
            return false;
        DisableAddOnRequest other = (DisableAddOnRequest) obj;

        if (other.getAddOnType() == null ^ this.getAddOnType() == null)
            return false;
        if (other.getAddOnType() != null
                && other.getAddOnType().equals(this.getAddOnType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }
}
