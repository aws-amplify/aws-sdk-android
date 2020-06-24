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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a get repository triggers operation.
 * </p>
 */
public class GetRepositoryTriggersResult implements Serializable {
    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     */
    private String configurationId;

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     */
    private java.util.List<RepositoryTrigger> triggers;

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     *
     * @return <p>
     *         The system-generated unique ID for the trigger.
     *         </p>
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     *
     * @param configurationId <p>
     *            The system-generated unique ID for the trigger.
     *            </p>
     */
    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationId <p>
     *            The system-generated unique ID for the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRepositoryTriggersResult withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     *
     * @return <p>
     *         The JSON block of configuration information for each trigger.
     *         </p>
     */
    public java.util.List<RepositoryTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     *
     * @param triggers <p>
     *            The JSON block of configuration information for each trigger.
     *            </p>
     */
    public void setTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers);
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The JSON block of configuration information for each trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRepositoryTriggersResult withTriggers(RepositoryTrigger... triggers) {
        if (getTriggers() == null) {
            this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers.length);
        }
        for (RepositoryTrigger value : triggers) {
            this.triggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            The JSON block of configuration information for each trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRepositoryTriggersResult withTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        setTriggers(triggers);
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
        if (getConfigurationId() != null)
            sb.append("configurationId: " + getConfigurationId() + ",");
        if (getTriggers() != null)
            sb.append("triggers: " + getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryTriggersResult == false)
            return false;
        GetRepositoryTriggersResult other = (GetRepositoryTriggersResult) obj;

        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null
                && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }
}
