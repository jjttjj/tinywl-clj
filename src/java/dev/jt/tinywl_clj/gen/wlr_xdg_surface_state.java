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
 * struct wlr_xdg_surface_state {
 *     uint32_t configure_serial;
 *     struct wlr_box geometry;
 * }
 * }
 */
public class wlr_xdg_surface_state {

    wlr_xdg_surface_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_INT.withName("configure_serial"),
        wlr_box.layout().withName("geometry")
    ).withName("wlr_xdg_surface_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt configure_serial$LAYOUT = (OfInt)$LAYOUT.select(groupElement("configure_serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t configure_serial
     * }
     */
    public static final OfInt configure_serial$layout() {
        return configure_serial$LAYOUT;
    }

    private static final long configure_serial$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t configure_serial
     * }
     */
    public static final long configure_serial$offset() {
        return configure_serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t configure_serial
     * }
     */
    public static int configure_serial(MemorySegment struct) {
        return struct.get(configure_serial$LAYOUT, configure_serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t configure_serial
     * }
     */
    public static void configure_serial(MemorySegment struct, int fieldValue) {
        struct.set(configure_serial$LAYOUT, configure_serial$OFFSET, fieldValue);
    }

    private static final GroupLayout geometry$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("geometry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_box geometry
     * }
     */
    public static final GroupLayout geometry$layout() {
        return geometry$LAYOUT;
    }

    private static final long geometry$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_box geometry
     * }
     */
    public static final long geometry$offset() {
        return geometry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_box geometry
     * }
     */
    public static MemorySegment geometry(MemorySegment struct) {
        return struct.asSlice(geometry$OFFSET, geometry$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_box geometry
     * }
     */
    public static void geometry(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, geometry$OFFSET, geometry$LAYOUT.byteSize());
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
