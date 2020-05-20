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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Hls Akamai Settings
 */
public class HlsAkamaiSettings implements Serializable {
    /**
     * Number of seconds to wait before retrying connection to the CDN if the
     * connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer connectionRetryInterval;

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 600<br/>
     */
    private Integer filecacheDuration;

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     */
    private String httpTransferMode;

    /**
     * Number of retry attempts that will be made before the Live Event is put
     * into an error state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numRetries;

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     */
    private Integer restartDelay;

    /**
     * Salt for authenticated Akamai.
     */
    private String salt;

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is
     * used.
     */
    private String token;

    /**
     * Number of seconds to wait before retrying connection to the CDN if the
     * connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of seconds to wait before retrying connection to the CDN
     *         if the connection is lost.
     */
    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the CDN if the
     * connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            connection to the CDN if the connection is lost.
     */
    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the CDN if the
     * connection is lost.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            connection to the CDN if the connection is lost.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
        return this;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 600<br/>
     *
     * @return Size in seconds of file cache for streaming outputs.
     */
    public Integer getFilecacheDuration() {
        return filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 600<br/>
     *
     * @param filecacheDuration Size in seconds of file cache for streaming
     *            outputs.
     */
    public void setFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 600<br/>
     *
     * @param filecacheDuration Size in seconds of file cache for streaming
     *            outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
        return this;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     *
     * @return Specify whether or not to use chunked transfer encoding to
     *         Akamai. User should contact Akamai to enable this feature.
     * @see HlsAkamaiHttpTransferMode
     */
    public String getHttpTransferMode() {
        return httpTransferMode;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     *
     * @param httpTransferMode Specify whether or not to use chunked transfer
     *            encoding to Akamai. User should contact Akamai to enable this
     *            feature.
     * @see HlsAkamaiHttpTransferMode
     */
    public void setHttpTransferMode(String httpTransferMode) {
        this.httpTransferMode = httpTransferMode;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     *
     * @param httpTransferMode Specify whether or not to use chunked transfer
     *            encoding to Akamai. User should contact Akamai to enable this
     *            feature.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAkamaiHttpTransferMode
     */
    public HlsAkamaiSettings withHttpTransferMode(String httpTransferMode) {
        this.httpTransferMode = httpTransferMode;
        return this;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     *
     * @param httpTransferMode Specify whether or not to use chunked transfer
     *            encoding to Akamai. User should contact Akamai to enable this
     *            feature.
     * @see HlsAkamaiHttpTransferMode
     */
    public void setHttpTransferMode(HlsAkamaiHttpTransferMode httpTransferMode) {
        this.httpTransferMode = httpTransferMode.toString();
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User
     * should contact Akamai to enable this feature.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHUNKED, NON_CHUNKED
     *
     * @param httpTransferMode Specify whether or not to use chunked transfer
     *            encoding to Akamai. User should contact Akamai to enable this
     *            feature.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAkamaiHttpTransferMode
     */
    public HlsAkamaiSettings withHttpTransferMode(HlsAkamaiHttpTransferMode httpTransferMode) {
        this.httpTransferMode = httpTransferMode.toString();
        return this;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put
     * into an error state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of retry attempts that will be made before the Live Event
     *         is put into an error state.
     */
    public Integer getNumRetries() {
        return numRetries;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put
     * into an error state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts that will be made before the
     *            Live Event is put into an error state.
     */
    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put
     * into an error state.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts that will be made before the
     *            Live Event is put into an error state.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
        return this;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @return If a streaming output fails, number of seconds to wait until a
     *         restart is initiated. A value of 0 means never restart.
     */
    public Integer getRestartDelay() {
        return restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param restartDelay If a streaming output fails, number of seconds to
     *            wait until a restart is initiated. A value of 0 means never
     *            restart.
     */
    public void setRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param restartDelay If a streaming output fails, number of seconds to
     *            wait until a restart is initiated. A value of 0 means never
     *            restart.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
        return this;
    }

    /**
     * Salt for authenticated Akamai.
     *
     * @return Salt for authenticated Akamai.
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Salt for authenticated Akamai.
     *
     * @param salt Salt for authenticated Akamai.
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * Salt for authenticated Akamai.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param salt Salt for authenticated Akamai.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withSalt(String salt) {
        this.salt = salt;
        return this;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is
     * used.
     *
     * @return Token parameter for authenticated akamai. If not specified, _gda_
     *         is used.
     */
    public String getToken() {
        return token;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is
     * used.
     *
     * @param token Token parameter for authenticated akamai. If not specified,
     *            _gda_ is used.
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is
     * used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param token Token parameter for authenticated akamai. If not specified,
     *            _gda_ is used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsAkamaiSettings withToken(String token) {
        this.token = token;
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
        if (getConnectionRetryInterval() != null)
            sb.append("ConnectionRetryInterval: " + getConnectionRetryInterval() + ",");
        if (getFilecacheDuration() != null)
            sb.append("FilecacheDuration: " + getFilecacheDuration() + ",");
        if (getHttpTransferMode() != null)
            sb.append("HttpTransferMode: " + getHttpTransferMode() + ",");
        if (getNumRetries() != null)
            sb.append("NumRetries: " + getNumRetries() + ",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: " + getRestartDelay() + ",");
        if (getSalt() != null)
            sb.append("Salt: " + getSalt() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFilecacheDuration() == null) ? 0 : getFilecacheDuration().hashCode());
        hashCode = prime * hashCode
                + ((getHttpTransferMode() == null) ? 0 : getHttpTransferMode().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode
                + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        hashCode = prime * hashCode + ((getSalt() == null) ? 0 : getSalt().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsAkamaiSettings == false)
            return false;
        HlsAkamaiSettings other = (HlsAkamaiSettings) obj;

        if (other.getConnectionRetryInterval() == null ^ this.getConnectionRetryInterval() == null)
            return false;
        if (other.getConnectionRetryInterval() != null
                && other.getConnectionRetryInterval().equals(this.getConnectionRetryInterval()) == false)
            return false;
        if (other.getFilecacheDuration() == null ^ this.getFilecacheDuration() == null)
            return false;
        if (other.getFilecacheDuration() != null
                && other.getFilecacheDuration().equals(this.getFilecacheDuration()) == false)
            return false;
        if (other.getHttpTransferMode() == null ^ this.getHttpTransferMode() == null)
            return false;
        if (other.getHttpTransferMode() != null
                && other.getHttpTransferMode().equals(this.getHttpTransferMode()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null
                && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null
                && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        if (other.getSalt() == null ^ this.getSalt() == null)
            return false;
        if (other.getSalt() != null && other.getSalt().equals(this.getSalt()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }
}
