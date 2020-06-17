package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AwsIotEndpointUtilityTest {

    @Test
    public void testGetRegionFromCustomIotEndpoint() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east-1.amazonaws.com";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testGetRegionFromCustomIotEndpointWithPort() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east-1.amazonaws.com:443";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromCustomIotEndpointBadRegion1() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east.amazonaws.com";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromCustomIotEndpointBadRegion2() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-east-9.amazonaws.com";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromCustomIotEndpointBadRegion3() throws Exception {
        String testEndpoint = "ABCDEFG.iot.us-central-1.amazonaws.com";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testGetRegionFromDataIotEndpointWithPort() throws Exception {
        String testEndpoint = "data.iot.us-east-1.amazonaws.com:443";
        assertEquals(Region.getRegion(Regions.US_EAST_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetRegionFromCustomIotEndpointNoPrefix() throws Exception {
        String testEndpoint = "iot.us-east-1.amazonaws.com";
        AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegionFromBadEndpointMissingCN() throws Exception {
        String testEndpoint = "random.ats.iot.cn-north-1.amazonaws.com";
        AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint);
    }

    @Test
    public void testRegionFromCNEndpoint() throws Exception {
        String testEndpoint = "random.iot.cn-north-1.amazonaws.com.cn";
        assertEquals(Region.getRegion(Regions.CN_NORTH_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
    }

    @Test
    public void testRegionFromCNATSEndpoint() throws Exception {
        String testEndpoint = "random.ats.iot.cn-north-1.amazonaws.com.cn";
        assertEquals(Region.getRegion(Regions.CN_NORTH_1), AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint));
        assertEquals("amazonaws.com.cn", AwsIotEndpointUtility.getRegionFromIotEndpoint(testEndpoint).getDomain());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEndpointTooLongShouldThrowException() throws Exception {
        String longEndpoint = "long.iot.cn-north-1.amazonaws.com.cn.long";
        AwsIotEndpointUtility.getRegionFromIotEndpoint(longEndpoint);
    }
}
