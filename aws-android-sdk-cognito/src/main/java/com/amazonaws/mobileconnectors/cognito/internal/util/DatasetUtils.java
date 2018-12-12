
package com.amazonaws.mobileconnectors.cognito.internal.util;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.cognito.Record;

import java.util.regex.Pattern;

/**
 * A utility class for datasets objects.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public final class DatasetUtils {

    /**
     * Valid dataset name pattern
     */
    public static final Pattern DATASET_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_.:-]{1,128}$");
    /**
     * Unknown identity id when the identity id is null
     */
    public static final String UNKNOWN_IDENTITY_ID = "unknown";

    /**
     * Validates the dataset name.
     * 
     * @param datasetName the dataset name to be validated
     * @return
     */
    public static String validateDatasetName(String datasetName) {
        if (!DATASET_NAME_PATTERN.matcher(datasetName).matches()) {
            throw new IllegalArgumentException("Invalid dataset name");
        }
        return datasetName;
    }

    /**
     * Validates the record key. It must be non empty and its length must be no
     * greater than 128. Otherwise {@link IllegalArgumentException} will be
     * thrown.
     * 
     * @param key the record key to be validated
     * @return the key itself
     */
    public static String validateRecordKey(String key) {
        if (StringUtils.isEmpty(key) || StringUtils.utf8ByteLength(key) > 128) {
            throw new IllegalArgumentException("Invalid record key");
        }
        return key;
    }

    /**
     * A helper function to compute record size which equals the sum of the
     * UTF-8 string length of record key and value. 0 if record is null.
     * 
     * @param record record to compute length
     * @return the sum UTF-8 string length of record key and value.
     */
    public static long computeRecordSize(Record record) {
        if (record == null) {
            return 0;
        }
        return StringUtils.utf8ByteLength(record.getKey())
                + StringUtils.utf8ByteLength(record.getValue());
    }

    /**
     * A helper function to get the identity id of the dataset from credentials
     * provider. If the identity id is null, UNKNOWN_IDENTITY_ID will be
     * returned.
     * 
     * @return the identity id associated with this dataset
     */
    public static String getIdentityId(CognitoCachingCredentialsProvider provider) {
        return provider.getCachedIdentityId() == null
                ? UNKNOWN_IDENTITY_ID
                : provider.getCachedIdentityId();
    }

}
