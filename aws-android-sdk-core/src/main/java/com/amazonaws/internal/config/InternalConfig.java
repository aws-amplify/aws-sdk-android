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

package com.amazonaws.internal.config;

import com.amazonaws.regions.Regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Internal configuration for the AWS Android SDK.
 */
public class InternalConfig {
    private static final Log log = LogFactory.getLog(InternalConfig.class);
    private static final String SERVICE_REGION_DELIMITOR = "/";

    private final SignerConfig defaultSignerConfig;
    private final Map<String, SignerConfig> serviceRegionSigners;
    private final Map<String, SignerConfig> regionSigners;
    private final Map<String, SignerConfig> serviceSigners;
    private final Map<String, HttpClientConfig> httpClients;
    private final List<HostRegexToRegionMapping> hostRegexToRegionMappings;

    InternalConfig() {
        defaultSignerConfig = getDefaultSigner();
        regionSigners = getDefaultRegionSigners();
        serviceSigners = getDefaultServiceSigners();
        serviceRegionSigners = getDefaultServiceRegionSigners();
        httpClients = getDefaultHttpClients();
        hostRegexToRegionMappings = getDefaultHostRegexToRegionMappings();
    }

    /**
     * Returns the signer configuration for the specified service, not specific
     * to any region.
     */
    public SignerConfig getSignerConfig(String serviceName) {
        return getSignerConfig(serviceName, null);
    }

    /**
     * Returns the http client configuration for the http client name.
     */
    public HttpClientConfig getHttpClientConfig(String httpClientName) {
        return httpClients.get(httpClientName);
    }

    /**
     * Returns the signer configuration for the specified service name and an
     * optional region name.
     *
     * @param serviceName must not be null
     * @param regionName similar to the region name in {@link Regions}; can be
     *            null.
     * @return the signer
     */
    public SignerConfig getSignerConfig(String serviceName, String regionName) {
        if (serviceName == null) {
            throw new IllegalArgumentException();
        }
        SignerConfig signerConfig = null;
        if (regionName != null) {
            // Service+Region signer config has the highest precedence
            final String key = serviceName + SERVICE_REGION_DELIMITOR + regionName;
            signerConfig = serviceRegionSigners.get(key);
            if (signerConfig != null) {
                return signerConfig;
            }
            // Region signer config has the 2nd highest precedence
            signerConfig = regionSigners.get(regionName);
            if (signerConfig != null) {
                return signerConfig;
            }
        }
        // Service signer config has the 3rd highest precedence
        signerConfig = serviceSigners.get(serviceName);
        // Fall back to the default
        return signerConfig == null ? defaultSignerConfig : signerConfig;
    }

    /**
     * @return all the host-name-regex to region-name mappings.
     */
    public List<HostRegexToRegionMapping> getHostRegexToRegionMappings() {
        return Collections.unmodifiableList(hostRegexToRegionMappings);
    }

    private static Map<String, HttpClientConfig> getDefaultHttpClients() {
        // map from service client name to sigv4 service name
        final Map<String, HttpClientConfig> ret = new HashMap<String, HttpClientConfig>();
        ret.put("AmazonCloudWatchClient", new HttpClientConfig("monitoring"));
        ret.put("AmazonCloudWatchLogsClient", new HttpClientConfig("logs"));
        ret.put("AmazonSimpleDBClient", new HttpClientConfig("sdb"));
        ret.put("AmazonSimpleEmailServiceClient", new HttpClientConfig("email"));
        ret.put("AWSSecurityTokenServiceClient", new HttpClientConfig("sts"));
        ret.put("AmazonCognitoIdentityClient", new HttpClientConfig("cognito-identity"));
        ret.put("AmazonCognitoIdentityProviderClient", new HttpClientConfig("cognito-idp"));
        ret.put("AmazonCognitoSyncClient", new HttpClientConfig("cognito-sync"));
        ret.put("AmazonKinesisFirehoseClient", new HttpClientConfig("firehose"));
        ret.put("AWSIotClient", new HttpClientConfig("execute-api"));
        ret.put("AmazonLexRuntimeClient", new HttpClientConfig("runtime.lex"));
        ret.put("AmazonPinpointClient", new HttpClientConfig("mobiletargeting"));
        ret.put("AmazonPinpointAnalyticsClient", new HttpClientConfig("mobileanalytics"));
        ret.put("AmazonTranscribeClient", new HttpClientConfig("transcribe"));
        ret.put("AmazonTranslateClient", new HttpClientConfig("translate"));
        ret.put("AmazonComprehendClient", new HttpClientConfig("comprehend"));
        ret.put("AWSKinesisVideoArchivedMediaClient", new HttpClientConfig("kinesisvideo"));
        return ret;
    }

    private static Map<String, SignerConfig> getDefaultRegionSigners() {
        // map from region name to signer type
        final Map<String, SignerConfig> ret = new HashMap<String, SignerConfig>();
        ret.put("eu-central-1", new SignerConfig("AWS4SignerType"));
        ret.put("cn-north-1", new SignerConfig("AWS4SignerType"));
        return ret;
    }

    private static Map<String, SignerConfig> getDefaultServiceRegionSigners() {
        // map from "<service>/<region>" to signer type
        final Map<String, SignerConfig> ret = new HashMap<String, SignerConfig>();
        ret.put("s3/eu-central-1", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/cn-north-1", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/us-east-2", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/ca-central-1", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/ap-south-1", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/ap-northeast-2", new SignerConfig("AWSS3V4SignerType"));
        ret.put("s3/eu-west-2", new SignerConfig("AWSS3V4SignerType"));
        return ret;
    }

    private static Map<String, SignerConfig> getDefaultServiceSigners() {
        // map from abbreviated service name to signer type
        final Map<String, SignerConfig> ret = new HashMap<String, SignerConfig>();
        ret.put("ec2", new SignerConfig("QueryStringSignerType"));
        ret.put("email", new SignerConfig("AWS3SignerType"));
        ret.put("s3", new SignerConfig("S3SignerType"));
        ret.put("sdb", new SignerConfig("QueryStringSignerType"));
        ret.put("runtime.lex", new SignerConfig("AmazonLexV4Signer"));
        ret.put("polly", new SignerConfig("AmazonPollyCustomPresigner"));
        return ret;
    }

    private static SignerConfig getDefaultSigner() {
        return new SignerConfig("AWS4SignerType");
    }

    private static List<HostRegexToRegionMapping> getDefaultHostRegexToRegionMappings() {
        final List<HostRegexToRegionMapping> ret = new ArrayList<HostRegexToRegionMapping>();
        ret.add(new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        ret.add(new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        ret.add(new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com",
                "us-gov-west-1"));
        return ret;
    }

    // For debugging purposes
    void dump() {
        final StringBuilder sb = new StringBuilder().append("defaultSignerConfig: ")
                .append(defaultSignerConfig).append("\n")
                .append("serviceRegionSigners: ").append(serviceRegionSigners)
                .append("\n").append("regionSigners: ").append(regionSigners)
                .append("\n").append("serviceSigners: ").append(serviceSigners)
                .append("\n").append("hostRegexToRegionMappings: ")
                .append(hostRegexToRegionMappings);
        log.debug(sb.toString());
    }

    public static class Factory {
        private static final InternalConfig SINGELTON;
        static {
            InternalConfig config = null;
            try {
                config = new InternalConfig();
            } catch (final RuntimeException ex) {
                throw ex;
            } catch (final Exception ex) {
                throw new IllegalStateException(
                        "Fatal: Failed to load the internal config for AWS Android SDK",
                        ex);
            }
            SINGELTON = config;
        }

        /**
         * Returns a non-null and immutable instance of the AWS SDK internal
         * configuration.
         */
        public static InternalConfig getInternalConfig() {
            return SINGELTON;
        }
    }
}
