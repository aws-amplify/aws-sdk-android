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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

public class CreateQueryLoggingConfigResult implements Serializable {
    /**
     * <p>
     * A complex type that contains the ID for a query logging configuration,
     * the ID of the hosted zone that you want to log queries for, and the ARN
     * for the log group that you want Amazon Route 53 to send query logs to.
     * </p>
     */
    private QueryLoggingConfig queryLoggingConfig;

    /**
     * <p>
     * The unique URL representing the new query logging configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains the ID for a query logging configuration,
     * the ID of the hosted zone that you want to log queries for, and the ARN
     * for the log group that you want Amazon Route 53 to send query logs to.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the ID for a query logging
     *         configuration, the ID of the hosted zone that you want to log
     *         queries for, and the ARN for the log group that you want Amazon
     *         Route 53 to send query logs to.
     *         </p>
     */
    public QueryLoggingConfig getQueryLoggingConfig() {
        return queryLoggingConfig;
    }

    /**
     * <p>
     * A complex type that contains the ID for a query logging configuration,
     * the ID of the hosted zone that you want to log queries for, and the ARN
     * for the log group that you want Amazon Route 53 to send query logs to.
     * </p>
     *
     * @param queryLoggingConfig <p>
     *            A complex type that contains the ID for a query logging
     *            configuration, the ID of the hosted zone that you want to log
     *            queries for, and the ARN for the log group that you want
     *            Amazon Route 53 to send query logs to.
     *            </p>
     */
    public void setQueryLoggingConfig(QueryLoggingConfig queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
    }

    /**
     * <p>
     * A complex type that contains the ID for a query logging configuration,
     * the ID of the hosted zone that you want to log queries for, and the ARN
     * for the log group that you want Amazon Route 53 to send query logs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryLoggingConfig <p>
     *            A complex type that contains the ID for a query logging
     *            configuration, the ID of the hosted zone that you want to log
     *            queries for, and the ARN for the log group that you want
     *            Amazon Route 53 to send query logs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueryLoggingConfigResult withQueryLoggingConfig(
            QueryLoggingConfig queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new query logging configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The unique URL representing the new query logging configuration.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The unique URL representing the new query logging configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new query logging
     *            configuration.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new query logging configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new query logging
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueryLoggingConfigResult withLocation(String location) {
        this.location = location;
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
        if (getQueryLoggingConfig() != null)
            sb.append("QueryLoggingConfig: " + getQueryLoggingConfig() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryLoggingConfig() == null) ? 0 : getQueryLoggingConfig().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueryLoggingConfigResult == false)
            return false;
        CreateQueryLoggingConfigResult other = (CreateQueryLoggingConfigResult) obj;

        if (other.getQueryLoggingConfig() == null ^ this.getQueryLoggingConfig() == null)
            return false;
        if (other.getQueryLoggingConfig() != null
                && other.getQueryLoggingConfig().equals(this.getQueryLoggingConfig()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
