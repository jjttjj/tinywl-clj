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
 * struct wlr_xdg_toplevel_move_event {
 *     struct wlr_xdg_toplevel *toplevel;
 *     struct wlr_seat_client *seat;
 *     uint32_t serial;
 * }
 * }
 */
public class wlr_xdg_toplevel_move_event {

    wlr_xdg_toplevel_move_event() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("toplevel"),
        C.C_POINTER.withName("seat"),
        C.C_INT.withName("serial"),
        MemoryLayout.paddingLayout(4)
    ).withName("wlr_xdg_toplevel_move_event");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout toplevel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("toplevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *toplevel
     * }
     */
    public static final AddressLayout toplevel$layout() {
        return toplevel$LAYOUT;
    }

    private static final long toplevel$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *toplevel
     * }
     */
    public static final long toplevel$offset() {
        return toplevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *toplevel
     * }
     */
    public static MemorySegment toplevel(MemorySegment struct) {
        return struct.get(toplevel$LAYOUT, toplevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *toplevel
     * }
     */
    public static void toplevel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(toplevel$LAYOUT, toplevel$OFFSET, fieldValue);
    }

    private static final AddressLayout seat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_seat_client *seat
     * }
     */
    public static final AddressLayout seat$layout() {
        return seat$LAYOUT;
    }

    private static final long seat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_seat_client *seat
     * }
     */
    public static final long seat$offset() {
        return seat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_seat_client *seat
     * }
     */
    public static MemorySegment seat(MemorySegment struct) {
        return struct.get(seat$LAYOUT, seat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_seat_client *seat
     * }
     */
    public static void seat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seat$LAYOUT, seat$OFFSET, fieldValue);
    }

    private static final OfInt serial$LAYOUT = (OfInt)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static final OfInt serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static int serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t serial
     * }
     */
    public static void serial(MemorySegment struct, int fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
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

