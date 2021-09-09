package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.file;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.google.common.truth.Truth.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = {Config.OLDEST_SDK})
public class ImageFileMediaSourceConfigurationTest {

    private Context context;
    private AssetManager assetManager;

    final int FPS = 25;
    final String FRAME_DIR = "test_folder";
    final String FILE_NAME_FORMAT = "frame-%03d.h264";
    final int START_FILE_INDEX = 1;
    final int END_FILE_INDEX = 375;

    @Before
    public void initialize() {
        context = ApplicationProvider.getApplicationContext();
        assetManager = context.getAssets();
    }

    @Test
    public void testConfigurationFieldsAreSetCorrectly() {
        ImageFileMediaSourceConfiguration config = new ImageFileMediaSourceConfiguration.Builder()
                .fps(FPS)
                .dir(FRAME_DIR)
                .assetManager(assetManager)
                .filenameFormat(FILE_NAME_FORMAT)
                .startFileIndex(START_FILE_INDEX)
                .endFileIndex(END_FILE_INDEX)
                .build();

        assertThat(config.getFps()).isEqualTo(FPS);
        assertThat(config.getDir()).isEqualTo(FRAME_DIR);
        assertThat(config.getAssetManager()).isSameInstanceAs(assetManager);
        assertThat(config.getFilenameFormat()).isEqualTo(FILE_NAME_FORMAT);
        assertThat(config.getStartFileIndex()).isEqualTo(START_FILE_INDEX);
        assertThat(config.getEndFileIndex()).isEqualTo(END_FILE_INDEX);
    }

    @Test
    public void testEmptyFilePathIsValid() {
        ImageFileMediaSourceConfiguration config = new ImageFileMediaSourceConfiguration.Builder()
                .fps(FPS)
                .dir("")
                .assetManager(assetManager)
                .filenameFormat(FILE_NAME_FORMAT)
                .startFileIndex(START_FILE_INDEX)
                .endFileIndex(END_FILE_INDEX)
                .build();

        assertThat(config.getDir()).isEqualTo("");
    }

    @Test
    public void testTrailingSlashIsRemoved() {
        ImageFileMediaSourceConfiguration config = new ImageFileMediaSourceConfiguration.Builder()
                .fps(FPS)
                .dir(FRAME_DIR + "/")
                .assetManager(assetManager)
                .filenameFormat(FILE_NAME_FORMAT)
                .startFileIndex(START_FILE_INDEX)
                .endFileIndex(END_FILE_INDEX)
                .build();

        assertThat(config.getDir()).isEqualTo(FRAME_DIR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroFpsThrowsException() {
        ImageFileMediaSourceConfiguration config = new ImageFileMediaSourceConfiguration.Builder()
                .fps(0)
                .dir(FRAME_DIR)
                .assetManager(assetManager)
                .filenameFormat(FILE_NAME_FORMAT)
                .startFileIndex(START_FILE_INDEX)
                .endFileIndex(END_FILE_INDEX)
                .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFpsThrowsException() {
        ImageFileMediaSourceConfiguration config = new ImageFileMediaSourceConfiguration.Builder()
                .fps(-FPS)
                .dir(FRAME_DIR)
                .assetManager(assetManager)
                .filenameFormat(FILE_NAME_FORMAT)
                .startFileIndex(START_FILE_INDEX)
                .endFileIndex(END_FILE_INDEX)
                .build();
    }
}
