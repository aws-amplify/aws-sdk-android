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
 * Information about the tag keys to deregister for the current Region. You can
 * either specify individual tag keys or deregister all tag keys in the current
 * Region. You must specify either <code>IncludeAllTagsOfInstance</code> or
 * <code>InstanceTagKeys</code> in the request
 * </p>
 */
public class DeregisterInstanceTagAttributeRequest implements Serializable {
    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region.
     * Specify <code>false</code> to deregister all tag keys.
     * </p>
     */
    private Boolean includeAllTagsOfInstance;

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     */
    private java.util.List<String> instanceTagKeys;

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region.
     * Specify <code>false</code> to deregister all tag keys.
     * </p>
     *
     * @return <p>
     *         Indicates whether to deregister all tag keys in the current
     *         Region. Specify <code>false</code> to deregister all tag keys.
     *         </p>
     */
    public Boolean isIncludeAllTagsOfInstance() {
        return includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region.
     * Specify <code>false</code> to deregister all tag keys.
     * </p>
     *
     * @return <p>
     *         Indicates whether to deregister all tag keys in the current
     *         Region. Specify <code>false</code> to deregister all tag keys.
     *         </p>
     */
    public Boolean getIncludeAllTagsOfInstance() {
        return includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region.
     * Specify <code>false</code> to deregister all tag keys.
     * </p>
     *
     * @param includeAllTagsOfInstance <p>
     *            Indicates whether to deregister all tag keys in the current
     *            Region. Specify <code>false</code> to deregister all tag keys.
     *            </p>
     */
    public void setIncludeAllTagsOfInstance(Boolean includeAllTagsOfInstance) {
        this.includeAllTagsOfInstance = includeAllTagsOfInstance;
    }

    /**
     * <p>
     * Indicates whether to deregister all tag keys in the current Region.
     * Specify <code>false</code> to deregister all tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAllTagsOfInstance <p>
     *            Indicates whether to deregister all tag keys in the current
     *            Region. Specify <code>false</code> to deregister all tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceTagAttributeRequest withIncludeAllTagsOfInstance(
            Boolean includeAllTagsOfInstance) {
        this.includeAllTagsOfInstance = includeAllTagsOfInstance;
        return this;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     *
     * @return <p>
     *         Information about the tag keys to deregister.
     *         </p>
     */
    public java.util.List<String> getInstanceTagKeys() {
        return instanceTagKeys;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     *
     * @param instanceTagKeys <p>
     *            Information about the tag keys to deregister.
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
     * Information about the tag keys to deregister.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTagKeys <p>
     *            Information about the tag keys to deregister.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceTagAttributeRequest withInstanceTagKeys(String... instanceTagKeys) {
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
     * Information about the tag keys to deregister.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTagKeys <p>
     *            Information about the tag keys to deregister.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceTagAttributeRequest withInstanceTagKeys(
            java.util.Collection<String> instanceTagKeys) {
        setInstanceTagKeys(instanceTagKeys);
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
        if (getIncludeAllTagsOfInstance() != null)
            sb.append("IncludeAllTagsOfInstance: " + getIncludeAllTagsOfInstance() + ",");
        if (getInstanceTagKeys() != null)
            sb.append("InstanceTagKeys: " + getInstanceTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIncludeAllTagsOfInstance() == null) ? 0 : getIncludeAllTagsOfInstance()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTagKeys() == null) ? 0 : getInstanceTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstanceTagAttributeRequest == false)
            return false;
        DeregisterInstanceTagAttributeRequest other = (DeregisterInstanceTagAttributeRequest) obj;

        if (other.getIncludeAllTagsOfInstance() == null
                ^ this.getIncludeAllTagsOfInstance() == null)
            return false;
        if (other.getIncludeAllTagsOfInstance() != null
                && other.getIncludeAllTagsOfInstance().equals(this.getIncludeAllTagsOfInstance()) == false)
            return false;
        if (other.getInstanceTagKeys() == null ^ this.getInstanceTagKeys() == null)
            return false;
        if (other.getInstanceTagKeys() != null
                && other.getInstanceTagKeys().equals(this.getInstanceTagKeys()) == false)
            return false;
        return true;
    }
}
