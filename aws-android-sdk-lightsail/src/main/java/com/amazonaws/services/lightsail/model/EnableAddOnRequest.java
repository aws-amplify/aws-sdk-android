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
 * Enables or modifies an add-on for an Amazon Lightsail resource. For more
 * information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-configuring-automatic-snapshots"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class EnableAddOnRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     */
    private AddOnRequest addOnRequest;

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source resource for which to enable or modify the
     *         add-on.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source resource for which to enable or modify
     *            the add-on.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source resource for which to enable or modify
     *            the add-on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableAddOnRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     *
     * @return <p>
     *         An array of strings representing the add-on to enable or modify.
     *         </p>
     */
    public AddOnRequest getAddOnRequest() {
        return addOnRequest;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     *
     * @param addOnRequest <p>
     *            An array of strings representing the add-on to enable or
     *            modify.
     *            </p>
     */
    public void setAddOnRequest(AddOnRequest addOnRequest) {
        this.addOnRequest = addOnRequest;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOnRequest <p>
     *            An array of strings representing the add-on to enable or
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableAddOnRequest withAddOnRequest(AddOnRequest addOnRequest) {
        this.addOnRequest = addOnRequest;
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
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName() + ",");
        if (getAddOnRequest() != null)
            sb.append("addOnRequest: " + getAddOnRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getAddOnRequest() == null) ? 0 : getAddOnRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAddOnRequest == false)
            return false;
        EnableAddOnRequest other = (EnableAddOnRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getAddOnRequest() == null ^ this.getAddOnRequest() == null)
            return false;
        if (other.getAddOnRequest() != null
                && other.getAddOnRequest().equals(this.getAddOnRequest()) == false)
            return false;
        return true;
    }
}
