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

/**
 * <p>
 * The information for each resource record set that you want to change.
 * </p>
 */
public class Change implements Serializable {
    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     */
    private String action;

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     */
    private ResourceRecordSet resourceRecordSet;

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     *
     * @return <p>
     *         The action to perform:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE</code>: Creates a resource record set that has the
     *         specified values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE</code>: Deletes a existing resource record set.
     *         </p>
     *         <important>
     *         <p>
     *         To delete the resource record set that is associated with a
     *         traffic policy instance, use <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *         >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     *         resource record set automatically. If you delete the resource
     *         record set by using <code>ChangeResourceRecordSets</code>, Route
     *         53 doesn't automatically delete the traffic policy instance, and
     *         you'll continue to be charged for it even though it's no longer
     *         in use.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <code>UPSERT</code>: If a resource record set doesn't already
     *         exist, Route 53 creates it. If a resource record set does exist,
     *         Route 53 updates it with the values in the request.
     *         </p>
     *         </li>
     *         </ul>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     *
     * @param action <p>
     *            The action to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATE</code>: Creates a resource record set that has
     *            the specified values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code>: Deletes a existing resource record set.
     *            </p>
     *            <important>
     *            <p>
     *            To delete the resource record set that is associated with a
     *            traffic policy instance, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *            >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete
     *            the resource record set automatically. If you delete the
     *            resource record set by using
     *            <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *            automatically delete the traffic policy instance, and you'll
     *            continue to be charged for it even though it's no longer in
     *            use.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            <code>UPSERT</code>: If a resource record set doesn't already
     *            exist, Route 53 creates it. If a resource record set does
     *            exist, Route 53 updates it with the values in the request.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     *
     * @param action <p>
     *            The action to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATE</code>: Creates a resource record set that has
     *            the specified values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code>: Deletes a existing resource record set.
     *            </p>
     *            <important>
     *            <p>
     *            To delete the resource record set that is associated with a
     *            traffic policy instance, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *            >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete
     *            the resource record set automatically. If you delete the
     *            resource record set by using
     *            <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *            automatically delete the traffic policy instance, and you'll
     *            continue to be charged for it even though it's no longer in
     *            use.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            <code>UPSERT</code>: If a resource record set doesn't already
     *            exist, Route 53 creates it. If a resource record set does
     *            exist, Route 53 updates it with the values in the request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public Change withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     *
     * @param action <p>
     *            The action to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATE</code>: Creates a resource record set that has
     *            the specified values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code>: Deletes a existing resource record set.
     *            </p>
     *            <important>
     *            <p>
     *            To delete the resource record set that is associated with a
     *            traffic policy instance, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *            >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete
     *            the resource record set automatically. If you delete the
     *            resource record set by using
     *            <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *            automatically delete the traffic policy instance, and you'll
     *            continue to be charged for it even though it's no longer in
     *            use.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            <code>UPSERT</code>: If a resource record set doesn't already
     *            exist, Route 53 creates it. If a resource record set does
     *            exist, Route 53 updates it with the values in the request.
     *            </p>
     *            </li>
     *            </ul>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes a existing resource record set.
     * </p>
     * <important>
     * <p>
     * To delete the resource record set that is associated with a traffic
     * policy instance, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     * >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete the
     * resource record set automatically. If you delete the resource record set
     * by using <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     * automatically delete the traffic policy instance, and you'll continue to
     * be charged for it even though it's no longer in use.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set doesn't already exist,
     * Route 53 creates it. If a resource record set does exist, Route 53
     * updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE, UPSERT
     *
     * @param action <p>
     *            The action to perform:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATE</code>: Creates a resource record set that has
     *            the specified values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETE</code>: Deletes a existing resource record set.
     *            </p>
     *            <important>
     *            <p>
     *            To delete the resource record set that is associated with a
     *            traffic policy instance, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteTrafficPolicyInstance.html"
     *            >DeleteTrafficPolicyInstance</a>. Amazon Route 53 will delete
     *            the resource record set automatically. If you delete the
     *            resource record set by using
     *            <code>ChangeResourceRecordSets</code>, Route 53 doesn't
     *            automatically delete the traffic policy instance, and you'll
     *            continue to be charged for it even though it's no longer in
     *            use.
     *            </p>
     *            </important></li>
     *            <li>
     *            <p>
     *            <code>UPSERT</code>: If a resource record set doesn't already
     *            exist, Route 53 creates it. If a resource record set does
     *            exist, Route 53 updates it with the values in the request.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public Change withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     *
     * @return <p>
     *         Information about the resource record set to create, delete, or
     *         update.
     *         </p>
     */
    public ResourceRecordSet getResourceRecordSet() {
        return resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     *
     * @param resourceRecordSet <p>
     *            Information about the resource record set to create, delete,
     *            or update.
     *            </p>
     */
    public void setResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create, delete, or update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRecordSet <p>
     *            Information about the resource record set to create, delete,
     *            or update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Change withResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getResourceRecordSet() != null)
            sb.append("ResourceRecordSet: " + getResourceRecordSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getResourceRecordSet() == null) ? 0 : getResourceRecordSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResourceRecordSet() == null ^ this.getResourceRecordSet() == null)
            return false;
        if (other.getResourceRecordSet() != null
                && other.getResourceRecordSet().equals(this.getResourceRecordSet()) == false)
            return false;
        return true;
    }
}
