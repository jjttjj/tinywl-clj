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
 * struct wlr_xcursor {
 *     unsigned int image_count;
 *     struct wlr_xcursor_image **images;
 *     char *name;
 *     uint32_t total_delay;
 * }
 * }
 */
public class wlr_xcursor {

    wlr_xcursor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_INT.withName("image_count"),
        MemoryLayout.paddingLayout(4),
        C.C_POINTER.withName("images"),
        C.C_POINTER.withName("name"),
        C.C_INT.withName("total_delay"),
        MemoryLayout.paddingLayout(4)
    ).withName("wlr_xcursor");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt image_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("image_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int image_count
     * }
     */
    public static final OfInt image_count$layout() {
        return image_count$LAYOUT;
    }

    private static final long image_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int image_count
     * }
     */
    public static final long image_count$offset() {
        return image_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int image_count
     * }
     */
    public static int image_count(MemorySegment struct) {
        return struct.get(image_count$LAYOUT, image_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int image_count
     * }
     */
    public static void image_count(MemorySegment struct, int fieldValue) {
        struct.set(image_count$LAYOUT, image_count$OFFSET, fieldValue);
    }

    private static final AddressLayout images$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("images"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xcursor_image **images
     * }
     */
    public static final AddressLayout images$layout() {
        return images$LAYOUT;
    }

    private static final long images$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xcursor_image **images
     * }
     */
    public static final long images$offset() {
        return images$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xcursor_image **images
     * }
     */
    public static MemorySegment images(MemorySegment struct) {
        return struct.get(images$LAYOUT, images$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xcursor_image **images
     * }
     */
    public static void images(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(images$LAYOUT, images$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final OfInt total_delay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("total_delay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t total_delay
     * }
     */
    public static final OfInt total_delay$layout() {
        return total_delay$LAYOUT;
    }

    private static final long total_delay$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t total_delay
     * }
     */
    public static final long total_delay$offset() {
        return total_delay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t total_delay
     * }
     */
    public static int total_delay(MemorySegment struct) {
        return struct.get(total_delay$LAYOUT, total_delay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t total_delay
     * }
     */
    public static void total_delay(MemorySegment struct, int fieldValue) {
        struct.set(total_delay$LAYOUT, total_delay$OFFSET, fieldValue);
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

