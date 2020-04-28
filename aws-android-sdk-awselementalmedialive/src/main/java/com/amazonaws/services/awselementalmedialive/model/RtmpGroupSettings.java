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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Rtmp Group Settings
 */
public class RtmpGroupSettings implements Serializable {
    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     */
    private String authenticationScheme;

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     */
    private String cacheFullBehavior;

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - <br/>
     */
    private Integer cacheLength;

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     */
    private String captionData;

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     */
    private String inputLossAction;

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer restartDelay;

    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     *
     * @return Authentication scheme to use when connecting with CDN
     * @see AuthenticationScheme
     */
    public String getAuthenticationScheme() {
        return authenticationScheme;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     *
     * @param authenticationScheme Authentication scheme to use when connecting
     *            with CDN
     * @see AuthenticationScheme
     */
    public void setAuthenticationScheme(String authenticationScheme) {
        this.authenticationScheme = authenticationScheme;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     *
     * @param authenticationScheme Authentication scheme to use when connecting
     *            with CDN
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthenticationScheme
     */
    public RtmpGroupSettings withAuthenticationScheme(String authenticationScheme) {
        this.authenticationScheme = authenticationScheme;
        return this;
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     *
     * @param authenticationScheme Authentication scheme to use when connecting
     *            with CDN
     * @see AuthenticationScheme
     */
    public void setAuthenticationScheme(AuthenticationScheme authenticationScheme) {
        this.authenticationScheme = authenticationScheme.toString();
    }

    /**
     * Authentication scheme to use when connecting with CDN
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AKAMAI, COMMON
     *
     * @param authenticationScheme Authentication scheme to use when connecting
     *            with CDN
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthenticationScheme
     */
    public RtmpGroupSettings withAuthenticationScheme(AuthenticationScheme authenticationScheme) {
        this.authenticationScheme = authenticationScheme.toString();
        return this;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     *
     * @return Controls behavior when content cache fills up. If remote origin
     *         server stalls the RTMP connection and does not accept content
     *         fast enough the 'Media Cache' will fill up. When the cache
     *         reaches the duration specified by cacheLength the cache will stop
     *         accepting new content. If set to disconnectImmediately, the RTMP
     *         output will force a disconnect. Clear the media cache, and
     *         reconnect after restartDelay seconds. If set to waitForServer,
     *         the RTMP output will wait up to 5 minutes to allow the origin
     *         server to begin accepting data again.
     * @see RtmpCacheFullBehavior
     */
    public String getCacheFullBehavior() {
        return cacheFullBehavior;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     *
     * @param cacheFullBehavior Controls behavior when content cache fills up.
     *            If remote origin server stalls the RTMP connection and does
     *            not accept content fast enough the 'Media Cache' will fill up.
     *            When the cache reaches the duration specified by cacheLength
     *            the cache will stop accepting new content. If set to
     *            disconnectImmediately, the RTMP output will force a
     *            disconnect. Clear the media cache, and reconnect after
     *            restartDelay seconds. If set to waitForServer, the RTMP output
     *            will wait up to 5 minutes to allow the origin server to begin
     *            accepting data again.
     * @see RtmpCacheFullBehavior
     */
    public void setCacheFullBehavior(String cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     *
     * @param cacheFullBehavior Controls behavior when content cache fills up.
     *            If remote origin server stalls the RTMP connection and does
     *            not accept content fast enough the 'Media Cache' will fill up.
     *            When the cache reaches the duration specified by cacheLength
     *            the cache will stop accepting new content. If set to
     *            disconnectImmediately, the RTMP output will force a
     *            disconnect. Clear the media cache, and reconnect after
     *            restartDelay seconds. If set to waitForServer, the RTMP output
     *            will wait up to 5 minutes to allow the origin server to begin
     *            accepting data again.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpCacheFullBehavior
     */
    public RtmpGroupSettings withCacheFullBehavior(String cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior;
        return this;
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     *
     * @param cacheFullBehavior Controls behavior when content cache fills up.
     *            If remote origin server stalls the RTMP connection and does
     *            not accept content fast enough the 'Media Cache' will fill up.
     *            When the cache reaches the duration specified by cacheLength
     *            the cache will stop accepting new content. If set to
     *            disconnectImmediately, the RTMP output will force a
     *            disconnect. Clear the media cache, and reconnect after
     *            restartDelay seconds. If set to waitForServer, the RTMP output
     *            will wait up to 5 minutes to allow the origin server to begin
     *            accepting data again.
     * @see RtmpCacheFullBehavior
     */
    public void setCacheFullBehavior(RtmpCacheFullBehavior cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior.toString();
    }

    /**
     * Controls behavior when content cache fills up. If remote origin server
     * stalls the RTMP connection and does not accept content fast enough the
     * 'Media Cache' will fill up. When the cache reaches the duration specified
     * by cacheLength the cache will stop accepting new content. If set to
     * disconnectImmediately, the RTMP output will force a disconnect. Clear the
     * media cache, and reconnect after restartDelay seconds. If set to
     * waitForServer, the RTMP output will wait up to 5 minutes to allow the
     * origin server to begin accepting data again.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER
     *
     * @param cacheFullBehavior Controls behavior when content cache fills up.
     *            If remote origin server stalls the RTMP connection and does
     *            not accept content fast enough the 'Media Cache' will fill up.
     *            When the cache reaches the duration specified by cacheLength
     *            the cache will stop accepting new content. If set to
     *            disconnectImmediately, the RTMP output will force a
     *            disconnect. Clear the media cache, and reconnect after
     *            restartDelay seconds. If set to waitForServer, the RTMP output
     *            will wait up to 5 minutes to allow the origin server to begin
     *            accepting data again.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpCacheFullBehavior
     */
    public RtmpGroupSettings withCacheFullBehavior(RtmpCacheFullBehavior cacheFullBehavior) {
        this.cacheFullBehavior = cacheFullBehavior.toString();
        return this;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - <br/>
     *
     * @return Cache length, in seconds, is used to calculate buffer size.
     */
    public Integer getCacheLength() {
        return cacheLength;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - <br/>
     *
     * @param cacheLength Cache length, in seconds, is used to calculate buffer
     *            size.
     */
    public void setCacheLength(Integer cacheLength) {
        this.cacheLength = cacheLength;
    }

    /**
     * Cache length, in seconds, is used to calculate buffer size.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - <br/>
     *
     * @param cacheLength Cache length, in seconds, is used to calculate buffer
     *            size.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RtmpGroupSettings withCacheLength(Integer cacheLength) {
        this.cacheLength = cacheLength;
        return this;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     *
     * @return Controls the types of data that passes to onCaptionInfo outputs.
     *         If set to 'all' then 608 and 708 carried DTVCC data will be
     *         passed. If set to 'field1AndField2608' then DTVCC data will be
     *         stripped out, but 608 data from both fields will be passed. If
     *         set to 'field1608' then only the data carried in 608 from field 1
     *         video will be passed.
     * @see RtmpCaptionData
     */
    public String getCaptionData() {
        return captionData;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     *
     * @param captionData Controls the types of data that passes to
     *            onCaptionInfo outputs. If set to 'all' then 608 and 708
     *            carried DTVCC data will be passed. If set to
     *            'field1AndField2608' then DTVCC data will be stripped out, but
     *            608 data from both fields will be passed. If set to
     *            'field1608' then only the data carried in 608 from field 1
     *            video will be passed.
     * @see RtmpCaptionData
     */
    public void setCaptionData(String captionData) {
        this.captionData = captionData;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     *
     * @param captionData Controls the types of data that passes to
     *            onCaptionInfo outputs. If set to 'all' then 608 and 708
     *            carried DTVCC data will be passed. If set to
     *            'field1AndField2608' then DTVCC data will be stripped out, but
     *            608 data from both fields will be passed. If set to
     *            'field1608' then only the data carried in 608 from field 1
     *            video will be passed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpCaptionData
     */
    public RtmpGroupSettings withCaptionData(String captionData) {
        this.captionData = captionData;
        return this;
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     *
     * @param captionData Controls the types of data that passes to
     *            onCaptionInfo outputs. If set to 'all' then 608 and 708
     *            carried DTVCC data will be passed. If set to
     *            'field1AndField2608' then DTVCC data will be stripped out, but
     *            608 data from both fields will be passed. If set to
     *            'field1608' then only the data carried in 608 from field 1
     *            video will be passed.
     * @see RtmpCaptionData
     */
    public void setCaptionData(RtmpCaptionData captionData) {
        this.captionData = captionData.toString();
    }

    /**
     * Controls the types of data that passes to onCaptionInfo outputs. If set
     * to 'all' then 608 and 708 carried DTVCC data will be passed. If set to
     * 'field1AndField2608' then DTVCC data will be stripped out, but 608 data
     * from both fields will be passed. If set to 'field1608' then only the data
     * carried in 608 from field 1 video will be passed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, FIELD1_608, FIELD1_AND_FIELD2_608
     *
     * @param captionData Controls the types of data that passes to
     *            onCaptionInfo outputs. If set to 'all' then 608 and 708
     *            carried DTVCC data will be passed. If set to
     *            'field1AndField2608' then DTVCC data will be stripped out, but
     *            608 data from both fields will be passed. If set to
     *            'field1608' then only the data carried in 608 from field 1
     *            video will be passed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpCaptionData
     */
    public RtmpGroupSettings withCaptionData(RtmpCaptionData captionData) {
        this.captionData = captionData.toString();
        return this;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @return Controls the behavior of this RTMP group if input becomes
     *         unavailable. - emitOutput: Emit a slate until input returns. -
     *         pauseOutput: Stop transmitting data until input returns. This
     *         does not close the underlying RTMP connection.
     * @see InputLossActionForRtmpOut
     */
    public String getInputLossAction() {
        return inputLossAction;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Controls the behavior of this RTMP group if input
     *            becomes unavailable. - emitOutput: Emit a slate until input
     *            returns. - pauseOutput: Stop transmitting data until input
     *            returns. This does not close the underlying RTMP connection.
     * @see InputLossActionForRtmpOut
     */
    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Controls the behavior of this RTMP group if input
     *            becomes unavailable. - emitOutput: Emit a slate until input
     *            returns. - pauseOutput: Stop transmitting data until input
     *            returns. This does not close the underlying RTMP connection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForRtmpOut
     */
    public RtmpGroupSettings withInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
        return this;
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Controls the behavior of this RTMP group if input
     *            becomes unavailable. - emitOutput: Emit a slate until input
     *            returns. - pauseOutput: Stop transmitting data until input
     *            returns. This does not close the underlying RTMP connection.
     * @see InputLossActionForRtmpOut
     */
    public void setInputLossAction(InputLossActionForRtmpOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
    }

    /**
     * Controls the behavior of this RTMP group if input becomes unavailable. -
     * emitOutput: Emit a slate until input returns. - pauseOutput: Stop
     * transmitting data until input returns. This does not close the underlying
     * RTMP connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Controls the behavior of this RTMP group if input
     *            becomes unavailable. - emitOutput: Emit a slate until input
     *            returns. - pauseOutput: Stop transmitting data until input
     *            returns. This does not close the underlying RTMP connection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForRtmpOut
     */
    public RtmpGroupSettings withInputLossAction(InputLossActionForRtmpOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is
     * initiated. A value of 0 means never restart.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
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
     * <b>Range: </b>0 - <br/>
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
     * <b>Range: </b>0 - <br/>
     *
     * @param restartDelay If a streaming output fails, number of seconds to
     *            wait until a restart is initiated. A value of 0 means never
     *            restart.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RtmpGroupSettings withRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
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
        if (getAuthenticationScheme() != null)
            sb.append("AuthenticationScheme: " + getAuthenticationScheme() + ",");
        if (getCacheFullBehavior() != null)
            sb.append("CacheFullBehavior: " + getCacheFullBehavior() + ",");
        if (getCacheLength() != null)
            sb.append("CacheLength: " + getCacheLength() + ",");
        if (getCaptionData() != null)
            sb.append("CaptionData: " + getCaptionData() + ",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: " + getInputLossAction() + ",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: " + getRestartDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthenticationScheme() == null) ? 0 : getAuthenticationScheme().hashCode());
        hashCode = prime * hashCode
                + ((getCacheFullBehavior() == null) ? 0 : getCacheFullBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getCacheLength() == null) ? 0 : getCacheLength().hashCode());
        hashCode = prime * hashCode
                + ((getCaptionData() == null) ? 0 : getCaptionData().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode
                + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RtmpGroupSettings == false)
            return false;
        RtmpGroupSettings other = (RtmpGroupSettings) obj;

        if (other.getAuthenticationScheme() == null ^ this.getAuthenticationScheme() == null)
            return false;
        if (other.getAuthenticationScheme() != null
                && other.getAuthenticationScheme().equals(this.getAuthenticationScheme()) == false)
            return false;
        if (other.getCacheFullBehavior() == null ^ this.getCacheFullBehavior() == null)
            return false;
        if (other.getCacheFullBehavior() != null
                && other.getCacheFullBehavior().equals(this.getCacheFullBehavior()) == false)
            return false;
        if (other.getCacheLength() == null ^ this.getCacheLength() == null)
            return false;
        if (other.getCacheLength() != null
                && other.getCacheLength().equals(this.getCacheLength()) == false)
            return false;
        if (other.getCaptionData() == null ^ this.getCaptionData() == null)
            return false;
        if (other.getCaptionData() != null
                && other.getCaptionData().equals(this.getCaptionData()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null
                && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null
                && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        return true;
    }
}
