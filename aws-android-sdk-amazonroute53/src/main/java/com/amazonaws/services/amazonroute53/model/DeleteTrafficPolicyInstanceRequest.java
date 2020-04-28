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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a traffic policy instance and all of the resource record sets that
 * Amazon Route 53 created when you created the instance.
 * </p>
 * <note>
 * <p>
 * In the Route 53 console, traffic policy instances are known as policy
 * records.
 * </p>
 * </note>
 */
public class DeleteTrafficPolicyInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the traffic policy instance that you want to delete.
     * </p>
     * <important>
     * <p>
     * When you delete a traffic policy instance, Amazon Route 53 also deletes
     * all of the resource record sets that were created when you created the
     * traffic policy instance.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String id;

    /**
     * <p>
     * The ID of the traffic policy instance that you want to delete.
     * </p>
     * <important>
     * <p>
     * When you delete a traffic policy instance, Amazon Route 53 also deletes
     * all of the resource record sets that were created when you created the
     * traffic policy instance.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The ID of the traffic policy instance that you want to delete.
     *         </p>
     *         <important>
     *         <p>
     *         When you delete a traffic policy instance, Amazon Route 53 also
     *         deletes all of the resource record sets that were created when
     *         you created the traffic policy instance.
     *         </p>
     *         </important>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to delete.
     * </p>
     * <important>
     * <p>
     * When you delete a traffic policy instance, Amazon Route 53 also deletes
     * all of the resource record sets that were created when you created the
     * traffic policy instance.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy instance that you want to delete.
     *            </p>
     *            <important>
     *            <p>
     *            When you delete a traffic policy instance, Amazon Route 53
     *            also deletes all of the resource record sets that were created
     *            when you created the traffic policy instance.
     *            </p>
     *            </important>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to delete.
     * </p>
     * <important>
     * <p>
     * When you delete a traffic policy instance, Amazon Route 53 also deletes
     * all of the resource record sets that were created when you created the
     * traffic policy instance.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param id <p>
     *            The ID of the traffic policy instance that you want to delete.
     *            </p>
     *            <important>
     *            <p>
     *            When you delete a traffic policy instance, Amazon Route 53
     *            also deletes all of the resource record sets that were created
     *            when you created the traffic policy instance.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTrafficPolicyInstanceRequest withId(String id) {
        this.id = id;
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
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrafficPolicyInstanceRequest == false)
            return false;
        DeleteTrafficPolicyInstanceRequest other = (DeleteTrafficPolicyInstanceRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
