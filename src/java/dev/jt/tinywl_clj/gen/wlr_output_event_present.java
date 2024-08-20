// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct wlr_output_event_present {
 *     struct wlr_output *output;
 *     uint32_t commit_seq;
 *     bool presented;
 *     struct timespec *when;
 *     unsigned int seq;
 *     int refresh;
 *     uint32_t flags;
 * }
 * }
 */
public class wlr_output_event_present {

    wlr_output_event_present() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("output"),
        C.C_INT.withName("commit_seq"),
        C.C_BOOL.withName("presented"),
        MemoryLayout.paddingLayout(3),
        C.C_POINTER.withName("when"),
        C.C_INT.withName("seq"),
        C.C_INT.withName("refresh"),
        C.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("wlr_output_event_present");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout output$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("output"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_output *output
     * }
     */
    public static final AddressLayout output$layout() {
        return output$LAYOUT;
    }

    private static final long output$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_output *output
     * }
     */
    public static final long output$offset() {
        return output$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_output *output
     * }
     */
    public static MemorySegment output(MemorySegment struct) {
        return struct.get(output$LAYOUT, output$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_output *output
     * }
     */
    public static void output(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(output$LAYOUT, output$OFFSET, fieldValue);
    }

    private static final OfInt commit_seq$LAYOUT = (OfInt)$LAYOUT.select(groupElement("commit_seq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t commit_seq
     * }
     */
    public static final OfInt commit_seq$layout() {
        return commit_seq$LAYOUT;
    }

    private static final long commit_seq$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t commit_seq
     * }
     */
    public static final long commit_seq$offset() {
        return commit_seq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t commit_seq
     * }
     */
    public static int commit_seq(MemorySegment struct) {
        return struct.get(commit_seq$LAYOUT, commit_seq$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t commit_seq
     * }
     */
    public static void commit_seq(MemorySegment struct, int fieldValue) {
        struct.set(commit_seq$LAYOUT, commit_seq$OFFSET, fieldValue);
    }

    private static final OfBoolean presented$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("presented"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool presented
     * }
     */
    public static final OfBoolean presented$layout() {
        return presented$LAYOUT;
    }

    private static final long presented$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool presented
     * }
     */
    public static final long presented$offset() {
        return presented$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool presented
     * }
     */
    public static boolean presented(MemorySegment struct) {
        return struct.get(presented$LAYOUT, presented$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool presented
     * }
     */
    public static void presented(MemorySegment struct, boolean fieldValue) {
        struct.set(presented$LAYOUT, presented$OFFSET, fieldValue);
    }

    private static final AddressLayout when$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("when"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec *when
     * }
     */
    public static final AddressLayout when$layout() {
        return when$LAYOUT;
    }

    private static final long when$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec *when
     * }
     */
    public static final long when$offset() {
        return when$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec *when
     * }
     */
    public static MemorySegment when(MemorySegment struct) {
        return struct.get(when$LAYOUT, when$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec *when
     * }
     */
    public static void when(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(when$LAYOUT, when$OFFSET, fieldValue);
    }

    private static final OfInt seq$LAYOUT = (OfInt)$LAYOUT.select(groupElement("seq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int seq
     * }
     */
    public static final OfInt seq$layout() {
        return seq$LAYOUT;
    }

    private static final long seq$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int seq
     * }
     */
    public static final long seq$offset() {
        return seq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int seq
     * }
     */
    public static int seq(MemorySegment struct) {
        return struct.get(seq$LAYOUT, seq$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int seq
     * }
     */
    public static void seq(MemorySegment struct, int fieldValue) {
        struct.set(seq$LAYOUT, seq$OFFSET, fieldValue);
    }

    private static final OfInt refresh$LAYOUT = (OfInt)$LAYOUT.select(groupElement("refresh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int refresh
     * }
     */
    public static final OfInt refresh$layout() {
        return refresh$LAYOUT;
    }

    private static final long refresh$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int refresh
     * }
     */
    public static final long refresh$offset() {
        return refresh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int refresh
     * }
     */
    public static int refresh(MemorySegment struct) {
        return struct.get(refresh$LAYOUT, refresh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int refresh
     * }
     */
    public static void refresh(MemorySegment struct, int fieldValue) {
        struct.set(refresh$LAYOUT, refresh$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
