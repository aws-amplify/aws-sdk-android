package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import java.util.List;

/**
 * Interface to receive undeliverable kinesis data to further process or submit through other means.<br />
 * This may be re-evaluating the data and stream name or packaging the data to be sent to S3.<br />
 * <br />
 * The data sent here either encountered errors that cannot be retried or exceeded the retry limit.<br />
 * <br />
 * This is set using {@link KinesisRecorderConfig#withDeadLetterListener(DeadLetterListener)}.
 */
public interface DeadLetterListener {
    /**
     * The data sent here either encountered errors that cannot be retried or exceeded the retry limit.
     * @param streamName stream the data was being sent to.
     * @param data the list of individual records being submitted represented as a byte array.
     */
    void onRecordsDropped(String streamName, List<byte[]> data);
}
