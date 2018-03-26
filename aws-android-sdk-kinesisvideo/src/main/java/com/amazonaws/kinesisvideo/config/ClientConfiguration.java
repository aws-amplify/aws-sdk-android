/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.config;

import java.net.URI;

public final class ClientConfiguration {
    private String region;
    private String serviceName;
    private String apiName;
    private String materialSet;
    private String streamName;
    private URI streamUri;
    private Integer connectionTimeoutInMillis;
    private Integer readTimeoutInMillis;
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ClientConfiguration [region=" + region + ", serviceName=" + serviceName + ", apiName=" + apiName
                + ", materialSet=" + materialSet + ", streamName=" + streamName + ", streamUri=" + streamUri
                + ", connectionTimeoutInMillis=" + connectionTimeoutInMillis + ", readTimeoutInMillis="
                + readTimeoutInMillis + "super=" + super.toString() + "]";
    }

    ClientConfiguration(ClientConfigurationBuilder builder) {
        this.region = builder.region;
        this.serviceName = builder.serviceName;
        this.apiName = builder.apiName;
        this.materialSet = builder.materialSet;
        this.streamName = builder.streamName;
        this.streamUri = builder.streamUri;
        this.connectionTimeoutInMillis = builder.connectionTimeoutInMillis;
        this.readTimeoutInMillis = builder.readTimeoutInMillis;
    }
    
    public static ClientConfigurationBuilder builder() {
        return new ClientConfigurationBuilder();
    }
    
    public static class ClientConfigurationBuilder {
        private String region;
        private String serviceName;
        private String apiName;
        private String materialSet;
        private String streamName;
        private URI streamUri;
        private Integer connectionTimeoutInMillis;
        private Integer readTimeoutInMillis;
        
        ClientConfigurationBuilder() { }
        
        public ClientConfigurationBuilder region(String region) {
            this.region = region;
            return this;
        }
        
        public ClientConfigurationBuilder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        
        public ClientConfigurationBuilder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        
        public ClientConfigurationBuilder materialSet(String materialSet) {
            this.materialSet = materialSet;
            return this;
        }
        
        public ClientConfigurationBuilder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        
        public ClientConfigurationBuilder streamUri(URI streamUri) {
            this.streamUri = streamUri;
            return this;
        }
        
        public ClientConfigurationBuilder connectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
            this.connectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }
        
        public ClientConfigurationBuilder readTimeoutInMillis(Integer readTimeoutInMillis) {
            this.readTimeoutInMillis = readTimeoutInMillis;
            return this;
        }
        
        public ClientConfiguration build() {
            return new ClientConfiguration(this);
        }
    }
    
    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }
    /**
     * @return the serviceName
     */
    public String getServiceName() {
        return serviceName;
    }
    /**
     * @return the apiName
     */
    public String getApiName() {
        return apiName;
    }
    /**
     * @return the materialSet
     */
    public String getMaterialSet() {
        return materialSet;
    }
    /**
     * @return the streamName
     */
    public String getStreamName() {
        return streamName;
    }
    /**
     * @return the streamUri
     */
    public URI getStreamUri() {
        return streamUri;
    }
    /**
     * @return the connectionTimeoutInMillis
     */
    public Integer getConnectionTimeoutInMillis() {
        return connectionTimeoutInMillis;
    }
    /**
     * @return the readTimeoutInMillis
     */
    public Integer getReadTimeoutInMillis() {
        return readTimeoutInMillis;
    }
}
