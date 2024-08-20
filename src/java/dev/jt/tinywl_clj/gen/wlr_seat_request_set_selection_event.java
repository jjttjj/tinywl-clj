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
 * struct wlr_seat_request_set_selection_event {
 *     struct wlr_data_source *source;
 *     uint32_t serial;
 * }
 * }
 */
public class wlr_seat_request_set_selection_event {

    wlr_seat_request_set_selection_event() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("source"),
        C.C_INT.withName("serial"),
        MemoryLayout.paddingLayout(4)
    ).withName("wlr_seat_request_set_selection_event");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout source$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("source"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_data_source *source
     * }
     */
    public static final AddressLayout source$layout() {
        return source$LAYOUT;
    }

    private static final long source$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_data_source *source
     * }
     */
    public static final long source$offset() {
        return source$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_data_source *source
     * }
     */
    public static MemorySegment source(MemorySegment struct) {
        return struct.get(source$LAYOUT, source$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_data_source *source
     * }
     */
    public static void source(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(source$LAYOUT, source$OFFSET, fieldValue);
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

    private static final long serial$OFFSET = 8;

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

