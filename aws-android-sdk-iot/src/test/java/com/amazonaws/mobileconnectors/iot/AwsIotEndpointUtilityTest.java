package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AwsIotEndpointUtilityTest {

    public static final Region US_EAST_1 = Region.getRegion(Regions.US_EAST_1);
    public static final Region CN_NORTH_1 = Region.getRegion(Regions.CN_NORTH_1);

    @Test
    public void testGetRegionFromCustomIotEndpoint() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east-1.amazonaws.com";
        assertEquals(US_EAST_1, AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testGetRegionFromCustomIotEndpointWithPort() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east-1.amazonaws.com:443";
        assertEquals(US_EAST_1, AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testGetRegionFromDataIotEndpointWithPort() throws Exception {
        String testEndpoint = "data.iot.us-east-1.amazonaws.com:443";
        assertEquals(US_EAST_1, AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testRegionFromCNEndpoint() throws Exception {
        String testEndpoint = "random.iot.cn-north-1.amazonaws.com.cn";
        assertEquals(CN_NORTH_1, AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testRegionFromCNATSEndpoint() throws Exception {
        String testEndpoint = "random.ats.iot.cn-north-1.amazonaws.com.cn";
        Region region = AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint);

        assertEquals(CN_NORTH_1, region);
        assertEquals("amazonaws.com.cn", region.getDomain());
    }

    @Test
    public void testRegionFromUppercasedEndpoint() throws Exception {
        String testEndpoint = "ABCDEFG.IOT.US-EAST-1.AMAZONAWS.COM";
        assertEquals(US_EAST_1, AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromCustomIotEndpointUnknownRegion() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-pretend-1.amazonaws.com";
        AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromUnrelatedString() throws Exception {
        String testEndpoint = "Lorem ipsum dolor sit amet";
        AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint);
    }
}
