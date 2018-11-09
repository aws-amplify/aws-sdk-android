package com.amazonaws.kinesisvideo.internal.client.mediasource;

/**
 * Configuration for the media source. Each concrete media source
 * has different configuration implementation. E.g. for camera or microphone
 */
public interface MediaSourceConfiguration {

    interface Builder<T extends MediaSourceConfiguration> {
        T build();
    }

    /**
     * @return type of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceType();

    /**
     * @return description of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceDescription();
}
