package com.amazonaws.services.kinesisvideo;

import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

import org.junit.Ignore;
import org.junit.Test;

import java.nio.ByteBuffer;

import static com.amazonaws.kinesisvideo.producer.FrameFlags.FRAME_FLAG_NONE;
import static junit.framework.Assert.assertEquals;

public class KinesisVideoFrameTest {

    @Ignore("Fails with BufferUnderFlowException")
    @Test
    public void testTrailingZeroRemoved() {
        byte[] rawData = new byte[] {1, 2, 3, 0, 0, 0, 0, 0};
        KinesisVideoFrame frame = new KinesisVideoFrame(0, FRAME_FLAG_NONE, 0,
                0, 1, ByteBuffer.wrap(rawData));
        assertEquals(3, frame.getSize());
        byte[] actualDataPassed = new byte[frame.getSize()];
        frame.getData().get(actualDataPassed);
        for (int i = 0; i < actualDataPassed.length; i++) {
            assertEquals(rawData[i], actualDataPassed[i]);
        }
    }
}
