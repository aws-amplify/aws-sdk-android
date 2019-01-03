/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Used both as a base class and a minimal support of timing info.
 * <p>
 * In contrast to {@link TimingInfoFullSupport}, which is intended to be a full
 * support of the timing info, this class only provides a minimal support of
 * start and end time (ie with no-ops for sub-event measurements) for backward
 * compatiblity reasons.
 * <p>
 * This class is instantiated instead of {@link TimingInfoFullSupport} when
 * request metric collection is not required during a particular service
 * request/response cycle.
 */
public class TimingInfo {
    private static final double TIME_CONVERSION = 1000.0;
    static final int UNKNOWN = -1;
    /**
     * The wall clock time (as the number of milliseconds since Epoch) of when
     * the timing measurement starts; or null if unknown. This field is not
     * meant to be used for timing measurement. For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     */
    private final Long startEpochTimeMilli;
    /**
     * Start time in nanosecond used for timing measurement. Note the value in
     * this field may have nothing to do with the wall clock time. The wall
     * clock time of when the timing measurement starts can optionally be
     * captured in {@link #startEpochTimeMilli}. For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     * <p>
     * Note System.nanoTime() can return negative values.
     */
    private final long startTimeNano;
    /**
     * End time in nanosecond used for timing measurement or null if unknown.
     * Note the value in this field is only meant to be used for timing
     * measurement, and is not directly related to the wall clock time. For more
     * info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     * <p>
     * Note System.nanoTime() can return negative values.
     */
    private Long endTimeNano;

    /**
     * Captures the current wall clock time (since epoch in millisecond) and the
     * current time (in nanosecond) used for timing measurement. For more info,
     * see: https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     * @return the TimingInfo.
     */
    public static TimingInfo startTiming() {
        return new TimingInfo(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    /**
     * Captures the current wall clock time (since epoch in millisecond) and the
     * current time (in nanosecond) used for timing measurement. For more info,
     * see: https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     * @return the TimingInfo.
     */
    public static TimingInfo startTimingFullSupport() {
        return new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()),
                System.nanoTime(), null);
    }

    /**
     * Captures the given start time in nanosecond, ignoring the wall clock
     * time.
     *
     * @param startTimeNano start time in nanosecond
     * @return the TimingInfo.
     */
    public static TimingInfo startTimingFullSupport(long startTimeNano) {
        return new TimingInfoFullSupport(null, startTimeNano, null);
    }

    /**
     * Returns a {@link TimingInfoFullSupport} based on the given start and end
     * time in nanosecond, ignoring the wall clock time.
     *
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond
     * @return the TimingInfo.
     */
    public static TimingInfo newTimingInfoFullSupport(long startTimeNano, long endTimeNano) {
        return new TimingInfoFullSupport(null, startTimeNano, Long.valueOf(endTimeNano));
    }

    /**
     * Returns a {@link TimingInfoFullSupport} based on the given start time
     * since epoch in millisecond, and the given start and end time in
     * nanosecond.
     *
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond
     * @return the TimingInfo.
     */
    public static TimingInfo newTimingInfoFullSupport(
            long startEpochTimeMilli, long startTimeNano, long endTimeNano) {
        return new TimingInfoFullSupport(Long.valueOf(startEpochTimeMilli), startTimeNano,
                Long.valueOf(endTimeNano));
    }

    /**
     * @param startTimeNano start time nano.
     * @param endTimeNano end time nano.
     * @return an instance of {@link TimingInfo} that is not modifiable, given
     * the start and end nano times.
     */
    public static TimingInfo unmodifiableTimingInfo(long startTimeNano, Long endTimeNano) {
        return new TimingInfoUnmodifiable(null, startTimeNano, endTimeNano);
    }

    /**
     * @return an instance of {@link TimingInfo} that is not modifiable.
     *
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond; or null if not known
     */
    public static TimingInfo unmodifiableTimingInfo(long startEpochTimeMilli, long startTimeNano,
            Long endTimeNano) {
        return new TimingInfoUnmodifiable(startEpochTimeMilli, startTimeNano, endTimeNano);
    }

    /**
     * A private ctor to facilitate the deprecation of using millisecond and
     * migration to using nanosecond for timing measurement.
     *
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond; or null if not known
     */
    protected TimingInfo(Long startEpochTimeMilli, long startTimeNano, Long endTimeNano) {
        this.startEpochTimeMilli = startEpochTimeMilli;
        this.startTimeNano = startTimeNano;
        this.endTimeNano = endTimeNano;
    }

    @Deprecated
    public final long getStartTime() {
        return isStartEpochTimeMilliKnown()
                ? startEpochTimeMilli
                // best effort even though technically this is incorrect
                : TimeUnit.NANOSECONDS.toMillis(startTimeNano);
    }

    /**=
     * @return the star epoch time in milliseconds.
     */
    @Deprecated
    public final long getStartEpochTimeMilli() {
        Long v = getStartEpochTimeMilliIfKnown();
        return v == null ? UNKNOWN : v.longValue();
    }

    /**
     * Retrieves the start epoch time in milliseconds if known.
     * @return start epch time in milliseconds.
     */
    public final Long getStartEpochTimeMilliIfKnown() {
        return startEpochTimeMilli;
    }

    /**
     * @return the start time nano.
     */
    public final long getStartTimeNano() {
        return startTimeNano;
    }

    /**
     * @return the end time.
     */
    @Deprecated
    public final long getEndTime() {
        return getEndEpochTimeMilli();
    }

    /**
     * @return the end epoch time in milliseconds.
     */
    @Deprecated
    public final long getEndEpochTimeMilli() {
        Long v = getEndEpochTimeMilliIfKnown();
        return v == null ? UNKNOWN : v.longValue();
    }

    /**
     * @return the end epoch time in milliseconds.
     */
    public final Long getEndEpochTimeMilliIfKnown() {
        return isStartEpochTimeMilliKnown() && isEndTimeKnown()
                // make use of the wall clock time and elpased time
                ? startEpochTimeMilli.longValue()
                        + TimeUnit.NANOSECONDS.toMillis(endTimeNano.longValue() - startTimeNano)
                : null;
    }

    /**
     * @return the end time nano.
     */
    public final long getEndTimeNano() {
        return endTimeNano == null ? UNKNOWN : endTimeNano;
    }

    /**
     * @return the end time nano if known.
     */
    public final Long getEndTimeNanoIfKnown() {
        return endTimeNano;
    }

    /**
     * @return time duration in milliseconds.
     */
    @Deprecated
    public final double getTimeTakenMillis() {
        Double v = getTimeTakenMillisIfKnown();
        return v == null ? UNKNOWN : v.doubleValue();
    }

    /**
     * @return the time duration in nano if known.
     */
    public final Double getTimeTakenMillisIfKnown() {
        return isEndTimeKnown()
                ? durationMilliOf(startTimeNano, endTimeNano)
                : null;
    }

    /**
     * @param startTimeNano start time nano.
     * @param endTimeNano end time nano.
     * @return the duration in milliseconds as double, preserving the decimal
     * precision as necessary, for the given start and end time in nanoseconds.
     */
    public static double durationMilliOf(long startTimeNano, long endTimeNano) {
        double micros = TimeUnit.NANOSECONDS.toMicros(endTimeNano - startTimeNano);
        return micros / TIME_CONVERSION; // convert microseconds to milliseconds in
                                // double rather than long, preserving the
                                // precision
    }

    /**
     * @return the elapsed time in milliseconds.
     */
    @Deprecated
    public final long getElapsedTimeMillis() {
        Double v = getTimeTakenMillisIfKnown();
        return v == null ? UNKNOWN : v.longValue();
    }

    /**
     * @return true if end time nano is known.
     */
    public final boolean isEndTimeKnown() {
        return endTimeNano != null;
    }

    /**
     * @return if start epoch time in milliseconds is known.
     */
    public final boolean isStartEpochTimeMilliKnown() {
        return startEpochTimeMilli != null;
    }

    @Override
    public final String toString() {
        return String.valueOf(getTimeTakenMillis());
    }

    @Deprecated
    public void setEndTime(long endTimeMilli) {
        this.endTimeNano = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(endTimeMilli));
    }

    /**
     * @param endTimeNano the end time nano.
     */
    public void setEndTimeNano(long endTimeNano) {
        this.endTimeNano = endTimeNano;
    }

    /**
     * @return the TimingInfo.
     */
    public TimingInfo endTiming() {
        this.endTimeNano = Long.valueOf(System.nanoTime());
        return this;
    }

    /**
     * @param subMeasurementName the sub measurement name.
     * @param timingInfo the timing info.
     */
    public void addSubMeasurement(String subMeasurementName, TimingInfo timingInfo) {
    }

    /**
     * @param subMeasurementName the sub measurement name.
     * @return the TimingInfo.
     */
    public TimingInfo getSubMeasurement(String subMeasurementName) {
        return null;
    }

    /**
     * @param subMesurementName the sub measurement name.
     * @param index the index.
     * @return the TimingInfo.
     */
    public TimingInfo getSubMeasurement(String subMesurementName, int index) {
        return null;
    }

    /**
     * @param subMeasurementName the sub measurement name.
     * @return the TimingInfo.
     */
    public TimingInfo getLastSubMeasurement(String subMeasurementName) {
        return null;
    }

    /**
     * @param subMeasurementName the sub measurement name.
     * @return the TimingInfo list.
     */
    public List<TimingInfo> getAllSubMeasurements(String subMeasurementName) {
        return null;
    }

    /**
     * @return map of string to list of the TimingInfo.
     */
    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return Collections.emptyMap();
    }

    /**
     * @param key the key.
     * @return the counter.
     */
    public Number getCounter(String key) {
        return null;
    }

    /**
     * @return Map of all of the counters.
     */
    public Map<String, Number> getAllCounters() {
        return Collections.emptyMap();
    }

    /**
     * @param key the key.
     * @param count the count.
     */
    public void setCounter(String key, long count) {
    }

    /**=
     * @param key the key.
     */
    public void incrementCounter(String key) {
    }
}
