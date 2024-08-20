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
 * struct wlr_keyboard_key_event {
 *     uint32_t time_msec;
 *     uint32_t keycode;
 *     bool update_state;
 *     enum wl_keyboard_key_state state;
 * }
 * }
 */
public class wlr_keyboard_key_event {

    wlr_keyboard_key_event() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_INT.withName("time_msec"),
        C.C_INT.withName("keycode"),
        C.C_BOOL.withName("update_state"),
        MemoryLayout.paddingLayout(3),
        C.C_INT.withName("state")
    ).withName("wlr_keyboard_key_event");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt time_msec$LAYOUT = (OfInt)$LAYOUT.select(groupElement("time_msec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t time_msec
     * }
     */
    public static final OfInt time_msec$layout() {
        return time_msec$LAYOUT;
    }

    private static final long time_msec$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t time_msec
     * }
     */
    public static final long time_msec$offset() {
        return time_msec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t time_msec
     * }
     */
    public static int time_msec(MemorySegment struct) {
        return struct.get(time_msec$LAYOUT, time_msec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t time_msec
     * }
     */
    public static void time_msec(MemorySegment struct, int fieldValue) {
        struct.set(time_msec$LAYOUT, time_msec$OFFSET, fieldValue);
    }

    private static final OfInt keycode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("keycode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t keycode
     * }
     */
    public static final OfInt keycode$layout() {
        return keycode$LAYOUT;
    }

    private static final long keycode$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t keycode
     * }
     */
    public static final long keycode$offset() {
        return keycode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t keycode
     * }
     */
    public static int keycode(MemorySegment struct) {
        return struct.get(keycode$LAYOUT, keycode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t keycode
     * }
     */
    public static void keycode(MemorySegment struct, int fieldValue) {
        struct.set(keycode$LAYOUT, keycode$OFFSET, fieldValue);
    }

    private static final OfBoolean update_state$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("update_state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool update_state
     * }
     */
    public static final OfBoolean update_state$layout() {
        return update_state$LAYOUT;
    }

    private static final long update_state$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool update_state
     * }
     */
    public static final long update_state$offset() {
        return update_state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool update_state
     * }
     */
    public static boolean update_state(MemorySegment struct) {
        return struct.get(update_state$LAYOUT, update_state$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool update_state
     * }
     */
    public static void update_state(MemorySegment struct, boolean fieldValue) {
        struct.set(update_state$LAYOUT, update_state$OFFSET, fieldValue);
    }

    private static final OfInt state$LAYOUT = (OfInt)$LAYOUT.select(groupElement("state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum wl_keyboard_key_state state
     * }
     */
    public static final OfInt state$layout() {
        return state$LAYOUT;
    }

    private static final long state$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum wl_keyboard_key_state state
     * }
     */
    public static final long state$offset() {
        return state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum wl_keyboard_key_state state
     * }
     */
    public static int state(MemorySegment struct) {
        return struct.get(state$LAYOUT, state$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum wl_keyboard_key_state state
     * }
     */
    public static void state(MemorySegment struct, int fieldValue) {
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
