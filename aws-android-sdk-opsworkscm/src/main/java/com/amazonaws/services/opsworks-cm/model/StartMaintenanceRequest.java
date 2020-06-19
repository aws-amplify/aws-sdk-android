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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the underlying cause of maintenance failure has been resolved. The server is in an <code>UNDER_MAINTENANCE</code> state while maintenance is in progress. </p> <p> Maintenance can only be started on servers in <code>HEALTHY</code> and <code>UNHEALTHY</code> states. Otherwise, an <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. </p>
 */
public class StartMaintenanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the server on which to run maintenance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     */
    private java.util.List<EngineAttribute> engineAttributes;

    /**
     * <p>The name of the server on which to run maintenance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>The name of the server on which to run maintenance. </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>The name of the server on which to run maintenance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The name of the server on which to run maintenance. </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>The name of the server on which to run maintenance. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The name of the server on which to run maintenance. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartMaintenanceRequest withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     *
     * @return <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     */
    public java.util.List<EngineAttribute> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     *
     * @param engineAttributes <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     */
    public void setEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        if (engineAttributes == null) {
            this.engineAttributes = null;
            return;
        }

        this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes);
    }

    /**
     * <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineAttributes <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartMaintenanceRequest withEngineAttributes(EngineAttribute... engineAttributes) {
        if (getEngineAttributes() == null) {
            this.engineAttributes = new java.util.ArrayList<EngineAttribute>(engineAttributes.length);
        }
        for (EngineAttribute value : engineAttributes) {
            this.engineAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineAttributes <p>Engine attributes that are specific to the server on which you want to run maintenance.</p> <p class="title"> <b>Attributes accepted in a StartMaintenance request for Chef</b> </p> <ul> <li> <p> <code>CHEF_MAJOR_UPGRADE</code>: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a <code>StartMaintenance</code> request and set the value to <code>true</code> to upgrade the server to Chef Automate 2. For more information, see <a href="https://docs.aws.amazon.com/opsworks/latest/userguide/opscm-a2upgrade.html">Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2</a>. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartMaintenanceRequest withEngineAttributes(java.util.Collection<EngineAttribute> engineAttributes) {
        setEngineAttributes(engineAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServerName() != null) sb.append("ServerName: " + getServerName() + ",");
        if (getEngineAttributes() != null) sb.append("EngineAttributes: " + getEngineAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getEngineAttributes() == null) ? 0 : getEngineAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartMaintenanceRequest == false) return false;
        StartMaintenanceRequest other = (StartMaintenanceRequest)obj;

        if (other.getServerName() == null ^ this.getServerName() == null) return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false) return false;
        if (other.getEngineAttributes() == null ^ this.getEngineAttributes() == null) return false;
        if (other.getEngineAttributes() != null && other.getEngineAttributes().equals(this.getEngineAttributes()) == false) return false;
        return true;
    }
}
