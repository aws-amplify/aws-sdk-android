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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Pinpoint analytics configuration for collecting metrics for a user
 * pool.
 * </p>
 */
public class AnalyticsConfigurationType implements Serializable {
    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events
     * to Amazon Pinpoint analytics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The external ID.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will
     * include user data in the events it publishes to Amazon Pinpoint
     * analytics.
     * </p>
     */
    private Boolean userDataShared;

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @return <p>
     *         The application ID for an Amazon Pinpoint application.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param applicationId <p>
     *            The application ID for an Amazon Pinpoint application.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-fA-F]+$<br/>
     *
     * @param applicationId <p>
     *            The application ID for an Amazon Pinpoint application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfigurationType withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events
     * to Amazon Pinpoint analytics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The ARN of an IAM role that authorizes Amazon Cognito to publish
     *         events to Amazon Pinpoint analytics.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events
     * to Amazon Pinpoint analytics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that authorizes Amazon Cognito to
     *            publish events to Amazon Pinpoint analytics.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events
     * to Amazon Pinpoint analytics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param roleArn <p>
     *            The ARN of an IAM role that authorizes Amazon Cognito to
     *            publish events to Amazon Pinpoint analytics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfigurationType withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     *
     * @return <p>
     *         The external ID.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     *
     * @param externalId <p>
     *            The external ID.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The external ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfigurationType withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will
     * include user data in the events it publishes to Amazon Pinpoint
     * analytics.
     * </p>
     *
     * @return <p>
     *         If <code>UserDataShared</code> is <code>true</code>, Amazon
     *         Cognito will include user data in the events it publishes to
     *         Amazon Pinpoint analytics.
     *         </p>
     */
    public Boolean isUserDataShared() {
        return userDataShared;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will
     * include user data in the events it publishes to Amazon Pinpoint
     * analytics.
     * </p>
     *
     * @return <p>
     *         If <code>UserDataShared</code> is <code>true</code>, Amazon
     *         Cognito will include user data in the events it publishes to
     *         Amazon Pinpoint analytics.
     *         </p>
     */
    public Boolean getUserDataShared() {
        return userDataShared;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will
     * include user data in the events it publishes to Amazon Pinpoint
     * analytics.
     * </p>
     *
     * @param userDataShared <p>
     *            If <code>UserDataShared</code> is <code>true</code>, Amazon
     *            Cognito will include user data in the events it publishes to
     *            Amazon Pinpoint analytics.
     *            </p>
     */
    public void setUserDataShared(Boolean userDataShared) {
        this.userDataShared = userDataShared;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will
     * include user data in the events it publishes to Amazon Pinpoint
     * analytics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDataShared <p>
     *            If <code>UserDataShared</code> is <code>true</code>, Amazon
     *            Cognito will include user data in the events it publishes to
     *            Amazon Pinpoint analytics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfigurationType withUserDataShared(Boolean userDataShared) {
        this.userDataShared = userDataShared;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getUserDataShared() != null)
            sb.append("UserDataShared: " + getUserDataShared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getUserDataShared() == null) ? 0 : getUserDataShared().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsConfigurationType == false)
            return false;
        AnalyticsConfigurationType other = (AnalyticsConfigurationType) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getUserDataShared() == null ^ this.getUserDataShared() == null)
            return false;
        if (other.getUserDataShared() != null
                && other.getUserDataShared().equals(this.getUserDataShared()) == false)
            return false;
        return true;
    }
}
