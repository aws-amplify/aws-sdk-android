package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.file;

import android.content.res.AssetManager;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VIDEO_CONTENT_TYPE;

/**
 * This class represents a MediaSourceConfiguration for a MediaSource based on local image
 * files. Currently, this MediaSourceConfiguration expects a series of H264 frames located
 * within an Android Assets folder.
 * See https://github.com/awslabs/aws-sdk-android-samples/tree/main/AmazonKinesisVideoDemoApp/src/main/assets/sample_frames
 */
public class ImageFileMediaSourceConfiguration implements MediaSourceConfiguration {

    private final int fps;
    private final String dir;
    private final AssetManager assetManager;
    private final String filenameFormat;
    private final int startFileIndex;
    private final int endFileIndex;
    private final String contentType;

    public ImageFileMediaSourceConfiguration(final Builder builder) {
        this.fps = builder.fps;
        if (builder.dir.endsWith("/")) {
            this.dir = builder.dir.substring(0, builder.dir.length() - 1);
        } else {
            this.dir = builder.dir;
        }
        this.assetManager = builder.assetManager;
        this.filenameFormat = builder.filenameFormat;
        this.startFileIndex = builder.startFileIndex;
        this.endFileIndex = builder.endFileIndex;
        this.contentType = builder.contentType;
    }

    public int getFps() {
        return fps;
    }

    public String getDir() {
        return dir;
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }

    public String getFilenameFormat() {
        return filenameFormat;
    }

    public int getStartFileIndex() {
        return startFileIndex;
    }

    public int getEndFileIndex() {
        return endFileIndex;
    }

    public String getContentType() {
        return contentType;
    }

    @Override
    public String getMediaSourceType() {
        return null;
    }

    @Override
    public String getMediaSourceDescription() {
        return null;
    }

    public static class Builder implements MediaSourceConfiguration.Builder<ImageFileMediaSourceConfiguration> {
        private int fps;
        private String dir;
        private AssetManager assetManager;
        private String filenameFormat;
        private int startFileIndex;
        private int endFileIndex;
        private String contentType = VIDEO_CONTENT_TYPE; // content type should be video only

        public Builder fps(final int fps) {
            this.fps = fps;
            if (fps <= 0) {
                throw new IllegalArgumentException("Fps should not be negative or zero.");
            }
            return this;
        }

        public Builder dir(final String dir) {
            this.dir = dir;
            return this;
        }

        public Builder assetManager(final AssetManager assetManager) {
            this.assetManager = assetManager;
            return this;
        }

        public Builder filenameFormat(final String filenameFormat) {
            this.filenameFormat = filenameFormat;
            return this;
        }

        public Builder startFileIndex(final int index) {
            this.startFileIndex = index;
            return this;
        }

        public Builder endFileIndex(final int index) {
            this.endFileIndex = index;
            return this;
        }

        public Builder contentType(final String contentType) {
            this.contentType = contentType;
            return this;
        }

        @Override
        public ImageFileMediaSourceConfiguration build() {
            return new ImageFileMediaSourceConfiguration(this);
        }
    }
}
