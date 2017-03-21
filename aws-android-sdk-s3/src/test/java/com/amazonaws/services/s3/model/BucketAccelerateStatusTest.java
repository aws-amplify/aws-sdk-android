package com.amazonaws.services.s3.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BucketAccelerateStatusTest {

    @Test
    public void fromString_EnabledString_ReturnsEnabledEnum() {
        assertEquals(BucketAccelerateStatus.Enabled, BucketAccelerateStatus.fromValue("Enabled"));
    }

    @Test
    public void fromString_SuspendedString_ReturnsSuspendedEnum() {
        assertEquals(BucketAccelerateStatus.Suspended, BucketAccelerateStatus.fromValue("Suspended"));
    }

    @Test
    public void toString_SuspendedEnum_ReturnsSuspendedString() {
        assertEquals("Suspended", BucketAccelerateStatus.Suspended.toString());
    }

    @Test
    public void toString_EnabledEnum_ReturnsEnabledString() {
        assertEquals("Enabled", BucketAccelerateStatus.Enabled.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromString_InvalidStatus_ThrowsException() {
        BucketAccelerateStatus.fromValue("InvalidStatus");
    }
}
