package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

/**
 * Helper class for parsing AWS IoT endpoints.
 */
public final class AwsIotEndpointUtility {

    /** Constant for token offset of AWS region in endpoint. */
    private static final int ENDPOINT_REGION_OFFSET = 2;
    /** Constant for number of tokens in China's ATS endpoint. */
    private static final int ENDPOINT_CN_ATS_SPLIT_SIZE = 7;

    /**
     * Helper class, no public constructor.
     */
    private AwsIotEndpointUtility() { };

    /**
     * Strip the port off of the endpoint if present.
     * @param endpoint desired endpoint.
     * @return string with endpoint removed if present.
     */
    private static String stripPort(String endpoint) {
        return endpoint.split(":")[0];
    }

    /**
     * Splits endpoint into tokens.
     * @param endpoint endpoint to split.
     * @return array of string tokens.
     */
    private static String[] splitEndpoint(String endpoint) {
        return endpoint.split("\\.");
    }

    /**
     * Parse AWS region from endpoint.
     * @param endpoint endpoint to parse.
     * @return Region contained in endpoint.
     */
    static Region getRegionFromIotEndpoint(String endpoint) {
        try {
            String endpointWithoutPort = stripPort(endpoint);
            String[] splits = splitEndpoint(endpointWithoutPort);
            final int offset = (splits.length == ENDPOINT_CN_ATS_SPLIT_SIZE) 
                ? (ENDPOINT_REGION_OFFSET + 1) 
                : ENDPOINT_REGION_OFFSET;
            return Region.getRegion(Regions.fromName(splits[offset]));
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cannot parse region from endpoint.", ex);
        }
    }
}
