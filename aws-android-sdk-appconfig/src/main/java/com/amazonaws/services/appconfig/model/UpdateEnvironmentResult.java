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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

public class UpdateEnvironmentResult implements Serializable {
    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     */
    private String state;

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     */
    private java.util.List<Monitor> monitors;

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The application ID.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The environment ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The environment ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The environment ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the environment.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the environment.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The description of the environment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the environment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The description of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     *
     * @return <p>
     *         The state of the environment. An environment can be in one of the
     *         following states: <code>READY_FOR_DEPLOYMENT</code>,
     *         <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *         <code>ROLLED_BACK</code>
     *         </p>
     * @see EnvironmentState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     *
     * @param state <p>
     *            The state of the environment. An environment can be in one of
     *            the following states: <code>READY_FOR_DEPLOYMENT</code>,
     *            <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *            <code>ROLLED_BACK</code>
     *            </p>
     * @see EnvironmentState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     *
     * @param state <p>
     *            The state of the environment. An environment can be in one of
     *            the following states: <code>READY_FOR_DEPLOYMENT</code>,
     *            <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *            <code>ROLLED_BACK</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentState
     */
    public UpdateEnvironmentResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     *
     * @param state <p>
     *            The state of the environment. An environment can be in one of
     *            the following states: <code>READY_FOR_DEPLOYMENT</code>,
     *            <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *            <code>ROLLED_BACK</code>
     *            </p>
     * @see EnvironmentState
     */
    public void setState(EnvironmentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the
     * following states: <code>READY_FOR_DEPLOYMENT</code>,
     * <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     * <code>ROLLED_BACK</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK,
     * ROLLED_BACK
     *
     * @param state <p>
     *            The state of the environment. An environment can be in one of
     *            the following states: <code>READY_FOR_DEPLOYMENT</code>,
     *            <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *            <code>ROLLED_BACK</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentState
     */
    public UpdateEnvironmentResult withState(EnvironmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     *
     * @return <p>
     *         Amazon CloudWatch alarms monitored during the deployment.
     *         </p>
     */
    public java.util.List<Monitor> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms monitored during the deployment.
     *            </p>
     */
    public void setMonitors(java.util.Collection<Monitor> monitors) {
        if (monitors == null) {
            this.monitors = null;
            return;
        }

        this.monitors = new java.util.ArrayList<Monitor>(monitors);
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms monitored during the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withMonitors(Monitor... monitors) {
        if (getMonitors() == null) {
            this.monitors = new java.util.ArrayList<Monitor>(monitors.length);
        }
        for (Monitor value : monitors) {
            this.monitors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms monitored during the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEnvironmentResult withMonitors(java.util.Collection<Monitor> monitors) {
        setMonitors(monitors);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getMonitors() != null)
            sb.append("Monitors: " + getMonitors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMonitors() == null) ? 0 : getMonitors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentResult == false)
            return false;
        UpdateEnvironmentResult other = (UpdateEnvironmentResult) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMonitors() == null ^ this.getMonitors() == null)
            return false;
        if (other.getMonitors() != null && other.getMonitors().equals(this.getMonitors()) == false)
            return false;
        return true;
    }
}
