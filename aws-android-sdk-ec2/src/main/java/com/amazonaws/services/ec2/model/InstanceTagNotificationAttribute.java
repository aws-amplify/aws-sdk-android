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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the registered tag keys for the current Region.
 * </p>
 */
public class InstanceTagNotificationAttribute implements Serializable {
    /**
     * <p>
     * The registered tag keys.
     * </p>
     */
    private java.util.List<String> instanceTagKeys;

    /**
     * <p>
     * Indicates wheter all tag keys in the current Region are registered to
     * appear in scheduled event notifications. <code>true</code> indicates that
     * all tag keys in the current Region are registered.
     * </p>
     */
    private Boolean includeAllTagsOfInstance;

    /**
     * <p>
     * The registered tag keys.
     * </p>
     *
     * @return <p>
     *         The registered tag keys.
     *         </p>
     */
    public java.util.List<String> getInstanceTagKeys() {
        return instanceTagKeys;
    }

    /**
     * <p>
     * The registered tag keys.
     * </p>
     *
     * @param instanceTagKeys <p>
     *            The registered tag keys.
     *            </p>
     */
    public void setInstanceTagKeys(java.util.Collection<String> instanceTagKeys) {
        if (instanceTagKeys == null) {
            this.instanceTagKeys = null;
            return;
        }

        this.instanceTagKeys = new java.util.ArrayList<String>(instanceTagKeys);
    }

    /**
     * <p>
     * The registered tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTagKeys <p>
     *            The registered tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTagNotificationAttribute withInstanceTagKeys(String... instanceTagKeys) {
        if (getInstanceTagKeys() == null) {
            this.instanceTagKeys = new java.util.ArrayList<String>(instanceTagKeys.length);
        }
        for (String value : instanceTagKeys) {
            this.instanceTagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The registered tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTagKeys <p>
     *            The registered tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTagNotificationAttribute withInstanceTagKeys(
            java.util.Collection<String> instanceTagKeys) {
        setInstanceTagKeys(instanceTagKeys);
        return this;
    }

    /**
     * <p>
     * Indicates wheter all tag keys in the current Region are registered to
     * appear in scheduled event notifications. <code>true</code> indicates that
     * all tag keys in the current Region are registered.
     * </p>
     *
     * @return <p>
     *         Indicates wheter all tag keys in the current Region are
     *         registered to appear in scheduled event notifications.
     *         <code>true</code> indicates that all tag keys in the current
     *         Region are registered.
     *         </p>
     */
    public Boolean isIncludeAllTagsOfInstance() {
        return includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates wheter all tag keys in the current Region are registered to
     * appear in scheduled event notifications. <code>true</code> indicates that
     * all tag keys in the current Region are registered.
     * </p>
     *
     * @return <p>
     *         Indicates wheter all tag keys in the current Region are
     *         registered to appear in scheduled event notifications.
     *         <code>true</code> indicates that all tag keys in the current
     *         Region are registered.
     *         </p>
     */
    public Boolean getIncludeAllTagsOfInstance() {
        return includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates wheter all tag keys in the current Region are registered to
     * appear in scheduled event notifications. <code>true</code> indicates that
     * all tag keys in the current Region are registered.
     * </p>
     *
     * @param includeAllTagsOfInstance <p>
     *            Indicates wheter all tag keys in the current Region are
     *            registered to appear in scheduled event notifications.
     *            <code>true</code> indicates that all tag keys in the current
     *            Region are registered.
     *            </p>
     */
    public void setIncludeAllTagsOfInstance(Boolean includeAllTagsOfInstance) {
        this.includeAllTagsOfInstance = includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates wheter all tag keys in the current Region are registered to
     * appear in scheduled event notifications. <code>true</code> indicates that
     * all tag keys in the current Region are registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAllTagsOfInstance <p>
     *            Indicates wheter all tag keys in the current Region are
     *            registered to appear in scheduled event notifications.
     *            <code>true</code> indicates that all tag keys in the current
     *            Region are registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceTagNotificationAttribute withIncludeAllTagsOfInstance(
            Boolean includeAllTagsOfInstance) {
        this.includeAllTagsOfInstance = includeAllTagsOfInstance;
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
        if (getInstanceTagKeys() != null)
            sb.append("InstanceTagKeys: " + getInstanceTagKeys() + ",");
        if (getIncludeAllTagsOfInstance() != null)
            sb.append("IncludeAllTagsOfInstance: " + getIncludeAllTagsOfInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceTagKeys() == null) ? 0 : getInstanceTagKeys().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeAllTagsOfInstance() == null) ? 0 : getIncludeAllTagsOfInstance()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTagNotificationAttribute == false)
            return false;
        InstanceTagNotificationAttribute other = (InstanceTagNotificationAttribute) obj;

        if (other.getInstanceTagKeys() == null ^ this.getInstanceTagKeys() == null)
            return false;
        if (other.getInstanceTagKeys() != null
                && other.getInstanceTagKeys().equals(this.getInstanceTagKeys()) == false)
            return false;
        if (other.getIncludeAllTagsOfInstance() == null
                ^ this.getIncludeAllTagsOfInstance() == null)
            return false;
        if (other.getIncludeAllTagsOfInstance() != null
                && other.getIncludeAllTagsOfInstance().equals(this.getIncludeAllTagsOfInstance()) == false)
            return false;
        return true;
    }
}
