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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For each application, you define one or more environments. An environment is
 * a logical deployment group of AppConfig targets, such as applications in a
 * <code>Beta</code> or <code>Production</code> environment. You can also define
 * environments for application subcomponents such as the <code>Web</code>,
 * <code>Mobile</code> and <code>Back-end</code> components for your
 * application. You can configure Amazon CloudWatch alarms for each environment.
 * The system monitors alarms during a configuration deployment. If an alarm is
 * triggered, the system rolls back the configuration.
 * </p>
 */
public class CreateEnvironmentRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A name for the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     */
    private java.util.List<Monitor> monitors;

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize
     * your AppConfig resources. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreateEnvironmentRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A name for the environment.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A name for the environment.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A name for the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A description of the environment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the environment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     *
     * @return <p>
     *         Amazon CloudWatch alarms to monitor during the deployment
     *         process.
     *         </p>
     */
    public java.util.List<Monitor> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms to monitor during the deployment
     *            process.
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
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms to monitor during the deployment
     *            process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withMonitors(Monitor... monitors) {
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
     * Amazon CloudWatch alarms to monitor during the deployment process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitors <p>
     *            Amazon CloudWatch alarms to monitor during the deployment
     *            process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withMonitors(java.util.Collection<Monitor> monitors) {
        setMonitors(monitors);
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize
     * your AppConfig resources. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @return <p>
     *         Metadata to assign to the environment. Tags help organize and
     *         categorize your AppConfig resources. Each tag consists of a key
     *         and an optional value, both of which you define.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize
     * your AppConfig resources. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @param tags <p>
     *            Metadata to assign to the environment. Tags help organize and
     *            categorize your AppConfig resources. Each tag consists of a
     *            key and an optional value, both of which you define.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize
     * your AppConfig resources. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata to assign to the environment. Tags help organize and
     *            categorize your AppConfig resources. Each tag consists of a
     *            key and an optional value, both of which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the environment. Tags help organize and categorize
     * your AppConfig resources. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateEnvironmentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMonitors() != null)
            sb.append("Monitors: " + getMonitors() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMonitors() == null) ? 0 : getMonitors().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
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
        if (other.getMonitors() == null ^ this.getMonitors() == null)
            return false;
        if (other.getMonitors() != null && other.getMonitors().equals(this.getMonitors()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
