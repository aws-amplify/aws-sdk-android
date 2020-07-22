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

package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

import java.net.InetAddress;

import javax.net.ssl.TrustManager;

/**
 * Client configuration options such as proxy settings, user agent string, max
 * retry attempts, etc.
 */
public class ClientConfiguration {

    /** The default timeout for creating new connections. */
    public static final int DEFAULT_CONNECTION_TIMEOUT = 15 * 1000;

    /** The default timeout for reading from a connected socket. */
    public static final int DEFAULT_SOCKET_TIMEOUT = 15 * 1000;

    /** The default max connection pool size. */
    public static final int DEFAULT_MAX_CONNECTIONS = 10;

    /** The default HTTP user agent header for AWS Java SDK clients. */
    public static final String DEFAULT_USER_AGENT = VersionInfoUtils.getUserAgent();

    /**
     * Default request retry policy, including the maximum retry count of 3, the
     * default retry condition and the default back-off strategy.
     * <p>
     * Note this default policy might be overridden by a service-specific
     * default policy, if the user doesn't provide a custom RetryPolicy
     * implementation by {@link #setRetryPolicy(RetryPolicy)}. For example,
     * AmazonDynamoDBClient by default uses a different retry policy
     * {@link PredefinedRetryPolicies#DYNAMODB_DEFAULT}.
     *
     * @see PredefinedRetryPolicies#DEFAULT
     * @see PredefinedRetryPolicies#DYNAMODB_DEFAULT
     */
    public static final RetryPolicy DEFAULT_RETRY_POLICY = PredefinedRetryPolicies.DEFAULT;

    /** The HTTP user agent header passed with all HTTP requests. */
    private String userAgent = DEFAULT_USER_AGENT;

    /**
     * The {@link #userAgent} string is sometimes combined with other strings. If this property is set, it instructs the
     * client to only use this as the full user agent string.
     */
    private String userAgentOverride;

    /**
     * The maximum number of times that a retryable failed request (ex: a 5xx
     * response from a service) will be retried. Or -1 if the user has not
     * explicitly set this value, in which case the configured RetryPolicy will
     * be used to control the retry count.
     */
    private int maxErrorRetry = -1;

    /** The retry policy upon failed requests. **/
    private RetryPolicy retryPolicy = DEFAULT_RETRY_POLICY;

    /** Optionally specifies the local address to bind to */
    private InetAddress localAddress;

    /**
     * The protocol to use when connecting to Amazon Web Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased
     * security.
     */
    private Protocol protocol = Protocol.HTTPS;

    /** Optionally specifies the proxy host to connect through. */
    private String proxyHost = null;

    /** Optionally specifies the port on the proxy host to connect through. */
    private int proxyPort = -1;

    /**
     * Optionally specifies the user name to use when connecting through a
     * proxy.
     */
    private String proxyUsername = null;

    /**
     * Optionally specifies the password to use when connecting through a proxy.
     */
    private String proxyPassword = null;

    /** Optional Windows domain name for configuring NTLM proxy support. */
    @Deprecated
    private String proxyDomain = null;

    /** Optional Windows workstation name for configuring NTLM proxy support. */
    @Deprecated
    private String proxyWorkstation = null;

    /**
     * Whether to pre-emptively authenticate against a proxy server using basic
     * authentication
     */
    private boolean preemptiveBasicProxyAuth;

    /** The maximum number of open HTTP connections. */
    private int maxConnections = DEFAULT_MAX_CONNECTIONS;

    /**
     * The amount of time to wait (in milliseconds) for data to be transfered
     * over an established, open connection before the connection is timed out.
     * A value of 0 means infinity, and is not recommended.
     */
    private int socketTimeout = DEFAULT_SOCKET_TIMEOUT;

    /**
     * The amount of time to wait (in milliseconds) when initially establishing
     * a connection before giving up and timing out. A value of 0 means
     * infinity, and is not recommended.
     */
    private int connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;

    /**
     * Optional size hint (in bytes) for the low level TCP send buffer. This is
     * an advanced option for advanced users who want to tune low level TCP
     * parameters to try and squeeze out more performance.
     */
    private int socketSendBufferSizeHint = 0;

    /**
     * Optional size hint (in bytes) for the low level TCP receive buffer. This
     * is an advanced option for advanced users who want to tune low level TCP
     * parameters to try and squeeze out more performance.
     */
    private int socketReceiveBufferSizeHint = 0;

    /**
     * Optional override to control which signature algorithm should be used to
     * sign requests to the service. If not explicitly set, the client will
     * determine the algorithm to use by inspecting a configuration file baked
     * in to the SDK.
     */
    private String signerOverride;

    /**
     * Optional override to control how to perform authentication for secure
     * connections.
     */
    private TrustManager trustManager = null;

    /**
     * Enable/disable logging.
     */
    private boolean curlLogging = false;

    /**
     * Optional whether to use gzip compression when making HTTP requests.
     */
    private boolean enableGzip = false;

    /**
     * Constructor.
     */
    public ClientConfiguration() {
    }

    /**
     * Constructor.
     * @param other the client configuration.
     */
    public ClientConfiguration(ClientConfiguration other) {
        this.connectionTimeout = other.connectionTimeout;
        this.maxConnections = other.maxConnections;
        this.maxErrorRetry = other.maxErrorRetry;
        this.retryPolicy = other.retryPolicy;
        this.localAddress = other.localAddress;
        this.protocol = other.protocol;
        this.proxyDomain = other.proxyDomain;
        this.proxyHost = other.proxyHost;
        this.proxyPassword = other.proxyPassword;
        this.proxyPort = other.proxyPort;
        this.proxyUsername = other.proxyUsername;
        this.proxyWorkstation = other.proxyWorkstation;
        this.preemptiveBasicProxyAuth = other.preemptiveBasicProxyAuth;
        this.socketTimeout = other.socketTimeout;
        this.userAgent = other.userAgent;
        this.userAgentOverride = other.userAgentOverride;
        this.socketReceiveBufferSizeHint = other.socketReceiveBufferSizeHint;
        this.socketSendBufferSizeHint = other.socketSendBufferSizeHint;
        this.signerOverride = other.signerOverride;
        this.trustManager = other.trustManager;
        this.curlLogging = other.curlLogging;
        this.enableGzip = other.enableGzip;
    }

    /**
     * Returns the protocol (HTTP or HTTPS) to use when connecting to Amazon Web
     * Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased
     * security.
     * <p>
     * Individual clients can also override this setting by explicitly including
     * the protocol as part of the endpoint URL when calling
     * {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @return The protocol to use when connecting to Amazon Web Services.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon
     * Web Services.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased
     * security.
     * <p>
     * Individual clients can also override this setting by explicitly including
     * the protocol as part of the endpoint URL when calling
     * {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @param protocol The protocol to use when connecting to Amazon Web
     *            Services.
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    /**
     * Sets the protocol (i.e. HTTP or HTTPS) to use when connecting to Amazon
     * Web Services, and returns the updated ClientConfiguration object so that
     * additional calls may be chained together.
     * <p>
     * The default configuration is to use HTTPS for all requests for increased
     * security.
     * <p>
     * Individual clients can also override this setting by explicitly including
     * the protocol as part of the endpoint URL when calling
     * {@link AmazonWebServiceClient#setEndpoint(String)}.
     *
     * @param protocol The protocol to use when connecting to Amazon Web
     *            Services.
     * @return The updated ClientConfiguration object with the new max HTTP
     *         connections setting.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProtocol(Protocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * Returns the maximum number of allowed open HTTP connections.
     *
     * @return The maximum number of allowed open HTTP connections.
     */
    public int getMaxConnections() {
        return maxConnections;
    }

    /**
     * Sets the maximum number of allowed open HTTP connections.
     *
     * @param maxConnections The maximum number of allowed open HTTP
     *            connections.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * Sets the maximum number of allowed open HTTP connections and returns the
     * updated ClientConfiguration object.
     *
     * @param maxConnections The maximum number of allowed open HTTP
     *            connections.
     * @return The updated ClientConfiguration object with the new max HTTP
     *         connections setting.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withMaxConnections(int maxConnections) {
        setMaxConnections(maxConnections);
        return this;
    }

    /**
     * Returns the HTTP user agent header to send with all requests.
     *
     * @return The user agent string to use when sending requests.
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the HTTP user agent header to send with all requests.
     *
     * @param userAgent The user agent string to use when sending requests.
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Sets the HTTP user agent header used in requests and returns the updated
     * ClientConfiguration object.
     *
     * @param userAgent The user agent string to use when sending requests.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * The {@link #userAgent} string is sometimes combined with other strings. If this property is set, it instructs the
     * client to only use this as the full user agent string.
     *
     * @return The string to use as the full user agent when sending requests.
     */
    public String getUserAgentOverride() {
        return userAgentOverride;
    }

    /**
     * The {@link #userAgent} string is sometimes combined with other strings. If this property is set, it instructs the
     * client to only use this as the full user agent string.
     *
     * @param userAgentOverride The string to use as the full user agent when sending requests.
     */
    public void setUserAgentOverride(String userAgentOverride) {
        this.userAgentOverride = userAgentOverride;
    }

    /**
     * The {@link #userAgent} string is sometimes combined with other strings. If this property is set, it instructs the
     * client to only use this as the full user agent string.
     *
     * @param userAgentOverride The string to use as the full user agent when sending requests.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withUserAgentOverride(String userAgentOverride) {
        setUserAgentOverride(userAgentOverride);
        return this;
    }

    /**
     * Returns the optional local address the client will bind to.
     *
     * @return The local address the client will bind to.
     */
    public InetAddress getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the optional local address the client will bind to.
     *
     * @param localAddress The local address the client will bind to.
     */
    public void setLocalAddress(InetAddress localAddress) {
        this.localAddress = localAddress;
    }

    /**
     * Sets the optional local address the client will bind to and returns the
     * updated ClientConfiguration object.
     *
     * @param localAddress The local address the client will bind to.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withLocalAddress(InetAddress localAddress) {
        setLocalAddress(localAddress);
        return this;
    }

    /**
     * Returns the optional proxy host the client will connect through.
     *
     * @return The proxy host the client will connect through.
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Sets the optional proxy host the client will connect through.
     *
     * @param proxyHost The proxy host the client will connect through.
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Sets the optional proxy host the client will connect through and returns
     * the updated ClientConfiguration object.
     *
     * @param proxyHost The proxy host the client will connect through.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyHost(String proxyHost) {
        setProxyHost(proxyHost);
        return this;
    }

    /**
     * Returns the optional proxy port the client will connect through.
     *
     * @return The proxy port the client will connect through.
     */
    public int getProxyPort() {
        return proxyPort;
    }

    /**
     * Sets the optional proxy port the client will connect through.
     *
     * @param proxyPort The proxy port the client will connect through.
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Sets the optional proxy port the client will connect through and returns
     * the updated ClientConfiguration object.
     *
     * @param proxyPort The proxy port the client will connect through.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyPort(int proxyPort) {
        setProxyPort(proxyPort);
        return this;
    }

    /**
     * Returns the optional proxy user name to use if connecting through a
     * proxy.
     *
     * @return The optional proxy user name the configured client will use if
     *         connecting through a proxy.
     */
    public String getProxyUsername() {
        return proxyUsername;
    }

    /**
     * Sets the optional proxy user name to use if connecting through a proxy.
     *
     * @param proxyUsername The proxy user name to use if connecting through a
     *            proxy.
     */
    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    /**
     * Sets the optional proxy user name and returns the updated
     * ClientConfiguration object.
     *
     * @param proxyUsername The proxy user name to use if connecting through a
     *            proxy.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyUsername(String proxyUsername) {
        setProxyUsername(proxyUsername);
        return this;
    }

    /**
     * Returns the optional proxy password to use when connecting through a
     * proxy.
     *
     * @return The password to use when connecting through a proxy.
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy.
     *
     * @param proxyPassword The password to use when connecting through a proxy.
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Sets the optional proxy password to use when connecting through a proxy,
     * and returns the updated ClientConfiguration object.
     *
     * @param proxyPassword The password to use when connecting through a proxy.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyPassword(String proxyPassword) {
        setProxyPassword(proxyPassword);
        return this;
    }

    /**
     * Returns the optional Windows domain name for configuring an NTLM proxy.
     * If you aren't using a Windows NTLM proxy, you do not need to set this
     * field.
     *
     * @return The optional Windows domain name for configuring an NTLM proxy.
     */
    @Deprecated
    public String getProxyDomain() {
        return proxyDomain;
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy. If
     * you aren't using a Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain The optional Windows domain name for configuring an
     *            NTLM proxy.
     */
    @Deprecated
    public void setProxyDomain(String proxyDomain) {
        this.proxyDomain = proxyDomain;
    }

    /**
     * Sets the optional Windows domain name for configuration an NTLM proxy and
     * returns a reference to this updated ClientConfiguration object so that
     * additional method calls can be chained together. If you aren't using a
     * Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyDomain The optional Windows domain name for configuring an
     *            NTLM proxy.
     * @return The updated ClientConfiguration object.
     */
    @Deprecated
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyDomain(String proxyDomain) {
        setProxyDomain(proxyDomain);
        return this;
    }

    /**
     * Returns the optional Windows workstation name for configuring NTLM proxy
     * support. If you aren't using a Windows NTLM proxy, you do not need to set
     * this field.
     *
     * @return The optional Windows workstation name for configuring NTLM proxy
     *         support.
     */
    public String getProxyWorkstation() {
        return proxyWorkstation;
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy
     * support. If you aren't using a Windows NTLM proxy, you do not need to set
     * this field.
     *
     * @param proxyWorkstation The optional Windows workstation name for
     *            configuring NTLM proxy support.
     */
    @Deprecated
    public void setProxyWorkstation(String proxyWorkstation) {
        this.proxyWorkstation = proxyWorkstation;
    }

    /**
     * Sets the optional Windows workstation name for configuring NTLM proxy
     * support, and returns the updated ClientConfiguration object so that
     * additional method calls can be chained together. If you aren't using a
     * Windows NTLM proxy, you do not need to set this field.
     *
     * @param proxyWorkstation The optional Windows workstation name for
     *            configuring NTLM proxy support.
     * @return The updated ClientConfiguration object.
     */
    @Deprecated
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withProxyWorkstation(String proxyWorkstation) {
        setProxyWorkstation(proxyWorkstation);
        return this;
    }

    /**
     * Returns the retry policy upon failed requests.
     *
     * @return The retry policy upon failed requests.
     */
    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * Sets the retry policy upon failed requests. User could specify whether
     * the RetryPolicy should honor maxErrorRetry set by
     * {@link #setMaxErrorRetry(int)}.
     *
     * @param retryPolicy The retry policy upon failed requests.
     */
    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * Sets the retry policy upon failed requests, and returns the updated
     * ClientConfiguration object. User could specify whether the RetryPolicy
     * should honor maxErrorRetry set by {@link #setMaxErrorRetry(int)}
     *
     * @param retryPolicy The retry policy upon failed requests.
     * @return the client configuration.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withRetryPolicy(RetryPolicy retryPolicy) {
        setRetryPolicy(retryPolicy);
        return this;
    }

    /**
     * Returns the maximum number of retry attempts for failed retryable
     * requests (ex: 5xx error responses from a service). This method returns -1
     * before a maxErrorRetry value is explicitly set by
     * {@link #setMaxErrorRetry(int)}, in which case the configured RetryPolicy
     * will be used to control the retry count.
     *
     * @return The maximum number of retry attempts for failed retryable
     *         requests, or -1 if maxErrorRetry has not been set by
     *         {@link #setMaxErrorRetry(int)}.
     */
    public int getMaxErrorRetry() {
        return maxErrorRetry;
    }

    /**
     * Sets the maximum number of retry attempts for failed retryable requests
     * (ex: 5xx error responses from services).
     *
     * @param maxErrorRetry The maximum number of retry attempts for failed
     *            retryable requests. This value should not be negative.
     */
    public void setMaxErrorRetry(int maxErrorRetry) {
        if (maxErrorRetry < 0) {
            throw new IllegalArgumentException("maxErrorRetry shoud be non-negative");
        }
        this.maxErrorRetry = maxErrorRetry;
    }

    /**
     * Sets the maximum number of retry attempts for failed retryable requests
     * (ex: 5xx error responses from services), and returns the updated
     * ClientConfiguration object.
     *
     * @param maxErrorRetry The maximum number of retry attempts for failed
     *            retryable requests. This value should not be negative.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withMaxErrorRetry(int maxErrorRetry) {
        setMaxErrorRetry(maxErrorRetry);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) for data to be
     * transfered over an established, open connection before the connection
     * times out and is closed. A value of 0 means infinity, and isn't
     * recommended.
     *
     * @return The amount of time to wait (in milliseconds) for data to be
     *         transfered over an established, open connection before the
     *         connection times out and is closed.
     */
    public int getSocketTimeout() {
        return socketTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be
     * transfered over an established, open connection before the connection
     * times out and is closed. A value of 0 means infinity, and isn't
     * recommended.
     *
     * @param socketTimeout The amount of time to wait (in milliseconds) for
     *            data to be transfered over an established, open connection
     *            before the connection is times out and is closed.
     */
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) for data to be
     * transfered over an established, open connection before the connection
     * times out and is closed, and returns the updated ClientConfiguration
     * object so that additional method calls may be chained together.
     *
     * @param socketTimeout The amount of time to wait (in milliseconds) for
     *            data to be transfered over an established, open connection
     *            before the connection is times out and is closed.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withSocketTimeout(int socketTimeout) {
        setSocketTimeout(socketTimeout);
        return this;
    }

    /**
     * Returns the amount of time to wait (in milliseconds) when initially
     * establishing a connection before giving up and timing out. A value of 0
     * means infinity, and is not recommended.
     *
     * @return The amount of time to wait (in milliseconds) when initially
     *         establishing a connection before giving up and timing out.
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially
     * establishing a connection before giving up and timing out. A value of 0
     * means infinity, and is not recommended.
     *
     * @param connectionTimeout The amount of time to wait (in milliseconds)
     *            when initially establishing a connection before giving up and
     *            timing out.
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Sets the amount of time to wait (in milliseconds) when initially
     * establishing a connection before giving up and timing out, and returns
     * the updated ClientConfiguration object so that additional method calls
     * may be chained together.
     *
     * @param connectionTimeout the amount of time to wait (in milliseconds)
     *            when initially establishing a connection before giving up and
     *            timing out.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withConnectionTimeout(int connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * Returns the optional size hints (in bytes) for the low level TCP send and
     * receive buffers. This is an advanced option for advanced users who want
     * to tune low level TCP parameters to try and squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly
     * dependent on network configuration and operating system configuration and
     * capabilities. For example, most modern operating systems provide
     * auto-tuning functionality for TCP buffer sizes, which can have a big
     * impact on performance for TCP connections that are held open long enough
     * for the auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer
     * more data in memory without requiring the remote server to acknowledge
     * receipt of that information, so can be particularly useful when the
     * network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to
     * honor it. When using this option, users should <b>always</b> check the
     * operating system's configured limits and defaults. Most OS's have a
     * maximum TCP buffer size limit configured, and won't let you go beyond
     * that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP
     * buffer sizes and operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @return A two element array containing first the TCP send buffer size
     *         hint and then the TCP receive buffer size hint.
     */
    public int[] getSocketBufferSizeHints() {
        return new int[] {
            socketSendBufferSizeHint, socketReceiveBufferSizeHint
        };
    }

    /**
     * Sets the optional size hints (in bytes) for the low level TCP send and
     * receive buffers. This is an advanced option for advanced users who want
     * to tune low level TCP parameters to try and squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly
     * dependent on network configuration and operating system configuration and
     * capabilities. For example, most modern operating systems provide
     * auto-tuning functionality for TCP buffer sizes, which can have a big
     * impact on performance for TCP connections that are held open long enough
     * for the auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer
     * more data in memory without requiring the remote server to acknowledge
     * receipt of that information, so can be particularly useful when the
     * network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to
     * honor it. When using this option, users should <b>always</b> check the
     * operating system's configured limits and defaults. Most OS's have a
     * maximum TCP buffer size limit configured, and won't let you go beyond
     * that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP
     * buffer sizes and operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @param socketSendBufferSizeHint The size hint (in bytes) for the low
     *            level TCP send buffer.
     * @param socketReceiveBufferSizeHint The size hint (in bytes) for the low
     *            level TCP receive buffer.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setSocketBufferSizeHints(
            int socketSendBufferSizeHint, int socketReceiveBufferSizeHint) {
        this.socketSendBufferSizeHint = socketSendBufferSizeHint;
        this.socketReceiveBufferSizeHint = socketReceiveBufferSizeHint;
    }

    /**
     * Sets the optional size hints (in bytes) for the low level TCP send and
     * receive buffers, and returns the updated ClientConfiguration object so
     * that additional method calls may be chained together.
     * <p>
     * This is an advanced option for advanced users who want to tune low level
     * TCP parameters to try and squeeze out more performance.
     * <p>
     * The optimal TCP buffer sizes for a particular application are highly
     * dependent on network configuration and operating system configuration and
     * capabilities. For example, most modern operating systems provide
     * auto-tuning functionality for TCP buffer sizes, which can have a big
     * impact on performance for TCP connections that are held open long enough
     * for the auto-tuning to optimize buffer sizes.
     * <p>
     * Large buffer sizes (ex: 2MB) will allow the operating system to buffer
     * more data in memory without requiring the remote server to acknowledge
     * receipt of that information, so can be particularly useful when the
     * network has high latency.
     * <p>
     * This is only a <b>hint</b>, and the operating system may choose not to
     * honor it. When using this option, users should <b>always</b> check the
     * operating system's configured limits and defaults. Most OS's have a
     * maximum TCP buffer size limit configured, and won't let you go beyond
     * that limit unless you explicitly raise the max TCP buffer size limit.
     * <p>
     * There are many resources available online to help with configuring TCP
     * buffer sizes and operating system specific TCP settings, including:
     * <ul>
     * <li>http://onlamp.com/pub/a/onlamp/2005/11/17/tcp_tuning.html</li>
     * <li>http://fasterdata.es.net/TCP-tuning/</li>
     * </ul>
     *
     * @param socketSendBufferSizeHint The size hint (in bytes) for the low
     *            level TCP send buffer.
     * @param socketReceiveBufferSizeHint The size hint (in bytes) for the low
     *            level TCP receive buffer.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withSocketBufferSizeHints(
            int socketSendBufferSizeHint, int socketReceiveBufferSizeHint) {
        setSocketBufferSizeHints(socketSendBufferSizeHint, socketReceiveBufferSizeHint);
        return this;
    }

    /**
     * Returns the name of the signature algorithm to use for signing requests
     * made by this client. If not set or explicitly set to null, the client
     * will choose a signature algorithm to use based on a configuration file of
     * supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature
     * algorithm is being used, as the defaults will be sufficient. This setting
     * exists only so advanced users can opt in to newer signature protocols
     * which have not yet been made the default for a particular service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an
     * unsupported signature algorithm will lead to authentication failures. Use
     * me at your own risk, and only after consulting the documentation for the
     * service to ensure it actually does supports your chosen algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a
     * {@code Signer} class implementing the chosen algorithm by the
     * {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @return The signature algorithm to use for this client, or null to use
     *         the default.
     */
    public String getSignerOverride() {
        return signerOverride;
    }

    /**
     * Sets the name of the signature algorithm to use for signing requests made
     * by this client. If not set or explicitly set to null, the client will
     * choose a signature algorithm to use based on a configuration file of
     * supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature
     * algorithm is being used, as the defaults will be sufficient. This setting
     * exists only so advanced users can opt in to newer signature protocols
     * which have not yet been made the default for a particular service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an
     * unsupported signature algorithm will lead to authentication failures. Use
     * me at your own risk, and only after consulting the documentation for the
     * service to ensure it actually does supports your chosen algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a
     * {@code Signer} class implementing the chosen algorithm by the
     * {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @param value The signature algorithm to use for this client, or null to
     *            use the default.
     */
    public void setSignerOverride(final String value) {
        signerOverride = value;
    }

    /**
     * Sets the name of the signature algorithm to use for signing requests made
     * by this client. If not set or explicitly set to null, the client will
     * choose a signature algorithm to use based on a configuration file of
     * supported signature algorithms for the service and region.
     * <p>
     * Most users do not need to concern themselves with which signature
     * algorithm is being used, as the defaults will be sufficient. This setting
     * exists only so advanced users can opt in to newer signature protocols
     * which have not yet been made the default for a particular service/region.
     * <p>
     * Not all services support all signature algorithms, and configuring an
     * unsupported signature algorithm will lead to authentication failures. Use
     * me at your own risk, and only after consulting the documentation for the
     * service to ensure it actually does supports your chosen algorithm.
     * <p>
     * If non-null, the name returned from this method is used to look up a
     * {@code Signer} class implementing the chosen algorithm by the
     * {@code com.amazonaws.auth.SignerFactory} class.
     *
     * @param value The signature algorithm to use for this client, or null to
     *            use the default.
     * @return The updated ClientConfiguration object.
     */
    public ClientConfiguration withSignerOverride(final String value) {
        setSignerOverride(value);
        return this;
    }

    /**
     * Returns whether to attempt to authenticate preemptively against proxy
     * servers using basic authentication
     *
     * @return Whether to authenticate preemptively against proxy server.
     */
    public boolean isPreemptiveBasicProxyAuth() {
        return preemptiveBasicProxyAuth;
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy
     * servers using basic authentication
     *
     * @param preemptiveBasicProxyAuth Whether to authenticate preemptively
     *            against proxy server.
     */
    public void setPreemptiveBasicProxyAuth(Boolean preemptiveBasicProxyAuth) {
        this.preemptiveBasicProxyAuth = preemptiveBasicProxyAuth;
    }

    /**
     * Sets whether to attempt to authenticate preemptively against proxy
     * servers using basic authentication, and returns the updated
     * ClientConfiguration object so that additional method calls may be chained
     * together.
     *
     * @param preemptiveBasicProxyAuth Whether to authenticate preemptively
     *            against proxy server.
     * @return The updated ClientConfiguration objectt=
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withPreemptiveBasicProxyAuth(boolean preemptiveBasicProxyAuth) {
        setPreemptiveBasicProxyAuth(preemptiveBasicProxyAuth);
        return this;
    }

    /**
     * Gets the trust manager to use for secure connections from this client. If
     * null the default authentication will be used.
     *
     * @return The trust manager to use for this client, or null to use the
     *         default authentication for secure connections.
     */
    public TrustManager getTrustManager() {
        return trustManager;
    }

    /**
     * Sets the trust manager to use for secure connections from this client. If
     * null the default authentication will be used.
     *
     * @param trustManager The trust manager to use for this client.
     */
    public void setTrustManager(TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    /**
     * Sets the trust manager to use for secure connections from this client,
     * and returns the updated ClientConfiguration object so that additional
     * calls may be chained together. If null the default authentication will be
     * used.
     *
     * @param trustManager The trust manager to use for this client.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withTrustManager(TrustManager trustManager) {
        setTrustManager(trustManager);
        return this;
    }

    /**
     * Tells whether or not the client should be logging anything. Currently,
     * logging will print curl commands to replay http requests.
     *
     * @return Whether or not the client will be logging.
     */
    public boolean isCurlLogging() {
        return curlLogging;
    }

    /**
     * Sets whether or not the client should be logging any information. This
     * should be used for debug builds only. Defaults to false.
     *
     * @param curlLogging Whether or not the client should be logging operations.
     */
    public void setCurlLogging(boolean curlLogging) {
        this.curlLogging = curlLogging;
    }

    /**
     * Sets whether or not the client should be logging any information. This
     * should be used for debug builds only, and returns the updated
     * ClientConfiguration object so that additional calls may be chained
     * together. Defaults to false.
     *
     * @param curlLogging Whether or not the client should be logging operations.
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withCurlLogging(boolean curlLogging) {
        this.curlLogging = curlLogging;
        return this;
    }

    /**
     * @return if gzip compression is used.
     */
    public boolean isEnableGzip() {
        return enableGzip;
    }

    /**
     * Sets whether gzip compression should be used
     *
     * @param enableGzip true if it is a gzip.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setEnableGzip(boolean enableGzip) {
        this.enableGzip = enableGzip;
    }

    /**
     * Sets whether gzip compression should be used
     *
     * @param enableGzip whether gzip compression should be used
     * @return The updated ClientConfiguration object.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public ClientConfiguration withEnableGzip(boolean enableGzip) {
        setEnableGzip(enableGzip);
        return this;
    }
}
