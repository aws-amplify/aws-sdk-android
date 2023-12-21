/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The logging parameters of a user pool.
 * </p>
 */
public class LogDeliveryConfigurationType implements Serializable {
    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     */
    private java.util.List<LogConfigurationType> logConfigurations;

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the user pool where you configured detailed activity
     *         logging.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The ID of the user pool where you configured detailed activity
     *            logging.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the user pool where you configured detailed activity logging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The ID of the user pool where you configured detailed activity
     *            logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogDeliveryConfigurationType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     *
     * @return <p>
     *         The detailed activity logging destination of a user pool.
     *         </p>
     */
    public java.util.List<LogConfigurationType> getLogConfigurations() {
        return logConfigurations;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     *
     * @param logConfigurations <p>
     *            The detailed activity logging destination of a user pool.
     *            </p>
     */
    public void setLogConfigurations(java.util.Collection<LogConfigurationType> logConfigurations) {
        if (logConfigurations == null) {
            this.logConfigurations = null;
            return;
        }

        this.logConfigurations = new java.util.ArrayList<LogConfigurationType>(logConfigurations);
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logConfigurations <p>
     *            The detailed activity logging destination of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogDeliveryConfigurationType withLogConfigurations(
            LogConfigurationType... logConfigurations) {
        if (getLogConfigurations() == null) {
            this.logConfigurations = new java.util.ArrayList<LogConfigurationType>(
                    logConfigurations.length);
        }
        for (LogConfigurationType value : logConfigurations) {
            this.logConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The detailed activity logging destination of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logConfigurations <p>
     *            The detailed activity logging destination of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogDeliveryConfigurationType withLogConfigurations(
            java.util.Collection<LogConfigurationType> logConfigurations) {
        setLogConfigurations(logConfigurations);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getLogConfigurations() != null)
            sb.append("LogConfigurations: " + getLogConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getLogConfigurations() == null) ? 0 : getLogConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDeliveryConfigurationType == false)
            return false;
        LogDeliveryConfigurationType other = (LogDeliveryConfigurationType) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getLogConfigurations() == null ^ this.getLogConfigurations() == null)
            return false;
        if (other.getLogConfigurations() != null
                && other.getLogConfigurations().equals(this.getLogConfigurations()) == false)
            return false;
        return true;
    }
}
