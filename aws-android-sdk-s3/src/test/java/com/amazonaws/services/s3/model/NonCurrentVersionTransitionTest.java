package com.amazonaws.services.s3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.NoncurrentVersionTransition;

public class NonCurrentVersionTransitionTest {

    private NoncurrentVersionTransition nvt;

    @Before
    public void setup() {
        nvt = new NoncurrentVersionTransition();
    }

    @Test
    public void setStorageClassEnum_ToNull_ReturnsNull() {
        StorageClass nullStorageClass = null;
        nvt.setStorageClass(nullStorageClass);
        assertNull(nvt.getStorageClass());
        assertNull(nvt.getStorageClassAsString());
    }

    @Test
    public void setStorageClassString_ToNull_ReturnsNull() {
        String nullStorageClass = null;
        nvt.setStorageClass(nullStorageClass);
        assertNull(nvt.getStorageClass());
        assertNull(nvt.getStorageClassAsString());
    }

    @Test
    public void setStorageClassString_ToKnownStorageClass_AlsoUpdatesEnumValue() {
        nvt.setStorageClass(StorageClass.Glacier.toString());
        assertEquals(StorageClass.Glacier, nvt.getStorageClass());
        assertEquals(StorageClass.Glacier.toString(), nvt.getStorageClassAsString());
    }

    @Test
    public void setStorageClass_ToKnownStorageClassThenUnknown_PreservesStringValue() {
        nvt.setStorageClass(StorageClass.Glacier.toString());
        nvt.setStorageClass("UNKNOWN");
        assertEquals(null, nvt.getStorageClass());
        assertEquals("UNKNOWN", nvt.getStorageClassAsString());
    }

    @Test
    public void setStorageClass_WithEnumSetter_AlsoUpdatesStringValue() {
        nvt.setStorageClass(StorageClass.ReducedRedundancy);
        assertEquals(StorageClass.ReducedRedundancy, nvt.getStorageClass());
        assertEquals(StorageClass.ReducedRedundancy.toString(), nvt.getStorageClassAsString());
    }
}
