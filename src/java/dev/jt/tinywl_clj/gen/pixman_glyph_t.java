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
 * struct {
 *     int x;
 *     int y;
 *     const void *glyph;
 * }
 * }
 */
public class pixman_glyph_t {

    pixman_glyph_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_INT.withName("x"),
        C.C_INT.withName("y"),
        C.C_POINTER.withName("glyph")
    ).withName("$anon$1205:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final AddressLayout glyph$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("glyph"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *glyph
     * }
     */
    public static final AddressLayout glyph$layout() {
        return glyph$LAYOUT;
    }

    private static final long glyph$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *glyph
     * }
     */
    public static final long glyph$offset() {
        return glyph$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *glyph
     * }
     */
    public static MemorySegment glyph(MemorySegment struct) {
        return struct.get(glyph$LAYOUT, glyph$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *glyph
     * }
     */
    public static void glyph(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(glyph$LAYOUT, glyph$OFFSET, fieldValue);
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

