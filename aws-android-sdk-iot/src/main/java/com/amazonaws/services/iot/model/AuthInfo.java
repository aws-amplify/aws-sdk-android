/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A collection of authorization information.
 * </p>
 */
public class AuthInfo implements Serializable {
    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     */
    private String actionType;

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the
     * specified action.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     *
     * @return <p>
     *         The type of action for which the principal is being authorized.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     *
     * @param actionType <p>
     *            The type of action for which the principal is being
     *            authorized.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     *
     * @param actionType <p>
     *            The type of action for which the principal is being
     *            authorized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public AuthInfo withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     *
     * @param actionType <p>
     *            The type of action for which the principal is being
     *            authorized.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of action for which the principal is being authorized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, SUBSCRIBE, RECEIVE, CONNECT
     *
     * @param actionType <p>
     *            The type of action for which the principal is being
     *            authorized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public AuthInfo withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the
     * specified action.
     * </p>
     *
     * @return <p>
     *         The resources for which the principal is being authorized to
     *         perform the specified action.
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the
     * specified action.
     * </p>
     *
     * @param resources <p>
     *            The resources for which the principal is being authorized to
     *            perform the specified action.
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the
     * specified action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The resources for which the principal is being authorized to
     *            perform the specified action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthInfo withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resources for which the principal is being authorized to perform the
     * specified action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The resources for which the principal is being authorized to
     *            perform the specified action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthInfo withResources(java.util.Collection<String> resources) {
        setResources(resources);
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
        if (getActionType() != null)
            sb.append("actionType: " + getActionType() + ",");
        if (getResources() != null)
            sb.append("resources: " + getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthInfo == false)
            return false;
        AuthInfo other = (AuthInfo) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }
}
