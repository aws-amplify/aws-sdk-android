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

package com.amazonaws.mobileconnectors.kinesisvideo.encoding;

import android.media.Image;
import android.media.MediaCodec;

import java.nio.ByteBuffer;

/**
 * Utility class to submit frames to the encoder.
 *
 * Submits the camera image image into the encoder plane-by-plane.
 *
 * It's up to you to make sure the camera image has the same color format as the encoder input
 * image. It works on multiple devices when camera image is in ImageFormat.YUV_420_888 and
 * encoder is MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Flexible. 'Flexible' here means
 * that encoder can choose it's own way of packaging the YUV420 frame, so it might not work on
 * some devices. Probably there needs to be more complex logic to mediate/convert between these.
 *
 * Danger. Serious magic happens here, there's zero documentation for this in sdk or interwebs.
 * Modify at your own risk.
 *
 * Currently works like this:
 *
 *   - first, get the temporary input buffer from the encoder:
 *        - encoders expect frame data to be aligned correctly, and they have a lot of
 *          assumptions about it, so it's hard to figure out the way to correctly put data
 *          into it.
 *
 *          So we're not going to use this buffer directly to put the frame data into. We need
 *          it just to know its index and calculate its size.
 *
 *          We still need buffer index and buffer size to do anything with the encoder,
 *          so there's no way to get rid of this step;
 *
 *   - get the input image from the encoder using the buffer index we got in the previous
 *     step:
 *        - encoder gives us writable image in correct format. This way we don't need to worry
 *          about alignments or anything, we just need to populate buffers for each of the image's
 *          plane.
 *
 *          When we get the image, the original buffer from the previous step becomes unusable;
 *
 *   - copy the camera image into the encoder input image plane-by-plane:
 *        - this assumes they're in the same format. Which may not be the case. There should be
 *          more complicated logic to support this;
 *
 *   - submit the image into the encoder:
 *        - we need to use the input buffer index and also provide the size of
 *          the data we're submitting.
 *
 *          Because we used the same input buffer index for the first two steps, we can use the same
 *          index for submitting the buffer into the encoder.
 *
 *          Problem now is that we also need to know the input data size when we're submitting it.
 *          But we used the input image, we did not put data into input buffer directly.
 *          So we don't know its size. That's because when we got the input image from the encoder,
 *          it managed the buffer allocation and alignment and all other magic internally
 *          behind the scenes, so we cannot just add up all image planes sizes
 *          to figure out the buffer size.
 *
 *          So the best guess now is to use the original temporary input buffer size we got from
 *          first step. Some internal alien magic happens here either. Actual image size is larger
 *          than the buffer size from the first step, so encoder seems to use something else
 *          in addition to this information. But if you submit incorrect buffer size it'll crash.
 *
 *    - mic drop
 */
public class EncoderFrameSubmitter {

    private static final long NS_IN_MS = 1000000;
    private static final int FROM_START = 0;
    private static final int NO_FLAGS = 0;
    private static final int DEQUEUE_NOW = -1;

    private final MediaCodec mEncoder;
    private long mFirstFrameTimestamp = -1;

    public EncoderFrameSubmitter(final MediaCodec encoder) {
        mEncoder = encoder;
    }

    public void submitFrameToEncoder(final Image frameImageYUV420,
                                     final boolean endOfStream) {

        // encoders are super sensitive to the timestamps, careful here
        final long timestamp = nanosSinceFirstFrame();
        queueIntoInputImage(frameImageYUV420, timestamp, endOfStream);
    }

    /**
     * TLDR: read the above javadoc for the class
     */
    private void queueIntoInputImage(final Image frameImageYUV420,
                                     final long timestamp,
                                     final boolean endOfStream) {

        final int flags = endOfStream ? MediaCodec.BUFFER_FLAG_END_OF_STREAM : NO_FLAGS;

        // step one. get the info about the encoder input buffer
        final int inputBufferIndex = mEncoder.dequeueInputBuffer(DEQUEUE_NOW);
        final ByteBuffer tmpBuffer = mEncoder.getInputBuffer(inputBufferIndex);
        final int tmpBufferSize = tmpBuffer.capacity();

        // step two. copy the frame into the encoder input image
        copyCameraFrameIntoInputImage(inputBufferIndex, frameImageYUV420);

        // step three. submit the buffer into the encoder
        mEncoder.queueInputBuffer(
                inputBufferIndex,
                FROM_START,
                tmpBufferSize,
                timestamp,
                flags);
    }

    /**
     * this assumes that camera frame and encoder input image have the same format
     */
    private void copyCameraFrameIntoInputImage(final int inputBufferIndex,
                                               final Image cameraFrame) {
        final Image codecInputImage = mEncoder.getInputImage(inputBufferIndex);

        for (int i = 0; i < cameraFrame.getPlanes().length; i++) {
            final ByteBuffer sourceImagePlane = cameraFrame.getPlanes()[i].getBuffer();
            final ByteBuffer destinationImagePlane = codecInputImage.getPlanes()[i].getBuffer();
            copyBuffer(sourceImagePlane, destinationImagePlane);
        }
    }

    private int copyBuffer(final ByteBuffer sourceBuffer,
                           final ByteBuffer destinationBuffer) {

        final int bytesToCopy = Math.min(destinationBuffer.capacity(), sourceBuffer.remaining());
        destinationBuffer.limit(bytesToCopy);
        sourceBuffer.limit(bytesToCopy);
        destinationBuffer.put(sourceBuffer);
        destinationBuffer.rewind();

        return bytesToCopy;
    }

    private long nanosSinceFirstFrame() {
        final long currentTime = System.currentTimeMillis();
        if (mFirstFrameTimestamp < 0) {
            mFirstFrameTimestamp = currentTime;
        }
        return (currentTime - mFirstFrameTimestamp) * NS_IN_MS;
    }
}
