package com.amazonaws.services.s3.model;

import java.util.regex.Matcher;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegionTest {

    @Test
    public void bogusRegion() {
        Matcher m = com.amazonaws.services.s3.model.Region.S3_REGIONAL_ENDPOINT_PATTERN
                .matcher("s3-bucket.amazonaws.com.s3-us-west-2.amazonaws.com");
        Assert.assertFalse(m.matches());
    }

    @Test
    public void fromValue_usEast1String_ReturnsUsStandard() {
        assertEquals(Region.US_Standard, Region.fromValue("us-east-1"));
    }

    @Test
    public void toAWSRegion_UsStandard_ReturnsUsEast1Region() {
        assertEquals("us-east-1", Region.US_Standard.toAWSRegion().getName());
    }

}
