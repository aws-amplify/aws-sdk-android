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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a collection of route settings.
 * </p>
 */
public class RouteSettings implements Serializable {
    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for
     * this route. This property affects the log entries pushed to Amazon
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     */
    private Boolean dataTraceEnabled;

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     */
    private Boolean detailedMetricsEnabled;

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     */
    private String loggingLevel;

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     */
    private Integer throttlingBurstLimit;

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     */
    private Double throttlingRateLimit;

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for
     * this route. This property affects the log entries pushed to Amazon
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Specifies whether (true) or not (false) data trace logging is
     *         enabled for this route. This property affects the log entries
     *         pushed to Amazon CloudWatch Logs. Supported only for WebSocket
     *         APIs.
     *         </p>
     */
    public Boolean isDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for
     * this route. This property affects the log entries pushed to Amazon
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Specifies whether (true) or not (false) data trace logging is
     *         enabled for this route. This property affects the log entries
     *         pushed to Amazon CloudWatch Logs. Supported only for WebSocket
     *         APIs.
     *         </p>
     */
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for
     * this route. This property affects the log entries pushed to Amazon
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     *
     * @param dataTraceEnabled <p>
     *            Specifies whether (true) or not (false) data trace logging is
     *            enabled for this route. This property affects the log entries
     *            pushed to Amazon CloudWatch Logs. Supported only for WebSocket
     *            APIs.
     *            </p>
     */
    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for
     * this route. This property affects the log entries pushed to Amazon
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTraceEnabled <p>
     *            Specifies whether (true) or not (false) data trace logging is
     *            enabled for this route. This property affects the log entries
     *            pushed to Amazon CloudWatch Logs. Supported only for WebSocket
     *            APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSettings withDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether detailed metrics are enabled.
     *         </p>
     */
    public Boolean isDetailedMetricsEnabled() {
        return detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether detailed metrics are enabled.
     *         </p>
     */
    public Boolean getDetailedMetricsEnabled() {
        return detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     *
     * @param detailedMetricsEnabled <p>
     *            Specifies whether detailed metrics are enabled.
     *            </p>
     */
    public void setDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        this.detailedMetricsEnabled = detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailedMetricsEnabled <p>
     *            Specifies whether detailed metrics are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSettings withDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        this.detailedMetricsEnabled = detailedMetricsEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @return <p>
     *         Specifies the logging level for this route: INFO, ERROR, or OFF.
     *         This property affects the log entries pushed to Amazon CloudWatch
     *         Logs. Supported only for WebSocket APIs.
     *         </p>
     * @see LoggingLevel
     */
    public String getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this route: INFO, ERROR, or
     *            OFF. This property affects the log entries pushed to Amazon
     *            CloudWatch Logs. Supported only for WebSocket APIs.
     *            </p>
     * @see LoggingLevel
     */
    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this route: INFO, ERROR, or
     *            OFF. This property affects the log entries pushed to Amazon
     *            CloudWatch Logs. Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public RouteSettings withLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this route: INFO, ERROR, or
     *            OFF. This property affects the log entries pushed to Amazon
     *            CloudWatch Logs. Supported only for WebSocket APIs.
     *            </p>
     * @see LoggingLevel
     */
    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel.toString();
    }

    /**
     * <p>
     * Specifies the logging level for this route: INFO, ERROR, or OFF. This
     * property affects the log entries pushed to Amazon CloudWatch Logs.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this route: INFO, ERROR, or
     *            OFF. This property affects the log entries pushed to Amazon
     *            CloudWatch Logs. Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public RouteSettings withLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     *
     * @return <p>
     *         Specifies the throttling burst limit.
     *         </p>
     */
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     *
     * @param throttlingBurstLimit <p>
     *            Specifies the throttling burst limit.
     *            </p>
     */
    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttlingBurstLimit <p>
     *            Specifies the throttling burst limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSettings withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     *
     * @return <p>
     *         Specifies the throttling rate limit.
     *         </p>
     */
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     *
     * @param throttlingRateLimit <p>
     *            Specifies the throttling rate limit.
     *            </p>
     */
    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttlingRateLimit <p>
     *            Specifies the throttling rate limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteSettings withThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
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
        if (getDataTraceEnabled() != null)
            sb.append("DataTraceEnabled: " + getDataTraceEnabled() + ",");
        if (getDetailedMetricsEnabled() != null)
            sb.append("DetailedMetricsEnabled: " + getDetailedMetricsEnabled() + ",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: " + getLoggingLevel() + ",");
        if (getThrottlingBurstLimit() != null)
            sb.append("ThrottlingBurstLimit: " + getThrottlingBurstLimit() + ",");
        if (getThrottlingRateLimit() != null)
            sb.append("ThrottlingRateLimit: " + getThrottlingRateLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getDetailedMetricsEnabled() == null) ? 0 : getDetailedMetricsEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode
                + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode
                + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteSettings == false)
            return false;
        RouteSettings other = (RouteSettings) obj;

        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null)
            return false;
        if (other.getDataTraceEnabled() != null
                && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false)
            return false;
        if (other.getDetailedMetricsEnabled() == null ^ this.getDetailedMetricsEnabled() == null)
            return false;
        if (other.getDetailedMetricsEnabled() != null
                && other.getDetailedMetricsEnabled().equals(this.getDetailedMetricsEnabled()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null
                && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
            return false;
        if (other.getThrottlingBurstLimit() == null ^ this.getThrottlingBurstLimit() == null)
            return false;
        if (other.getThrottlingBurstLimit() != null
                && other.getThrottlingBurstLimit().equals(this.getThrottlingBurstLimit()) == false)
            return false;
        if (other.getThrottlingRateLimit() == null ^ this.getThrottlingRateLimit() == null)
            return false;
        if (other.getThrottlingRateLimit() != null
                && other.getThrottlingRateLimit().equals(this.getThrottlingRateLimit()) == false)
            return false;
        return true;
    }
}
