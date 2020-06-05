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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the method setting properties.
 * </p>
 */
public class MethodSetting implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a
     * Boolean.
     * </p>
     */
    private Boolean metricsEnabled;

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting
     * is <code>/{method_setting_key}/logging/loglevel</code>, and the available
     * levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * Choose <code>ERROR</code> to write only error-level entries to CloudWatch
     * Logs, or choose <code>INFO</code> to include all <code>ERROR</code>
     * events as well as extra informational events.
     * </p>
     */
    private String loggingLevel;

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which
     * affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path
     * for this setting is <code>/{method_setting_key}/logging/dataTrace</code>,
     * and the value is a Boolean.
     * </p>
     */
    private Boolean dataTraceEnabled;

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value
     * is an integer.
     * </p>
     */
    private Integer throttlingBurstLimit;

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is
     * a double.
     * </p>
     */
    private Double throttlingRateLimit;

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A
     * cache cluster must be enabled on the stage for responses to be cached.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a
     * Boolean.
     * </p>
     */
    private Boolean cachingEnabled;

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The
     * higher the TTL, the longer the response will be cached. The PATCH path
     * for this setting is
     * <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is
     * an integer.
     * </p>
     */
    private Integer cacheTtlInSeconds;

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for
     * this setting is <code>/{method_setting_key}/caching/dataEncrypted</code>,
     * and the value is a Boolean.
     * </p>
     */
    private Boolean cacheDataEncrypted;

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation
     * request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     * , and the value is a Boolean.
     * </p>
     */
    private Boolean requireAuthorizationForCacheControl;

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     */
    private String unauthorizedCacheControlHeaderStrategy;

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon CloudWatch metrics are enabled for this
     *         method. The PATCH path for this setting is
     *         <code>/{method_setting_key}/metrics/enabled</code>, and the value
     *         is a Boolean.
     *         </p>
     */
    public Boolean isMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether Amazon CloudWatch metrics are enabled for this
     *         method. The PATCH path for this setting is
     *         <code>/{method_setting_key}/metrics/enabled</code>, and the value
     *         is a Boolean.
     *         </p>
     */
    public Boolean getMetricsEnabled() {
        return metricsEnabled;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @param metricsEnabled <p>
     *            Specifies whether Amazon CloudWatch metrics are enabled for
     *            this method. The PATCH path for this setting is
     *            <code>/{method_setting_key}/metrics/enabled</code>, and the
     *            value is a Boolean.
     *            </p>
     */
    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a
     * Boolean.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricsEnabled <p>
     *            Specifies whether Amazon CloudWatch metrics are enabled for
     *            this method. The PATCH path for this setting is
     *            <code>/{method_setting_key}/metrics/enabled</code>, and the
     *            value is a Boolean.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting
     * is <code>/{method_setting_key}/logging/loglevel</code>, and the available
     * levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * Choose <code>ERROR</code> to write only error-level entries to CloudWatch
     * Logs, or choose <code>INFO</code> to include all <code>ERROR</code>
     * events as well as extra informational events.
     * </p>
     *
     * @return <p>
     *         Specifies the logging level for this method, which affects the
     *         log entries pushed to Amazon CloudWatch Logs. The PATCH path for
     *         this setting is
     *         <code>/{method_setting_key}/logging/loglevel</code>, and the
     *         available levels are <code>OFF</code>, <code>ERROR</code>, and
     *         <code>INFO</code>. Choose <code>ERROR</code> to write only
     *         error-level entries to CloudWatch Logs, or choose
     *         <code>INFO</code> to include all <code>ERROR</code> events as
     *         well as extra informational events.
     *         </p>
     */
    public String getLoggingLevel() {
        return loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting
     * is <code>/{method_setting_key}/logging/loglevel</code>, and the available
     * levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * Choose <code>ERROR</code> to write only error-level entries to CloudWatch
     * Logs, or choose <code>INFO</code> to include all <code>ERROR</code>
     * events as well as extra informational events.
     * </p>
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this method, which affects the
     *            log entries pushed to Amazon CloudWatch Logs. The PATCH path
     *            for this setting is
     *            <code>/{method_setting_key}/logging/loglevel</code>, and the
     *            available levels are <code>OFF</code>, <code>ERROR</code>, and
     *            <code>INFO</code>. Choose <code>ERROR</code> to write only
     *            error-level entries to CloudWatch Logs, or choose
     *            <code>INFO</code> to include all <code>ERROR</code> events as
     *            well as extra informational events.
     *            </p>
     */
    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting
     * is <code>/{method_setting_key}/logging/loglevel</code>, and the available
     * levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * Choose <code>ERROR</code> to write only error-level entries to CloudWatch
     * Logs, or choose <code>INFO</code> to include all <code>ERROR</code>
     * events as well as extra informational events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingLevel <p>
     *            Specifies the logging level for this method, which affects the
     *            log entries pushed to Amazon CloudWatch Logs. The PATCH path
     *            for this setting is
     *            <code>/{method_setting_key}/logging/loglevel</code>, and the
     *            available levels are <code>OFF</code>, <code>ERROR</code>, and
     *            <code>INFO</code>. Choose <code>ERROR</code> to write only
     *            error-level entries to CloudWatch Logs, or choose
     *            <code>INFO</code> to include all <code>ERROR</code> events as
     *            well as extra informational events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which
     * affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path
     * for this setting is <code>/{method_setting_key}/logging/dataTrace</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether data trace logging is enabled for this method,
     *         which affects the log entries pushed to Amazon CloudWatch Logs.
     *         The PATCH path for this setting is
     *         <code>/{method_setting_key}/logging/dataTrace</code>, and the
     *         value is a Boolean.
     *         </p>
     */
    public Boolean isDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which
     * affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path
     * for this setting is <code>/{method_setting_key}/logging/dataTrace</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether data trace logging is enabled for this method,
     *         which affects the log entries pushed to Amazon CloudWatch Logs.
     *         The PATCH path for this setting is
     *         <code>/{method_setting_key}/logging/dataTrace</code>, and the
     *         value is a Boolean.
     *         </p>
     */
    public Boolean getDataTraceEnabled() {
        return dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which
     * affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path
     * for this setting is <code>/{method_setting_key}/logging/dataTrace</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @param dataTraceEnabled <p>
     *            Specifies whether data trace logging is enabled for this
     *            method, which affects the log entries pushed to Amazon
     *            CloudWatch Logs. The PATCH path for this setting is
     *            <code>/{method_setting_key}/logging/dataTrace</code>, and the
     *            value is a Boolean.
     *            </p>
     */
    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which
     * affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path
     * for this setting is <code>/{method_setting_key}/logging/dataTrace</code>,
     * and the value is a Boolean.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTraceEnabled <p>
     *            Specifies whether data trace logging is enabled for this
     *            method, which affects the log entries pushed to Amazon
     *            CloudWatch Logs. The PATCH path for this setting is
     *            <code>/{method_setting_key}/logging/dataTrace</code>, and the
     *            value is a Boolean.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value
     * is an integer.
     * </p>
     *
     * @return <p>
     *         Specifies the throttling burst limit. The PATCH path for this
     *         setting is
     *         <code>/{method_setting_key}/throttling/burstLimit</code>, and the
     *         value is an integer.
     *         </p>
     */
    public Integer getThrottlingBurstLimit() {
        return throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value
     * is an integer.
     * </p>
     *
     * @param throttlingBurstLimit <p>
     *            Specifies the throttling burst limit. The PATCH path for this
     *            setting is
     *            <code>/{method_setting_key}/throttling/burstLimit</code>, and
     *            the value is an integer.
     *            </p>
     */
    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value
     * is an integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttlingBurstLimit <p>
     *            Specifies the throttling burst limit. The PATCH path for this
     *            setting is
     *            <code>/{method_setting_key}/throttling/burstLimit</code>, and
     *            the value is an integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
        return this;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is
     * a double.
     * </p>
     *
     * @return <p>
     *         Specifies the throttling rate limit. The PATCH path for this
     *         setting is
     *         <code>/{method_setting_key}/throttling/rateLimit</code>, and the
     *         value is a double.
     *         </p>
     */
    public Double getThrottlingRateLimit() {
        return throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is
     * a double.
     * </p>
     *
     * @param throttlingRateLimit <p>
     *            Specifies the throttling rate limit. The PATCH path for this
     *            setting is
     *            <code>/{method_setting_key}/throttling/rateLimit</code>, and
     *            the value is a double.
     *            </p>
     */
    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is
     * a double.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throttlingRateLimit <p>
     *            Specifies the throttling rate limit. The PATCH path for this
     *            setting is
     *            <code>/{method_setting_key}/throttling/rateLimit</code>, and
     *            the value is a double.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
        return this;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A
     * cache cluster must be enabled on the stage for responses to be cached.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether responses should be cached and returned for
     *         requests. A cache cluster must be enabled on the stage for
     *         responses to be cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/enabled</code>, and the value
     *         is a Boolean.
     *         </p>
     */
    public Boolean isCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A
     * cache cluster must be enabled on the stage for responses to be cached.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether responses should be cached and returned for
     *         requests. A cache cluster must be enabled on the stage for
     *         responses to be cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/enabled</code>, and the value
     *         is a Boolean.
     *         </p>
     */
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A
     * cache cluster must be enabled on the stage for responses to be cached.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a
     * Boolean.
     * </p>
     *
     * @param cachingEnabled <p>
     *            Specifies whether responses should be cached and returned for
     *            requests. A cache cluster must be enabled on the stage for
     *            responses to be cached. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/enabled</code>, and the
     *            value is a Boolean.
     *            </p>
     */
    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A
     * cache cluster must be enabled on the stage for responses to be cached.
     * The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a
     * Boolean.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cachingEnabled <p>
     *            Specifies whether responses should be cached and returned for
     *            requests. A cache cluster must be enabled on the stage for
     *            responses to be cached. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/enabled</code>, and the
     *            value is a Boolean.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The
     * higher the TTL, the longer the response will be cached. The PATCH path
     * for this setting is
     * <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is
     * an integer.
     * </p>
     *
     * @return <p>
     *         Specifies the time to live (TTL), in seconds, for cached
     *         responses. The higher the TTL, the longer the response will be
     *         cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the
     *         value is an integer.
     *         </p>
     */
    public Integer getCacheTtlInSeconds() {
        return cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The
     * higher the TTL, the longer the response will be cached. The PATCH path
     * for this setting is
     * <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is
     * an integer.
     * </p>
     *
     * @param cacheTtlInSeconds <p>
     *            Specifies the time to live (TTL), in seconds, for cached
     *            responses. The higher the TTL, the longer the response will be
     *            cached. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     *            the value is an integer.
     *            </p>
     */
    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The
     * higher the TTL, the longer the response will be cached. The PATCH path
     * for this setting is
     * <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is
     * an integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheTtlInSeconds <p>
     *            Specifies the time to live (TTL), in seconds, for cached
     *            responses. The higher the TTL, the longer the response will be
     *            cached. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     *            the value is an integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        return this;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for
     * this setting is <code>/{method_setting_key}/caching/dataEncrypted</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cached responses are encrypted. The PATCH
     *         path for this setting is
     *         <code>/{method_setting_key}/caching/dataEncrypted</code>, and the
     *         value is a Boolean.
     *         </p>
     */
    public Boolean isCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for
     * this setting is <code>/{method_setting_key}/caching/dataEncrypted</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether the cached responses are encrypted. The PATCH
     *         path for this setting is
     *         <code>/{method_setting_key}/caching/dataEncrypted</code>, and the
     *         value is a Boolean.
     *         </p>
     */
    public Boolean getCacheDataEncrypted() {
        return cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for
     * this setting is <code>/{method_setting_key}/caching/dataEncrypted</code>,
     * and the value is a Boolean.
     * </p>
     *
     * @param cacheDataEncrypted <p>
     *            Specifies whether the cached responses are encrypted. The
     *            PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/dataEncrypted</code>, and
     *            the value is a Boolean.
     *            </p>
     */
    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for
     * this setting is <code>/{method_setting_key}/caching/dataEncrypted</code>,
     * and the value is a Boolean.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheDataEncrypted <p>
     *            Specifies whether the cached responses are encrypted. The
     *            PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/dataEncrypted</code>, and
     *            the value is a Boolean.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        return this;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation
     * request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     * , and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether authorization is required for a cache
     *         invalidation request. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     *         , and the value is a Boolean.
     *         </p>
     */
    public Boolean isRequireAuthorizationForCacheControl() {
        return requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation
     * request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     * , and the value is a Boolean.
     * </p>
     *
     * @return <p>
     *         Specifies whether authorization is required for a cache
     *         invalidation request. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     *         , and the value is a Boolean.
     *         </p>
     */
    public Boolean getRequireAuthorizationForCacheControl() {
        return requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation
     * request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     * , and the value is a Boolean.
     * </p>
     *
     * @param requireAuthorizationForCacheControl <p>
     *            Specifies whether authorization is required for a cache
     *            invalidation request. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     *            , and the value is a Boolean.
     *            </p>
     */
    public void setRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
        this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation
     * request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     * , and the value is a Boolean.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireAuthorizationForCacheControl <p>
     *            Specifies whether authorization is required for a cache
     *            invalidation request. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>
     *            , and the value is a Boolean.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MethodSetting withRequireAuthorizationForCacheControl(
            Boolean requireAuthorizationForCacheControl) {
        this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     *
     * @return <p>
     *         Specifies how to handle unauthorized requests for cache
     *         invalidation. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     *         , and the available values are <code>FAIL_WITH_403</code>,
     *         <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *         <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     *         </p>
     * @see UnauthorizedCacheControlHeaderStrategy
     */
    public String getUnauthorizedCacheControlHeaderStrategy() {
        return unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     *
     * @param unauthorizedCacheControlHeaderStrategy <p>
     *            Specifies how to handle unauthorized requests for cache
     *            invalidation. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     *            , and the available values are <code>FAIL_WITH_403</code>,
     *            <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *            <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     *            </p>
     * @see UnauthorizedCacheControlHeaderStrategy
     */
    public void setUnauthorizedCacheControlHeaderStrategy(
            String unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     *
     * @param unauthorizedCacheControlHeaderStrategy <p>
     *            Specifies how to handle unauthorized requests for cache
     *            invalidation. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     *            , and the available values are <code>FAIL_WITH_403</code>,
     *            <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *            <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnauthorizedCacheControlHeaderStrategy
     */
    public MethodSetting withUnauthorizedCacheControlHeaderStrategy(
            String unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     *
     * @param unauthorizedCacheControlHeaderStrategy <p>
     *            Specifies how to handle unauthorized requests for cache
     *            invalidation. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     *            , and the available values are <code>FAIL_WITH_403</code>,
     *            <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *            <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     *            </p>
     * @see UnauthorizedCacheControlHeaderStrategy
     */
    public void setUnauthorizedCacheControlHeaderStrategy(
            UnauthorizedCacheControlHeaderStrategy unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy
                .toString();
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The
     * PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     * , and the available values are <code>FAIL_WITH_403</code>,
     * <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER,
     * SUCCEED_WITHOUT_RESPONSE_HEADER
     *
     * @param unauthorizedCacheControlHeaderStrategy <p>
     *            Specifies how to handle unauthorized requests for cache
     *            invalidation. The PATCH path for this setting is
     *            <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>
     *            , and the available values are <code>FAIL_WITH_403</code>,
     *            <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *            <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnauthorizedCacheControlHeaderStrategy
     */
    public MethodSetting withUnauthorizedCacheControlHeaderStrategy(
            UnauthorizedCacheControlHeaderStrategy unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy
                .toString();
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
        if (getMetricsEnabled() != null)
            sb.append("metricsEnabled: " + getMetricsEnabled() + ",");
        if (getLoggingLevel() != null)
            sb.append("loggingLevel: " + getLoggingLevel() + ",");
        if (getDataTraceEnabled() != null)
            sb.append("dataTraceEnabled: " + getDataTraceEnabled() + ",");
        if (getThrottlingBurstLimit() != null)
            sb.append("throttlingBurstLimit: " + getThrottlingBurstLimit() + ",");
        if (getThrottlingRateLimit() != null)
            sb.append("throttlingRateLimit: " + getThrottlingRateLimit() + ",");
        if (getCachingEnabled() != null)
            sb.append("cachingEnabled: " + getCachingEnabled() + ",");
        if (getCacheTtlInSeconds() != null)
            sb.append("cacheTtlInSeconds: " + getCacheTtlInSeconds() + ",");
        if (getCacheDataEncrypted() != null)
            sb.append("cacheDataEncrypted: " + getCacheDataEncrypted() + ",");
        if (getRequireAuthorizationForCacheControl() != null)
            sb.append("requireAuthorizationForCacheControl: "
                    + getRequireAuthorizationForCacheControl() + ",");
        if (getUnauthorizedCacheControlHeaderStrategy() != null)
            sb.append("unauthorizedCacheControlHeaderStrategy: "
                    + getUnauthorizedCacheControlHeaderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricsEnabled() == null) ? 0 : getMetricsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode
                + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode
                + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        hashCode = prime * hashCode
                + ((getCachingEnabled() == null) ? 0 : getCachingEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCacheTtlInSeconds() == null) ? 0 : getCacheTtlInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getCacheDataEncrypted() == null) ? 0 : getCacheDataEncrypted().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequireAuthorizationForCacheControl() == null) ? 0
                        : getRequireAuthorizationForCacheControl().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnauthorizedCacheControlHeaderStrategy() == null) ? 0
                        : getUnauthorizedCacheControlHeaderStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MethodSetting == false)
            return false;
        MethodSetting other = (MethodSetting) obj;

        if (other.getMetricsEnabled() == null ^ this.getMetricsEnabled() == null)
            return false;
        if (other.getMetricsEnabled() != null
                && other.getMetricsEnabled().equals(this.getMetricsEnabled()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null
                && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
            return false;
        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null)
            return false;
        if (other.getDataTraceEnabled() != null
                && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false)
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
        if (other.getCachingEnabled() == null ^ this.getCachingEnabled() == null)
            return false;
        if (other.getCachingEnabled() != null
                && other.getCachingEnabled().equals(this.getCachingEnabled()) == false)
            return false;
        if (other.getCacheTtlInSeconds() == null ^ this.getCacheTtlInSeconds() == null)
            return false;
        if (other.getCacheTtlInSeconds() != null
                && other.getCacheTtlInSeconds().equals(this.getCacheTtlInSeconds()) == false)
            return false;
        if (other.getCacheDataEncrypted() == null ^ this.getCacheDataEncrypted() == null)
            return false;
        if (other.getCacheDataEncrypted() != null
                && other.getCacheDataEncrypted().equals(this.getCacheDataEncrypted()) == false)
            return false;
        if (other.getRequireAuthorizationForCacheControl() == null
                ^ this.getRequireAuthorizationForCacheControl() == null)
            return false;
        if (other.getRequireAuthorizationForCacheControl() != null
                && other.getRequireAuthorizationForCacheControl().equals(
                        this.getRequireAuthorizationForCacheControl()) == false)
            return false;
        if (other.getUnauthorizedCacheControlHeaderStrategy() == null
                ^ this.getUnauthorizedCacheControlHeaderStrategy() == null)
            return false;
        if (other.getUnauthorizedCacheControlHeaderStrategy() != null
                && other.getUnauthorizedCacheControlHeaderStrategy().equals(
                        this.getUnauthorizedCacheControlHeaderStrategy()) == false)
            return false;
        return true;
    }
}
