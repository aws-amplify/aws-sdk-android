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

package com.amazonaws.metrics;

import static com.amazonaws.SDKGlobalConfiguration.DEFAULT_METRICS_SYSTEM_PROPERTY;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.AWSServiceMetrics;

import com.amazonaws.logging.LogFactory;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Used to control the default AWS SDK metric collection system.
 * <p>
 * The default metric collection of the Java AWS SDK is disabled by default. To
 * enable it, simply specify the system property
 * <b>"com.amazonaws.sdk.enableDefaultMetrics"</b> when starting up the JVM.
 * When the system property is specified, a default metric collector will be
 * started at the AWS SDK level. The default implementation uploads the
 * request/response metrics captured to Amazon CloudWatch using AWS credentials
 * obtained via the {@link DefaultAWSCredentialsProviderChain}.
 * <p>
 * For additional optional attributes that can be specified for the system
 * property, please read the javadoc of the individual fields of this class for
 * more details.
 * <p>
 * Instead of via system properties, the default AWS SDK metric collection can
 * also be enabled programmatically via {@link #enableDefaultMetrics()}.
 * Similarly, metric collection at the AWS SDK level can be disabled via
 * {@link #disableMetrics()}.
 * <p>
 * Clients who needs to fully customize the metric collection can implement the
 * SPI {@link MetricCollector}, and then replace the default AWS SDK
 * implementation of the collector via
 * {@link #setMetricCollector(MetricCollector)}.
 * <p>
 * Alternatively, for limited customization of the internal collector
 * implementation provided by the AWS SDK, one can extend the internal Amazon
 * CloudWatch metric collector. See the javadoc at
 * com.amazonaws.metrics.internal.cloudwatch.CloudWatchMetricConfig for more
 * details.
 */
@SuppressWarnings("checkstyle:nowhitespacebefore")
public enum AwsSdkMetrics {
    ;

    /** Constant for default metric namespace. */
    public static final String DEFAULT_METRIC_NAMESPACE = "AWSSDK/Java";

    private static final int QUEUE_POLL_TIMEOUT_MILLI_MINUMUM = 1000;

    private static final String MBEAN_OBJECT_NAME =
            "com.amazonaws.management:type=" + AwsSdkMetrics.class.getSimpleName();
    /**
     * Used to enable the use of a single metric namespace for all levels of SDK
     * generated CloudWatch metrics such as JVM level, host level, etc.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=useSingleMetricNamespace
     * </pre>
     */
    public static final String USE_SINGLE_METRIC_NAMESPACE = "useSingleMetricNamespace";
    /**
     * Used to exclude the generation of JVM metrics when the AWS SDK default
     * metrics is enabled. By default, jvm metrics is included.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=excludeJvmMetrics
     * </pre>
     */
    public static final String EXCLUDE_MACHINE_METRICS = "excludeMachineMetrics";

    /**
     * Used to generate per host level metrics when the AWS SDK default metrics
     * is enabled. By default, per-host level metrics is excluded.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=includePerHostMetrics
     * </pre>
     */
    public static final String INCLUDE_PER_HOST_METRICS = "includePerHostMetrics";

    /**
     * Used to specify an AWS credential property file. By default, the
     * {@link DefaultAWSCredentialsProviderChain} is used.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=credentialFile=/path/aws.properties
     * </pre>
     */
    public static final String AWS_CREDENTAIL_PROPERTIES_FILE = "credentialFile";

    /**
     * Used to specify the Amazon CloudWatch region for metrics uploading
     * purposes. By default, metrics are uploaded to us-east-1.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=cloudwatchRegion=us-west-2
     * </pre>
     */
    public static final String CLOUDWATCH_REGION = "cloudwatchRegion";

    /**
     * Used to specify the internal in-memory queue size for queuing metrics
     * data points. The default size is 1,000.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=metricQueueSize=1000
     * </pre>
     */
    public static final String METRIC_QUEUE_SIZE = "metricQueueSize";

    /**
     * Used to specify the internal queue polling timeout in millisecond. The
     * default timeout is 1 minute, which is optimal for the default CloudWatch
     * implementation.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=getQueuePollTimeoutMilli=60000
     * </pre>
     */
    public static final String QUEUE_POLL_TIMEOUT_MILLI = "getQueuePollTimeoutMilli";

    /**
     * Used to specify a custom metric name space. The default name space is
     * {@link #DEFAULT_METRIC_NAMESPACE}.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=metricNameSpace=MyNameSpace
     * </pre>
     */
    public static final String METRIC_NAME_SPACE = "metricNameSpace";

    /**
     * Used to generate per JVM level metrics when the AWS SDK default metrics
     * is enabled. By default, JVM level metrics are not generated.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=jvmMetricName=Tomcat1
     * </pre>
     */
    public static final String JVM_METRIC_NAME = "jvmMetricName";

    /**
     * Used to explicitly specify the host name for metric purposes, instead of
     * detecting the host name via {@link InetAddress} when the AWS SDK default
     * metrics is enabled. Specifying the host name also has the side effecting
     * of enabling per host level metrics.
     *
     * <pre>
     * Example:
     *  -Dcom.amazonaws.sdk.enableDefaultMetrics=hostMetricName=MyHost
     * </pre>
     */
    public static final String HOST_METRIC_NAME = "hostMetricName";

    private static final String DEFAULT_METRIC_COLLECTOR_FACTORY =
            "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";
    /**
     * True iff the system property {@link #DEFAULT_METRICS_SYSTEM_PROPERTY} has
     * been set; false otherwise.
     */
    private static final boolean DEFAULT_METRICS_ENABLED;
    private static volatile AWSCredentialsProvider credentialProvider;
    /**
     * True if machine metrics is to be excluded; false otherwise.
     */
    private static volatile boolean machineMetricsExcluded;
    /**
     * True if per-host metrics is to be included; false if per-host metrics is
     * to be excluded when {@link #hostMetricName} is not specified. In the
     * absence of {@link #hostMetricName}, the host name will be automatically
     * detected via {@link InetAddress}.
     */
    private static volatile boolean perHostMetricsIncluded;
    private static volatile Regions region;
    private static volatile Integer metricQueueSize;
    private static volatile Long queuePollTimeoutMilli;
    private static volatile String metricNameSpace = DEFAULT_METRIC_NAMESPACE;
    private static volatile String credentialFile;

    /**
     * No JVM level metrics is generated if this field is set to null or blank.
     * Otherwise, the value in this field is used to compose the metric name
     * space. Example:
     * <ol>
     * <li>If jvmMetricName="Tomcat1" and host-level metrics is disabled, the
     * metric name space will be something like: "AWSSDK/Java/Tomcat1".</li>
     * <li>If jvmMetricName="Tomcat1" and host-level metrics is enabled, the
     * metric name space will be something like:
     * "AWSSDK/Java/myhost.mycompany.com/Tomcat1".</li>
     * <li>If jvmMetricName="Tomcat1" and host-level metrics is enabled and the
     * metricNameSpace="MyNameSpace", the metric name space will be something
     * like: "MyNameSpace/myhost.mycompany.com/Tomcat1".</li>
     * </ol>
     */
    private static volatile String jvmMetricName;
    private static volatile String hostMetricName;
    /**
     * True if the same metric namespace is to be used for all levels (such as
     * JVM level, host-level, etc.) of AWS Cloudwatch Metrics for the Java SDK;
     * false otherwise.
     */
    private static volatile boolean singleMetricNamespace;

    static {
        String defaultMetrics = System.getProperty(DEFAULT_METRICS_SYSTEM_PROPERTY);
        DEFAULT_METRICS_ENABLED = defaultMetrics != null;
        if (DEFAULT_METRICS_ENABLED) {
            String[] values = defaultMetrics.split(",");
            boolean excludeMachineMetrics = false;
            boolean includePerHostMetrics = false;
            boolean useSingleMetricNamespace = false;
            for (String s : values) {
                String part = s.trim();
                if (!excludeMachineMetrics && EXCLUDE_MACHINE_METRICS.equals(part)) {
                    excludeMachineMetrics = true;
                } else if (!includePerHostMetrics && INCLUDE_PER_HOST_METRICS.equals(part)) {
                    includePerHostMetrics = true;
                } else if (!useSingleMetricNamespace && USE_SINGLE_METRIC_NAMESPACE.equals(part)) {
                    useSingleMetricNamespace = true;
                } else {
                    String[] pair = part.split("=");
                    if (pair.length == 2) {
                        String key = pair[0].trim();
                        String value = pair[1].trim();
                        try {
                            if (AWS_CREDENTAIL_PROPERTIES_FILE.equals(key)) {
                                setCredentialFile0(value);
                            } else if (CLOUDWATCH_REGION.equals(key)) {
                                region = Regions.fromName(value);
                            } else if (METRIC_QUEUE_SIZE.equals(key)) {
                                Integer i = new Integer(value);
                                if (i.intValue() < 1)
                                    throw new IllegalArgumentException(METRIC_QUEUE_SIZE
                                            + " must be at least 1");
                                metricQueueSize = i;
                            } else if (QUEUE_POLL_TIMEOUT_MILLI.equals(key)) {
                                Long i = new Long(value);
                                if (i.intValue() < QUEUE_POLL_TIMEOUT_MILLI_MINUMUM)
                                    throw new IllegalArgumentException(QUEUE_POLL_TIMEOUT_MILLI
                                            + " must be at least 1000");
                                queuePollTimeoutMilli = i;
                            } else if (METRIC_NAME_SPACE.equals(key)) {
                                metricNameSpace = value;
                            } else if (JVM_METRIC_NAME.equals(key)) {
                                jvmMetricName = value;
                            } else if (HOST_METRIC_NAME.equals(key)) {
                                hostMetricName = value;
                            } else {
                                LogFactory.getLog(AwsSdkMetrics.class).debug(
                                        "Ignoring unrecognized parameter: " + part);
                            }
                        } catch (Exception e) {
                            LogFactory.getLog(AwsSdkMetrics.class).debug("Ignoring failure", e);
                        }
                    }
                }
            }
            machineMetricsExcluded = excludeMachineMetrics;
            perHostMetricsIncluded = includePerHostMetrics;
            singleMetricNamespace = useSingleMetricNamespace;
        }
    }

    private static final MetricRegistry REGISTRY = new MetricRegistry();
    private static volatile MetricCollector mc;
    /**
     * Used to disallow re-entrancy in enabling the default metric collection
     * system.
     */
    private static boolean dirtyEnabling;

    /**
     * @param <T> RequestMetricCollector type.
     * @return a non-null request metric collector for the SDK. If no custom
     * request metric collector has previously been specified via
     * {@link #setMetricCollector(MetricCollector)} and the
     * {@link SDKGlobalConfiguration#DEFAULT_METRICS_SYSTEM_PROPERTY} has been
     * set, then this method will initialize and return the default metric
     * collector provided by the AWS SDK on a best-attempt basis.
     */
    public static <T extends RequestMetricCollector> T getRequestMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T) (mc == null ? RequestMetricCollector.NONE : mc.getRequestMetricCollector());
        return t;
    }

    /**
     * @param <T> Tje ServiceMetricCollector type.
     * @return a non-null service metric collector for the SDK.
     */
    public static <T extends ServiceMetricCollector> T getServiceMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T) (mc == null ? ServiceMetricCollector.NONE : mc.getServiceMetricCollector());
        return t;
    }

    /**
     * This method should never be called by anyone except the JMX MBean used
     * for administrative purposes only.
     */
    static MetricCollector getInternalMetricCollector() {
        return mc;
    }

    /**
     * @param <T> The MetricCollector type.
     * @return a non-null metric collector for the SDK.
     */
    public static <T extends MetricCollector> T getMetricCollector() {
        if (mc == null) {
            if (isDefaultMetricsEnabled())
                enableDefaultMetrics();
        }
        @SuppressWarnings("unchecked")
        T t = (T) (mc == null ? MetricCollector.NONE : mc);
        return t;
    }

    /**
     * Sets the metric collector to be used by the AWS SDK, and stop the
     * previously running collector used by the AWS SDK, if any. Note, however,
     * a request metric collector specified at the web service client level or
     * request level, if any, always takes precedence over the one specified at
     * the AWS SDK level.
     * <p>
     * Caller of this method is responsible for starting the new metric
     * collector specified as the input parameter.
     *
     * @param mc the metric collector to be used by the AWS SDK; or null if no
     *            metric collection is to be performed at the AWS SDK level.
     * @see RequestMetricCollector
     * @see RequestMetricCollector#NONE
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public static synchronized void setMetricCollector(MetricCollector mc) {
        MetricCollector old = AwsSdkMetrics.mc;
        AwsSdkMetrics.mc = mc;
        if (old != null) {
            old.stop();
        }
    }

    /**
     * Used to set whether the machine metrics is to be excluded.
     *
     * @param excludeMachineMetrics true if machine metrics is to be excluded;
     *            false otherwise.
     */
    public static void setMachineMetricsExcluded(boolean excludeMachineMetrics) {
        AwsSdkMetrics.machineMetricsExcluded = excludeMachineMetrics;
    }

    /**
     * Used to set whether the per-host metrics is to be included.
     *
     * @param includePerHostMetrics true if per-host metrics is to be included;
     *            false otherwise.
     */
    public static void setPerHostMetricsIncluded(boolean includePerHostMetrics) {
        AwsSdkMetrics.perHostMetricsIncluded = includePerHostMetrics;
    }

    /**
     * @return true if the system property
     * {@link SDKGlobalConfiguration#DEFAULT_METRICS_SYSTEM_PROPERTY} has been
     * set; false otherwise.
     */
    public static boolean isDefaultMetricsEnabled() {
        return DEFAULT_METRICS_ENABLED;
    }

    /**
     * @return true if a single metric name space is to be used for all levels
     * of SDK generated CloudWatch metrics, including JVM level, host level,
     * etc.; false otherwise.
     */
    public static boolean isSingleMetricNamespace() {
        return singleMetricNamespace;
    }

    /**
     * Used to set whether a single metric name space is to be used for all
     * levels of SDK generated CloudWatch metrics, including JVM level, host
     * level, etc.
     *
     * @param singleMetricNamespace true if single metric name is to be used;
     *            false otherwise.
     */
    public static void setSingleMetricNamespace(boolean singleMetricNamespace) {
        AwsSdkMetrics.singleMetricNamespace = singleMetricNamespace;
    }

    /**
     * @return true if metrics at the AWS SDK level is enabled; false if
     * disabled.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public static boolean isMetricsEnabled() {
        MetricCollector mc = AwsSdkMetrics.mc;
        return mc != null && mc.isEnabled();
    }

    /**
     * @return true if machine metrics is to be excluded.
     */
    public static boolean isMachineMetricExcluded() {
        return machineMetricsExcluded;
    }

    /**
     * @return true if the per-host metrics flag has been set; false otherwise.
     */
    public static boolean isPerHostMetricIncluded() {
        return perHostMetricsIncluded;
    }

    /**
     * @return true if per-host metrics is enabled; false otherwise.
     */
    public static boolean isPerHostMetricEnabled() {
        if (perHostMetricsIncluded)
            return true;
        String host = hostMetricName;
        host = host == null ? "" : host.trim();
        return host.length() > 0;
    }

    /**
     * Starts the default AWS SDK metric collector, but only if no metric
     * collector is currently in use at the AWS SDK level.
     *
     * @return true if the default AWS SDK metric collector has been
     *         successfully started by this call; false otherwise.
     */
    public static synchronized boolean enableDefaultMetrics() {
        if (mc == null || !mc.isEnabled()) {
            if (dirtyEnabling) {
                throw new IllegalStateException("Reentrancy is not allowed");
            }
            dirtyEnabling = true;
            try {
                Class<?> c = Class.forName(DEFAULT_METRIC_COLLECTOR_FACTORY);
                MetricCollector.Factory f = (MetricCollector.Factory) c.newInstance();
                MetricCollector instance = f.getInstance();
                if (instance != null) {
                    setMetricCollector(instance);
                    return true;
                }
            } catch (Exception e) {
                LogFactory.getLog(AwsSdkMetrics.class)
                        .warn("Failed to enable the default metrics", e);
            } finally {
                dirtyEnabling = false;
            }
        }
        return false;
    }

    /**
     * Convenient method to disable the metric collector at the AWS SDK level.
     */
    public static void disableMetrics() {
        setMetricCollector(MetricCollector.NONE);
    }

    /**
     * Adds the given metric type to the REGISTRY of predefined metrics to be
     * captured at the AWS SDK level.
     * @param type the metric type.
     * @return true if the set of predefined metric types gets changed as a
     *         result of the call
     */
    public static boolean add(MetricType type) {
        return type == null ? false : REGISTRY.addMetricType(type);
    }

    /**
     * Adds the given metric types to the REGISTRY of predefined metrics to be
     * captured at the AWS SDK level.
     * @param types the collection of metric types.
     * @param <T> the MetricType type.
     * @return true if the set of predefined metric types gets changed as a
     *         result of the call
     */
    public static <T extends MetricType> boolean addAll(Collection<T> types) {
        return types == null || types.size() == 0
                ? false
                : REGISTRY.addMetricTypes(types);
    }

    /**
     * Sets the given metric types to replace the REGISTRY of predefined metrics
     * to be captured at the AWS SDK level.
     * @param types the collection of metric types.
     * @param <T> the MetricType type.
     */
    public static <T extends MetricType> void set(Collection<T> types) {
        REGISTRY.setMetricTypes(types);
    }

    /**
     * Removes the given metric type from the REGISTRY of predefined metrics to
     * be captured at the AWS SDK level.
     * @param type the collection of metric types.
     * @return true if the set of predefined metric types gets changed as a
     *         result of the call
     */
    public static boolean remove(MetricType type) {
        return type == null ? false : REGISTRY.removeMetricType(type);
    }

    /**
     * @return an unmodifiable set of the current predefined metrics.
     */
    public static Set<MetricType> getPredefinedMetrics() {
        return REGISTRY.predefinedMetrics();
    }

    /**
     * @return the credential provider for the default AWS SDK metric
     * implementation. This method is restricted to calls from the default AWS
     * SDK metric implementation.
     *
     * @throws SecurityException if called outside the default AWS SDK metric
     *             implementation.
     */
    public static AWSCredentialsProvider getCredentialProvider() {
        StackTraceElement[] e = Thread.currentThread().getStackTrace();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getClassName().equals(DEFAULT_METRIC_COLLECTOR_FACTORY)) {
                return credentialProvider;
            }
        }
        SecurityException ex = new SecurityException();
        LogFactory.getLog(AwsSdkMetrics.class).warn(
                "Illegal attempt to access the credential provider", ex);
        throw ex;
    }

    /**
     * Sets the credential provider for the default AWS SDK metric
     * implementation; or null if the default is to be used. Calling this method
     * may result in the credential provider being different from the credential
     * file property.
     * @param provider the AWSCredentialsProvider.
     */
    public static synchronized void setCredentialProvider(
            AWSCredentialsProvider provider) {
        credentialProvider = provider;
    }

    /**
     * @return the region configured for the default AWS SDK metric collector;
     * or null if the default is to be used.
     */
    public static Regions getRegion() {
        return region;
    }

    /**
     * Sets the region to be used for the default AWS SDK metric collector; or
     * null if the default is to be used.
     * @param region the region.
     */
    public static void setRegion(Regions region) {
        AwsSdkMetrics.region = region;
    }

    /**
     * @return the last set AWS credential file, or null if there is none.
     */
    public static String getCredentailFile() {
        return credentialFile;
    }

    /**
     * Sets the AWS credential file to be used for accessing Amazon CloudWatch.
     * Successfully calling this method would result in the AWS credential
     * provider to make use of the given credential file.
     * @param filepath the credential filepath.
     */
    public static void setCredentialFile(String filepath)
            throws IOException {
        setCredentialFile0(filepath);
    }

    /**
     * Internal method to implement the {@link #setCredentialFile(String)}.
     */
    private static void setCredentialFile0(String filepath)
            throws IOException {
        final PropertiesCredentials cred =
                new PropertiesCredentials(new File(filepath));
        synchronized (AwsSdkMetrics.class) {
            credentialProvider = new AWSCredentialsProvider() {
                @Override
                public void refresh() {
                }

                @Override
                public AWSCredentials getCredentials() {
                    return cred;
                }
            };
            AwsSdkMetrics.credentialFile = filepath;
        }
    }

    /**
     * @return the internal metric queue size to be used for the default AWS SDK
     * metric collector; or null if the default is to be used.
     */
    public static Integer getMetricQueueSize() {
        return metricQueueSize;
    }

    /**
     * Sets the metric queue size to be used for the default AWS SDK metric
     * collector; or null if the default is to be used.
     * @param size the size of the metric queue.
     */
    public static void setMetricQueueSize(Integer size) {
        metricQueueSize = size;
    }

    /**
     * @return the internal metric queue timeout in millisecond to be used for
     * the default AWS SDK metric collector; or null if the default is to be
     * used.
     */
    public static Long getQueuePollTimeoutMilli() {
        return queuePollTimeoutMilli;
    }

    /**
     * Sets the queue poll time in millisecond to be used for the default AWS
     * SDK metric collector; or null if the default is to be used.
     * @param timeoutMilli the timeout in milliseconds.
     */
    public static void setQueuePollTimeoutMilli(Long timeoutMilli) {
        queuePollTimeoutMilli = timeoutMilli;
    }

    /**
     * @return the metric name space, which is never null or blank.
     */
    public static String getMetricNameSpace() {
        return metricNameSpace;
    }

    /**
     * Sets the metric name space.
     *
     * @param metricNameSpace metric name space which must neither be null or
     *            blank.
     * @throws IllegalArgumentException if the specified metric name space is
     *             either null or blank.
     */
    public static void setMetricNameSpace(String metricNameSpace) {
        if (metricNameSpace == null || metricNameSpace.trim().length() == 0)
            throw new IllegalArgumentException();
        AwsSdkMetrics.metricNameSpace = metricNameSpace;
    }

    /**
     * @return the name of the JVM for generating per-JVM level metrics; or null
     * or blank if per-JVM level metrics are disabled.
     */
    public static String getJvmMetricName() {
        return jvmMetricName;
    }

    /**
     * Sets the name of the JVM for generating per-JVM level metrics.
     *
     * @param jvmMetricName name of the JVM for generating per-JVM level
     *            metrics; or null or blank if per-JVM level metrics are to be
     *            disabled.
     */
    public static void setJvmMetricName(String jvmMetricName) {
        AwsSdkMetrics.jvmMetricName = jvmMetricName;
    }

    /**
     * @return the host name for generating per-host level metrics; or null or
     * blank if the host is to be automatically detected via {@link InetAddress}
     * .
     */
    public static String getHostMetricName() {
        return hostMetricName;
    }

    /**
     * Sets the host name for generating per-host level metrics.
     *
     * @param hostMetricName host name for generating per-host level metrics; or
     *            null or blank if the host is to be automatically detected via
     *            {@link InetAddress}.
     */
    public static void setHostMetricName(String hostMetricName) {
        AwsSdkMetrics.hostMetricName = hostMetricName;
    }

    /**
     * Used as a REGISTRY for the predefined metrics to be captured by the
     * metric collector at the AWS SDK level.
     */
    private static class MetricRegistry {
        private final Set<MetricType> metricTypes = new HashSet<MetricType>();
        private volatile Set<MetricType> readOnly;

        MetricRegistry() {
            metricTypes.add(Field.ClientExecuteTime);
            metricTypes.add(Field.Exception);
            metricTypes.add(Field.HttpClientRetryCount);
            metricTypes.add(Field.HttpRequestTime);
            metricTypes.add(Field.RequestCount);
            // metricTypes.add(Field.RequestSigningTime);
            // metricTypes.add(Field.ResponseProcessingTime);
            metricTypes.add(Field.RetryCount);
            metricTypes.add(Field.HttpClientSendRequestTime);
            metricTypes.add(Field.HttpClientReceiveResponseTime);
            metricTypes.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            syncReadOnly();
        }

        private void syncReadOnly() {
            readOnly = Collections.unmodifiableSet(new HashSet<MetricType>(metricTypes));
        }

        public boolean addMetricType(MetricType type) {
            synchronized (metricTypes) {
                boolean added = metricTypes.add(type);
                if (added)
                    syncReadOnly();
                return added;
            }
        }

        public <T extends MetricType> boolean addMetricTypes(Collection<T> types) {
            synchronized (metricTypes) {
                boolean added = metricTypes.addAll(types);
                if (added)
                    syncReadOnly();
                return added;
            }
        }

        public <T extends MetricType> void setMetricTypes(Collection<T> types) {
            synchronized (metricTypes) {
                if (types == null || types.size() == 0) {
                    if (metricTypes.size() == 0)
                        return;
                    if (types == null)
                        types = Collections.emptyList();
                }
                metricTypes.clear();
                if (!addMetricTypes(types)) {
                    syncReadOnly(); // avoid missing sync
                }
            }
        }

        public boolean removeMetricType(MetricType type) {
            synchronized (metricTypes) {
                boolean removed = metricTypes.remove(type);
                if (removed)
                    syncReadOnly();
                return removed;
            }
        }

        public Set<MetricType> predefinedMetrics() {
            return readOnly;
        }
    }
}
