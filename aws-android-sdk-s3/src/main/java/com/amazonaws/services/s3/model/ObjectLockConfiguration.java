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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * The container element for Object Lock configuration parameters.
 * </p>
 */
public class ObjectLockConfiguration implements Serializable {
    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     */
    private String objectLockEnabled;

    /**
     * <p>
     * The Object Lock rule in place for the specified object.
     * </p>
     */
    private ObjectLockRule rule;

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     *
     * @return <p>
     *         Indicates whether this bucket has an Object Lock configuration
     *         enabled.
     *         </p>
     * @see ObjectLockEnabled
     */
    public String getObjectLockEnabled() {
        return objectLockEnabled;
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     *
     * @param objectLockEnabled <p>
     *            Indicates whether this bucket has an Object Lock configuration
     *            enabled.
     *            </p>
     * @see ObjectLockEnabled
     */
    public void setObjectLockEnabled(String objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     *
     * @param objectLockEnabled <p>
     *            Indicates whether this bucket has an Object Lock configuration
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockEnabled
     */
    public ObjectLockConfiguration withObjectLockEnabled(String objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
        return this;
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     *
     * @param objectLockEnabled <p>
     *            Indicates whether this bucket has an Object Lock configuration
     *            enabled.
     *            </p>
     * @see ObjectLockEnabled
     */
    public void setObjectLockEnabled(ObjectLockEnabled objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled.toString();
    }

    /**
     * <p>
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled
     *
     * @param objectLockEnabled <p>
     *            Indicates whether this bucket has an Object Lock configuration
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockEnabled
     */
    public ObjectLockConfiguration withObjectLockEnabled(ObjectLockEnabled objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled.toString();
        return this;
    }

    /**
     * <p>
     * The Object Lock rule in place for the specified object.
     * </p>
     *
     * @return <p>
     *         The Object Lock rule in place for the specified object.
     *         </p>
     */
    public ObjectLockRule getRule() {
        return rule;
    }

    /**
     * <p>
     * The Object Lock rule in place for the specified object.
     * </p>
     *
     * @param rule <p>
     *            The Object Lock rule in place for the specified object.
     *            </p>
     */
    public void setRule(ObjectLockRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The Object Lock rule in place for the specified object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rule <p>
     *            The Object Lock rule in place for the specified object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectLockConfiguration withRule(ObjectLockRule rule) {
        this.rule = rule;
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
        if (getObjectLockEnabled() != null)
            sb.append("ObjectLockEnabled: " + getObjectLockEnabled() + ",");
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getObjectLockEnabled() == null) ? 0 : getObjectLockEnabled().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLockConfiguration == false)
            return false;
        ObjectLockConfiguration other = (ObjectLockConfiguration) obj;

        if (other.getObjectLockEnabled() == null ^ this.getObjectLockEnabled() == null)
            return false;
        if (other.getObjectLockEnabled() != null
                && other.getObjectLockEnabled().equals(this.getObjectLockEnabled()) == false)
            return false;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }
}
