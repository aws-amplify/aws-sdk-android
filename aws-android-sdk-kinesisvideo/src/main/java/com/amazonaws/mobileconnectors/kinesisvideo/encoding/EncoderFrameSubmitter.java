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
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import android.graphics.Rect;
import android.graphics.ImageFormat;


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
    private static final long NS_IN_US = 1000;
    private static final long NS_IN_MS = 1000000;
    private static final int FROM_START = 0;
    private static final int NO_FLAGS = 0;
    private static final int DEQUEUE_NOW = -1;

    private final MediaCodec mEncoder;
    private long mFirstFrameTimestamp = -1;
    private boolean mRotate90 = false;


    public EncoderFrameSubmitter(final MediaCodec encoder) {
        mEncoder = encoder;
    }

    public EncoderFrameSubmitter(final MediaCodec encoder, boolean rotate90) {
        mEncoder = encoder;
        mRotate90 = rotate90;
    }


    public void submitFrameToEncoder(final Image frameImageYUV420,
                                     final boolean endOfStream) {

        // encoders are super sensitive to the timestamps, careful here
        final long timestamp = nanosSinceFirstFrame();
        queueIntoInputImage(frameImageYUV420, timestamp / NS_IN_US, endOfStream);
    }

    /**
     * TLDR: read the above javadoc for the class
     */
    private void queueIntoInputImage(final Image frameImageYUV420,
                                     final long timestampInUS,
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
                timestampInUS,
                flags);
    }

    /**
     * this assumes that camera frame and encoder input image have the same format
     */
    private void copyCameraFrameIntoInputImage(final int inputBufferIndex,
                                               final Image cameraFrame) {
        final Image codecInputImage = mEncoder.getInputImage(inputBufferIndex);

        // This is the less efficient rotation with the width and height still hard coded from testing.
        // ByteBuffer[] planes = convertByteArrayToPlanes(rotateYUV420Degree90_byteArray(convertYUV420ToByteArray(cameraFrame), 320, 240), 240, 320);

        // If device orientation != sensor orientation, should rotate.
        if (mRotate90) {
            ByteBuffer[] imagePlaneBuffers = rotateYUV420Degree90(cameraFrame);
            for (int i = 0; i < imagePlaneBuffers.length; i++) {
                final ByteBuffer sourceImagePlaneBuffer = imagePlaneBuffers[i];
                final ByteBuffer destinationImagePlaneBuffer = codecInputImage.getPlanes()[i].getBuffer();
                copyBuffer(sourceImagePlaneBuffer, destinationImagePlaneBuffer);
            }
        } else {
            for (int i = 0; i < cameraFrame.getPlanes().length; i++) {
                final ByteBuffer sourceImagePlaneBuffer = cameraFrame.getPlanes()[i].getBuffer();
                final ByteBuffer destinationImagePlaneBuffer = codecInputImage.getPlanes()[i].getBuffer();
                copyBuffer(sourceImagePlaneBuffer, destinationImagePlaneBuffer);
            }
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


    /* 
     * The necessity for the complexity of the below rotateYUV420Degree90 function stems from the
     * format which Android's YUV Image Planes hold the UV values when using a semi-planar scheme:
     * 
     * If the YUV data in planar form is as follow:
     * Y1 Y2 Y3 Y4 Y5 Y6 Y7 Y8 Y9 Y10 Y11 Y12 Y13 Y14 Y15 Y16
     * U1 U2 U3 U4
     * V1 V2 V3 V4
     * 
     * The U ByteBuffer (in semi-planar, interleaved form) returned from Image.Plane[1] will be:
     * U1 V1 U2 V2 U3 V3 U4 __
     * 
     * And the V ByteBuffer (in semi-planar, interleaved form) returned from Image.Plane[2] will be:
     * __ V1 U2 V2 U3 V3 U4 V4
     * 
     * So, both U and V buffers will contain the same data except the U buffer will be missing
     * the last V, and V buffer will be missing the first U.
     * 
     */
    private ByteBuffer[] rotateYUV420Degree90(Image image)
    {
        final Image.Plane[] planes = image.getPlanes();

        final int imageWidth = image.getWidth();
        final int imageHeight = image.getHeight();

        final ByteBuffer yPlane = planes[0].getBuffer();
        final ByteBuffer uPlane = planes[1].getBuffer();
        final ByteBuffer vPlane = planes[2].getBuffer();

        final int uvRowStride = planes[1].getRowStride();
        final int uvPixelStride = planes[1].getPixelStride();

        final int ySize = imageWidth * imageHeight;
        final int uvSize = ySize / 4; // This is the length of each of the U and V buffers if planar scheme.

        final ByteBuffer rotatedYBuffer = ByteBuffer.allocateDirect(ySize);
        final ByteBuffer rotatedUBuffer = ByteBuffer.allocateDirect(uvSize * 2 - 1);
        final ByteBuffer rotatedVBuffer = ByteBuffer.allocateDirect(uvSize * 2 - 1);


        // Rotate the Y luma values.
        for (int x = 0; x < imageWidth; x++) {
            for (int y = imageHeight - 1; y >= 0; y--) {
                rotatedYBuffer.put(yPlane.get(y * imageWidth + x));
            }
        }


        // Rotate the U and V chroma values.

        final int uvWidth = imageWidth / 2;
        final int uvHeight = imageHeight / 2;
        
        int UVPlaneLength = uvWidth * uvHeight * 2 - 1;

        // Put the new first U value only in the U buffer - the V buffer should not contain the new first U value.
        rotatedUBuffer.put(uPlane.get(UVPlaneLength - (imageWidth - 1)));
        rotatedUBuffer.put(uPlane.get(UVPlaneLength - (imageWidth - 1) - 1));
        // ...
        rotatedVBuffer.put(uPlane.get(UVPlaneLength - (imageWidth - 1) - 1));

        // Fill the rest of each of the new Buffers' first row.
        for (int y = uvHeight - 1 - 1; y >= 0; y--) {
            rotatedUBuffer.put(uPlane.get(y * imageWidth));
            rotatedUBuffer.put(uPlane.get(y * imageWidth + 1));
            rotatedVBuffer.put(uPlane.get(y * imageWidth));
            rotatedVBuffer.put(uPlane.get(y * imageWidth + 1));
        }

        // The middle, non-edge cases.
        for (int x = 1; x < (uvWidth - 1); x++) {
            for (int y = uvHeight - 1; y >= 0; y--) {
                rotatedUBuffer.put(uPlane.get(y * imageWidth + x * uvPixelStride));
                rotatedUBuffer.put(uPlane.get(y * imageWidth + x * uvPixelStride + 1));

                rotatedVBuffer.put(uPlane.get(y * imageWidth + x * uvPixelStride));
                rotatedVBuffer.put(uPlane.get(y * imageWidth + x * uvPixelStride + 1));
            }
        }

        rotatedUBuffer.put(uPlane.get(UVPlaneLength - 1)); // The last element of the old U plane is its last U value...
        // ...the U buffer is missing the old U buffer's last V, so get it from the old V buffer.
        rotatedUBuffer.put(vPlane.get(UVPlaneLength - 1)); // The last element of the old V plane is its last V value.
        
        // Do the same for the new V buffer.
        rotatedVBuffer.put(uPlane.get(UVPlaneLength - 1));
        rotatedVBuffer.put(vPlane.get(UVPlaneLength - 1));

        // Only go down to y == 1 because y == 0 is also a special case (the new U buffer needs to not get the new last V value).
        for (int y = uvHeight - 1 - 1; y >= 1; y--) {
            rotatedUBuffer.put(uPlane.get(y * imageWidth + (imageWidth - 2)));
            rotatedUBuffer.put(uPlane.get(y * imageWidth + (imageWidth - 1)));

            rotatedVBuffer.put(uPlane.get(y * imageWidth + (imageWidth - 2)));
            rotatedVBuffer.put(uPlane.get(y * imageWidth + (imageWidth - 1)));
        }

        // Put the new last values into the buffers. The U only gets the new last U value and the V gets both U and V.
        rotatedUBuffer.put(uPlane.get((imageWidth - 2)));
        // ...
        rotatedVBuffer.put(uPlane.get((imageWidth - 2)));
        rotatedVBuffer.put(uPlane.get((imageWidth - 1)));


        // Reset buffer positions to the beginning.
        rotatedYBuffer.rewind();
        rotatedUBuffer.rewind();
        rotatedVBuffer.rewind();

        final ByteBuffer[] retArray = {rotatedYBuffer, rotatedUBuffer, rotatedVBuffer};

        return retArray;
    }



    //
    // NOTE: The below 3 functions are un-optimized versions of the rotateYUV420Degree90 function. These functions
    // convert the YUV ByteBuffers into byte arrays, then rotate, then convert the outputted arrays back to ByteBuffers.
    //

//     private ByteBuffer[] convertByteArrayToPlanes(byte[] data, int width, int height) {
//         ByteBuffer[] buffers = new ByteBuffer[3];

//         int ySize = width * height;
//         int uvSize = ySize / 4; // U and V planes each have half the width and height of Y plane.

//         // Allocate buffers for Y, U, and V planes.
//         ByteBuffer yBuffer = ByteBuffer.allocateDirect(ySize);
//         ByteBuffer uBuffer;
//         ByteBuffer vBuffer;

//         // Copy Y components from byte array to Y buffer.
//         yBuffer.put(data, 0, ySize).rewind();

//         // Copy U and V components from byte arrays to respective buffer.
//         if (this.uvPixelStride == 1) {
//             uBuffer = ByteBuffer.allocateDirect(uvSize);
//             vBuffer = ByteBuffer.allocateDirect(uvSize);

//             // Planar format: Copy U and V components from byte array to their respective buffers.
//             uBuffer.put(data, ySize, uvSize).rewind();
//             vBuffer.put(data, ySize + uvSize, uvSize).rewind();
//         } else {
//             uBuffer = ByteBuffer.allocateDirect(uvSize * 2 - 1);
//             vBuffer = ByteBuffer.allocateDirect(uvSize * 2 - 1);
            
//             // Semi-planar format: Interleave U and V components.
//             for (int i = 0; i < uvSize - 1; i++) {
//                 uBuffer.put(data[ySize +          i]);
//                 uBuffer.put(data[ySize + uvSize + i]);

//                 vBuffer.put(data[ySize + uvSize + i]);
//                 vBuffer.put(data[ySize +          i + 1]);
//             }
//             // And add in the final U and V (this is an edge case so not in the for-loop).
//             uBuffer.put(data[ySize + uvSize          - 1]);
//             vBuffer.put(data[ySize + uvSize + uvSize - 1]);


//             uBuffer.rewind();
//             vBuffer.rewind();
//         }

//         buffers[0] = yBuffer;
//         buffers[1] = uBuffer;
//         buffers[2] = vBuffer;

//         return buffers;
//     }


//     private byte[] rotateYUV420Degree90_byteArray(byte[] data, int imageWidth, int imageHeight) 
//     {
//         byte [] yuv = new byte[imageWidth*imageHeight*3/2];
//         // Rotate the Y luma.
//         int i = 0;
//         for(int x = 0; x < imageWidth; x++)
//         {
//             for(int y = imageHeight-1; y >= 0;y--)                               
//             {
//                 yuv[i] = data[y*imageWidth+x];
//                 i++;
//             }
//         }

//         // Rotate the U chroma.
//         for(int x = 0; x < imageWidth/2; x++)
//         {
//             for(int y = (imageHeight/2)-1; y >= 0;y--)                               
//             {
//                 yuv[i] = data[y*(imageWidth/2)+x + (imageWidth * imageHeight)];
//                 i++;
//             }
//         }

//         // Rotate the V chroma.
//         for(int x = 0; x < imageWidth/2; x++)
//         {
//             for(int y = (imageHeight/2)-1; y >= 0;y--)                               
//             {
//                 yuv[i] = data[y*(imageWidth/2)+x + (imageWidth * imageHeight) + (imageWidth * imageHeight / 4)];
//                 i++;
//             }
//         }

//         return yuv;
//     }



//     /*
//      * If the input image is in semi-planar format, the function will convert
//      * the output to be in planar format:
//      * YYYYYYYY UVUV (Represented by the semiplanar image planes as UVU and VUV)  ->  YYYYYYYY UU VV
//      */
//     private byte[] convertYUV420ToByteArray(Image image) {
//         Image.Plane[] planes = image.getPlanes();
    
//         int width = image.getWidth();
//         int height = image.getHeight();
//         int ySize = width * height;
//         int uvSize = ySize / 4; // U and V planes each have half the width and height of Y plane.
    
//         byte[] yuvData = new byte[ySize + (2 * uvSize)];
    
//         // Copy Y plane data to the byte array.
//         ByteBuffer yBuffer = planes[0].getBuffer();
//         yBuffer.get(yuvData, 0, ySize);
    
//         // Copy U and V plane data to the byte array.
//         ByteBuffer uBuffer = planes[1].getBuffer();
//         ByteBuffer vBuffer = planes[2].getBuffer();
//         int uvRowStride = planes[1].getRowStride();
//         this.uvPixelStride = planes[1].getPixelStride();

//         int uvHeight = height / 2;
//         int uvWidth = width / 2;

//         if (this.uvPixelStride == 1) {
//             // Planar format.
//             uBuffer.get(yuvData, ySize, uvSize);
//             vBuffer.get(yuvData, ySize + uvSize, uvSize);
//         } else {
//             // Semi-planar format.
//             for (int row = 0; row < uvHeight; row++) {
//                 int rowOffset = row * uvRowStride;
//                 for (int col = 0; col < uvWidth; col++) {
//                     yuvData[ySize +          row * uvWidth + col] = uBuffer.get(rowOffset + col * this.uvPixelStride);
//                     yuvData[ySize + uvSize + row * uvWidth + col] = vBuffer.get(rowOffset + col * this.uvPixelStride);
//                 }
//             }
//         }

//         return yuvData;
//     }

}
