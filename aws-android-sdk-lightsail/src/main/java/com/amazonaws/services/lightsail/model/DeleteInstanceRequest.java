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
 * Deletes an Amazon Lightsail instance.
 * </p>
 * <p>
 * The <code>delete instance</code> operation supports tag-based access control
 * via resource tags applied to the resource identified by
 * <code>instance name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the
     * disk.
     * </p>
     */
    private Boolean forceDeleteAddOns;

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance to delete.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance to delete.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInstanceRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the
     * disk.
     * </p>
     *
     * @return <p>
     *         A Boolean value to indicate whether to delete the enabled add-ons
     *         for the disk.
     *         </p>
     */
    public Boolean isForceDeleteAddOns() {
        return forceDeleteAddOns;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the
     * disk.
     * </p>
     *
     * @return <p>
     *         A Boolean value to indicate whether to delete the enabled add-ons
     *         for the disk.
     *         </p>
     */
    public Boolean getForceDeleteAddOns() {
        return forceDeleteAddOns;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the
     * disk.
     * </p>
     *
     * @param forceDeleteAddOns <p>
     *            A Boolean value to indicate whether to delete the enabled
     *            add-ons for the disk.
     *            </p>
     */
    public void setForceDeleteAddOns(Boolean forceDeleteAddOns) {
        this.forceDeleteAddOns = forceDeleteAddOns;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to delete the enabled add-ons for the
     * disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDeleteAddOns <p>
     *            A Boolean value to indicate whether to delete the enabled
     *            add-ons for the disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteInstanceRequest withForceDeleteAddOns(Boolean forceDeleteAddOns) {
        this.forceDeleteAddOns = forceDeleteAddOns;
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getForceDeleteAddOns() != null)
            sb.append("forceDeleteAddOns: " + getForceDeleteAddOns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode
                + ((getForceDeleteAddOns() == null) ? 0 : getForceDeleteAddOns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceRequest == false)
            return false;
        DeleteInstanceRequest other = (DeleteInstanceRequest) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getForceDeleteAddOns() == null ^ this.getForceDeleteAddOns() == null)
            return false;
        if (other.getForceDeleteAddOns() != null
                && other.getForceDeleteAddOns().equals(this.getForceDeleteAddOns()) == false)
            return false;
        return true;
    }
}
