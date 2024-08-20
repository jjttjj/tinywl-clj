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
 * struct wlr_seat_touch_grab {
 *     const struct wlr_touch_grab_interface *interface;
 *     struct wlr_seat *seat;
 *     void *data;
 * }
 * }
 */
public class wlr_seat_touch_grab {

    wlr_seat_touch_grab() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("interface"),
        C.C_POINTER.withName("seat"),
        C.C_POINTER.withName("data")
    ).withName("wlr_seat_touch_grab");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout interface_$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("interface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wlr_touch_grab_interface *interface
     * }
     */
    public static final AddressLayout interface_$layout() {
        return interface_$LAYOUT;
    }

    private static final long interface_$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wlr_touch_grab_interface *interface
     * }
     */
    public static final long interface_$offset() {
        return interface_$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wlr_touch_grab_interface *interface
     * }
     */
    public static MemorySegment interface_(MemorySegment struct) {
        return struct.get(interface_$LAYOUT, interface_$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wlr_touch_grab_interface *interface
     * }
     */
    public static void interface_(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(interface_$LAYOUT, interface_$OFFSET, fieldValue);
    }

    private static final AddressLayout seat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_seat *seat
     * }
     */
    public static final AddressLayout seat$layout() {
        return seat$LAYOUT;
    }

    private static final long seat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_seat *seat
     * }
     */
    public static final long seat$offset() {
        return seat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_seat *seat
     * }
     */
    public static MemorySegment seat(MemorySegment struct) {
        return struct.get(seat$LAYOUT, seat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_seat *seat
     * }
     */
    public static void seat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seat$LAYOUT, seat$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
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

