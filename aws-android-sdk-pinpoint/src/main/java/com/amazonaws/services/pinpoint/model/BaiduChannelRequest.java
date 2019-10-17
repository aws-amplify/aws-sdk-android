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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Baidu Cloud Push credentials
 */
public class BaiduChannelRequest implements Serializable {
    /**
     * Platform credential API key from Baidu.
     */
    private String apiKey;

    /**
     * If the channel is enabled for sending messages.
     */
    private Boolean enabled;

    /**
     * Platform credential Secret key from Baidu.
     */
    private String secretKey;

    /**
     * Platform credential API key from Baidu.
     *
     * @return Platform credential API key from Baidu.
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Platform credential API key from Baidu.
     *
     * @param apiKey Platform credential API key from Baidu.
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Platform credential API key from Baidu.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiKey Platform credential API key from Baidu.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduChannelRequest withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @return If the channel is enabled for sending messages.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     *
     * @param enabled If the channel is enabled for sending messages.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled If the channel is enabled for sending messages.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Platform credential Secret key from Baidu.
     *
     * @return Platform credential Secret key from Baidu.
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Platform credential Secret key from Baidu.
     *
     * @param secretKey Platform credential Secret key from Baidu.
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * Platform credential Secret key from Baidu.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretKey Platform credential Secret key from Baidu.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduChannelRequest withSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
        if (getApiKey() != null)
            sb.append("ApiKey: " + getApiKey() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getSecretKey() != null)
            sb.append("SecretKey: " + getSecretKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaiduChannelRequest == false)
            return false;
        BaiduChannelRequest other = (BaiduChannelRequest) obj;

        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null
                && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        return true;
    }
}
