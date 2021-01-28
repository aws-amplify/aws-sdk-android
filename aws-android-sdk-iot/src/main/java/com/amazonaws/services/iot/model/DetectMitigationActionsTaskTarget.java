/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The target of a mitigation action task.
 * </p>
 */
public class DetectMitigationActionsTaskTarget implements Serializable {
    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     */
    private java.util.List<String> violationIds;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String behaviorName;

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     *
     * @return <p>
     *         The unique identifiers of the violations.
     *         </p>
     */
    public java.util.List<String> getViolationIds() {
        return violationIds;
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     *
     * @param violationIds <p>
     *            The unique identifiers of the violations.
     *            </p>
     */
    public void setViolationIds(java.util.Collection<String> violationIds) {
        if (violationIds == null) {
            this.violationIds = null;
            return;
        }

        this.violationIds = new java.util.ArrayList<String>(violationIds);
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationIds <p>
     *            The unique identifiers of the violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskTarget withViolationIds(String... violationIds) {
        if (getViolationIds() == null) {
            this.violationIds = new java.util.ArrayList<String>(violationIds.length);
        }
        for (String value : violationIds) {
            this.violationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationIds <p>
     *            The unique identifiers of the violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskTarget withViolationIds(
            java.util.Collection<String> violationIds) {
        setViolationIds(violationIds);
        return this;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskTarget withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the behavior.
     *         </p>
     */
    public String getBehaviorName() {
        return behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param behaviorName <p>
     *            The name of the behavior.
     *            </p>
     */
    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    /**
     * <p>
     * The name of the behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param behaviorName <p>
     *            The name of the behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskTarget withBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
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
        if (getViolationIds() != null)
            sb.append("violationIds: " + getViolationIds() + ",");
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getBehaviorName() != null)
            sb.append("behaviorName: " + getBehaviorName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getViolationIds() == null) ? 0 : getViolationIds().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getBehaviorName() == null) ? 0 : getBehaviorName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskTarget == false)
            return false;
        DetectMitigationActionsTaskTarget other = (DetectMitigationActionsTaskTarget) obj;

        if (other.getViolationIds() == null ^ this.getViolationIds() == null)
            return false;
        if (other.getViolationIds() != null
                && other.getViolationIds().equals(this.getViolationIds()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehaviorName() == null ^ this.getBehaviorName() == null)
            return false;
        if (other.getBehaviorName() != null
                && other.getBehaviorName().equals(this.getBehaviorName()) == false)
            return false;
        return true;
    }
}
