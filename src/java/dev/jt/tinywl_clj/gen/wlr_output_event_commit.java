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
 * struct wlr_output_event_commit {
 *     struct wlr_output *output;
 *     struct timespec *when;
 *     const struct wlr_output_state *state;
 * }
 * }
 */
public class wlr_output_event_commit {

    wlr_output_event_commit() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("output"),
        C.C_POINTER.withName("when"),
        C.C_POINTER.withName("state")
    ).withName("wlr_output_event_commit");

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

    private static final long when$OFFSET = 8;

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

    private static final AddressLayout state$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wlr_output_state *state
     * }
     */
    public static final AddressLayout state$layout() {
        return state$LAYOUT;
    }

    private static final long state$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wlr_output_state *state
     * }
     */
    public static final long state$offset() {
        return state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wlr_output_state *state
     * }
     */
    public static MemorySegment state(MemorySegment struct) {
        return struct.get(state$LAYOUT, state$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wlr_output_state *state
     * }
     */
    public static void state(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(state$LAYOUT, state$OFFSET, fieldValue);
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
