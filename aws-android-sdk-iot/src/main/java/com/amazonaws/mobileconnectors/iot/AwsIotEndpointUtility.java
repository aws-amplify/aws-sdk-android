package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

/**
 * Helper class for parsing AWS IoT endpoints.
 */
public final class AwsIotEndpointUtility {
    private static final String TOKENIZE_ENDPOINT_PATTERN = "[\\.:]";

    private AwsIotEndpointUtility() { };

    /**
     * Identifies the AWS Region of the given endpoint and returns the corresponding {@link Region}.
     *
     * @param endpoint endpoint from which to identify the AWS Region code.
     * @return {@link Region} for the AWS Region code contained within the endpoint.
     * @throws {@link IllegalArgumentException} if no valid AWS Region code can be found within endpoint.
     */
    static Region getRegionFromIotEndpoint(String endpoint) {
        String[] parts = endpoint.toLowerCase().split(TOKENIZE_ENDPOINT_PATTERN);
        Region region;

        for (String part : parts) {
            region = Region.getRegion(part);

            if (region != null) {
                return region;
            }
        }

        throw new IllegalArgumentException("Cannot find AWS Region code within endpoint");
    }
}
